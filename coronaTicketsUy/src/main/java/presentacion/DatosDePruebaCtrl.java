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
        
        //////////////////////CARGA DE DATOS DE ARTISTAS////////////////////////////////////
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
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.persist(vp);
        Artista dm = new Artista();
        dm.setApellido("Mode");
        dm.setBiografia(" ");
        dm.setCorreo("dmode@tuta.io");
        dm.setDescripcion("Depeche   Mode   es   un   grupo   inglés   de   música electrónica   formado   en   Basildon,   Essex,   en   1980   por Vicent   Clarke   y   Andrew   John   Fletcher,   a   los   que   se unieron Martin Lee Gore y poco después David Gahan. Actualmente   se   le   considera   como   grupo   de   música alternativa.");
        java.sql.Date fdm = new java.sql.Date(1980-1899,6-12,14-31);
        dm.setFechaNacimiento(fdm);
        dm.setImagen("PATH");
        dm.setLinkWeb("www.depechemode.com");
        dm.setNickname("dmode");
        dm.setNombre("Depeche");
        em.persist(dm);
        em.getTransaction().commit();
        em.getTransaction().begin();
        Artista cl = new Artista();
        cl.setApellido("Lauper");
        cl.setBiografia("Cynthia   Ann   Stephanie   Lauper\n" +
"(Brooklyn,   Nueva  York;   22   de   junio\n" +
"de 1953).");
        cl.setCorreo("clauper@hotmail.com");
        cl.setDescripcion("Cynthia Ann Stephanie Lauper, conocida simplemente\n" +
"como   Cyndi   Lauper,   es   una   cantautora,   actriz   y\n" +
"empresaria   estadounidense.   Después   de   participar   en\n" +
"el   grupo   musical,   Blue   Angel,   en   1983   firmó   con\n" +
"Portrait   Records   (filial   de   Epic   Records)   y   lanzó   su\n" +
"exitoso álbum debut She's So Unusual a finales de ese\n" +
"mismo año. Siguió  lanzando una serie de álbumes en\n" +
"los que encontró una inmensa popularidad, superando\n" +
"los límites de contenido de las letras de sus canciones");
        java.sql.Date fcl = new java.sql.Date(1953-1899,6-12,22-31);
        cl.setFechaNacimiento(fcl);
        cl.setImagen("PATH");
        cl.setLinkWeb("cyndilauper.com");
        cl.setNickname("clouper");
        cl.setNombre("Cyndi");
        em.persist(cl);
        em.getTransaction().commit();
        em.getTransaction().begin();
        Artista bs = new Artista();
        bs.setApellido("Springsteen");
        bs.setBiografia(" ");
        bs.setCorreo("bruceTheBoss@gmail.com");
        bs.setDescripcion("Bruce   Frederick   Joseph   Springsteen   (Long   Branch,\n" +
"Nueva Jersey, 23 de septiembre de 1949), más conocido\n" +
"como   Bruce   Springsteen,   es   un   cantante,   músico   y\n" +
"compositor estadounidense.");
        java.sql.Date fbs = new java.sql.Date(1949-1899,9-12,23-31);
        bs.setFechaNacimiento(fbs);
        bs.setImagen("PATH");
        bs.setLinkWeb("brucespringsteen.net");
        bs.setNickname("bruceTheBoss");
        bs.setNombre("Bruce");
        em.persist(bs);
        em.getTransaction().commit();
        em.getTransaction().begin();
        Artista tn = new Artista();
        tn.setApellido("Nelson");
        tn.setBiografia(" ");
        tn.setCorreo("tripleNelson@tuta.io");
        tn.setDescripcion("La   Triple   Nelson   es   un   grupo   de   rock   uruguayo\n" +
"formado en enero de 1998 e integrado inicialmente por\n" +
"Christian Cary (guitarra y voz), Fernando \"Paco\" Pintos\n" +
"(bajo y coros) y Rubén Otonello (actualmente su nuevo\n" +
"baterista es Rafael Ugo).");
        java.sql.Date ftn = new java.sql.Date(1998-1899,1-12,1-31);
        tn.setFechaNacimiento(ftn);
        tn.setImagen("PATH");
        tn.setLinkWeb("www.latriplenelson.uy");
        tn.setNickname("tripleNelson");
        tn.setNombre("La Triple");
        em.persist(tn);
        em.getTransaction().commit();
        em.getTransaction().begin();
        Artista ll = new Artista();
        ll.setApellido("Ley");
        ll.setBiografia(" ");
        ll.setCorreo("la_ley@tuta.io");
        ll.setDescripcion("La Ley fue una banda chilena de rock formada en 1987\n" +
"por   iniciativa   del   tecladista   y   guitarrista.   En   un\n" +
"principio, La Ley tenía la aspiración de ser un grupo de\n" +
"música tecno. Este disco resulta ser un éxito de ventas\n" +
"y   reciben   una   invitación   al   Festival   Internacional   de\n" +
"Viña del Mar de febrero de 1994.");
        java.sql.Date fll = new java.sql.Date(1987-1899,2-12,14-31);
        ll.setFechaNacimiento(fll);
        ll.setImagen("PATH");
        ll.setLinkWeb("www.lasleyesdenewton.com");
        ll.setNickname("la_ley");
        ll.setNombre("La");
        em.persist(ll);
        em.getTransaction().commit();
        em.getTransaction().begin();
        Artista pi = new Artista();
        pi.setApellido("Pimpinela");
        pi.setBiografia(" ");
        pi.setCorreo("lospimpi@gmail.com");
        pi.setDescripcion("Pimpinela es un dúo musical argentino compuesto por\n" +
"los hermanos Lucía Galán y Joaquín Galán. Pimpinela\n" +
"ha editado veinticuatro discos");
        java.sql.Date fpi = new java.sql.Date(1981-1899,8-12,13-31);
        pi.setFechaNacimiento(fpi);
        pi.setImagen("PATH");
        pi.setLinkWeb("www.pimpinela.net");
        pi.setNickname("lospimpi");
        pi.setNombre("Pimpinela");
        em.persist(pi);
        em.getTransaction().commit();
        em.getTransaction().begin();
        Artista dy = new Artista();
        dy.setApellido("Ango");
        dy.setBiografia(" ");
        dy.setCorreo("dyangounchained@gmail.com");
        dy.setDescripcion("José   Gómez   Romero,   conocido   artísticamente   como\n" +
"Dyango es un cantante español de música romántica.");
        java.sql.Date fdy = new java.sql.Date(1981-1899,8-12,13-31);
        dy.setFechaNacimiento(fdy);
        dy.setImagen("PATH");
        dy.setLinkWeb(" ");
        dy.setNickname("dyangounchained");
        dy.setNombre("Dyango");
        em.persist(dy);
        em.getTransaction().commit();
        em.getTransaction().begin();
        Artista al = new Artista();
        al.setApellido("Violeta");
        al.setBiografia(" ");
        al.setCorreo("alcides@tuta.io");
        al.setDescripcion("Su   carrera   comienza   en   1976   cuando   forma   la   banda\n" +
"Los   Playeros   junto   a   su   hermano   Víctor.   Al   poco\n" +
"tiempo   se   mudan   a   San   Luis   donde   comienzan   a\n" +
"hacerse conocidos en la escena musical. Su éxito a nivel\n" +
"nacional   llega   a   comienzos   de   los   años   1990   cuando\n" +
"desembarca en Buenos Aires y graba el éxito \"Violeta\",\n" +
"originalmente compuesta e interpretada en 1985 por el\n" +
"músico brasileño Luiz Caldas bajo el título «Fricote»");
        java.sql.Date fal = new java.sql.Date(1952-1899,7-12,17-31);
        al.setFechaNacimiento(fal);
        al.setImagen("PATH");
        al.setLinkWeb(" ");
        al.setNickname("alcides");
        al.setNombre("Alcides");
        em.persist(al);
        em.getTransaction().commit();
        ////////////////////////////FIN DE LA CARGA DE DATOS DE ARTISTAS///////////////////////////////
        
        ////////////////////////////CARGA DE ESPECTADORES//////////////////////////////////////////////
        em.getTransaction().begin();
        Espectador el = new Espectador("eleven11","Eleven","Ten","eleven11@gmail.com",31,12,1971);
        em.persist(el);
        Espectador co = new Espectador("costas","Gerardo","Costas","gcostas@gmail.com",15,11,1983);
        em.persist(co);
        Espectador ew = new Espectador("waston","Emma","Watson","e.watson@gmail.com",15,4,1990);
        em.persist(ew);
        Espectador gh = new Espectador("house","Gregory","House","greghouse@gmail.com",15,5,1959);
        em.persist(gh);
        Espectador sp = new Espectador("sergiop","Sergio","Puglia","puglia@alpanpan.com.uy",28,1,1959);
        em.persist(sp);
        Espectador ar = new Espectador("chino","Alvaro","Recoba","chino@trico.org.uy",17,3,1976);
        em.persist(ar);
        Espectador ap = new Espectador("tonyp","Antonio","Pacheco","eltony@manya.org.uy",14,2,1955);
        em.persist(ap);
        Espectador ml = new Espectador("lachiqui","Mirtha","Legrand","lachiqui@hotmail.com.ar",23,2,1927);
        em.persist(ml);
        Espectador cb = new Espectador("cbochinche","Cacho","Bochinche","cbochinche@vera.com.uy",8,5,1937);
        em.persist(cb);
        em.getTransaction().commit();
        ///////////////////////////////FIN DE LA CARGA DE ESPECTADORES/////////////////////////////////////
        
        //////////////////////////////CARGA DE PLATAFORMAS/////////////////////////////////
        em.getTransaction().begin();
        Plataforma in = new Plataforma("Instagram Live","Funcionalidad de la red social Instagram, con la que \n" +
"los usuarios pueden transmitir vídeos en vivo.","https://www.instagram.com/liveoficial");
        em.persist(in);
        Plataforma fb = new Plataforma("Facebook Watch","Servicio de video bajo demanda operado por \n" +
"Facebook.","https://www.facebook.com/watch/");
        em.persist(fb);
        Plataforma tl = new Plataforma("Twitter Live","Aplicación de Twitter para la transmisión de video \n" +
"en directo (streaming).","https://twitter.com/");
        em.persist(tl);
        Plataforma yt = new Plataforma("Youtube","Sitio web de origen estadounidense dedicado a \n" +
"compartir videos.","https://www.youtube.com/");
        em.persist(yt);
        em.getTransaction().commit();
        //////////////////////////////FIN DE LA CARGA DE PLATAFORMAS////////////////////////
        
        em.close();
        emf.close();       
    }

    public DatosDePruebaCtrl() {
    }
}
