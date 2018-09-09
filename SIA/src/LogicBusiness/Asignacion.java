

package LogicBusiness;
import data.Carrera;
import data.Docente;
import data.Curso;


public class Asignacion{    
    public static void ingreso(){
    
    Carrera ingenieriaElectronica = new Carrera("ingenieria electronica",null,null);
    Carrera matematicas =new Carrera("matematicas",null,null);
       
    Docente guillermo =new Docente(1022381594,"guillermo antnio","padilla calvo",null,null,null);
    Docente arturo =new Docente(34321511,"arturo jose","cediel castro",null,null,null);
    
    Curso poo12=new Curso(1216654,"programacion orienteda a objetos 12",null,null);
    Curso poo11=new Curso(121312,"programacion orienteda a objetos 15",null,null);
       
}

}
