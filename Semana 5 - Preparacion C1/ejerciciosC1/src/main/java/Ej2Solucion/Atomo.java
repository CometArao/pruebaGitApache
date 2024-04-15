/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2Solucion;

/**
 *
 * @author comet
 */
public class Atomo {
    public String nombre;
    public int cantidad;
    
    public Atomo(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString(){
        return this.cantidad + " atomos de " + this.nombre;
    }
    
    @Override
    public boolean equals(Object otro){
        Atomo otro_atomo=(Atomo)otro;
        return this.nombre.equals(otro_atomo.nombre);
    }
}
