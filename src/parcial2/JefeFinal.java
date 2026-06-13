/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author elias
 */
public class JefeFinal extends EnemigoComun {

    private int cantidadEvoluciones;
    private int potenciaSuperpoder;
    private boolean vuela;

    public JefeFinal(int x, int y, int nivelEnergia, int numeroVidas, int capacidadOfensiva, String textura, int cantidadEvoluciones, int potenciaSuperpoder, boolean vuela){
        super(x, y, nivelEnergia, numeroVidas, capacidadOfensiva, textura);
        this.cantidadEvoluciones = cantidadEvoluciones;
        this.potenciaSuperpoder = potenciaSuperpoder;
        this.vuela = vuela;
    }

    public void evolucionar() {
        this.cantidadEvoluciones++;
        this.capacidadOfensiva += 20;
        System.out.println("¡El Jefe ha evolucionado! Nueva potencia: " + this.capacidadOfensiva);
    }

    public void lanzarSuperpoder() {
        if (this.nivelEnergia >= 50) {
            System.out.println("El Jefe lanza un superpoder con potencia: " + this.potenciaSuperpoder);
            this.nivelEnergia -= 50;
        } else {
            System.out.println("Energia insuficiente para el superpoder.");
        }
    }

 
    public boolean isVuela(){ 
        return vuela; 
    }
    public void setVuela(boolean vuela){
        this.vuela = vuela; 
    }
}