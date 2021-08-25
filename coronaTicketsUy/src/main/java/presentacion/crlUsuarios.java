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
public class crlUsuarios implements iUsuarios
{
//    public List<DtUsuario> getDatos()
//    {
//        
//        return ManejadorUsuarios.getDatos(); 
//    }
//           
    public crlUsuarios(){}
    public List<DtEspectador> getEspectadores()
    {
        
        return ManejadorUsuarios.getEspectadores(); 
    }
    
    public List<DtArtista> getArtistas()
    {
        return ManejadorUsuarios.getArtistas(); 
    }
//    
//    public Usuario getUsuario(String nickname)
//    {
//        return ManejadorUsuarios.getUsuario(nickname);
//    }
//    
    public boolean existeUsuario(String nickname)
    {
        if(ManejadorUsuarios.existeArtista(nickname))
        {
            return true;
        }
        else if(ManejadorUsuarios.existeEspectador(nickname))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public void altaArtista(DtArtista ar)
    { 
        ManejadorUsuarios.altaArtista(ar);
    }
    
    public void altaEspectador(DtEspectador es)
    {
        ManejadorUsuarios.altaEspectador(es);
    }
//    
    public void modificarArtista(DtArtista ar)
    {
        ManejadorUsuarios.modificarArtista(ar);
    }
    
    
    public void modificarEspectador(DtEspectador es)
    {
        ManejadorUsuarios.modificarEspectador(es);
    }
    
    public List<DtEspectador> getNoRegistrados(String nombreFuncion){
        return ManejadorUsuarios.getNoRegistrados(nombreFuncion);
    }
    
    public int getCanjeables(String nickname){
        return ManejadorUsuarios.getCanjeables(nickname);
    }
    
    public List<Registro> listarCanjeables(String nickname){
        return ManejadorUsuarios.listarCanjeables(nickname);
    }
    
   public void canjearRegistros(List<String> canjeables, String nickname, float costo, String nombreFuncion){
       ManejadorUsuarios.canjearRegistros(canjeables, nickname, costo, nombreFuncion);
   }
   
   public void registrarUsuario(String nickname, String nombreFuncion, float costo){
       ManejadorUsuarios.registrarUsuario(nickname, nombreFuncion, costo);
   }
   
   public DtEspectador getDatosEspectador(String nickname){
       return ManejadorUsuarios.getDatosEspectador(nickname);
   }

}
