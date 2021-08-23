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
    List<DtEspectaculo> listarEspectaculos(String nombre);
    
    boolean existeEspectaculo(String nombreEspectaculo);
}
