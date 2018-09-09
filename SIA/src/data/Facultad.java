
package data;
import java.util.List;

public class Facultad {
    //Atributos
        private String nombre;
        private List<Estudiante> estudiantes;
        private List<Carrera> carreras;
        private List<Edificio> edificios;
        private List<Docente> docentes;
    //Get
        
        public String getNombre(){
        return this.nombre;
        }
        public List<Estudiante> getEstudiantes(){
        return this.estudiantes;
        }
        public List<Carrera>  getCarreras(){
        return this.carreras;
        }
        public List<Edificio> getEdificios(){
        return this.edificios;
        }
        public List<Docente> getDocentes(){
        return this.docentes;
        }
    //Set
        public void setNombre(String nombre){
        this.nombre=nombre;
        }
        public void setEstudiantes(List<Estudiante> estudiantes){
        this.estudiantes=estudiantes;
        }
        public void setCarreras(List<Carrera> carreras){
        this.carreras=carreras;
        }
        public void setEdificios(List<Edificio> edificios){
        this.edificios=edificios;
        }
        public void setDocentes(List<Docente> docentes){
        this.docentes=docentes;
        }
        
        
        
        
        
        
        
}
