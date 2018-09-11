

package LogicBusiness;
import data.Carrera;
import data.Docente;
import data.Curso;
import data.Grupo;
import data.Nota;
import data.Salon;
import data.Estudiante;
import data.Facultad;
import data.Edificio;

public class Asignacion{    
    public static void ingreso(){
        
    //Estudiantes
     Estudiante ramiro=new Estudiante(null,3.5,1001936613,null,"Ramiro","Ramiro",null,null);
   
   Estudiante luisa=new Estudiante(null,3.4,1001936612,null,null,null,null,null);
    //Facultad
    Facultad ingenieria=new Facultad("ingenieria",null,null,null,null);
    Facultad ciencias=new Facultad("ciencias",null,null,null,null);
    //Edificio
    Edificio julioGaravito=new Edificio(401,"Julio Garavito",null,null);
    Edificio fem=new Edificio(401,"Julio Garavito",null,null);
    //Carreras
    Carrera ingenieriaElectronica = new Carrera("ingenieria electronica",null,null);
    Carrera matematicas =new Carrera("matematicas",null,null);
    //Docentes
    Docente guillermo =new Docente(1022381594,"guillermo antnio","padilla calvo",null,null,null);
    Docente arturo =new Docente(34321511,"arturo jose","cediel castro",null,null,null);
    //Cursos
    Curso poo12=new Curso(1216654,"programacion orienteda a objetos 12",null,null);
    Curso poo11=new Curso(121312,"programacion orienteda a objetos 15",null,null);
    //Notas
    Nota programacion12=new Nota(4.5,null,null);
    Nota programacion15=new Nota(3.9,null);
    //Salones
    Salon salon454404=new Salon(404,null,null,null);
    Salon salon454403=new Salon(403,null,null);
    //Gruopos
    Grupo objetos12=new Grupo(22012, null,null, "segundosemestre", poo12, null,null,null);
    Grupo objetos15=new Grupo(22015, null,null, poo12, null,null,null);
       
}

}
