/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author elias
 */
public class Torre extends ObjetoInmovil {
    private int alcance;
    private int potenciaDisparo;

    public Torre(int x, int y, int alcance, int potenciaDisparo) {
        super(x, y);
        this.alcance = alcance;
        this.potenciaDisparo = potenciaDisparo;
    }

    public void disparar() {
        System.out.println("La torre dispara con potencia: " + potenciaDisparo);
    }
}
