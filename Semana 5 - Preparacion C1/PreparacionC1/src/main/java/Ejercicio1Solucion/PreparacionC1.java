/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio1Solucion;

/**
 *
 * @author comet
 */
public class PreparacionC1 {

    public static void main(String[] args) {
        Planeta p1=new Planeta("P1",1);
        Planeta p2=new Planeta("P2",2);
        Planeta p3=new Planeta("P3",4);
        //Mercurio, Venus, La Tierra y Marte; Júpiter, c, Urano y Neptuno
        Planeta m1=new Planeta("Mercurio",1);
        Planeta m2=new Planeta("Venus",2);
        Planeta m3=new Planeta("La Tierra",3);
        Planeta m4=new Planeta("Marte",4);
        Planeta m5=new Planeta("Júpiter",8);
        Planeta m6=new Planeta("Saturno",9);
        Planeta m7=new Planeta("Urano",11);
        Planeta m8=new Planeta("Neptuno",12);
        
        SistemaSolar ss1=new SistemaSolar("SS1",8);
        ss1.nuevoPlaneta(m1);
        ss1.nuevoPlaneta(m2);
        ss1.nuevoPlaneta(m3);
        ss1.nuevoPlaneta(m4);
        ss1.nuevoPlaneta(m5);
        ss1.nuevoPlaneta(m6);
        ss1.nuevoPlaneta(m7);
        ss1.nuevoPlaneta(m8);
        
        SistemaSolar ss2=new SistemaSolar("SS2",3);
        ss2.nuevoPlaneta(p1);
        ss2.nuevoPlaneta(p2);
        ss2.nuevoPlaneta(p3);
        
        System.out.println(ss1.toString());
        System.out.println(ss2.toString());
        
        ss1.planetasDistanciaSol(5);
        
        SistemaSolar colision=ss1.chocarSistemaSolar(ss2);
        
        ss1=null;
        ss2=null;
        
        System.out.println(colision.toString());
    }
}
