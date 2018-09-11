

package LogicBusiness;

import java.util.Scanner;

public class Asignacion{    
    public static void ingreso(){
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
         String resultado;
         switch(x){
            case 1:   
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
            default :break;
          }
       }while(x!=0);
        
    }    
        
        
        
        
   
}

}
