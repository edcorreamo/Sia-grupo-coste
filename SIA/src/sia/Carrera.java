
package SIA;

import java.util.List;


public class Carrera {
    //Atributos
    private String nombres;
    private List<Facultad> efacultad;
    private List<Estudiante> estudiantes;
        
    public Carrera(String nombre, List efacultad, List estudiantes){
        this.setNombre(nombre);
        this.setEstudiantes(estudiantes);
        this.seteFacultad(efacultad);
    }
    public Carrera(String nombre,List estudiantes){
        this.setNombre(nombre);
        this.setEstudiantes(estudiantes);
    }
    
    //Get
    public List<Facultad> geteFacultad(){
    return this.efacultad;
    }
    public List<Estudiante> getEstudiantes(){
    return this.estudiantes;
    }
    public String getNombres(){
    return this.nombres;
    }
    //Set
    public void setNombre(String nombres){
    this.nombres=nombres;
    }
    public void seteFacultad(List<Facultad> efacultad){
    this.efacultad=efacultad;
    }
    public void setEstudiantes(List<Estudiante> estudiantes){
    this.estudiantes=estudiantes;
    
    }
}
