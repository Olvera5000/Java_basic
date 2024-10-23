package express_java;
/*Importamos la libreria Scanner*/
import java.util.Scanner;

public class ifanidad {
    /*METODO MAIN*/
    public static void main (String args[])
    {
        /*Creamos un objeto Scanner para leer la entrada del usuario*/
        Scanner scanner = new Scanner (System.in);

        System.out.print("¿Que operacion quieres realizar? 1.-Suma 2.-Resta 3.-Multiplicacion 4.-Division ");
        //lee el numero que se ingresó
        int opcion = scanner.nextInt();
        
       
        if (opcion>=1 && opcion<=4) 
        {
         
            int ope;

            
        //Pedimos un dato por consola
        System.out.print("Escriba su primer numero: ");
        //lee el numero que se ingresó
        int n1 = scanner.nextInt();

        
        //Pedimos un dato por consola
        System.out.print("Escriba su segundo numero: ");
        //lee el numero que se ingresó
        int n2 = scanner.nextInt();
     
        if (opcion==1) {

           ope = n1+n2;
           System.out.println("El resultado de su suma es:"+ope);
            
        }
        
        if (opcion==2) {

            ope = n1-n2;
            System.out.println("El resultado de su resta es:"+ope);
             
         }
         
        if (opcion==3) {

            ope = n1*n2;
            System.out.println("El resultado de su multiplicacion es:"+ope);
             
         }
         
        if (opcion==4) {

            ope = n1/n2;
            System.out.println("El resultado de su division es:"+ope);
             
         }
            


        }

        else 
        {
            System.out.println("Lo siento, su opcion no se encuentra en el sistema");
        }

       
    }
}
