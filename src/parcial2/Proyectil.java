/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author elias
 */
public class Proyectil {
    private String tipo; // hielo, fuego, acido
    private int cantidad;
    private int danoCausado;
    private String efecto; // congela, quema, envenena

    private static int contadorTotalHielo = 0;
    private static int contadorTotalFuego = 0;
    private static int contadorTotalAcido = 0;

    public Proyectil(String tipo, int cantidad, int danoCausado, String efecto) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.danoCausado = danoCausado;
        this.efecto = efecto;
        
        actualizarContadorGlobal(tipo, cantidad);
    }

    private void actualizarContadorGlobal(String tipo, int cantidad) {
        switch (tipo.toLowerCase()) {
            case "hielo": 
                contadorTotalHielo += cantidad;
                break;
            
            case "fuego": 
                contadorTotalFuego += cantidad;
                break;
            
            case "acido": 
                contadorTotalAcido += cantidad;
                break;
        }
    }

    public String getTipo(){
        return tipo; 
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public int getDanoCausado(){
        return danoCausado; 
    }
    
    public String getEfecto(){
        return efecto; 
    }

    public static int getContadorTotalHielo(){ 
        return contadorTotalHielo; 
    }
    
    public static int getContadorTotalFuego(){
        return contadorTotalFuego; 
    }
    
    public static int getContadorTotalAcido(){ 
        return contadorTotalAcido; 
    }
}
