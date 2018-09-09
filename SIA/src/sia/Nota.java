
package SIA;
import java.util.List;
public class Nota {
    private double nota;
    private List<Grupo> grupo;
    private List<Estudiante> alumno;
    
    public double getNota(){
    return this.nota;
    }
    public List<Grupo> getGrupo(){
    return this.grupo;
    }
    public List<Estudiante> getAlumno(){
    return this.alumno;
    }
    public void setnota(double nota){
    this.nota=nota;
    }
    public void setGrupo(List<Grupo> grupo){
    this.grupo=grupo;
    }
    public void setEstudiante(List<Estudiante> alumno){
    this.alumno=alumno;
    }
    
    
}
