/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipack;

/**
 *
 * @author Administrador
 */
public class Estudiante {
   private String nombre;
   private int id;
   
   public Estudiante(int id, String nombre){
   this.nombre=nombre;
   this.id= id;   
   }
   public String toString(){
   return("el nombre es "+nombre+",con id "+id);
   }
   }
