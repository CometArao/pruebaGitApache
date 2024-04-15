/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2Solucion;

/**
 *
 * @author comet
 */
public class Main {
    public static void main(String[] args) {
        Molecula m = new Molecula("agua", 2);
        Atomo ax = new Atomo("Hidrogeno", 2);
        Atomo ay = new Atomo("Oxigeno", 1);
        Atomo az = new Atomo("Cloro", 1);
        Atomo aw = new Atomo("Hidrogeno", 1);
        
        Molecula mx = new Molecula("Acido clorhidrico", 2);
        
        m.agregarAtomo(ax); 
        m.agregarAtomo(ay);
        mx.agregarAtomo(az); mx.agregarAtomo(aw);
        System.out.println(m);
        System.out.println("Atomos con más de 2 unidades de " + mx.nombre + " es " + mx.cantidadTotalAtomos(2));
        /* Prueba la fusión */
        System.out.println(m.mutacion(mx));
    }
    
}
