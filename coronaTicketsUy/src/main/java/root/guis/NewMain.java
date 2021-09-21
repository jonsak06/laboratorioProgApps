/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.guis;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import root.datatypes.DtEspectador;
import root.entidades.Espectador;
import root.entidades.EstadoRegistro;
import root.entidades.Funcion;
import root.entidades.Registro;
import root.*;
import root.datatypes.DtEspectaculo;
import root.fabrica.Fabrica;
import root.interfaces.IEspectaculos;


/**
 *
 * @author julio
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IEspectaculos ie = Fabrica.getCtrlEspectaculos();
        List<DtEspectaculo> e = ie.listarEspectaculos("Youtube");
        System.out.println(e.size());
        
    }
    
}
