/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2Solucion;

/**
 *
 * @author comet
 */
public class Molecula {
    public String nombre;
    public int cantidadAtomos;
    public Atomo atomos[];
    public int cantidadActual;
    
    public Molecula(String nombre, int cantidadAtomos){
        this.nombre = nombre;
        this.cantidadAtomos = cantidadAtomos;
        this.atomos = new Atomo[cantidadAtomos];
    }
    
    @Override
    public String toString(){
        String cadena = "Molecula : " + this.nombre + "\n";
        for(int i=0; i < this.cantidadAtomos; i++){
            cadena += (" " + this.atomos[i]);
        }
        return cadena;
    }
    
    public boolean equals(Object otro){
        Molecula otra_molecula=(Molecula)otro;
        return this.nombre.equals(otra_molecula.nombre) 
                && this.cantidadAtomos == otra_molecula.cantidadAtomos;
    }
    
    public void agregarAtomo(Atomo nuevo){
        if (this.cantidadActual < this.cantidadAtomos){
            this.atomos[this.cantidadActual++] = nuevo;
        }
    }
    
    /**
     * Retoena la cantidad de átomos cuya cantidad es igual o superior al límite indicado
     * @param limite, valor mínimo de cantidad de átomos para ser considerado
     * @return cantidad de átomos presentes en la molécula que cuenta con más del mínimo indicado
     */
    public int cantidadTotalAtomos(int limite){
        int total = 0;
        for(int i=0; i < this.cantidadAtomos; i++){
            if (this.atomos[i].cantidad >= limite)
            total += 1;
        }
        return total;
    }
    
    /**
     * Experimento de mutación: crea una molécula considerando los átomos presentes en ambas moléculas
     * sumando la cantidad del átomo en la molécula 1 más lso de la molécula 2
     * @param otra, segunda molécula para el experimento
     * @return nueva molécula considerando s
     */
    public Molecula mutacion(Molecula otra){
        Molecula fusionada = new Molecula("fusion", this.cantidadAtomos + otra.cantidadAtomos);
        boolean existe;
        Atomo nuevo;
        int total = 0;
        for(int i=0; i < this.cantidadAtomos; i++){
            /* Busca el átomo en la segunda molécula */
            existe = false;
            for(int j=0; j < otra.cantidadAtomos; j++){
                if(this.atomos[i].equals(otra.atomos[j])){
                    nuevo = new Atomo(this.atomos[i].nombre, this.atomos[i].cantidad + this.atomos[j].cantidad);                    
                    total += 1;
                    fusionada.agregarAtomo(nuevo);
                    break;
                }
            }            
        }
        /* Actualiza el total de átomos que finalmente tiene la nueva molécula */
        fusionada.cantidadAtomos = total;
        return fusionada;
    }
}
