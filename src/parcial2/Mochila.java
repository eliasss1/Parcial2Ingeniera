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
public class Mochila {
    private int capacidadMaxima;
    private List<ObjetoMovil> contenido;

    public Mochila() {
        this.capacidadMaxima = 3;
        this.contenido = new ArrayList<>();
    }
    
    public Comida buscarComida() {
        for (ObjetoMovil obj : contenido) {
            if (obj instanceof Comida) {
                return (Comida) obj;
            }
        }
        return null;
    }

    public void ampliarCapacidad(int nuevaCapacidad) {
        if (nuevaCapacidad > this.capacidadMaxima) {
            this.capacidadMaxima = nuevaCapacidad;
            System.out.println("Capacidad ampliada a: " + this.capacidadMaxima);
        } else {
            System.out.println("La nueva capacidad debe ser mayor a la actual.");
        }
    }

    public void guardar(ObjetoMovil o) {
        if (contenido.size() < capacidadMaxima) {
            contenido.add(o);
            System.out.println(o.getNombre() + " guardado en la mochila.");
        } else {
            System.out.println("Error: La mochila esta llena.");
        }
    }

    public void usar(ObjetoMovil o) {
        if (contenido.contains(o)) {
            if (o instanceof Comida) {
                ((Comida) o).consumir();
            }
            System.out.println("Objeto " + o.getNombre() + " utilizado.");
        } else {
            System.out.println("El objeto no esta en la mochila.");
        }
    }

    public void tirar(ObjetoMovil o) {
        if (contenido.remove(o)) {
            System.out.println(o.getNombre() + " ha sido tirado de la mochila.");
        } else {
            System.out.println("El objeto no se encontro en la mochila.");
        }
    }

    public List<ObjetoMovil> getContenido() {
        return contenido;
    }
}
