
package data;

import java.util.List;


public class Grupo {
    //Atributos
    private int numero;
    private String[] diasdesemana;
    private String[] horario;
    
    private Curso curso;
    private Docente dictadopor;
    private List<Estudiante> asistidopor;
    private Nota nota;
    //CONSTRUCTOR
        public Grupo(int numero, String[] diasdesemana, String[] horario, String semestre, Curso curso, Docente dictadopor, List<Estudiante> asistidopor, Nota nota){
        this.setNumero(numero);
        this.setAsistidopor(asistidopor);
        this.setDiasdesemana(diasdesemana);
        this.setHorario(horario);
       
        this.setCurso(curso);
        this.setDictadopor(dictadopor);
        this.setNota(nota);               
    }
    
    public Grupo(int numero, String[] diasdesemana, String[] horario, Curso curso, Docente dictadopor, List<Estudiante> asistidopor, Nota nota){
        this.setNumero(numero);
        this.setAsistidopor(asistidopor);
        this.setDiasdesemana(diasdesemana);
        this.setHorario(horario);
        this.setCurso(curso);
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
    public String[] getDiasdesemana(){
    return this.diasdesemana;
    }
    public String[] getHorario(){
    return this.horario;
    }
  
    public Curso getCurso(){
    return this.curso;
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
   
    public void setCurso(Curso curso){
    this.curso=curso;
    }
    public void setDictadopor(Docente dictadopor){
    this.dictadopor=dictadopor;
    }
   public void setAsistidopor(List<Estudiante> asistidopor){
     this.asistidopor=asistidopor;
     }
    
    
    @Override
   public String toString(){
   String printer="Numero: "+this.getNumero()+"/n"+ "Asistidopor: "+ getAsistidopor()+"/n Dias de Semana: "+getDiasdesemana() +"/n"
           + "Horario: "+getHorario()+"/n"+"Nota: "+getNota()+"/n"+"Asistidopor: "+getAsistidopor()+"/n"+"Dictadopor:"+getDictadopor();
          
    return printer;
    }
    
    
    
    

}
