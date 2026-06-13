/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author elias
 */
public class MochilaTest {
    
    Mochila mochila;
    
    @Before
    public void setUp() {
        mochila = new Mochila(); 
    }

    @Test
    public void testGuardarTresObjetos() {
        mochila.guardar(new Comida(0, 0, "Manzana", 10, 1));
        mochila.guardar(new Arma(0, 0, "Espada", 10, 1, 1, 1));
        mochila.guardar(new Comida(0, 0, "Poción", 20, 1));
        
        assertEquals("Debe haber exactamente 3 objetos en la mochila", 3, mochila.getContenido().size());
    }

    @Test
    public void testExcederCapacidadMochila() {
        mochila.guardar(new Comida(0, 0, "Item1", 10, 1));
        mochila.guardar(new Comida(0, 0, "Item2", 10, 1));
        mochila.guardar(new Comida(0, 0, "Item3", 10, 1));
        
        // Intentamos el 4to la consola mostrara rrror: La mochila esta llena
        mochila.guardar(new Comida(0, 0, "Item4", 10, 1));
        
        assertEquals("La mochila debe rechazar el 4to objeto y mantenerse en 3", 3, mochila.getContenido().size());
    }

    @Test
    public void testAmpliarCapacidad() {
        mochila.ampliarCapacidad(5);
        
        mochila.guardar(new Comida(0, 0, "Item1", 10, 1));
        mochila.guardar(new Comida(0, 0, "Item2", 10, 1));
        mochila.guardar(new Comida(0, 0, "Item3", 10, 1));
        mochila.guardar(new Comida(0, 0, "Item4", 10, 1)); 
        
        assertEquals("Tras ampliar a 5, la mochila debe permitir tener 4 objetos", 4, mochila.getContenido().size());
    }
}
