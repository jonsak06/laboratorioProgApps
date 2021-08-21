/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import java.sql.*;
import java.util.*;
import java.util.Properties;
import javax.persistence.*;

/**
 *
 * @author julio
 */
public class DatosDePruebaCtrl implements iDatosDePrueba {

    public void cargarDatos(){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Plataforma p = new Plataforma();
        p.setNombre("La casa de nana");
        p.setUrl("www.lcdn.com");
        em.persist(p);
        em.getTransaction().commit();
        em.getTransaction().begin();
        Artista a = new Artista();
        a.setApellido("Ramirez");
        a.setBiografia("Nacio en un deposito sucio");
        a.setCorreo("lolaRamirez@mail.com");
        a.setDescripcion("Terraja");
        java.sql.Date fecha = new java.sql.Date(2012-1899,12-12,15-31);
        a.setFechaNacimiento(fecha);
        a.setImagen("PATH");
        a.setLinkWeb("LINK");
        a.setNickname("laLoca");
        a.setNombre("Lola");
        em.persist(a);
        em.getTransaction().commit();
        em.getTransaction().begin();
        Espectaculo e = new Espectaculo();
        e.setArtista(a);
        e.setCantMaxEspectadores(10);
        e.setCantMinEspectadores(2);
        e.setCosto(500);
        e.setDescrp("La terrajada");
        e.setDuracion("200 dias");
        e.setFechaRegistro(fecha);
        e.setNombre("Bruto Baile");
        e.setPlataforma(p);
        e.setURL("miramequetemiro.org");
        em.persist(e);
        em.getTransaction().commit();
        em.close();
        emf.close();       
    }

    public DatosDePruebaCtrl() {
    }
}
