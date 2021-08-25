/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import java.util.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author tecnologo
 */
public class ManejadorUsuarios 
{
    //Get la lista de usuarios
//    public static List<DtUsuario> getDatos()
//    {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
//        EntityManager em = emf.createEntityManager();
//        List<Espectador> listaEspectadores = em.createNamedQuery("Espectador.findAll").getResultList();
//        List<Artista> listaArtistas = em.createNamedQuery("Artista.findAll").getResultList();
//        List<DtUsuario> lista = new ArrayList<DtUsuario>();
//        
//        for(int i=0; i<listaEspectadores.size(); i++)
//        {
//            Espectador hasCurrent = listaEspectadores.get(i);
//            lista.add(hasCurrent.getMyDt());
//        }
//        
//        for(int i=0; i<listaArtistas.size(); i++)
//        {
//            Artista hasCurrent = listaArtistas.get(i);
//            lista.add(hasCurrent.getMyDt());
//        }
//        
//        
//        return lista; 
//    }
//           
    public ManejadorUsuarios(){}
    public static List<DtEspectador> getEspectadores()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Espectador> consulta = em.createNamedQuery("Espectador.findAll",Espectador.class);
        List<Espectador> e = consulta.getResultList();
        em.getTransaction().commit();
        em.close();
        emf.close();
        List<DtEspectador> dtE = new ArrayList<DtEspectador>();
        for (Espectador i :e){
            DtEspectador esteDt = i.getMyDt();
            dtE.add(esteDt);
        }
        return dtE; 
    }
//    
    public static List<DtArtista> getArtistas()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Artista> consulta = em.createNamedQuery("Artista.findAll",Artista.class);
        List<Artista> a = consulta.getResultList();
        em.getTransaction().commit();
        em.close();
        emf.close();
        List<DtArtista> dtA = new ArrayList<DtArtista>();
        for (Artista i :a){
            DtArtista esteDt = i.getMyDt();
            dtA.add(esteDt);
        }
        return dtA;
    }
        
    
//    
//    public static Usuario getUsuario(String nickname)
//    {
//        Usuario us=null;
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
//        EntityManager em = emf.createEntityManager();
//        
//        List<Espectador> listaEspectadores = em.createNamedQuery("Espectador.findAll").getResultList();
//        Espectador vp = null;
//        for(int i=0; i<listaEspectadores.size(); i++)
//        {
//            vp=listaEspectadores.get(i);
//            if(vp.getNickname()==nickname)
//            {
//                us=vp;
//            }
//        }
//        List<Artista> listaArtistas = em.createNamedQuery("Artista.findAll").getResultList();
//        Artista ar = null;
//        for(int i=0; i<listaArtistas.size(); i++)
//        {
//            ar=listaArtistas.get(i);
//            if(ar.getNickname()==nickname)
//            {
//                us=ar;
//            }
//        }
//        
//        
//        return us;
//    }
    
    public static List<DtEspectador> getNoRegistrados(String nombreFuncion){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Funcion> consulta = em.createNamedQuery("Funcion.findByNombre", Funcion.class);
        consulta.setParameter("nombre", nombreFuncion);
        Funcion estaFuncion = consulta.getSingleResult();
        em.getTransaction().commit();
        List<DtEspectador> listaFinal = new ArrayList<DtEspectador>();
        List<Registro> regF = estaFuncion.getRegistros();
        List<String> listadeNick = new ArrayList<String>();
        for (Registro i :regF){
            String nick = i.getEspectador().getNickname();
            listadeNick.add(nick);
        }
        for (String i :listadeNick){
            TypedQuery<Espectador> cons = em.createNamedQuery("EspectadorporNick", Espectador.class);
            Espectador este = cons.setParameter("nickname", i).getSingleResult();
            DtEspectador esteDt = este.getMyDt();
            listaFinal.add(esteDt);
        }
        List<DtEspectador> resultado = new ArrayList<DtEspectador>();
        List<DtEspectador> listaTotal = ManejadorUsuarios.getEspectadores();
        for (DtEspectador i :listaTotal){
            int esta = 0;
            for(DtEspectador j :listaFinal){
                if(j.getId()==i.getId()){esta = esta+1;}
                }
            if(esta == 0){resultado.add(i);}
        }
        em.close();
        emf.close(); 
        return resultado;
    }
    
    public static boolean existeArtista(String nickname)
    {
        boolean us=false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Artista> consulta = em.createNamedQuery("ArtistaporNick",Artista.class);
        consulta.setParameter("nickname", nickname);
        List<Artista> a = consulta.getResultList();
        em.getTransaction().commit();
        if(a.size()>0)
        {
            us=true;
        }
        em.close();
        emf.close(); 
        return us;
    }
    
    public static boolean existeEspectador(String nickname)
    {
        boolean us=false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Espectador> consulta = em.createNamedQuery("EspectadorporNick",Espectador.class);
        consulta.setParameter("nickname", nickname);
        List<Espectador> e = consulta.getResultList();
        em.getTransaction().commit();
        if(e.size()>0)
        {
            us=true;
        }
        em.close();
        emf.close(); 
        return us;
    }
    
    public static void altaArtista(DtArtista ar)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Artista vp = new Artista(ar.getNombre(), ar.getApellido(), ar.getCorreo(), ar.getNickname(), ar.getImagen(), ar.getFechaNacimiento(), ar.getDescripcion(), ar.getLinkWeb(), ar.getBiografia());
        em.getTransaction().commit();
        em.getTransaction().begin();
        
        em.persist(vp);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.close();
        emf.close(); 
    }
    
    public static void altaEspectador(DtEspectador es)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Espectador vp = new Espectador(es.getNombre(), es.getApellido(), es.getCorreo(), es.getNickname(), es.getImagen(), es.getFechaNacimiento());
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.persist(vp);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.close();
        emf.close(); 
    }
