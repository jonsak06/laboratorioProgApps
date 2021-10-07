/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.guis;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import root.datatypes.DtEspectador;
import root.entidades.Espectador;
import root.entidades.EstadoRegistro;
import root.entidades.Funcion;
import root.entidades.Registro;
import root.*;
import root.datatypes.DtEspectaculo;
import root.datatypes.DtFuncion;
import root.entidades.Espectaculo;
import root.fabrica.Fabrica;
import root.interfaces.IEspectaculos;
import root.interfaces.iUsuarios;


/**
 *
 * @author julio
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Espectador> consulta = em.createNamedQuery("EspectadorporNick",Espectador.class);
        consulta.setParameter("nickname", "costas");
        Espectador esteMen = consulta.getSingleResult();
        em.getTransaction().commit();
        em.close();
        emf.close();
        List<DtFuncion> lista = new ArrayList<DtFuncion>();
        for(Registro r: esteMen.getRegistros()){
            if(r.getEstado()==EstadoRegistro.PENDIENTE){
            lista.add(r.getFuncion().getMyDt());
            }
        
        }
        
        for(DtFuncion f: lista){
        System.out.print(f.getNombre());
        }
        
    }
    
}