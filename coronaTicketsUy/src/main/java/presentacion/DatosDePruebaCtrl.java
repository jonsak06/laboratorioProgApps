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
        Artista vp = new Artista();
        vp.setApellido("People");
        vp.setBiografia("Grupo   americano   del   disco   creado por   Jacques   Morali   y   Henry   Belolo en   1977.   Según   Marjorie   Burgess, todo   comenzó   cuando   Morali   fue   a un bar gay de Nueva York una noche y notó al bailarín Felipe Rose vestido como un nativo americano.");
        vp.setCorreo("vpeople@tuta.io");
        vp.setDescripcion("Village   People   es   una   innovadora   formación   musical de   estilo   disco   de   finales   de   los   años   70.   Fue   famosa tanto   por   sus   peculiares   disfraces,   como   por   sus canciones pegadizas, con letras sugerentes y llenas dedobles sentidos.");
        java.sql.Date fvp = new java.sql.Date(1977-1899,1-12,1-31);
        vp.setFechaNacimiento(fvp);
        vp.setImagen("PATH");
        vp.setLinkWeb("www.officialvillagepeople.com");
        vp.setNickname("vpeople");
        vp.setNombre("Village");
        em.persist(vp);
        em.getTransaction().commit();
        em.close();
        emf.close();       
    }

    public DatosDePruebaCtrl() {
    }
}
