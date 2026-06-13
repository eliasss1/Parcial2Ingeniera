/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

import java.util.List;

/**
 *
 * @author elias
 */
public class Personaje extends ElementoJuego{
    protected int nivelEnergia;
    protected int numeroVidas;
    protected int capacidadOfensiva;
    protected int ancho;
    protected int alto;
    protected String textura;
    protected List<String> habilidadesEspeciales;
    protected List<String> habilidadesNormales;
    
    public Personaje(int x, int y, int nivelEnergia, int numeroVidas, int capacidadOfensiva, String textura){
        super(x, y);
        this.nivelEnergia = nivelEnergia;
        this.numeroVidas = numeroVidas;
        this.capacidadOfensiva = capacidadOfensiva;
        this.textura = textura;
        
    }
     


}
