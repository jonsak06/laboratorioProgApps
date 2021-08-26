/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import java.util.*;
import javax.persistence.*;
/**
 *
 * @author dexion
 */
public class ManejadorPaquetes {
    private static final ManejadorPaquetes instance = new ManejadorPaquetes();
    private ManejadorPaquetes(){};
    public static ManejadorPaquetes getInstance() {
        return instance;
    }
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
    
    public boolean existePaquete(String nombrePaquete) {
        EntityManager em = emf.createEntityManager();
        List<PaqueteDeEspectaculos> paq = em.createNamedQuery("PaqueteByName", PaqueteDeEspectaculos.class)
                .setParameter("nombre", nombrePaquete).getResultList();
        
        em.close();
        return paq.size()>0;
    };
    
    public boolean crearPaquete(DtPaqueteDeEspectaculos dvPaquete){
        if(existePaquete(dvPaquete.getNombre())) {
            return false;
        }
        PaqueteDeEspectaculos p = new PaqueteDeEspectaculos(dvPaquete);
        p.setFechaAlta(new java.sql.Date(System.currentTimeMillis()));
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();
        txn.begin();
        em.persist(p);
        txn.commit();
        em.close();
        return true;
    };
}
