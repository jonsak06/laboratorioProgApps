/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
public class CtrlEspectaculos implements IEspectaculos {
    
    public CtrlEspectaculos(){}
    
    public List<DtPlataforma> listarPlataformas(){
        return ManPlataformas.getDatos();
    }
    
       public List<DtEspectaculo> listarEspectaculos(String nombre){
        return ManPlataformas.getEspectaculos(nombre);
    }
    
//    public List<DtEspectaculo> listarEspectaculos(String plataforma){
//        List<DtEspectaculo> dtE = new ArrayList<DtEspectaculo>();
//        
//    }
    public boolean existeEspectaculo(String nombreEspectaculo){
        return ManEspectaculo.existeEspectaculo(nombreEspectaculo);
    }
}
