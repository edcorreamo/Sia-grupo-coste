
package data;
import java.util.List;


public class Salon {
    //Atributos
    private int numero;
    private Edificio edificios;
    private List<Curso> cursos;
    private List<Facultad> facultad;
    //CONSTRUCTOR
        public Salon(int numero, Edificio edificios, List<Curso> cursos, List<Facultad> facultad){
        this.setNumero (numero);
        this.setEdificios(edificios);
        this.setFacultad(facultad);
        this.setCursos(cursos);
    }
    
    public Salon(int numero, Edificio edificios, List<Curso> cursos){
        this.setNumero (numero);
        this.setEdificios(edificios);
        this.setCursos(cursos);
    }
    
    //Get 
        public List<Curso> getCursos(){
        return this.cursos;
        }
        public List<Facultad>  getFacultad(){
        return this.facultad;
        }
        public Edificio getEdificios(){
        return this.edificios;
        }
        public int getNumero(){
        return this.numero;
        }
   
    //Set
        public void setFacultad(List<Facultad> facultad){
        this.facultad=facultad;
        }
        public void setEdificios(Edificio edificios){
        this.edificios=edificios;
        }
        public void setCursos(List<Curso> cursos){
        this.cursos=cursos;
        }
        public void setNumero(int numero){
        this.numero=numero;
    
    
        }
        
      @Override
   public String toString(){
   String printer="Numero: "+this.getNumero()+"/n"+ "Edificios: "+ getEdificios()+"/n Cursos: "+getCursos()+"/n"
           + "Facultad: "+getFacultad();
    return printer;
    }  
        
        
}
