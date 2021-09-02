/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author elinzar
 */
public class ManEspectaculo {
    
    /**
     *
     * @param plataforma
     * @param artista
     * @param espectaculo
     */
    public static void altaEspectaculo(String plataforma, String artista, DtEspectaculo espectaculo)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        TypedQuery<Plataforma> consultaPlataforma = em.createNamedQuery("Plataforma.findByNombre",Plataforma.class);
        consultaPlataforma.setParameter("nombre", plataforma);
        Plataforma estaPlataforma = consultaPlataforma.getSingleResult();
        
        TypedQuery<Artista> consultaArtista = em.createNamedQuery("ArtistaporNick",Artista.class);
        consultaArtista.setParameter("nickname", artista);
        Artista esteArtista = consultaArtista.getSingleResult();
        
        Espectaculo nuevoEspectaculo = new Espectaculo(espectaculo.getNombre(),espectaculo.getDescripcion(),espectaculo.getDuracion(),espectaculo.getCantidadMaximaEspectadores(),espectaculo.getCantidadMinimaEspectadores(),espectaculo.getUrl(),espectaculo.getCosto(),espectaculo.getFechaDeRegistro(), estaPlataforma, esteArtista);
        
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.persist(nuevoEspectaculo);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.close();
        emf.close(); 
    }
    
    public static boolean existeEspectaculo(String nombreEspectaculo){
        boolean existe = false;
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
       EntityManager em = emf.createEntityManager();
       em.getTransaction().begin();
       TypedQuery<Espectaculo> consulta = em.createNamedQuery("Espectaculo.findByNombre",Espectaculo.class);
       consulta.setParameter("nombre", nombreEspectaculo);
       List<Espectaculo> lEspectaculo = consulta.getResultList();
       em.getTransaction().commit();
       if(lEspectaculo.size()>0)
        {
            existe=true;
        }
       em.close();
       emf.close();
       return existe;
       
   }
    
    public static List<DtFuncion> listarFunciones(String nombreEsp){
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
       EntityManager em = emf.createEntityManager();
       em.getTransaction().begin();
       TypedQuery<Espectaculo> consulta = em.createNamedQuery("Espectaculo.findByNombre", Espectaculo.class);
       consulta.setParameter("nombre", nombreEsp);
       Espectaculo e = consulta.getSingleResult();
       List<DtFuncion> lDtf = new ArrayList<DtFuncion>();
       List<Funcion> funciones = e.getFunciones();
        java.sql.Date f= new java.sql.Date(Calendar.getInstance().getTime().getTime());
       for (Funcion i :funciones){
           if(i.getFecha().after(f)){
           DtFuncion esteDt = new DtFuncion(i.getId(),i.getNombre(),i.getHoraInicio(),i.getFechaRegistro(),i.getFecha());
           lDtf.add(esteDt);
           }
       }
       em.close();
       emf.close();
       return lDtf;
    }
    
    public static float getDescuento(String nickname, String nombreFuncion){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Espectador> consulta = em.createNamedQuery("EspectadorporNick",Espectador.class);
        consulta.setParameter("nickname", nickname);
        Espectador esteMen = consulta.getSingleResult();
        List<Compra> comprasDesteMen = esteMen.getCompras();
        List<PaqueteDeEspectaculos> paquetesComprados = new ArrayList<PaqueteDeEspectaculos>();
        for(Compra i :comprasDesteMen){
           paquetesComprados.add(i.getPaquete());
        }
        TypedQuery<Funcion> consultaFuncion = em.createNamedQuery("Funcion.findByNombre",Funcion.class);
        consultaFuncion.setParameter("nombre", nombreFuncion);
        Funcion funcion = consultaFuncion.getSingleResult();
        float result = 0;
        for(PaqueteDeEspectaculos i :paquetesComprados){
            for(Espectaculo j :i.getEspectaculos()){
                if(j.getId()==funcion.getEspectaculo().getId()){
                    result = i.getDescuento();
                }
            }
        }
        em.close();
        emf.close();
        return result;
    }
    
    public static float getCosto(String nombreFuncion){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Funcion> consultaFuncion = em.createNamedQuery("Funcion.findByNombre",Funcion.class);
        consultaFuncion.setParameter("nombre", nombreFuncion);
        Funcion funcion = consultaFuncion.getSingleResult();
        em.close();
        emf.close();
        return funcion.getEspectaculo().getCosto();
    }
    
    public static DtFuncion getDatosFuncion(String nombreFuncion){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Funcion> consultaFuncion = em.createNamedQuery("Funcion.findByNombre",Funcion.class);
        consultaFuncion.setParameter("nombre", nombreFuncion);
        Funcion funcion = consultaFuncion.getSingleResult();
        em.close();
        emf.close();
        return funcion.getMyDt();
    }
    
    
    
    
    public static DtPlataforma plataformaEspectaculos(String nombre)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Espectaculo> consulta = em.createNamedQuery("Espectaculo.findByNombre",Espectaculo.class);
        consulta.setParameter("nombre", nombre);
        Espectaculo e = consulta.getSingleResult();
        em.getTransaction().commit();
        em.close();
        emf.close();
        DtPlataforma plat=new DtPlataforma();
        
        plat=e.getPlataforma().getMyDt();
        
        return plat;
    }
    
    
    
    
    public static List<DtPaqueteDeEspectaculos> listarPaquetesEspectaculos(String nombre)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Espectaculo> consulta = em.createNamedQuery("Espectaculo.findByNombre",Espectaculo.class);
        consulta.setParameter("nombre", nombre);
        Espectaculo e = consulta.getSingleResult();
        em.getTransaction().commit();
        em.close();
        emf.close();
        List<DtPaqueteDeEspectaculos> lista=new ArrayList<DtPaqueteDeEspectaculos>();

        for(int u=0; u<e.getPaquetes().size(); u++)
        {
            lista.add(e.getPaquetes().get(u).getMyDt());
        }

        return lista;
    }
    
    public static List<String> getNombres(String nombrePlataforma) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
            EntityManager em = emf.createEntityManager();
            List<Espectaculo> esps = em.createNamedQuery("Espectaculo.findAll", Espectaculo.class)
                    .getResultList();
            em.close();
            ArrayList<String> nombres = new ArrayList();
            esps.forEach(e -> {
                if(e.getPlataforma().getNombre().equals(nombrePlataforma)) {
                    nombres.add(e.getNombre());
                }
            });
            return nombres;
        }
    
    public static Espectaculo getEspectaculo(String nombreEspectaculo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        Espectaculo e = em.createNamedQuery("Espectaculo.findByNombre",Espectaculo.class)
                .setParameter("nombre", nombreEspectaculo).getSingleResult();
        em.close();
        emf.close();
        return e;
    }
    
    public static boolean estaCompleta(String nombreFuncion){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Funcion> consulta = em.createNamedQuery("Funcion.findByNombre",Funcion.class);
        consulta.setParameter("nombre", nombreFuncion);
        Funcion estaF = consulta.getSingleResult();
        boolean result = estaF.estaCompleta();
        em.close();
        emf.close();
        return result;
    }
    
    public static List<DtArtista> getInvitados(String nombreFuncion){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Funcion> consulta = em.createNamedQuery("Funcion.findByNombre", Funcion.class);
        consulta.setParameter("nombre", nombreFuncion);
        Funcion estaFuncion = consulta.getSingleResult();
        em.close();
        emf.close();
        List<DtArtista> result = new ArrayList<DtArtista>();
        for(Artista i :estaFuncion.getInvitados()){
            result.add(i.getMyDt());
        }
        return result;
    }
     
}
