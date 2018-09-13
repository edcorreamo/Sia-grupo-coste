
package data;

import java.util.List;


public class Curso {
    //Atributos
   private int numero;
   private String nombre;
   private List<Grupo> ofrecido;
   private List<Carrera> carreras;
   //CONSTRUCTOR
   public Curso(int numero,String nombre, List<Grupo> ofrecido, List<Carrera> carreras){
       this.setNumero(numero);
       this.setNombre(nombre);
       this.setOfrecido(ofrecido);
       this.setCarreras(carreras);
   }
   
   public Curso(int numero,String nombre, List<Carrera> carreras){
       this.setNumero(numero);
       this.setNombre(nombre);
       this.setCarreras(carreras);
   }
   
   public Curso(){
       this.setNumero(-1);
       this.setNombre("INDEFINIDO");
       this.setOfrecido(null);
       this.setCarreras(null);
   }
   
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
   @Override
   public String toString(){
   String printer="Nombre: "+this.getNombre()+"\n"+ "Numero: "+ getNumero()+"\nOfrecido: "+getOfrecido()+"\n"
           + "Carrera: "+getCarreras();
    return printer;
   }
   
   }
   
