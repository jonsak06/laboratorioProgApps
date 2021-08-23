/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author julio
 */
public class ManPlataformas {


    public ManPlataformas(){}
    
    public static List<DtPlataforma> getDatos(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Plataforma> consulta = em.createNamedQuery("Plataforma.findAll",Plataforma.class);
        List<Plataforma> p = consulta.getResultList();
        em.getTransaction().commit();
        em.close();
        emf.close();
        List<DtPlataforma> dtP = new ArrayList<DtPlataforma>();
        for (Plataforma i :p){
            DtPlataforma esteDt = new DtPlataforma(i.getId(),i.getUrl(),i.getNombre(),i.getDescripcion());
            dtP.add(esteDt);
        }
        return dtP;
        }
    
}
