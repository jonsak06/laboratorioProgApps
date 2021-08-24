/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author elinzar
 */
public class ManEspectaculo {
    
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
       for (Funcion i :funciones){
           DtFuncion esteDt = new DtFuncion(i.getId(),i.getNombre(),i.getHoraInicio(),i.getFechaRegistro(),i.getFecha());
           lDtf.add(esteDt);
       }
       return lDtf;
    }
    
}
