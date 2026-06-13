/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author elias
 */
public class CombateTest {
    
    Heroe heroe;
    EnemigoComun enemigo;
    
    @Before
    public void setUp() {
        heroe = new Heroe(0, 0, 100, 3, 50, "HeroeTextura");
        enemigo = new EnemigoComun(1, 1, 100, 1, 20, "EnemigoTextura");
        enemigo.setVida(100); 
    }

    @Test
    public void testGolpeRestaVidaSinMorir() {
        heroe.setCapacidadOfensiva(30); 
        enemigo.setVida(100); 
        
        heroe.atacar(enemigo);
        
        assertEquals("La vida debe quedar en 70", 70, enemigo.getVida());
        assertFalse("El enemigo NO debe estar muerto", enemigo.isEstaMuerto());
    }

    @Test
    public void testGolpeMataEnemigo() {
        heroe.setCapacidadOfensiva(50); 
        enemigo.setVida(50); 
        
        heroe.atacar(enemigo);
        
        assertEquals("La vida debe ser exactamente 0", 0, enemigo.getVida());
        assertTrue("El enemigo DEBE estar muerto", enemigo.isEstaMuerto());
    }

    @Test
    public void testGolpeExcesivoNoBajaDeCero() {
        heroe.setCapacidadOfensiva(100); 
        enemigo.setVida(30); 
        
        heroe.atacar(enemigo);
        
        assertEquals("La vida minima garantizada debe ser 0, no negativa", 0, enemigo.getVida());
        assertTrue("El enemigo DEBE estar muerto", enemigo.isEstaMuerto());
    }
}