//    
    public static void modificarArtista(DtArtista ar)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Artista> lista = em.createNamedQuery("ArtistaporNick",Artista.class);
        lista.setParameter("nickname", ar.getNickname());
        Artista vp= lista.getSingleResult();
        vp.setApellido(ar.getApellido());
        vp.setBiografia(ar.getBiografia());
        vp.setCorreo(ar.getCorreo());
        vp.setImagen(ar.getImagen());
        vp.setNombre(ar.getNombre());
        vp.setLinkWeb(ar.getLinkWeb());
        em.persist(vp);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.close();
        emf.close(); 
    }
//    
//    
    public static void modificarEspectador(DtEspectador es)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Espectador> lista = em.createNamedQuery("EspectadorporNick",Espectador.class);
        lista.setParameter("nickname", es.getNickname());
        Espectador vp= lista.getSingleResult();
        vp.setApellido(es.getApellido());
        em.persist(vp);
        em.getTransaction().commit();
        em.close();
        emf.close(); 
        
    }
    
    public static int getCanjeables(String nickname){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Espectador> consulta = em.createNamedQuery("EspectadorporNick",Espectador.class);
        consulta.setParameter("nickname", nickname);
        consulta.getSingleResult().calcularCanjeables();
        int cantCanj =  consulta.getSingleResult().getCanjeables();
        em.close();
        emf.close();
        return cantCanj;
    }
    
    public static List<Registro> listarCanjeables(String nickname){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Espectador> consulta = em.createNamedQuery("EspectadorporNick",Espectador.class);
        consulta.setParameter("nickname", nickname);
        Espectador esteMen = consulta.getSingleResult();
        List<Registro> registros = esteMen.getRegistros();
        List<Registro> canjeables = new ArrayList<Registro>();
        for(Registro i:registros){
            if(i.getEstado()!=EstadoRegistro.USADO){
                canjeables.add(i);
            }
        }
        em.close();
        emf.close();
        return canjeables;
    }
    
    public static void canjearRegistros(List<String> canjeables, String nickname, float costo, String nombreFuncion){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
//        Registro r = new Registro();
//        r.setCosto(costo);
        List<Registro> canjeados = new ArrayList<Registro>();
        TypedQuery<Espectador> consulta = em.createNamedQuery("EspectadorporNick",Espectador.class);
        consulta.setParameter("nickname", nickname);
        Espectador esteMen = consulta.getSingleResult();
        TypedQuery<Funcion> consultaFuncion = em.createNamedQuery("Funcion.findByNombre",Funcion.class);
        consultaFuncion.setParameter("nombre", nombreFuncion);
        Funcion estaFUncion = consultaFuncion.getSingleResult();
//        r.setEspectador(esteMen);
//        r.setFuncion(estaFUncion);
        List<Registro> registros = esteMen.getRegistros();
        for(Registro i :registros){
            int esta = 0;
            for(String j :canjeables){
                if(i.getFuncion().getNombre().equals(j)){esta++;}
            }
            if(esta!=0){
                i.setEstado(EstadoRegistro.USADO);
                canjeados.add(i);
                i.setFuncion(null);
                em.persist(i);
            }
            }
//        r.setCanjeados(canjeados);
        java.util.Date fecha =new java.util.Date();
        int dia = fecha.getDate();
        int mes = fecha.getMonth();
        int anio = fecha.getYear()+1900;
//        java.sql.Date estaFecha = new java.sql.Date(anio+1900-1899,mes-12,dia-31);
//        r.setFecha(estaFecha);
//        r.setEstado(EstadoRegistro.PENDIENTE);
        Registro r = new Registro(estaFUncion,esteMen,dia,mes,anio,costo);
        em.persist(r);
        r.setCanjeados(canjeados);
        em.persist(r);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }            
    
    public static void registrarUsuario(String nickname, String nombreFuncion, float costo){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
//        Registro r = new Registro();
//        r.setCosto(costo);
        TypedQuery<Espectador> consulta = em.createNamedQuery("EspectadorporNick",Espectador.class);
        consulta.setParameter("nickname", nickname);
        Espectador esteMen = consulta.getSingleResult();
        TypedQuery<Funcion> consultaFuncion = em.createNamedQuery("Funcion.findByNombre",Funcion.class);
        consultaFuncion.setParameter("nombre", nombreFuncion);
        Funcion estaFUncion = consultaFuncion.getSingleResult();
//        r.setEspectador(esteMen);
//        r.setFuncion(estaFUncion);
        java.util.Date fecha =new java.util.Date();
        int dia = fecha.getDate();
        int mes = fecha.getMonth();
        int anio = fecha.getYear();
//        java.sql.Date estaFecha = new java.sql.Date(anio+1900-1899,mes-12,dia-31);
//        r.setFecha(estaFecha);
//        r.setEstado(EstadoRegistro.PENDIENTE);
        Registro r = new Registro(estaFUncion,esteMen,dia,mes,anio,costo);
        em.persist(r);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    public static DtEspectador getDatosEspectador(String nickname){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Espectador> consulta = em.createNamedQuery("EspectadorporNick",Espectador.class);
        consulta.setParameter("nickname", nickname);
        Espectador esteMen = consulta.getSingleResult();
        em.getTransaction().commit();
        em.close();
        emf.close();
        return esteMen.getMyDt();
    }
   //    
}
