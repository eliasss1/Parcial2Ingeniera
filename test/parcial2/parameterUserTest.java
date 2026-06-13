/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author elias
 */
@RunWith(value = Parameterized.class)
public class parameterUserTest {
    
    // Atributos de la prueba parametrizada
    private String valorActual;
    private Usuario usr;
    private int valorEsperado;

    // Constructor que recibe los parámetros
    public parameterUserTest(String valorActual, Usuario usr, int valorEsperado) {
        this.valorActual = valorActual;
        this.usr = usr;
        this.valorEsperado = valorEsperado;
    }

    @Parameters
    public static Iterable<Object[]> getData() {
        Usuario usuarioBase = new Usuario("TestUser", 1212);
        
        return Arrays.asList(new Object[][] {
            {"1234", usuarioBase, 1234},   // Iteracion 1 ÉXITO
            {"123", usuarioBase, 1234},    // Iteracion 2 FALLO 
            {"'1234'", usuarioBase, 1234}  // Iteracion 3 FALLO
        });
    }

    @Test
    public void testCambioPass() {
        System.out.println("Ejecutando prueba parametrizada con valorActual: " + valorActual);
        
        try {
            usr.cambioPassword(this.valorActual);
            assertEquals(this.valorEsperado, usr.getPass());
        } catch (NumberFormatException e) {
            fail("Fallo por formato numerico incorrecto: " + e.getMessage());
        }
    }
}
