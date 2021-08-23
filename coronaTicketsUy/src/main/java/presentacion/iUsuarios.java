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
 * @author tecnologo
 */

public interface iUsuarios {
//    public List<DtUsuario> getDatos();
    public List<DtEspectador> getEspectadores();
    public List<DtArtista> getArtistas();
//    public Usuario getUsuario(String nickname);
    boolean existeUsuario(String nickname);
    void altaArtista(DtArtista ar);
    void altaEspectador(DtEspectador es);
//    public void modificarArtista(DtArtista ar);
//    public void modificarEspectador(DtEspectador es);
}
