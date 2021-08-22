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
    public static List<DtUsuario> getDatos()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        List<Espectador> listaEspectadores = em.createNamedQuery("Espectador.findAll").getResultList();
        List<Artista> listaArtistas = em.createNamedQuery("Artista.findAll").getResultList();
        List<DtUsuario> lista = new ArrayList<DtUsuario>();
        
        for(int i=0; i<listaEspectadores.size(); i++)
        {
            Espectador hasCurrent = listaEspectadores.get(i);
            lista.add(hasCurrent.getMyDt());
        }
        
        for(int i=0; i<listaArtistas.size(); i++)
        {
            Artista hasCurrent = listaArtistas.get(i);
            lista.add(hasCurrent.getMyDt());
        }
        
        
        return lista; 
    }
           
    public static List<DtEspectador> getEspectadores()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        List<Espectador> listaEspectadores = em.createNamedQuery("Espectador.findAll").getResultList();
        List<DtEspectador> lista = new ArrayList<DtEspectador>();
        
        for(int i=0; i<listaEspectadores.size(); i++)
        {
            Espectador hasCurrent = listaEspectadores.get(i);
            lista.add(hasCurrent.getMyDt());
        }
        
        return lista; 
    }
    
    public static List<DtArtista> getArtistas()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        List<Artista> listaArtistas = em.createNamedQuery("Artista.findAll").getResultList();
        List<DtArtista> lista = new ArrayList<DtArtista>();
        
        for(int i=0; i<listaArtistas.size(); i++)
        {
            Artista hasCurrent = listaArtistas.get(i);
            lista.add(hasCurrent.getMyDt());
        }
        
        return lista; 
    }
    
    public static Usuario getUsuario(String nickname)
    {
        Usuario us=null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        
        List<Espectador> listaEspectadores = em.createNamedQuery("Espectador.findAll").getResultList();
        Espectador vp = null;
        for(int i=0; i<listaEspectadores.size(); i++)
        {
            vp=listaEspectadores.get(i);
            if(vp.getNickname()==nickname)
            {
                us=vp;
            }
        }
        List<Artista> listaArtistas = em.createNamedQuery("Artista.findAll").getResultList();
        Artista ar = null;
        for(int i=0; i<listaArtistas.size(); i++)
        {
            ar=listaArtistas.get(i);
            if(ar.getNickname()==nickname)
            {
                us=ar;
            }
        }
        
        
        return us;
    }
    
    public static boolean existeUsuario(String nickname)
    {
        boolean us=false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        List<Espectador> listaEspectadores = em.createNamedQuery("Espectador.findAll").getResultList();
        Espectador vp = null;
        for(int i=0; i<listaEspectadores.size(); i++)
        {
            vp=listaEspectadores.get(i);
            if(vp.getNickname()==nickname)
            {
                us=true;
            }
        }
        List<Artista> listaArtistas = em.createNamedQuery("Artista.findAll").getResultList();
        Artista vc = null;
        for(int i=0; i<listaArtistas.size(); i++)
        {
            vc=listaArtistas.get(i);
            if(vp.getNickname()==nickname)
            {
                us=true;
            }
        }
        
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
    }
    
    public static void modificarArtista(DtArtista ar)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Artista> listaArtistas = em.createNamedQuery("Artista.findAll").getResultList();
        Artista vp = null;
        for(int i=0; i<listaArtistas.size(); i++)
        {
            vp=listaArtistas.get(i);
            if(vp.getNickname()==ar.getNickname())
            {
                vp.setApellido(ar.getApellido());
                vp.setBiografia(ar.getBiografia());
                vp.setCorreo(ar.getCorreo());
                vp.setImagen(ar.getImagen());
                vp.setNombre(ar.getNombre());
                vp.setLinkWeb(ar.getLinkWeb());
            }
        }    
    }
    
    
    public static void modificarEspectador(DtEspectador es)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Espectador> listaEspectadores = em.createNamedQuery("Espectador.findAll").getResultList();
        Espectador vp = null;
        for(int i=0; i<listaEspectadores.size(); i++)
        {
            vp=listaEspectadores.get(i);
            if(vp.getNickname()==es.getNickname())
            {
                vp.setApellido(es.getApellido());
                vp.setCorreo(es.getCorreo());
                vp.setImagen(es.getImagen());
                vp.setNombre(es.getNombre());
            }
        }    
    }
    
}
