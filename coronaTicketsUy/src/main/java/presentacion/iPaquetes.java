/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import java.util.List;
import java.sql.Date;

/**
 *
 * @author dexion
 */
public interface iPaquetes {
    public boolean confirmarAltaPaquete(String nombre, String descripcion, Date fechaInicio, Date fechaFin, float descuento);
    public List<String> listarPaquetes();
    public List<String> listarPlataformas();
    public List<String> listarEspectaculosNoIncluidos(String nombrePaquete, String nombrePlataforma);
    public void confirmarAgregadoEspectaculo();
}
