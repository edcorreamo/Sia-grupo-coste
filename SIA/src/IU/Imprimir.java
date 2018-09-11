
package IU;

import LogicBusiness.Asignacion;
import data.Carrera;
import data.Curso;
import data.Docente;
import data.Edificio;
import data.Estudiante;
import data.Facultad;
import data.Grupo;
import data.Nota;
import data.Salon;

public class Imprimir {
 
    public static void main(String[] args) {
    
   //Estudiantes
   Estudiante ramiro=new Estudiante(5.2,4,"jj",null,null,null,"ramirez",null);
   Estudiante luisa=new Estudiante(5.2,3,"ju",null,null,null,"rodriguez",null);
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
    //Grupos
    Grupo objetos12=new Grupo(22012, null,null, "segundosemestre", poo12, null,null,null);
    Grupo objetos15=new Grupo(22015, null,null, poo12, null,null,null);
    
    
       Asignacion.ingreso();
       
       
       
     
    }
}
