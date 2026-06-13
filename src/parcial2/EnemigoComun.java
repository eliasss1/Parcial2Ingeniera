/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author elias
 */
public class EnemigoComun extends Personaje {

    public EnemigoComun(int x, int y, int nivelEnergia, int numeroVidas, int capacidadOfensiva, String textura) {
        super(x, y, nivelEnergia, numeroVidas, capacidadOfensiva, textura);
    }

    public ObjetoMovil soltarObjeto() {
        System.out.println("El enemigo ha soltado un objeto.");
        return null; 
    }

    public PiezaArmadura soltarPiezaArmadura() {
        System.out.println("El enemigo ha soltado una pieza de armadura.");
        return null; 
    }
}