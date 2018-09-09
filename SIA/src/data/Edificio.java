
package data;
import java.util.List;

public class Edificio {
    //Atributos
    private int numero;
    private String nombre;
    private List<Carrera> carreras;
    private List<Curso> cursos;
    private List<Salon> salones;
    
    //Get
       public String getNombre(){
        return this.nombre;
        }
        public List<Carrera> getCarreras(){
        return this.carreras;
        }
        public List<Curso>  getCursos(){
        return this.cursos;
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
        public void setEdificios(List<Curso> cursos ){
        this.cursos=cursos;
        }
        public void setNumero(int numero){
        this.numero=numero;
    
    
        }
}
