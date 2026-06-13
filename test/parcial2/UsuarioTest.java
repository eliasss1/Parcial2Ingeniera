/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package parcial2;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elias
 */
public class UsuarioTest {
    static Usuario usr;
    static int numeroTest = 1;
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void antesDeTodo() {
        usr = new Usuario("Juanjo", 1212);
        System.out.println("TEST de usuario");
    }
    
    @AfterClass
    public static void despuesDeTodo() {
        LocalDate ayer = LocalDate.now().minusDays(1);
        System.out.println("Fin de las pruebas " + ayer);
    }
    
    @Before
    public void setUp() {
        System.out.println("--------------------");
        System.out.println("Test i: "+ numeroTest++);
    }
    
    @After
    public void tearDown() {
        System.out.println("--------------------");
    }

    /**
     * Test of validarPassword method, of class Usuario.
     */
    
    @Test
    public void testValidarPassword() {
        System.out.println("validarPassword");
        int contra = 2222;
        assertTrue("Expected <2222> but was <1212>", usr.validarPassword(contra));
    }
    
    @Test
    public void testValidarEmail(){
        System.out.println("testValidarEmail");
        String email = "juanjo@ulp.com.ar";
        boolean validacion = email.contains("@") && email.contains(".") && email.length() < 20;
        assertTrue("El email es valido", validacion);
    }

    /**
     * Test of cambioPassword method, of class Usuario.
     */
    @Test
    public void testCambioPassword() {
        System.out.println("cambiopass");
        String newPass = "1234";
        usr.cambioPassword(newPass);
        assertEquals(1234, usr.getPass());
    }

    /**
     * Test of delay method, of class Usuario.
     */
    @Test(timeout = 30)
    public void testDelay() throws InterruptedException {
        System.out.println("delay");
        usr.delay(50);
    }

    /**
     * Test of usuariosDiferentes method, of class Usuario.
     */
    @Test
    public void testUsuariosDiferentes() {
        System.out.println("usuariosDiferentes");
        Usuario u1 = new Usuario("Elias", 1111);
        Usuario u2 = new Usuario("Profe", 9999);
        
        assertNotSame("mismo usuario", u1, u2);
    }
    
}
