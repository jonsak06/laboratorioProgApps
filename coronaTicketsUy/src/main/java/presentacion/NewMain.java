/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.Properties;
import javax.persistence.*;

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
        em.getTransaction().begin();
//        Plataforma p = new Plataforma();
//        p.setNombre("El rincon de Carlitos");
//        p.setUrl("www.elrincondecarlitos.com");
//        em.persist(p);
//        em.getTransaction().commit();
//        Artista a = new Artista();
//        java.sql.Date  f = new java.sql.Date(2012, 12, 12);
//        a.setApellido("Baracutanga");
//        a.setBiografia("Nacio en un deposito sucio");
//        a.setCorreo("elguille@mail.com");
//        a.setDescripcion("Canta Basofia");
//        a.setFechaNacimiento(f);
//        a.setImagen("fregr");
//        a.setLinkWeb("www");
//        a.setNickname("elguille");
//        a.setNombre("Guillermo");
//        em.getTransaction().begin();
//        Espectaculo e = new Espectaculo();
//        e.setCantMaxEspectadores(25);
//        e.setCantMinEspectadores(1);
//        e.setCosto(500);
//        e.setDescrp("Canta la Odiosa");
//        e.setFechaRegistro(f);
//        e.setNombre("CantaODIOSA");
//        e.setURL("www.elrincondecarlitos.com");
//        e.setPlataforma(p);
//        e.setArtista(a);
//        em.persist(a);
        String nombre = "El rincon de Carlitos";
        List <Plataforma> l   = em.createNamedQuery("Plataforma.findAll")
                .getResultList();
        //        em.persist(e);
        em.getTransaction().commit();
        System.out.print(l.get(0).getNombre());
        em.close();
        emf.close();
    }
    
}
