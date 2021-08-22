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
           
    
}
