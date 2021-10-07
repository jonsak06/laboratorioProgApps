/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.controladores;

import java.util.ArrayList;
import java.util.List;
import root.datatypes.DtArtista;
import root.datatypes.DtEspectaculo;
import root.datatypes.DtEspectador;
import root.datatypes.DtFuncion;
import root.datatypes.DtPaqueteDeEspectaculos;
import root.datatypes.DtPlataforma;
import root.datatypes.DtRegistro;
import root.datatypes.DtUsuario;
import root.manejadores.ManEspectaculo;
import root.manejadores.ManejadorUsuarios;
import root.entidades.Registro;
import root.interfaces.iUsuarios;

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
    
   public void canjearRegistros(List<String> canjeables, String nickname, float costo, String nombreFuncion, int fdia, int fmes, int fanio){
       ManejadorUsuarios.canjearRegistros(canjeables, nickname, costo, nombreFuncion, fdia, fmes, fanio);
   }
   
   public void registrarUsuario(String nickname, String nombreFuncion, float costo, int fdia, int fmes, int fanio){
       ManejadorUsuarios.registrarUsuario(nickname, nombreFuncion, costo, fdia, fmes,  fanio);
   }
   
   public DtEspectador getDatosEspectador(String nickname){
       return ManejadorUsuarios.getDatosEspectador(nickname);
   }
   
   public List<DtRegistro> getRegistros(String nickname)
   {
       return ManejadorUsuarios.getRegistros(nickname);
   }
   public List<DtFuncion> getFuncionesRegistros(String nickname)
   {
       return ManejadorUsuarios.getFuncionesRegistros(nickname);
   }
   
   public List<DtEspectaculo> listarEspectaculosDeArtista(String nickname)
   {
       return ManejadorUsuarios.listarEspectaculosDeArtista(nickname);
   }
   
   public DtPlataforma plataformaEspectaculosDeArtista(String nickname, String nombre)
   {
       return ManEspectaculo.plataformaEspectaculos(nombre);
   
   }
   public List<DtFuncion> listarFuncionesEspectaculosDeArtista(String nickname, String nombre)
   {
       return ManEspectaculo.listarFunciones(nombre);
   }
   public List<DtPaqueteDeEspectaculos> listarPaquetesEspectaculosDeArtista(String nickname, String nombre)
   {
       return ManEspectaculo.listarPaquetesEspectaculos(nombre);
   }
    
   public boolean existeCorreo(String correo)
   {
       return ManejadorUsuarios.existeCorreo(correo);
   }
   
   public  void actualizarRegistros(){
       ManejadorUsuarios.actualizarRegistros();
   }
   
   public List<DtUsuario> getUsuariosQueNoSiguesAr(String nickname)
   {
       return ManejadorUsuarios.getUsuariosQueNoSiguesAr(nickname);
   }
   
     public List<DtUsuario> getUsuariosQueSiguesAr(String nickname) 
     {
         return ManejadorUsuarios.getUsuariosQueSiguesAr(nickname);
     }
     public List<DtUsuario> getUsuariosQueSiguesEs(String nickname){
         return ManejadorUsuarios.getUsuariosQueSiguesEs(nickname);
     }
     public List<DtUsuario> getUsuariosQueNoSiguesEs(String nickname){
         return ManejadorUsuarios.getUsuariosQueNoSiguesEs(nickname);
     }
     
     
     public void seguirUsuarioEs(String nickname, String seguido){
         ManejadorUsuarios.seguirUsuarioEs(nickname, seguido);
     }
     
     public void seguirUsuarioAr(String nickname, String seguido){
         ManejadorUsuarios.seguirUsuarioAr(nickname, seguido);
     }
     
     public void dejarDeSeguirUsuarioEs(String nickname, String seguido)
     {
         ManejadorUsuarios.dejarDeSeguirUsuarioEs(nickname, seguido);
     }
     public void dejarDeSeguirUsuarioAr(String nickname, String seguido)
     {
         ManejadorUsuarios.dejarDeSeguirUsuarioAr(nickname, seguido);
     }
     
     public List<DtPaqueteDeEspectaculos> getPaquetesDelUsuario(String nickname){
         return ManejadorUsuarios.getPaquetesDelUsuario(nickname);
     }
     
     public void comprarPaquete(String nickname, String nombrePaq){
          ManejadorUsuarios.comprarPaquete(nickname, nombrePaq);
     }
}
