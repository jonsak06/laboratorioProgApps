/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package root.manejadores;

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
import root.datatypes.DtRegistro;
import root.entidades.Registro;

/**
 *
 * @author julio
 */
public class ManejadorUsuariosTest {
    
    public ManejadorUsuariosTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
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
     * Test of getEspectadores method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testGetEspectadores() {
        System.out.println("getEspectadores");
        List<DtEspectador> expResult = null;
        List<DtEspectador> result = ManejadorUsuarios.getEspectadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArtistas method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testGetArtistas() {
        System.out.println("getArtistas");
        List<DtArtista> expResult = null;
        List<DtArtista> result = ManejadorUsuarios.getArtistas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoRegistrados method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testGetNoRegistrados() {
        System.out.println("getNoRegistrados");
        String nombreFuncion = "";
        List<DtEspectador> expResult = null;
        List<DtEspectador> result = ManejadorUsuarios.getNoRegistrados(nombreFuncion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeArtista method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testExisteArtista() {
        System.out.println("existeArtista");
        String nickname = "";
        boolean expResult = false;
        boolean result = ManejadorUsuarios.existeArtista(nickname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeEspectador method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testExisteEspectador() {
        System.out.println("existeEspectador");
        String nickname = "";
        boolean expResult = false;
        boolean result = ManejadorUsuarios.existeEspectador(nickname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeCorreo method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testExisteCorreo() {
        System.out.println("existeCorreo");
        String correo = "";
        boolean expResult = false;
        boolean result = ManejadorUsuarios.existeCorreo(correo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altaArtista method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testAltaArtista() {
        System.out.println("altaArtista");
        DtArtista ar = null;
        ManejadorUsuarios.altaArtista(ar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altaEspectador method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testAltaEspectador() {
        System.out.println("altaEspectador");
        DtEspectador es = null;
        ManejadorUsuarios.altaEspectador(es);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarArtista method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testModificarArtista() {
        System.out.println("modificarArtista");
        DtArtista ar = null;
        ManejadorUsuarios.modificarArtista(ar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarEspectador method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testModificarEspectador() {
        System.out.println("modificarEspectador");
        DtEspectador es = null;
        ManejadorUsuarios.modificarEspectador(es);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCanjeables method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testGetCanjeables() {
        System.out.println("getCanjeables");
        String nickname = "";
        int expResult = 0;
        int result = ManejadorUsuarios.getCanjeables(nickname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarCanjeables method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testListarCanjeables() {
        System.out.println("listarCanjeables");
        String nickname = "";
        List<Registro> expResult = null;
        List<Registro> result = ManejadorUsuarios.listarCanjeables(nickname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canjearRegistros method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testCanjearRegistros() {
        System.out.println("canjearRegistros");
        List<String> canjeables = null;
        String nickname = "";
        float costo = 0.0F;
        String nombreFuncion = "";
        int fdia = 0;
        int fmes = 0;
        int fanio = 0;
        ManejadorUsuarios.canjearRegistros(canjeables, nickname, costo, nombreFuncion, fdia, fmes, fanio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarUsuario method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testRegistrarUsuario() {
        System.out.println("registrarUsuario");
        String nickname = "";
        String nombreFuncion = "";
        float costo = 0.0F;
        int fdia = 0;
        int fmes = 0;
        int fanio = 0;
        ManejadorUsuarios.registrarUsuario(nickname, nombreFuncion, costo, fdia, fmes, fanio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatosEspectador method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testGetDatosEspectador() {
        System.out.println("getDatosEspectador");
        String nickname = "";
        DtEspectador expResult = null;
        DtEspectador result = ManejadorUsuarios.getDatosEspectador(nickname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegistros method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testGetRegistros() {
        System.out.println("getRegistros");
        String nickname = "";
        List<DtRegistro> expResult = null;
        List<DtRegistro> result = ManejadorUsuarios.getRegistros(nickname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFuncionesRegistros method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testGetFuncionesRegistros() {
        System.out.println("getFuncionesRegistros");
        String nickname = "";
        List<DtFuncion> expResult = null;
        List<DtFuncion> result = ManejadorUsuarios.getFuncionesRegistros(nickname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarEspectaculosDeArtista method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testListarEspectaculosDeArtista() {
        System.out.println("listarEspectaculosDeArtista");
        String nickname = "";
        List<DtEspectaculo> expResult = null;
        List<DtEspectaculo> result = ManejadorUsuarios.listarEspectaculosDeArtista(nickname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarRegistros method, of class ManejadorUsuarios.
     */
    @org.junit.Test
    public void testActualizarRegistros() {
        System.out.println("actualizarRegistros");
        ManejadorUsuarios.actualizarRegistros();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
