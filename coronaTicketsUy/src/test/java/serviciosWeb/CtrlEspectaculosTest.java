/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package serviciosWeb;

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
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<DtPlataforma> expResult = null;
        List<DtPlataforma> result = instance.listarPlataformas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarEspectaculos method, of class CtrlEspectaculos.
     */
    @Test
    public void testListarEspectaculos() {
        System.out.println("listarEspectaculos");
        String nombre = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<DtEspectaculo> expResult = null;
        List<DtEspectaculo> result = instance.listarEspectaculos(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeEspectaculo method, of class CtrlEspectaculos.
     */
    @Test
    public void testExisteEspectaculo() {
        System.out.println("existeEspectaculo");
        String nombreEspectaculo = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        boolean expResult = false;
        boolean result = instance.existeEspectaculo(nombreEspectaculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarFunciones method, of class CtrlEspectaculos.
     */
    @Test
    public void testListarFunciones() {
        System.out.println("listarFunciones");
        String nombreEspectaculo = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<DtFuncion> expResult = null;
        List<DtFuncion> result = instance.listarFunciones(nombreEspectaculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescuento method, of class CtrlEspectaculos.
     */
    @Test
    public void testGetDescuento() {
        System.out.println("getDescuento");
        String nickname = "";
        String nombreFuncion = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        float expResult = 0.0F;
        float result = instance.getDescuento(nickname, nombreFuncion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCosto method, of class CtrlEspectaculos.
     */
    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        String nombreFuncion = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        float expResult = 0.0F;
        float result = instance.getCosto(nombreFuncion);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatosFuncion method, of class CtrlEspectaculos.
     */
    @Test
    public void testGetDatosFuncion() {
        System.out.println("getDatosFuncion");
        String nombreFuncion = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        DtFuncion expResult = null;
        DtFuncion result = instance.getDatosFuncion(nombreFuncion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existePlataforma method, of class CtrlEspectaculos.
     */
    @Test
    public void testExistePlataforma() {
        System.out.println("existePlataforma");
        String nombrePlat = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        boolean expResult = false;
        boolean result = instance.existePlataforma(nombrePlat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresarPlataforma method, of class CtrlEspectaculos.
     */
    @Test
    public void testIngresarPlataforma() {
        System.out.println("ingresarPlataforma");
        String nombre = "";
        String descripcion = "";
        String url = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        boolean expResult = false;
        boolean result = instance.ingresarPlataforma(nombre, descripcion, url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaCompleta method, of class CtrlEspectaculos.
     */
    @Test
    public void testEstaCompleta() {
        System.out.println("estaCompleta");
        String nombreFuncion = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        boolean expResult = false;
        boolean result = instance.estaCompleta(nombreFuncion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearFuncion method, of class CtrlEspectaculos.
     */
    @Test
    public void testCrearFuncion() {
        System.out.println("crearFuncion");
        String nombreEspectaculo = "";
        DtFuncion dtFuncion = null;
        List<String> artInvi = null;
        CtrlEspectaculos instance = new CtrlEspectaculos();
        boolean expResult = false;
        boolean result = instance.crearFuncion(nombreEspectaculo, dtFuncion, artInvi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeFuncion method, of class CtrlEspectaculos.
     */
    @Test
    public void testExisteFuncion() {
        System.out.println("existeFuncion");
        String nombreFuncion = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        boolean expResult = false;
        boolean result = instance.existeFuncion(nombreFuncion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altaEspectaculo method, of class CtrlEspectaculos.
     */
    @Test
    public void testAltaEspectaculo() {
        System.out.println("altaEspectaculo");
        String plataforma = "";
        String artista = "";
        List<String> categorias = null;
        DtEspectaculo espectaculo = null;
        String pathImagen = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        instance.altaEspectaculo(plataforma, artista, categorias, espectaculo, pathImagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInvitados method, of class CtrlEspectaculos.
     */
    @Test
    public void testGetInvitados() {
        System.out.println("getInvitados");
        String nombreFuncion = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<DtArtista> expResult = null;
        List<DtArtista> result = instance.getInvitados(nombreFuncion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarRechazados method, of class CtrlEspectaculos.
     */
    @Test
    public void testListarRechazados() {
        System.out.println("listarRechazados");
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<DtEspectaculo> expResult = null;
        List<DtEspectaculo> result = instance.listarRechazados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarIngresados method, of class CtrlEspectaculos.
     */
    @Test
    public void testListarIngresados() {
        System.out.println("listarIngresados");
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<DtEspectaculo> expResult = null;
        List<DtEspectaculo> result = instance.listarIngresados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aceptar_rechazarIngresado method, of class CtrlEspectaculos.
     */
    @Test
    public void testAceptar_rechazarIngresado() {
        System.out.println("aceptar_rechazarIngresado");
        String nombre = "";
        EstadoEspectaculo estado = null;
        CtrlEspectaculos instance = new CtrlEspectaculos();
        instance.aceptar_rechazarIngresado(nombre, estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeCategoria method, of class CtrlEspectaculos.
     */
    @Test
    public void testExisteCategoria() {
        System.out.println("existeCategoria");
        String nombreCat = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        boolean expResult = false;
        boolean result = instance.existeCategoria(nombreCat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarEspPorCat method, of class CtrlEspectaculos.
     */
    @Test
    public void testListarEspPorCat() {
        System.out.println("listarEspPorCat");
        String nombreCat = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<DtEspectaculo> expResult = null;
        List<DtEspectaculo> result = instance.listarEspPorCat(nombreCat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarCategorias method, of class CtrlEspectaculos.
     */
    @Test
    public void testListarCategorias() {
        System.out.println("listarCategorias");
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<String> expResult = null;
        List<String> result = instance.listarCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of funcEspNoReg method, of class CtrlEspectaculos.
     */
    @Test
    public void testFuncEspNoReg() {
        System.out.println("funcEspNoReg");
        String nickname = "";
        String nombreEspectaculo = "";
        CtrlEspectaculos instance = new CtrlEspectaculos();
        List<DtFuncion> expResult = null;
        List<DtFuncion> result = instance.funcEspNoReg(nickname, nombreEspectaculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
