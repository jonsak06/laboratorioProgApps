/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.sql.Date;

/**
 *
 * @author dexion
 */
public class ctrlPaquetes implements iPaquetes {
    private static final ctrlPaquetes instance = new ctrlPaquetes();
    private ctrlPaquetes(){};
    public static ctrlPaquetes getInstance() {
        return instance;
    }
    
    private ManejadorPaquetes mp = ManejadorPaquetes.getInstance();
    
    public boolean confirmarAltaPaquete(String nombre, String descripcion, Date fechaInicio, Date fechaFin, float descuento){
        DtPaqueteDeEspectaculos dvPaquete = new DtPaqueteDeEspectaculos(nombre, descripcion, fechaInicio, fechaFin, descuento);
        return mp.crearPaquete(dvPaquete);
    };
}
