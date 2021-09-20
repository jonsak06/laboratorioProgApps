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
import root.entidades.Espectador;
import root.entidades.EstadoRegistro;
import root.entidades.Funcion;
import root.entidades.Registro;
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
        TypedQuery<Funcion> consulta = em.createNamedQuery("Funcion.findByNombre", Funcion.class);
        consulta.setParameter("nombre", "Bien de Familia - A");
        Funcion estaFuncion = consulta.getSingleResult();
        List<DtEspectador> listaFinal = new ArrayList<DtEspectador>();
        List<Registro> regF = estaFuncion.getRegistros();
        List<String> listadeNick = new ArrayList<String>();
        for (Registro i :regF){
            if(i.getEstado()!=EstadoRegistro.USADO){
            String nick = i.getEspectador().getNickname();
            listadeNick.add(nick);}
        }
        for (String i :listadeNick){
            TypedQuery<Espectador> cons = em.createNamedQuery("EspectadorporNick", Espectador.class);
            Espectador este = cons.setParameter("nickname", i).getSingleResult();
            DtEspectador esteDt = este.getMyDt();
            listaFinal.add(esteDt);
        }
        List<DtEspectador> resultado = new ArrayList<DtEspectador>();
        List<DtEspectador> listaTotal = ManejadorUsuarios.getEspectadores();
        for (DtEspectador i :listaTotal){
            int esta = 0;
            for(DtEspectador j :listaFinal){
                if(/*j.getId()==i.getId()*/j.getNickname().equals(i.getNickname())){esta = esta+1;}
                }
            if(esta == 0){resultado.add(i);}
        }
        for(DtEspectador i: resultado){
            System.out.println(i.getApellido());
        }
        em.close();
        emf.close();
        
    }
    
}
