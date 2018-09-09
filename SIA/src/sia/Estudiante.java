
package SIA;

import java.util.Date;
import java.util.List;

public class Estudiante {
    //Atributos
    private Nota nota;
    private double papa;
    private int id;
    private String usuario;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private List<Grupo> asistencia;
    
    //Get
    public Nota getNota(){
    return this.nota;
    }  
    public double getPapa(){ 
     return this.papa;
    }
    public int getId(){ 
    return this.id;
    }
     public String getUsuario(){ 
    return this.usuario;
     }
    public String getNombre(){ 
    return this.nombre;
    }
    public String getApellido(){ 
    return this.apellido;
    } 
    public Date getFechaNacimiento(){
    return this.fechaNacimiento;
    }
    public List<Grupo> getAsistencia(){
    return this.asistencia;
    }
    
       //Set  
    public void setNota(Nota nota){
    this.nota=nota;
    }
    public void setPapa(double papa){ 
    this.papa=papa;
    }
    public void setId(int id){ 
    this.id=id;
    }
    public void setUsuario(String usuario){ 
    this.usuario=usuario;
    }
    public void setNombre(String nombre){ 
    this.nombre=nombre;
    }
    public void setApellido(String apellido){ 
    this.apellido=apellido;
    } 
    public void setFechaNacimiento(Date fechaNacimiento){
    this.fechaNacimiento=fechaNacimiento;     
    }
    public void setAsistencia(List<Grupo> asistencia){
    this.asistencia=asistencia;
    }
    
}
