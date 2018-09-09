


import java.util.Scanner;

public class SIAPROJECT {
    public static void main(String[] args) {
         
         Scanner ingresar=new Scanner(System.in);
         int x;
         do{
         System.out.println("por favor vea nuestro menu: elija una opcion");
         System.out.println("1. revisar estudiantes");
         System.out.println("2. revisar carreras");
         System.out.println("3. revisar cursos");
         System.out.println("4. revisar docentes");
         System.out.println("5. revisar edificios");
         System.out.println("6. vrevisar grupos");
         System.out.println("7. revisar notas");
         System.out.println("8. Salones");
         System.out.println("9. faultades");
         System.out.println("0. salir ");
         x=ingresar.nextInt();
         
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
            default :
         
         }
         



         
         }while(x!=0);
        
    }
    
    
}
  
