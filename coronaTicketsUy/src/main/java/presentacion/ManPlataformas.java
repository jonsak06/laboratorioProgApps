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
    
   public static Plataforma getPlataforma(String nombrePlataforma){
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("PLATAFORMA");
       EntityManager em = emf.createEntityManager();
       em.getTransaction().begin();
       TypedQuery<Plataforma> consulta = em.createNamedQuery("Plataforma.findByNombre",Plataforma.class);
       consulta.setParameter("nombre", nombrePlataforma);
       List<Plataforma> lp = consulta.getResultList();
       em.getTransaction().commit();
       em.close();
       emf.close();
       return lp.get(0);
       
   }
        
        public static List<DtEspectaculo> getEspectaculos(String nombrePlataforma){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Plataforma> consulta = em.createNamedQuery("Plataforma.findByNombre",Plataforma.class);
        consulta.setParameter("nombre", nombrePlataforma);
        List<Plataforma> p = consulta.getResultList();
        Plataforma plat = p.get(0);
        em.getTransaction().commit();
        em.close();
        emf.close();
        List<DtEspectaculo> dtE = new ArrayList<DtEspectaculo>();
        for (int i=0;i<plat.getEspectaculos().size();i++){
            DtEspectaculo esteDt = new DtEspectaculo(plat.getEspectaculos().get(i).getId(),plat.getEspectaculos().get(i).getNombre(),plat.getEspectaculos().get(i).getDescrp(),plat.getEspectaculos().get(i).getDuracion(),plat.getEspectaculos().get(i).getCantMaxEspectadores(),plat.getEspectaculos().get(i).getCantMinEspectadores(),plat.getEspectaculos().get(i).getURL(),plat.getEspectaculos().get(i).getCosto(),plat.getEspectaculos().get(i).getFechaRegistro());
            dtE.add(esteDt);
        }
        return dtE;
        }
         
   
   
}
