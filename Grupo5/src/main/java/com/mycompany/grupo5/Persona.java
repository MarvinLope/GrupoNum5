/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grupo5;

/**
 *
 * @author USUARIO
 */
public abstract class  Persona {
    private String Nombre;
    private int Edad;
    public Persona(){
        //Constructor sin parametros
    }
    
    //Metodos para establecer y obtener los atributos de la clase
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
     public void getEdad(String Nombre){
        this.Nombre=Nombre;
    }
    
    public String getEdad(){
        return this.Nombre;
    }
   
    //Metodo Abstracto de dibujar
    abstract String Profesion();
    
}
