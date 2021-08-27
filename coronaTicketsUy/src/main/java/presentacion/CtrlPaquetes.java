/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.sql.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author dexion
 */
public class CtrlPaquetes implements iPaquetes {
    private static final CtrlPaquetes instance = new CtrlPaquetes();
    private CtrlPaquetes(){};
    public static CtrlPaquetes getInstance() {
        return instance;
    }
    
    private ManejadorPaquetes mp = ManejadorPaquetes.getInstance();
    
    public boolean confirmarAltaPaquete(String nombre, String descripcion, Date fechaInicio, Date fechaFin, float descuento){
        DtPaqueteDeEspectaculos dvPaquete = new DtPaqueteDeEspectaculos(nombre, descripcion, fechaInicio, fechaFin, descuento);
        return mp.crearPaquete(dvPaquete);
    }
    
    public List<String> listarPaquetes() {
        return mp.getNombres();
    }
    
    public List<String> listarPlataformas() {
        return ManPlataformas.getNombres();
    }
    
    public List<String> listarEspectaculosNoIncluidos(String nombrePaquete, String nombrePlataforma) {
        List<String> nomEsps = ManEspectaculo.getNombres(nombrePlataforma);
        PaqueteDeEspectaculos p = mp.getPaquete(nombrePaquete);
        return p.filtrarEspectaculosNoIncluidos(nomEsps, nombrePlataforma);
    }
    
    public void confirmarAgregadoEspectaculo(String nombreEspectaculo, String nombrePaquete) {
        //falta corregir persistencia
        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction txn = em.getTransaction();
//        txn.begin();
        Espectaculo e = ManEspectaculo.getEspectaculo(nombreEspectaculo);
        PaqueteDeEspectaculos p = mp.getPaquete(nombrePaquete);
        p.addEspectaculo(e);
        e.addPaquete(p);
//        em.persist(p);
//        em.persist(e);
//        txn.commit();
//        em.close();  
//        emf.close();
        
    }
    
    public DtPaqueteDeEspectaculos mostrarInfoPaquete(String nombrePaquete) {
        PaqueteDeEspectaculos p = mp.getPaquete(nombrePaquete);
        return p.getMyDt();
    }
    
    public List<String> listarEspectaculosIncluidos(String nombrePaquete) {
        PaqueteDeEspectaculos p = mp.getPaquete(nombrePaquete);
        return p.getNombresEspectaculos();
    }
    
    public DtEspectaculo mostarInfoEspectaculo(String nombreEspectaculo) {
        Espectaculo e = ManEspectaculo.getEspectaculo(nombreEspectaculo);
        return e.getMyDt();
    }
}
