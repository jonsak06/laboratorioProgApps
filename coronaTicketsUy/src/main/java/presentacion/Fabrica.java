/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * @author julio
 */
public class Fabrica {

    public Fabrica() {
    }
    
    public static iDatosDePrueba getDatosDePrueba(){
        iDatosDePrueba d = new DatosDePruebaCtrl();
        return d;
    }
    
    public static iUsuarios getCrlUsuarios(){
        iUsuarios u = new crlUsuarios();
        return u;
    }
    
    public static IEspectaculos getCtrlEspectaculos(){
        IEspectaculos e = new CtrlEspectaculos();
        return e;
    }
    
    public static iPaquetes getCtrlPaquetes(){
        iPaquetes cp = ctrlPaquetes.getInstance();
        return cp;
    }
    
}
