
package data;

import java.util.List;


public class Grupo {
    //Atributos
    private int numero;
    private String[] diasdesemana;
    private String[] horario;
    private String semestre;
    private Curso representante;
    private Docente dictadopor;
    private List<Estudiante> asistidopor;
    private Nota nota;
    
        public Grupo(int numero, String[] diasdesemana, String[] horario, String semestre, Curso representante, Docente dictadopor, List<Estudiante> asistidopor, Nota nota){
        this.setNumero(numero);
        this.setAsistidopor(asistidopor);
        this.setDiasdesemana(diasdesemana);
        this.setHorario(horario);
        this.setSemestre(semestre);
        this.setRepresentante(representante);
        this.setDictadopor(dictadopor);
        this.setNota(nota);               
    }
    
    public Grupo(int numero, String[] diasdesemana, String[] horario, Curso representante, Docente dictadopor, List<Estudiante> asistidopor, Nota nota){
        this.setNumero(numero);
        this.setAsistidopor(asistidopor);
        this.setDiasdesemana(diasdesemana);
        this.setHorario(horario);
        this.setRepresentante(representante);
        this.setDictadopor(dictadopor);
        this.setNota(nota);               
    }
    
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
