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
import root.entidades.Espectaculo;
import root.entidades.Espectador;
import root.entidades.EstadoEspectaculo;
import root.entidades.EstadoRegistro;
import root.entidades.Funcion;
import root.entidades.Registro;
import root.entidades.Usuario;
import root.manejadores.ManejadorUsuarios;


/**
 *
 * @author julio
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Espectaculo> consulta = em.createNamedQuery("Espectaculo.listarPorEstado", Espectaculo.class);
        consulta.setParameter("estado", EstadoEspectaculo.INGRESADO);
        List<Espectaculo> e = consulta.getResultList();
        for(Espectaculo i:e){
            System.out.println(i.getNombre());
        }
        em.close();
        emf.close();
        
    }
    
}
