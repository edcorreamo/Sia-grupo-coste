
package IU;
import java.util.Scanner;
import data.Carrera;
import LogicBusiness.Asignacion;

public class Imprimir {
 
    public static void main(String[] args) {
        
        Asignacion.ingreso();
                
         
         Scanner ingresar=new Scanner(System.in);
         int x;
         do{
         System.out.println("por favor vea nuestro menu: elija una opcion");
         System.out.println("1. revisar estudiantes");
         System.out.println("2. revisar carrera");
         System.out.println("3. revisar cursos");
         System.out.println("4. Revisar docentes");
         System.out.println("5. Revisar edificios");
         System.out.println("6. Revisar grupos");
         System.out.println("7. revisar notas");
         System.out.println("8. Salones");
         System.out.println("9. faultades");
         System.out.println("0. salir ");
         x=ingresar.nextInt();
         String resultado;
         switch(x){
            
            case 1:
            case 2: //resultado=matematicas.toString(); System.out.println(resultado);break;
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
