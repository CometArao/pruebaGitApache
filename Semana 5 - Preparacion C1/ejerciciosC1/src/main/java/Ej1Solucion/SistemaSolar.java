/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1Solucion;

/**
 *
 * @author comet
 */
public class SistemaSolar {
    
    public String nombre;
    public Planeta[] planetas;
    public int numeroplanetas;
    public int indice;
    
    public SistemaSolar(String nombre,int numeroplanetas) {
        this.nombre=nombre;
        this.numeroplanetas=numeroplanetas;
        planetas=new Planeta[numeroplanetas];
        indice=0;
    }
    
    public void nuevoPlaneta(Planeta p) {
        if (indice < numeroplanetas) {
           planetas[indice]=p;
           indice++;
        }
    }
    
    @Override
    public String toString() {
        String info_ss=" Sistema solar formado por: ";
        for(int i=0; i < planetas.length;i++)
            info_ss+=planetas[i].toString();
        return info_ss;
    }
    
    @Override
    public boolean equals(Object otro) {
        SistemaSolar otro_ss=(SistemaSolar)otro;
        return this.nombre.equals(otro_ss.nombre) && 
               this.numeroplanetas == otro_ss.numeroplanetas;
    }
    
    public void planetasDistanciaSol(int umbral) {
        for(int i=0; i < planetas.length;i++)
            if ( planetas[i].distancia <= umbral )
                System.out.println(planetas[i].toString());
    }
    
    public SistemaSolar chocarSistemaSolar(SistemaSolar s2) {
        int numeroplanetasunion=this.planetas.length+s2.planetas.length;
        SistemaSolar colision=new SistemaSolar("Colision",numeroplanetasunion);
        for(int i=0; i < this.planetas.length;i++)
            colision.nuevoPlaneta(planetas[i]);
         for(int i=0; i < s2.planetas.length;i++)
            colision.nuevoPlaneta(s2.planetas[i]);
         
         return colision;
    }
    
}
