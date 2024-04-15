/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1Solucion;

/**
 *
 * @author comet
 */
public class Planeta {
    
    public String nombre;
    public int distancia;
    
    public Planeta(String nombre,int distancia) {
        this.nombre=nombre;
        this.distancia=distancia;
    }
    
    @Override
    public String toString() {
        return " Planeta: "+nombre+", distancia = "+distancia;
    }
    
    @Override
    public boolean equals(Object otro) {
        Planeta otro_planeta=(Planeta)otro;
        return this.nombre.equals(otro_planeta.nombre);
    }
    
}
