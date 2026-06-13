/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author elias
 */
public class Heroe extends Personaje {
    
    private Mochila mochila;   
    private Armadura armadura; 

    public Heroe(int x, int y, int nivelEnergia, int numeroVidas, int capacidadOfensiva, String textura) {
        super(x, y, nivelEnergia, numeroVidas, capacidadOfensiva, textura);
        this.mochila = new Mochila();
        this.armadura = null;
    }

    public void recogerObjeto(ObjetoMovil o) {
        try {
            mochila.guardarEnMochila(o);
        } catch (Exception e) {
            System.out.println("No se pudo recoger: " + e.getMessage());
        }
    }

    public void combatir(Personaje enemigo) {
        System.out.println("El heroe inicia combate contra " + enemigo.getClass().getSimpleName());
        this.atacar(enemigo);
    }

    public void equiparArmadura(Armadura a) {
        this.armadura = a;
        System.out.println("Armadura equipada con exito.");
    }

    // Getters
    public Mochila getMochila() {
        return mochila;
    }

    public Armadura getArmadura() {
        return armadura;
    }
}
