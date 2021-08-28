/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.List;

/**
 *
 * @author julio
 */
public interface IEspectaculos {
    List<DtPlataforma> listarPlataformas();
    
    public List<DtEspectaculo> listarEspectaculos(String nombre);
    public List<DtFuncion> listarFunciones(String nombreEspectaculo);
    public float getDescuento(String nickname, String nombreFuncion);
    public float getCosto(String nombreFuncion);
    boolean existeEspectaculo(String nombreEspectaculo);
    public DtFuncion getDatosFuncion(String nombreFuncion);
    public boolean ingresarPlataforma(String nombre, String descripcion, String url);
    public boolean estaCompleta(String nombreFuncion);
}
