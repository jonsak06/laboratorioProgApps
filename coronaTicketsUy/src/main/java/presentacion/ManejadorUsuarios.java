/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import java.util.*;
import java.io.Serializable;
import java.sql.Date;
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
//    
}
