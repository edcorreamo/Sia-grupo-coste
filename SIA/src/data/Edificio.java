
package data;
import java.util.List;

public class Edificio {
    //Atributos
    private int numero;
    private String nombre;
    private List<Carrera> carreras;
  
    private List<Salon> salones;
    
    //CONSTRUCTOR
   public Edificio(int numero,String nombre,List<Carrera> carreras,List<Salon> salones){
    
   this.setSalones(salones);
   this.setCarreras(carreras);
   this.setNumero(numero);
   this.setNombre(nombre);
   
    } 
    
    //Get
       public String getNombre(){
        return this.nombre;
        }
        public List<Carrera> getCarreras(){
        return this.carreras;
        }
       
        public List<Salon> getSalones(){
        return this.salones;
        }
        public int getNumero(){
        return this.numero;
        }
    //Set
        public void setNombre(String nombre){
        this.nombre=nombre;
        }
        public void setSalones(List<Salon> salones){
        this.salones=salones;
        }
        public void setCarreras(List<Carrera> carreras){
        this.carreras=carreras;
        }
       
        public void setNumero(int numero){
        this.numero=numero;
    
    
        }
        
  @Override
   public String toString(){
   String printer="Nombre: "+this.getNombre()+"/n"+ "Carreras: "+ getCarreras()+"/n Numero: "+getNumero()+"/n"
          +"/n"+"Salones: "+getSalones();
         
    return printer;
    }       
        
        
        
}
