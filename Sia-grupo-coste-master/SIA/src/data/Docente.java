
package data;

import java.util.Date;
import java.util.List;

public class Docente {
    //Atributos
    private Nota nota;
    private int id;
    private String usuario;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private List<Grupo> grupoclase;
    
    //CONSTRUCTOR
    public Docente(int id,String usuario,String nombre, String apellido,Date fechaNacimiento,List<Grupo> grupoclase,Nota nota){
        this.setApellido(apellido);
        this.setFechaNacimiento(fechaNacimiento);
        this.setId(id);
        this.setNombre(nombre);
        this.setNota(nota);
        this.setUsuario(usuario);
        this.setgrupoclase(grupoclase);
    }
    
    public Docente(int id,String usuario,String nombre, String apellido,Date fechaNacimiento,List<Grupo> grupoclase){
        this.setApellido(apellido);
        this.setFechaNacimiento(fechaNacimiento);
        this.setId(id);
        this.setNombre(nombre);
        this.setUsuario(usuario);
        this.setgrupoclase(grupoclase);
    }
    
    public Docente(int id,String usuario,String nombre, String apellido,Date fechaNacimiento){
        this.setApellido(apellido);
        this.setFechaNacimiento(fechaNacimiento);
        this.setId(id);
        this.setNombre(nombre);
        this.setUsuario(usuario);
    }
    
    public Docente(){
        this.setNota(null);
        this.setApellido("INDEFINIDO");
        this.setFechaNacimiento(fechaNacimiento);
        this.setId(-1);
        this.setNombre("INDEFINIDO");
        this.setUsuario("INDEFINIDO");
        this.setgrupoclase(grupoclase);
    }
    
    //Get
    public Nota getNota(){
    return this.nota;
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
    public List<Grupo> getGrupoClase(){
    return this.grupoclase;
    }
    //Set
    public void setNota(Nota nota){
    this.nota=nota;
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
    public void setgrupoclase(List<Grupo> grupoclase){
    this.grupoclase=grupoclase;
    }
    @Override
   public String toString(){
   String printer="Nombre: "+getNombre()+"\n"+ "Apellido: "+ getApellido()+"\nUsuario: "+getUsuario()+"\n"
           + "Apellido: "+getApellido()+"\n"+"Fecha de Nacimiento: "+getFechaNacimiento();
    return printer;
    }
    
}
