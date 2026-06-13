/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elias
 */
public class Personaje extends ElementoJuego {
    protected int nivelEnergia;
    protected int numeroVidas;
    protected int capacidadOfensiva;
    protected int vida;
    protected boolean estaMuerto;
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
        this.vida = 100; 
        this.estaMuerto = false;
        this.textura = textura;
        this.habilidadesEspeciales = new ArrayList<>();
        this.habilidadesNormales = new ArrayList<>();
    }

    public void atacar(Personaje enemigo) {
        int vidaRestante = enemigo.getVida() - this.capacidadOfensiva;
        if (vidaRestante <= 0) {
            enemigo.setVida(0);
            enemigo.setEstaMuerto(true);
            enemigo.setX(-1);
            enemigo.setY(-1);
        } else {
            enemigo.setVida(vidaRestante);
        }
    }
    
    public void caminar(){ 
        System.out.println("El personaje esta caminando."); 
    }
    
    public void correr(){ 
        System.out.println("El personaje esta corriendo."); 
    }
    
    public void saltar(){ 
        System.out.println("El personaje esta saltando."); 
    }
    
    public void disparar(){ 
        System.out.println("El personaje esta disparando."); 
    }

    public void subirNivel() {
        this.nivelEnergia += 10;
        System.out.println("Nivel subido. Energia actual: " + this.nivelEnergia);
    }

    public int getVida(){
        return vida; 
    }
    
    public void setVida(int vida){
        this.vida = vida; 
    }
    
    public boolean isEstaMuerto(){
        return estaMuerto; 
    }
    
    public void setEstaMuerto(boolean estaMuerto){
        this.estaMuerto = estaMuerto; 
    }

    public int getNivelEnergia(){
        return nivelEnergia; 
    }
    
    public void setNivelEnergia(int nivelEnergia){
        this.nivelEnergia = nivelEnergia; 
    }
    
    public int getNumeroVidas(){
        return numeroVidas; 
    }
    
    public void setNumeroVidas(int numeroVidas){
        this.numeroVidas = numeroVidas; 
    }
    
    public int getCapacidadOfensiva(){
        return capacidadOfensiva; 
    }
    
    public void setCapacidadOfensiva(int capacidadOfensiva){
        this.capacidadOfensiva = capacidadOfensiva; 
    }
    
    public List<String> getHabilidadesEspeciales(){
        return habilidadesEspeciales; 
    }
    
    public List<String> getHabilidadesNormales(){
        return habilidadesNormales; 
    }
}
