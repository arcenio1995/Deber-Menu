/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author hp
 */
public class Computador {
    
    private String nombre;
    private String color;
    private String marca;
     private String modelo;
      private int año;
      private float numSerie;

    public Computador(String nombre, String color, String marca, String modelo, int año, float numSerie) {
        this.nombre = nombre;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numSerie = numSerie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
     public void setColor(String color) {
        this.color = color;
        
    }
     
     public void setMarca(String marca) {
        this.marca = marca;
    }
     
     public void setModelo(String modelo) {
        this.modelo = modelo;
    }
     
      public void setAño(int año) {
        this.año = año;
    }
      
      public void setNumSerie(float numSerie) {
        this.numSerie = numSerie;
    }
    
    public String getNombre() {
        return nombre;
    }

   

    public String getColor() {
        return color;
    }

    

    public String getMarca() {
        return marca;
    }

    

    public String getModelo() {
        return modelo;
    }

    

    public int getAño() {
        return año;
    }

   

    public float getNumSerie() {
        return numSerie;
    }

}