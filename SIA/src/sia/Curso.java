
package SIA;

import java.util.List;

//Pendiente
public class Curso {
    //Atributos
   private int numero;
   private String nombre;
   private List<Grupo> ofrecido;
   private List<Carrera> carreras;
   
   //Get
   public int getNumero(){
   return this.numero;
   }
   public String getNombre(){
   return this.nombre;
   }
   public List<Grupo> getOfrecido(){
   return this.ofrecido;
   }
   public List<Carrera> getCarreras(){
   return this.carreras;
   }
   
   //Set
   public void setNumero(int numero){
   this.numero=numero;
   }
   public void setNombre(String nombre){
   this.nombre=nombre;
   }
   public void setOfrecido(List<Grupo> ofrecido){
   this.ofrecido=ofrecido;
   }
   public void setCarreras(List<Carrera> carreras){
   this.carreras=carreras;
   }
   }
   

