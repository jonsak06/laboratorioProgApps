/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
// */
//package serviciosWeb;
//
//import java.sql.Date;
//import java.util.List;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import root.datatypes.DtEspectaculo;
//import root.datatypes.DtPaqueteDeEspectaculos;
//
///**
// *
// * @author julio
// */
//public class CtrlPaquetesTest {
//    
//    public CtrlPaquetesTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of getInstance method, of class CtrlPaquetes.
     */
//    @Test
//    public void testGetInstance() {
//        System.out.println("getInstance");
//        CtrlPaquetes expResult = null;
//        CtrlPaquetes result = CtrlPaquetes.getInstance();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of confirmarAltaPaquete method, of class CtrlPaquetes.
     */
//    @Test
//    public void testConfirmarAltaPaquete() {
//        System.out.println("confirmarAltaPaquete");
//        String nombre = "";
//        String descripcion = "";
//        Date fechaInicio = null;
//        Date fechaFin = null;
//        float descuento = 0.0F;
//        CtrlPaquetes instance = null;
//        boolean expResult = false;
//        boolean result = instance.confirmarAltaPaquete(nombre, descripcion, fechaInicio, fechaFin, descuento);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPaquetes method, of class CtrlPaquetes.
//     */
//    @Test
//    public void testListarPaquetes() {
//        System.out.println("listarPaquetes");
//        CtrlPaquetes instance = null;
//        List<String> expResult = null;
//        List<String> result = instance.listarPaquetes();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPaquetesVigentes method, of class CtrlPaquetes.
//     */
//    @Test
//    public void testListarPaquetesVigentes() {
//        System.out.println("listarPaquetesVigentes");
//        CtrlPaquetes instance = null;
//        List<String> expResult = null;
//        List<String> result = instance.listarPaquetesVigentes();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPlataformas method, of class CtrlPaquetes.
//     */
//    @Test
//    public void testListarPlataformas() {
//        System.out.println("listarPlataformas");
//        CtrlPaquetes instance = null;
//        List<String> expResult = null;
//        List<String> result = instance.listarPlataformas();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarEspectaculosNoIncluidos method, of class CtrlPaquetes.
//     */
//    @Test
//    public void testListarEspectaculosNoIncluidos() {
//        System.out.println("listarEspectaculosNoIncluidos");
//        String nombrePaquete = "";
//        String nombrePlataforma = "";
//        CtrlPaquetes instance = null;
//        List<String> expResult = null;
//        List<String> result = instance.listarEspectaculosNoIncluidos(nombrePaquete, nombrePlataforma);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of confirmarAgregadoEspectaculo method, of class CtrlPaquetes.
//     */
//    @Test
//    public void testConfirmarAgregadoEspectaculo() {
//        System.out.println("confirmarAgregadoEspectaculo");
//        String nombreEspectaculo = "";
//        String nombrePaquete = "";
//        CtrlPaquetes instance = null;
//        instance.confirmarAgregadoEspectaculo(nombreEspectaculo, nombrePaquete);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of mostrarInfoPaquete method, of class CtrlPaquetes.
//     */
//    @Test
//    public void testMostrarInfoPaquete() {
//        System.out.println("mostrarInfoPaquete");
//        String nombrePaquete = "";
//        CtrlPaquetes instance = null;
//        DtPaqueteDeEspectaculos expResult = null;
//        DtPaqueteDeEspectaculos result = instance.mostrarInfoPaquete(nombrePaquete);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarEspectaculosIncluidos method, of class CtrlPaquetes.
//     */
//    @Test
//    public void testListarEspectaculosIncluidos() {
//        System.out.println("listarEspectaculosIncluidos");
//        String nombrePaquete = "";
//        CtrlPaquetes instance = null;
//        List<String> expResult = null;
//        List<String> result = instance.listarEspectaculosIncluidos(nombrePaquete);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of mostarInfoEspectaculo method, of class CtrlPaquetes.
//     */
//    @Test
//    public void testMostarInfoEspectaculo() {
//        System.out.println("mostarInfoEspectaculo");
//        String nombreEspectaculo = "";
//        CtrlPaquetes instance = null;
//        DtEspectaculo expResult = null;
//        DtEspectaculo result = instance.mostarInfoEspectaculo(nombreEspectaculo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
