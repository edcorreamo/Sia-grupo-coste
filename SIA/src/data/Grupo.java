
package data;

import java.util.List;


public class Grupo {
    //Atributos
    private long numero;
    private String[] diasdesemana;
    private String[] horario;
    private String semestre;
    private Curso representante;
    private Docente dictadopor;
    private List<Estudiante> asistidopor;
    private Nota nota;
   //Get
    public Nota getNota(){
    return this.nota;
    }
    public long getNumero(){
    return this.numero;
    }
    public String[] geDiasdesemana(){
    return this.diasdesemana;
    }
    public String[] getHorario(){
    return this.horario;
    }
    public String getSemestre(){
    return this.semestre;
    } 
    public Curso getRepresentante(){
    return this.representante;
    }
    public Docente getDictadopor(){
    return this.dictadopor;
    }
   public List<Estudiante> getAsistidopor(){
     return this.asistidopor;
     }
   //Set
    public void setNota(Nota nota){
    this.nota=nota;
    }
    public void setNumero(int numero){
    this.numero=numero;
    }
    public void setDiasdesemana(String[] diasdesemana){
    this.diasdesemana=diasdesemana;
    }
    public void setHorario(String[] horario){
    this.horario=horario;
    }
    public void setSemestre(String semestre){
    this.semestre=semestre;
    } 
    public void setRepresentante(Curso representante){
    this.representante=representante;
    }
    public void setDictadopor(Docente dictadopor){
    this.dictadopor=dictadopor;
    }
   public void setAsistidopor(List<Estudiante> asistidopor){
     this.asistidopor=asistidopor;
     }
    
    
    
    
    
    
    

}
