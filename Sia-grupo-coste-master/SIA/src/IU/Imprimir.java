
package IU;
import LogicBusiness.Asignacion;
import java.util.Scanner;


public class Imprimir {
 
public static void menu(){
    System.out.println("Bienvenido a la Universidad Nacional de Colombia");
        System.out.println("Acontinuacion se le presenta un menú de opciones para que pueda "
                + "visualizar las distintas dependencias del campus. Escoja el numero correspondiente a su opción.");
        System.out.println("1. Estudiante");
        System.out.println("2. Docentes");
        System.out.println("3. Grupos");
        System.out.println("4. Cursos");
        System.out.println("5. Facultades");
        System.out.println("6. Salones");
        System.out.println("7. Edificios");
        System.out.println("8. Notas");
        System.out.println("9. Carreras");
        System.out.println("0. Salir");
}

public static int opcion(){
    Scanner a= new Scanner(System.in);
    int seleccion =a.nextInt();
    return seleccion;

}
}

