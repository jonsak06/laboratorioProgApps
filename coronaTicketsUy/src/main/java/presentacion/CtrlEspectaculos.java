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
    
    public  List<DtEspectaculo> listarEspectaculos(String nombre){
        return ManPlataformas.getEspectaculos(nombre);
    }
    
    public boolean existeEspectaculo(String nombreEspectaculo){
        return ManEspectaculo.existeEspectaculo(nombreEspectaculo);
    }
    
    public List<DtFuncion> listarFunciones(String nombreEspectaculo){
        return ManEspectaculo.listarFunciones(nombreEspectaculo);
    }
    
    public float getDescuento(String nickname, String nombreFuncion){
        return ManEspectaculo.getDescuento(nickname, nombreFuncion);
    }
    
    public float getCosto(String nombreFuncion){
        return ManEspectaculo.getCosto(nombreFuncion);
    }
    
    public DtFuncion getDatosFuncion(String nombreFuncion){
        return ManEspectaculo.getDatosFuncion(nombreFuncion);
    }
    
    public boolean ingresarPlataforma(String nombre, String descripcion, String url){
        return ManPlataformas.ingresarPlataforma(nombre, descripcion, url);
    }
}
