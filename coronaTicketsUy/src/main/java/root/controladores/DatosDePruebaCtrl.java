/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.controladores;
import java.sql.*;
import java.util.*;
import java.util.Properties;
import javax.persistence.*;
import root.entidades.Artista;
import root.entidades.Espectaculo;
import root.entidades.Espectador;
import root.entidades.EstadoRegistro;
import root.entidades.Funcion;
import root.entidades.PaqueteDeEspectaculos;
import root.entidades.Plataforma;
import root.entidades.Registro;
import root.interfaces.iDatosDePrueba;

/**
 *
 * @author julio
 */
public class DatosDePruebaCtrl implements iDatosDePrueba {

    public void cargarDatos(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        
//        List<Artista> lista = new ArrayList<Artista>();
//        TypedQuery<Artista> consulta1 = em.createNamedQuery("Artista.findAll",Artista.class);
//        lista = consulta1.getResultList();
//        try{
//            lista = consulta1.getResultList();
//        }catch(Exception e){
//            lista = new ArrayList<Artista>();
//        }
        if(!existenDatos()){
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
        
        /////////////////////////CARGA DE LOS ESPECTACULOS///////////////////////////////
        em.getTransaction().begin();
        Espectaculo e1 = new Espectaculo("Los Village Volvieron", "Espectáculo   de   retorno   de   los Village People", 90, 10, 800,"https://www.instagram.com/realvillagepeople/", 550, 31, 3, 2021,vp,in);
        em.persist(e1);
        Espectaculo e2 = new Espectaculo("Global Spirit","Espectáculo   donde   se   presenta el álbum Spirit.", 120,30,1300,"https://es-la.facebook.com/pechemode",750,20,4,2021,dm,fb);
        em.persist(e2);
        Espectaculo e3 = new Espectaculo("Memphis Blues World","Espectáculo promoviendo álbum Memphis Blues.",110,5,1000,"https://twitter.com/cyndilauper",800,30,5,2021,cl,tl);
        em.persist(e3);
        Espectaculo e4 = new Espectaculo("Springsteen on Broadway","Springsteen  tocando  guitarra o\n" +
"piano   y   relatando   anécdotas\n" +
"recogidas   en   su   autobiografía\n" +
"de 2016, Born to Run. ",100,100,1500,"https://www.youtube.com/BruceSpringsteen",980,7,6,2021,bs,yt);
        em.persist(e4);
        Espectaculo e5 = new Espectaculo("Bien de Familia","El   dúo   estará   presentando   sus\n" +
"más   sonados   éxitos   y   también\n" +
"nuevas canciones ", 150,10,500,"https://twitter.com/PimpinelaNet",500,8,7,2021,pi,tl);
        em.persist(e5);
        Espectaculo e6 = new Espectaculo("30 años","Espectáculo conmemorando los 30 años de Violeta.",80,30,150,"https://twitter.com/alcides_shows",450,31,7,2021,al,tl);
        em.persist(e6);
        em.getTransaction().commit();
        ////////////////////////////////////////CARGA DE ESPECTACULOS TERMINADA//////////////////////////////////

        /////////////////////////////////CARGA DE FUNCIONES DE ESPECTACULOS/////////////////////////
        em.getTransaction().begin();
        List<Artista> artF1 = new ArrayList<Artista>();
        artF1.add(dm);
        artF1.add(cl);
        Funcion f1 = new Funcion("Los Village Volvieron - 1",15,4,2021,15,30,31,3,2021,e1,artF1);
        em.persist(f1);
        List<Artista> artF2 = new ArrayList<Artista>();
        artF2.add(bs);
        Funcion f2 = new Funcion("Los Village Volvieron - 2",1,5,2021,17,0,31,3,2021,e1,artF2);
        em.persist(f2);
        List<Artista> artF3 = new ArrayList<Artista>();
        artF3.add(bs);
        artF3.add(cl);
        Funcion f3 = new Funcion("Los Village Volvieron - 3",1,6,2021,18,0,31,3,2021,e1,artF3);
        em.persist(f3);
        List<Artista> artF4 = new ArrayList<Artista>();
        artF4.add(vp);
        Funcion f4 = new Funcion("Global Spirit (I)",16,6,2021,19,0,20,4,2021,e2,artF4);
        em.persist(f4);
        List<Artista> artF5 = new ArrayList();
        artF5.add(cl);
        artF5.add(bs);
        Funcion f5 = new Funcion("Global Spirit (II)",10,7,2021,20,0,20,4,2021,e2,artF5);
        em.persist(f5);
        List<Artista> artF6 = new ArrayList();
        artF6.add(pi);
        Funcion f6 = new Funcion("Global Spirit (III)",10,8,2021,17,45,20,4,2021,e2,artF6);
        em.persist(f6);
        List<Artista> artF7 = new ArrayList();
        artF7.add(bs);
        Funcion f7 = new Funcion("Memphis Blues World - A",15,8,2021,16,30,30,5,2021,e3,artF7);
        em.persist(f7);
        List<Artista> artF8 = new ArrayList();
        artF8.add(bs);
        artF8.add(dm);
        Funcion f8 = new Funcion("Memphis Blues World - B",31,8,2021,19,30,30,5,2021,e3,artF8);
        em.persist(f8);
        List<Artista> artF9 = new ArrayList();
        artF9.add(pi);
        artF9.add(bs);
        Funcion f9 = new Funcion("Memphis Blues World - C",30,9,2021,20,0,30,5,2021,e3,artF9);
        em.persist(f9);
        List<Artista> artF10 = new ArrayList();
        artF10.add(dm);
        artF10.add(tn);
        Funcion f10 = new Funcion("Springsteen on Broadway - i",1,9,2021,19,30,7,6,2021,e4,artF10);
        em.persist(f10);
        List<Artista> artF11 = new ArrayList();
        artF11.add(tn);
        artF11.add(ll);
        Funcion f11 = new Funcion("Springsteen on Broadway - ii",30,9,2021,17,0,7,6,2021,e4,artF11);
        em.persist(f11);
        List<Artista> artF12 = new ArrayList();
        artF12.add(ll);
        Funcion f12 = new Funcion("Springsteen on Broadway - iii",15,10,2021,20,0,7,6,2021,e4,artF12);
        em.persist(f12);
        List<Artista> artF13 = new ArrayList();
        artF13.add(al);
        Funcion f13 = new Funcion("Bien de Familia - A",25,9,2021,19,0,8,7,2021,e5,artF13);
        em.persist(f13);
        List<Artista> artF14 = new ArrayList();
        artF14.add(tn);
        Funcion f14 = new Funcion("Bien de Familia - B",25,10,2021,18,30,8,7,2021,e5,artF4);
        em.persist(f14);
        List<Artista> artF15 = new ArrayList();
        Funcion f15 = new Funcion("Bien de Familia - C",25,11,2021,17,45,8,7,2021,e5,artF15);
        em.persist(f15);
        List<Artista> artF16 = new ArrayList();
        artF16.add(dy);
        Funcion f16 = new Funcion("30 años - 1",1,9,2021,21,0,31,7,2021,e6,artF16);
        em.persist(f16);
        List<Artista> artF17 = new ArrayList();
        artF17.add(pi);
        artF17.add(dy);
        Funcion f17 = new Funcion("30 años - 2",1,10,2021,21,0,31,7,2021,e6,artF17);
        em.persist(f17);
        em.getTransaction().commit();
        //////////////////////////////////////CARGA DE FUNCIONES TERMINADA////////////////////////
        
        //////////////////////////////////////COMIENZO DE CARGA DE LOS REGISTROS////////////////
        em.getTransaction().begin();
        Registro r1 = new Registro(f1,co,9,4,2021,550);
        em.persist(r1);
        Registro r2 = new Registro(f1,sp,10,4,2021,550);
        em.persist(r2);
        Registro r3 = new Registro(f1,ar,12,4,2021,550);
        em.persist(r3);
        Registro r4 = new Registro(f2,ar,15,4,2021,550);
        em.persist(r4);
        Registro r5 = new Registro(f2,ap,20,4,2021,550);
        em.persist(r5);
        Registro r6 = new Registro(f2,co,25,4,2021,550);
        em.persist(r6);
        Registro r7 = new Registro(f2,ml,28,4,2021,550);
        em.persist(r7);
        Registro r8 = new Registro(f3,cb,16,4,2021,550);
        em.persist(r8);
        Registro r9 = new Registro(f3,co,15,5,2021,550);
        em.persist(r9);
        Registro r10 = new Registro(f3,ml,20,5,2021,550);
        em.persist(r10);
        Registro r11 = new Registro(f4,el,5,5,2021,750);
        em.persist(r11);
        Registro r12 = new Registro(f4,ew,10,5,2021,750);
        em.persist(r12);
        Registro r13 = new Registro(f4,sp,15,5,2021,750);
        em.persist(r13);
        Registro r14 = new Registro(f4,ap,20,5,2021,750);
        em.persist(r14);
        Registro r15 = new Registro(f5,gh,8,6,2021,750);
        em.persist(r15);
        Registro r16 = new Registro(f5,ew,16,6,2021,750);
        em.persist(r16);
        Registro r17 = new Registro(f5,ml,25,6,2021,750);
        em.persist(r17);
        Registro r18 = new Registro(f6,cb,5,7,2021,750);
        em.persist(r18);
        Registro r19 = new Registro(f6,sp,11,7,2021,750);
        em.persist(r19);
        Registro r20 = new Registro(f6,ar,18,7,2021,750);
        em.persist(r20);
        List<Registro> cr21 = new ArrayList<Registro>();
        cr21.add(r7);
        r7.setEstado(EstadoRegistro.USADO);
        cr21.add(r10);
        r10.setEstado(EstadoRegistro.USADO);
        cr21.add(r17);
        r17.setEstado(EstadoRegistro.USADO);
        Registro r21 = new Registro(f7,ml,19,7,2021,0);
        r21.setCanjeados(cr21);
        em.persist(r21);
        Registro r22 = new Registro(f8,el,17,8,2021,800);
        em.persist(r22);
        Registro r23 = new Registro(f8,gh,20,8,2021,800);
        em.persist(r23);
        Registro r24 = new Registro(f8,ar,23,8,2021,800);
        em.persist(r24);
        List<Registro> cr25 = new ArrayList<Registro>();
        cr25.add(r1);
        cr25.add(r6);
        cr25.add(r9);
        r1.setEstado(EstadoRegistro.USADO);
        r6.setEstado(EstadoRegistro.USADO);
        r9.setEstado(EstadoRegistro.USADO);
        Registro r25 = new Registro(f9,co,15,8,2021,0);
        r25.setCanjeados(cr25);
        em.persist(r25);
        Registro r26 = new Registro(f9,ew,26,8,2021,800);
        em.persist(r26);
        Registro r27 = new Registro(f10,ar,19,7,2021,0);
        List<Registro> cr27 = new ArrayList<Registro>();
        cr27.add(r3);
        cr27.add(r4);
        cr27.add(r20);
        r3.setEstado(EstadoRegistro.USADO);
        r4.setEstado(EstadoRegistro.USADO);
        r20.setEstado(EstadoRegistro.USADO);
        r27.setCanjeados(cr27);
        em.persist(r27);
        Registro r28 = new Registro(f10,ap,16,8,2021,980);
        em.persist(r28);
        Registro r29 = new Registro(f10,ml,24,8,2021,980);
        em.persist(r29);
        Registro r30 = new Registro(f11,sp,1,8,2021,0);
        List<Registro> cr30 = new ArrayList<Registro>();
        cr30.add(r2);
        cr30.add(r13);
        cr30.add(r19);
        r2.setEstado(EstadoRegistro.USADO);
        r13.setEstado(EstadoRegistro.USADO);
        r19.setEstado(EstadoRegistro.USADO);
        r30.setCanjeados(cr30);
        em.persist(r30);
        Registro r31 = new Registro(f11,gh,30,8,2021,980);
        em.persist(r31);
        Registro r32 = new Registro(f12,el,16,8,2021,980);
        em.persist(r32);
        Registro r33 = new Registro(f12,co,16,8,2021,980);
        em.persist(r33);
        Registro r34 = new Registro(f12,ew,1,9,2021,980);
        em.persist(r34);
        Registro r35 = new Registro(f12,sp,5,9,2021,980);
        em.persist(r35);
        Registro r36 = new Registro(f13,gh,16,8,2021,500);
        em.persist(r36);
        Registro r37 = new Registro(f13,cb,3,9,2021,500);
        em.persist(r37);
        Registro r38 = new Registro(f14,el,16,8,2021,500);
        em.persist(r38);
        Registro r39 = new Registro(f14,cb,6,9,2021,500);
        em.persist(r39);
        Registro r40 = new Registro(f15,co,1,9,2021,500);
        em.persist(r40);
        Registro r41 = new Registro(f16,sp,16,8,2021,450);
        em.persist(r41);
        Registro r42 = new Registro(f16,el,20,8,2021,450);
        em.persist(r42);
        Registro r43 = new Registro(f16,ap,31,8,2021,450);
        em.persist(r43);
        Registro r44 = new Registro(f17,ar,16,8,2021,450);
        em.persist(r44);
        Registro r45 = new Registro(f17,ap,20,8,2021,450);
        em.persist(r45);
        Registro r46 = new Registro(f17,co,2,9,2021,450);
        em.persist(r46);
        em.getTransaction().commit();
        
        /////////////////////////////////////FIN DE LA CARGA DE REGISTROS//////////////////////
        
        ////////////////////////////////INICIO DE CARGA DE PAQUETES///////////////////////
        em.getTransaction().begin();
        PaqueteDeEspectaculos p1 = new PaqueteDeEspectaculos("Paquete de Bandas","Paquete de Bandas Musicales",20,1,5,2021,31,7,2021,30,4,2021);
        PaqueteDeEspectaculos p2 = new PaqueteDeEspectaculos("Paquete Solistas","Paquete de Solistas",30,1,8,2021,30,9,2021,15,7,2021);       
        PaqueteDeEspectaculos p3 = new PaqueteDeEspectaculos("Paquete Latino","Paquete de espectaculos latinos",15,15,8,2021,15,11,2021,1,8,2021);
        p1.addEspectaculo(e1);
        e1.addPaquete(p1);
        p1.addEspectaculo(e2);
        e2.addPaquete(p1);
        p2.addEspectaculo(e3);
        e3.addPaquete(p2);
        p2.addEspectaculo(e4);
        e4.addPaquete(p2);
        p3.addEspectaculo(e5);
        e5.addPaquete(p3);
        p3.addEspectaculo(e6);
        e6.addPaquete(p3);
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(e1);
        em.persist(e2);
        em.persist(e3);
        em.persist(e4);
        em.persist(e5);
        em.persist(e6);
        em.getTransaction().commit();
        /////////////////////////////////FIN DE CARGA DE PAQUETES/////////////////////////
        
       
        System.out.print("CARGA TERMINADA");
    //        em.getTransaction().begin();
    //        el.actualizarRegistros();
    //        co.actualizarRegistros();
    //        ew.actualizarRegistros();
    //        gh.actualizarRegistros();
    //        sp.actualizarRegistros();
    //        ar.actualizarRegistros();
    //        ap.actualizarRegistros();
    //        ml.actualizarRegistros();
    //        cb.actualizarRegistros();
    //        em.persist(el);
    //        em.persist(co);
    //        em.persist(ew);
    //        em.persist(gh);
    //        em.persist(sp);
    //        em.persist(ar);
    //        em.persist(ap);
    //        em.persist(ml);
    //        em.persist(cb);
    //        em.getTransaction().commit();
    //        System.out.print("Actualizados los registros");
        em.close();
        emf.close();  
        }
        ////ACTUALIZAR LOS REGISTROS DE LOS ESPECTADORES//////
        
        ////acceder desde mysql //// sudo mysql -h raspberrypijulio.ddns.net --port 8457 -u grupo1 -p   //pass grupo12021
    }

    public DatosDePruebaCtrl() {
    }
    
    public boolean existenDatos() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCIA");
        EntityManager em = emf.createEntityManager();
        List<Artista> lista = new ArrayList<Artista>();
        TypedQuery<Artista> consulta1 = em.createNamedQuery("Artista.findAll",Artista.class);
        lista = consulta1.getResultList();
        em.close();
        emf.close();
        return lista.size() > 0;
    }
}
