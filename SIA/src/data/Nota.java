
package data;
import java.util.List;
public class Nota {
    private double nota;
    private List<Grupo> grupo;
    private List<Estudiante> alumno;
    //CONSTRUCTOR
    public Nota (double nota, List<Grupo> grupo, List<Estudiante> alumno){
       this.setNota(nota);
       this.setGrupo(grupo);
       this.setAlumno(alumno);
    }
    
    public Nota (double nota, List<Estudiante> alumno){
       this.setNota(nota);
       this.setAlumno(alumno);
    } 
    public Nota (){
       this.setNota(-1);
       this.setGrupo(grupo);
       this.setAlumno(alumno);
    }
    
    public double getNota(){
    return this.nota;
    }
    public List<Grupo> getGrupo(){
    return this.grupo;
    }
    public List<Estudiante> getAlumno(){
    return this.alumno;
    }
    public void setNota(double nota){
    this.nota=nota;
    }
    public void setGrupo(List<Grupo> grupo){
    this.grupo=grupo;
    }
    public void setAlumno(List<Estudiante> alumno){
    this.alumno=alumno;
    }
    @Override
   public String toString(){
   String printer="Nota: "+this.getNota()+"\n"+ "Grupo: "+ getGrupo()+"\n Alumno: "+getAlumno();
          
    return printer;
    }
    
}
