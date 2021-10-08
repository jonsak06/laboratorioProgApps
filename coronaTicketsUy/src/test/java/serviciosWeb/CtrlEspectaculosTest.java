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
import root.datatypes.DtFuncion;
import root.datatypes.DtPlataforma;
import root.entidades.EstadoEspectaculo;
import root.entidades.Plataforma;

/**
 *
 * @author julio
 */
public class CtrlEspectaculosTest {
    
    public CtrlEspectaculosTest() {
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
     * Test of listarPlataformas method, of class CtrlEspectaculos.
     */
    @Test
    public void testListarPlataformas() {
        System.out.println("listarPlataformas");
         Plataforma in = new Plataforma("Instagram Live","Funcionalidad de la red social Instagram, con la que \n" +
"los usuarios pueden transmitir vídeos en vivo.","https://www.instagram.com/liveoficial");
        Plataforma fb = new Plataforma("Facebook Watch","Servicio de video bajo demanda operado por \n" +
"Facebook.","https://www.facebook.com/watch/");
        Plataforma tl = new Plataforma("Twitter Live","Aplicación de Twitter para la transmisión de video \n" +
"en directo (streaming).","https://twitter.com/");
        Plataforma yt = new Plataforma("Youtube","Sitio web de origen estadounidense dedicado a \n" +
"compartir videos.","https://www.youtube.com/");
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<String> expResult = new ArrayList<String>();
          expResult.add(in.getNombre());
          expResult.add(fb.getNombre());
          expResult.add(tl.getNombre());
          expResult.add(yt.getNombre());
        List<DtPlataforma> result = instance.listarPlataformas();
        List<String> resultado = new ArrayList<String>();
        for(DtPlataforma i: result){
        resultado.add(i.getNombre());
        }
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
    }

//    /**
//     * Test of listarEspectaculos method, of class CtrlEspectaculos.
//     */
    @Test
    public void testListarEspectaculos() {
        CtrlEspectaculos instance = new CtrlEspectaculos();
        String nombre = "Twitter Live";
        List<String> resEsp = new ArrayList<String>();
        List<String> res = new ArrayList<String>();
        resEsp.add("Memphis Blues World");
        resEsp.add("Bien de Familia");
        resEsp.add("30 anios");
        List<DtEspectaculo> result = instance.listarEspectaculos(nombre);
        for(DtEspectaculo i:result){
            res.add(i.getNombre());
        }
        assertEquals(resEsp, res);
    }
//
    /**
     * Test of existeEspectaculo method, of class CtrlEspectaculos.
     */
    @Test
    public void testExisteEspectaculo1() {
        String nombreEspectaculo = "Los Village Volvieron";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        boolean expResult = true;
        boolean result = instance.existeEspectaculo(nombreEspectaculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
        public void testExisteEspectaculo2() {
        String nombreEspectaculo = "Grandes Exitos 2020";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        boolean expResult = false;
        boolean result = instance.existeEspectaculo(nombreEspectaculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
        public void testExisteEspectaculo3() {
        String nombreEspectaculo = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        boolean expResult = false;
        boolean result = instance.existeEspectaculo(nombreEspectaculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
//
//    /**
//     * Test of listarFunciones method, of class CtrlEspectaculos.
//     */
    @Test
    public void testListarFunciones1() {
        String nombreEspectaculo = "Llega a Casa";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<DtFuncion> expResult = null;
        List<DtFuncion> result = instance.listarFunciones(nombreEspectaculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
       @Test
    public void testListarFunciones2() {
        String nombreEspectaculo = "Llega a Casa";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<DtFuncion> expResult = null;
        List<DtFuncion> result = instance.listarFunciones(nombreEspectaculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
//
    /**
     * Test of getDescuento method, of class CtrlEspectaculos.
     */
    @Test
    public void testGetDescuento() {
        String nickname = "costas";
        String nombreFuncion = "Bien de Familia - B";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        float expResult = 15;
        float result = instance.getDescuento(nickname, nombreFuncion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

//    /**
//     * Test of getCosto method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testGetCosto() {
//        System.out.println("getCosto");
//        String nombreFuncion = "";
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        float expResult = 0.0F;
//        float result = instance.getCosto(nombreFuncion);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDatosFuncion method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testGetDatosFuncion() {
//        System.out.println("getDatosFuncion");
//        String nombreFuncion = "";
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        DtFuncion expResult = null;
//        DtFuncion result = instance.getDatosFuncion(nombreFuncion);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of existePlataforma method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testExistePlataforma() {
//        System.out.println("existePlataforma");
//        String nombrePlat = "";
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        boolean expResult = false;
//        boolean result = instance.existePlataforma(nombrePlat);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ingresarPlataforma method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testIngresarPlataforma() {
//        System.out.println("ingresarPlataforma");
//        String nombre = "";
//        String descripcion = "";
//        String url = "";
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        boolean expResult = false;
//        boolean result = instance.ingresarPlataforma(nombre, descripcion, url);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of estaCompleta method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testEstaCompleta() {
//        System.out.println("estaCompleta");
//        String nombreFuncion = "";
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        boolean expResult = false;
//        boolean result = instance.estaCompleta(nombreFuncion);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of crearFuncion method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testCrearFuncion() {
//        System.out.println("crearFuncion");
//        String nombreEspectaculo = "";
//        DtFuncion dtFuncion = null;
//        List<String> artInvi = null;
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        boolean expResult = false;
//        boolean result = instance.crearFuncion(nombreEspectaculo, dtFuncion, artInvi);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of existeFuncion method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testExisteFuncion() {
//        System.out.println("existeFuncion");
//        String nombreFuncion = "";
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        boolean expResult = false;
//        boolean result = instance.existeFuncion(nombreFuncion);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of altaEspectaculo method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testAltaEspectaculo() {
//        System.out.println("altaEspectaculo");
//        String plataforma = "";
//        String artista = "";
//        List<String> categorias = null;
//        DtEspectaculo espectaculo = null;
//        String pathImagen = "";
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        instance.altaEspectaculo(plataforma, artista, categorias, espectaculo, pathImagen);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getInvitados method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testGetInvitados() {
//        System.out.println("getInvitados");
//        String nombreFuncion = "";
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        List<DtArtista> expResult = null;
//        List<DtArtista> result = instance.getInvitados(nombreFuncion);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarRechazados method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testListarRechazados() {
//        System.out.println("listarRechazados");
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        List<DtEspectaculo> expResult = null;
//        List<DtEspectaculo> result = instance.listarRechazados();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarIngresados method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testListarIngresados() {
//        System.out.println("listarIngresados");
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        List<DtEspectaculo> expResult = null;
//        List<DtEspectaculo> result = instance.listarIngresados();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of aceptar_rechazarIngresado method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testAceptar_rechazarIngresado() {
//        System.out.println("aceptar_rechazarIngresado");
//        String nombre = "";
//        EstadoEspectaculo estado = null;
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        instance.aceptar_rechazarIngresado(nombre, estado);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of existeCategoria method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testExisteCategoria() {
//        System.out.println("existeCategoria");
//        String nombreCat = "";
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        boolean expResult = false;
//        boolean result = instance.existeCategoria(nombreCat);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarEspPorCat method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testListarEspPorCat() {
//        System.out.println("listarEspPorCat");
//        String nombreCat = "";
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        List<DtEspectaculo> expResult = null;
//        List<DtEspectaculo> result = instance.listarEspPorCat(nombreCat);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarCategorias method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testListarCategorias() {
//        System.out.println("listarCategorias");
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        List<String> expResult = null;
//        List<String> result = instance.listarCategorias();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of funcEspNoReg method, of class CtrlEspectaculos.
//     */
//    @Test
//    public void testFuncEspNoReg() {
//        System.out.println("funcEspNoReg");
//        String nickname = "";
//        String nombreEspectaculo = "";
//        CtrlEspectaculos instance = new CtrlEspectaculos();
//        List<DtFuncion> expResult = null;
//        List<DtFuncion> result = instance.funcEspNoReg(nickname, nombreEspectaculo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
