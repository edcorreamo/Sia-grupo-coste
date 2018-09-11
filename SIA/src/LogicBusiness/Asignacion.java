

package LogicBusiness;

import data.Carrera;
import data.Curso;
import data.Docente;
import data.Edificio;
import data.Estudiante;
import data.Facultad;
import data.Grupo;
import data.Nota;
import data.Salon;
import java.util.Scanner;

public class Asignacion{    
    public static void ingreso(){ 
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
        
    
    System.out.println(ramiro);
    
      Scanner ingresar=new Scanner(System.in);  
        int x;
         do{
         System.out.println("Por favor vea nuestro menu: elija una opcion");
         System.out.println("1. Estudiantes");
         System.out.println("2. Carrera");
         System.out.println("3. Cursos");
         System.out.println("4. Docentes");
         System.out.println("5. Edificios");
         System.out.println("6. Grupos");
         System.out.println("7. Notas");
         System.out.println("8. Salones");
         System.out.println("9. Facultades");
         System.out.println("0. Salir ");
         x=ingresar.nextInt();
        
         switch(x){
            case 1:System.out.println(ramiro);System.out.println(luisa);break;     
            case 2:  
            case 3:
            case 4:
            case 5:
            case 6: System.out.println(julioGaravito);System.out.println(fem);break;
            case 7:
            case 8:
            case 9: System.out.println(ingenieria);System.out.println(ciencias);break;
            case 0:
            default :break;
          }
       }while(x!=0);
    }
    }    
 
