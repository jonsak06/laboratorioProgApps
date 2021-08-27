/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.sql.Date;
import java.util.List;

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
    
    public void confirmarAgregadoEspectaculo() {
        
    }
}
