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
    public List<DtUsuario> getDatos()
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
           
    public List<DtEspectador> getEspectadores()
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
    
    public List<DtArtista> getArtistas()
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
    
    public Usuario getUsuario(String nickname)
    {
        Usuario us=null;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        List<Artista> listaArtistas = em.createNamedQuery("Artista.findByNickname").getResultList();
        if(!listaArtistas.isEmpty())
        {
            us=listaArtistas.get(0);
        }
        List<Espectador> listaEspectadores = em.createNamedQuery("Espectador.findByNickname").getResultList();
        if(!listaEspectadores.isEmpty())
        {
            us=listaEspectadores.get(0);
        }
        return us;
    }
    
    public boolean existeUsuario(String nickname)
    {
        boolean us=false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        List<Artista> listaArtistas = em.createNamedQuery("Artista.findByNickname").getResultList();
        if(!listaArtistas.isEmpty())
        {
            us=true;
        }
        List<Espectador> listaEspectadores = em.createNamedQuery("Espectador.findByNickname").getResultList();
        if(!listaEspectadores.isEmpty())
        {
            us=true;
        }
        return us;
    }
    
    
}
