/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package serviciosWeb;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import root.datatypes.DtArtista;
import root.datatypes.DtEspectaculo;
import root.datatypes.DtEspectador;
import root.datatypes.DtFuncion;
import root.datatypes.DtPaqueteDeEspectaculos;
import root.datatypes.DtPlataforma;
import root.datatypes.DtRegistro;
import root.datatypes.DtUsuario;
import root.entidades.Espectador;

/**
 *
 * @author julio
 */
public class crlUsuariosTest {
    
    public crlUsuariosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEspectadores method, of class crlUsuarios.
     */
    @Test
    public void testGetEspectadores() {
        
        crlUsuarios instance = new crlUsuarios();
        
        Espectador el = new Espectador("eleven11","Eleven","Ten","eleven11@gmail.com",31,12,1971);
        Espectador co = new Espectador("costas","Gerardo","Costas","gcostas@gmail.com",15,11,1983);
        Espectador ew = new Espectador("waston","Emma","Watson","e.watson@gmail.com",15,4,1990);
        Espectador gh = new Espectador("house","Gregory","House","greghouse@gmail.com",15,5,1959);
        Espectador sp = new Espectador("sergiop","Sergio","Puglia","puglia@alpanpan.com.uy",28,1,1959);
        Espectador ar = new Espectador("chino","Alvaro","Recoba","chino@trico.org.uy",17,3,1976);
        Espectador ap = new Espectador("tonyp","Antonio","Pacheco","eltony@manya.org.uy",14,2,1955);
        Espectador ml = new Espectador("lachiqui","Mirtha","Legrand","lachiqui@hotmail.com.ar",23,2,1927);
        Espectador cb = new Espectador("cbochinche","Cacho","Bochinche","cbochinche@vera.com.uy",8,5,1937);
        el.setPasswd("lkj34df");
        el.setImagen("silueta.jpg");
        co.setPasswd("poke579");
        co.setImagen("silueta.jpg");
        ew.setPasswd("mkji648");
        ew.setImagen(ew.getNickname()+".jpg");
        gh.setPasswd("fcku0123");
        gh.setImagen(gh.getNickname()+".jpg");
        sp.setPasswd("vbmn4r");
        sp.setImagen(sp.getNickname()+".jpg");
        ar.setPasswd("ncnl123");
        ar.setImagen(ar.getNickname()+".jpg");
        ap.setPasswd("mny101");
        ap.setImagen(ap.getNickname()+".jpg");
        ml.setPasswd("1o1vbm");
        ml.setImagen("silueta.jpg");
        cb.setPasswd("ultraton01");
        cb.setImagen("silueta.jpg");
//        
        List<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add(el.getNickname());
        resultadoEsperado.add(co.getNickname());
        resultadoEsperado.add(ew.getNickname());
        resultadoEsperado.add(gh.getNickname());
        resultadoEsperado.add(sp.getNickname());
        resultadoEsperado.add(ar.getNickname());
        resultadoEsperado.add(ap.getNickname());
        resultadoEsperado.add(ml.getNickname());
        resultadoEsperado.add(cb.getNickname());
        List<String> resultado = new ArrayList<String>();
        List<DtEspectador> res = instance.getEspectadores();
        for(DtEspectador i: res){
            resultado.add(i.getNickname());
        }
        assertEquals(resultadoEsperado, resultado);
    }
//
//    /**
//     * Test of getArtistas method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetArtistas() {
//        System.out.println("getArtistas");
//        crlUsuarios instance = new crlUsuarios();
//        List<DtArtista> expResult = null;
//        List<DtArtista> result = instance.getArtistas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of existeUsuario method, of class crlUsuarios.
//     */
//    @Test
//    public void testExisteUsuario() {
//        System.out.println("existeUsuario");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        boolean expResult = false;
//        boolean result = instance.existeUsuario(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of existeArtista method, of class crlUsuarios.
//     */
//    @Test
//    public void testExisteArtista() {
//        System.out.println("existeArtista");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        boolean expResult = false;
//        boolean result = instance.existeArtista(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of existeEspectador method, of class crlUsuarios.
//     */
//    @Test
//    public void testExisteEspectador() {
//        System.out.println("existeEspectador");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        boolean expResult = false;
//        boolean result = instance.existeEspectador(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of altaArtista method, of class crlUsuarios.
//     */
//    @Test
//    public void testAltaArtista() {
//        System.out.println("altaArtista");
//        DtArtista ar = null;
//        crlUsuarios instance = new crlUsuarios();
//        instance.altaArtista(ar);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of altaEspectador method, of class crlUsuarios.
//     */
//    @Test
//    public void testAltaEspectador() {
//        System.out.println("altaEspectador");
//        DtEspectador es = null;
//        crlUsuarios instance = new crlUsuarios();
//        instance.altaEspectador(es);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of modificarArtista method, of class crlUsuarios.
//     */
//    @Test
//    public void testModificarArtista() {
//        System.out.println("modificarArtista");
//        DtArtista ar = null;
//        crlUsuarios instance = new crlUsuarios();
//        instance.modificarArtista(ar);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of modificarEspectador method, of class crlUsuarios.
//     */
//    @Test
//    public void testModificarEspectador() {
//        System.out.println("modificarEspectador");
//        DtEspectador es = null;
//        crlUsuarios instance = new crlUsuarios();
//        instance.modificarEspectador(es);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNoRegistrados method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetNoRegistrados() {
//        System.out.println("getNoRegistrados");
//        String nombreFuncion = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtEspectador> expResult = null;
//        List<DtEspectador> result = instance.getNoRegistrados(nombreFuncion);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCanjeables method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetCanjeables() {
//        System.out.println("getCanjeables");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        int expResult = 0;
//        int result = instance.getCanjeables(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarCanjeables method, of class crlUsuarios.
//     */
//    @Test
//    public void testListarCanjeables() {
//        System.out.println("listarCanjeables");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtRegistro> expResult = null;
//        List<DtRegistro> result = instance.listarCanjeables(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of canjearRegistros method, of class crlUsuarios.
//     */
//    @Test
//    public void testCanjearRegistros() {
//        System.out.println("canjearRegistros");
//        List<String> canjeables = null;
//        String nickname = "";
//        float costo = 0.0F;
//        String nombreFuncion = "";
//        int fdia = 0;
//        int fmes = 0;
//        int fanio = 0;
//        crlUsuarios instance = new crlUsuarios();
//        instance.canjearRegistros(canjeables, nickname, costo, nombreFuncion, fdia, fmes, fanio);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of registrarUsuario method, of class crlUsuarios.
//     */
//    @Test
//    public void testRegistrarUsuario() {
//        System.out.println("registrarUsuario");
//        String nickname = "";
//        String nombreFuncion = "";
//        float costo = 0.0F;
//        int fdia = 0;
//        int fmes = 0;
//        int fanio = 0;
//        crlUsuarios instance = new crlUsuarios();
//        instance.registrarUsuario(nickname, nombreFuncion, costo, fdia, fmes, fanio);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDatosEspectador method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetDatosEspectador() {
//        System.out.println("getDatosEspectador");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        DtEspectador expResult = null;
//        DtEspectador result = instance.getDatosEspectador(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDatosArtista method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetDatosArtista() {
//        System.out.println("getDatosArtista");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        DtArtista expResult = null;
//        DtArtista result = instance.getDatosArtista(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRegistros method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetRegistros() {
//        System.out.println("getRegistros");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtRegistro> expResult = null;
//        List<DtRegistro> result = instance.getRegistros(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFuncionesRegistros method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetFuncionesRegistros() {
//        System.out.println("getFuncionesRegistros");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtFuncion> expResult = null;
//        List<DtFuncion> result = instance.getFuncionesRegistros(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarEspectaculosDeArtista method, of class crlUsuarios.
//     */
//    @Test
//    public void testListarEspectaculosDeArtista() {
//        System.out.println("listarEspectaculosDeArtista");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtEspectaculo> expResult = null;
//        List<DtEspectaculo> result = instance.listarEspectaculosDeArtista(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of plataformaEspectaculosDeArtista method, of class crlUsuarios.
//     */
//    @Test
//    public void testPlataformaEspectaculosDeArtista() {
//        System.out.println("plataformaEspectaculosDeArtista");
//        String nickname = "";
//        String nombre = "";
//        crlUsuarios instance = new crlUsuarios();
//        DtPlataforma expResult = null;
//        DtPlataforma result = instance.plataformaEspectaculosDeArtista(nickname, nombre);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarFuncionesEspectaculosDeArtista method, of class crlUsuarios.
//     */
//    @Test
//    public void testListarFuncionesEspectaculosDeArtista() {
//        System.out.println("listarFuncionesEspectaculosDeArtista");
//        String nickname = "";
//        String nombre = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtFuncion> expResult = null;
//        List<DtFuncion> result = instance.listarFuncionesEspectaculosDeArtista(nickname, nombre);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPaquetesEspectaculosDeArtista method, of class crlUsuarios.
//     */
//    @Test
//    public void testListarPaquetesEspectaculosDeArtista() {
//        System.out.println("listarPaquetesEspectaculosDeArtista");
//        String nickname = "";
//        String nombre = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtPaqueteDeEspectaculos> expResult = null;
//        List<DtPaqueteDeEspectaculos> result = instance.listarPaquetesEspectaculosDeArtista(nickname, nombre);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of existeCorreo method, of class crlUsuarios.
//     */
//    @Test
//    public void testExisteCorreo() {
//        System.out.println("existeCorreo");
//        String correo = "";
//        crlUsuarios instance = new crlUsuarios();
//        boolean expResult = false;
//        boolean result = instance.existeCorreo(correo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of actualizarRegistros method, of class crlUsuarios.
//     */
//    @Test
//    public void testActualizarRegistros() {
//        System.out.println("actualizarRegistros");
//        crlUsuarios instance = new crlUsuarios();
//        instance.actualizarRegistros();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFuncionesNoRegistradas method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetFuncionesNoRegistradas() {
//        System.out.println("getFuncionesNoRegistradas");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtFuncion> expResult = null;
//        List<DtFuncion> result = instance.getFuncionesNoRegistradas(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tienePaquetesParaEspectaculo method, of class crlUsuarios.
//     */
//    @Test
//    public void testTienePaquetesParaEspectaculo() {
//        System.out.println("tienePaquetesParaEspectaculo");
//        String nickname = "";
//        String nombreEspectaculo = "";
//        crlUsuarios instance = new crlUsuarios();
//        boolean expResult = false;
//        boolean result = instance.tienePaquetesParaEspectaculo(nickname, nombreEspectaculo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPaquetesParaEsp method, of class crlUsuarios.
//     */
//    @Test
//    public void testListarPaquetesParaEsp() {
//        System.out.println("listarPaquetesParaEsp");
//        String nickname = "";
//        String nombreEspectaculo = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<String> expResult = null;
//        List<String> result = instance.listarPaquetesParaEsp(nickname, nombreEspectaculo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFuncionesRegistrosNoUsados method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetFuncionesRegistrosNoUsados() {
//        System.out.println("getFuncionesRegistrosNoUsados");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtFuncion> expResult = null;
//        List<DtFuncion> result = instance.getFuncionesRegistrosNoUsados(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUsuariosQueNoSiguesAr method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetUsuariosQueNoSiguesAr() {
//        System.out.println("getUsuariosQueNoSiguesAr");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtUsuario> expResult = null;
//        List<DtUsuario> result = instance.getUsuariosQueNoSiguesAr(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUsuariosQueSiguesAr method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetUsuariosQueSiguesAr() {
//        System.out.println("getUsuariosQueSiguesAr");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtUsuario> expResult = null;
//        List<DtUsuario> result = instance.getUsuariosQueSiguesAr(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUsuariosQueSiguesEs method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetUsuariosQueSiguesEs() {
//        System.out.println("getUsuariosQueSiguesEs");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtUsuario> expResult = null;
//        List<DtUsuario> result = instance.getUsuariosQueSiguesEs(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getUsuariosQueNoSiguesEs method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetUsuariosQueNoSiguesEs() {
//        System.out.println("getUsuariosQueNoSiguesEs");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtUsuario> expResult = null;
//        List<DtUsuario> result = instance.getUsuariosQueNoSiguesEs(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of seguirUsuarioEs method, of class crlUsuarios.
//     */
//    @Test
//    public void testSeguirUsuarioEs() {
//        System.out.println("seguirUsuarioEs");
//        String nickname = "";
//        String seguido = "";
//        crlUsuarios instance = new crlUsuarios();
//        instance.seguirUsuarioEs(nickname, seguido);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of seguirUsuarioAr method, of class crlUsuarios.
//     */
//    @Test
//    public void testSeguirUsuarioAr() {
//        System.out.println("seguirUsuarioAr");
//        String nickname = "";
//        String seguido = "";
//        crlUsuarios instance = new crlUsuarios();
//        instance.seguirUsuarioAr(nickname, seguido);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of dejarDeSeguirUsuarioEs method, of class crlUsuarios.
//     */
//    @Test
//    public void testDejarDeSeguirUsuarioEs() {
//        System.out.println("dejarDeSeguirUsuarioEs");
//        String nickname = "";
//        String seguido = "";
//        crlUsuarios instance = new crlUsuarios();
//        instance.dejarDeSeguirUsuarioEs(nickname, seguido);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of dejarDeSeguirUsuarioAr method, of class crlUsuarios.
//     */
//    @Test
//    public void testDejarDeSeguirUsuarioAr() {
//        System.out.println("dejarDeSeguirUsuarioAr");
//        String nickname = "";
//        String seguido = "";
//        crlUsuarios instance = new crlUsuarios();
//        instance.dejarDeSeguirUsuarioAr(nickname, seguido);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPaquetesDelUsuario method, of class crlUsuarios.
//     */
//    @Test
//    public void testGetPaquetesDelUsuario() {
//        System.out.println("getPaquetesDelUsuario");
//        String nickname = "";
//        crlUsuarios instance = new crlUsuarios();
//        List<DtPaqueteDeEspectaculos> expResult = null;
//        List<DtPaqueteDeEspectaculos> result = instance.getPaquetesDelUsuario(nickname);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of comprarPaquete method, of class crlUsuarios.
//     */
//    @Test
//    public void testComprarPaquete() {
//        System.out.println("comprarPaquete");
//        String nickname = "";
//        String nombrePaq = "";
//        crlUsuarios instance = new crlUsuarios();
//        instance.comprarPaquete(nickname, nombrePaq);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
