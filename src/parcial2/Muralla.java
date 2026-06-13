/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author elias
 */
public class Muralla extends ObjetoInmovil {
    private int nivelRecuperacion;
    private int mejorasDefensa;

    public Muralla(int x, int y, int nivelRecuperacion, int mejorasDefensa) {
        super(x, y);
        this.nivelRecuperacion = nivelRecuperacion;
        this.mejorasDefensa = mejorasDefensa;
    }

    public void recuperar() {
        System.out.println("Muralla recuperando salud al nivel: " + nivelRecuperacion);
    }
}
