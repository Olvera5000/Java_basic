package express_java;
//laibrari
import java.util.Scanner;

public class entra4 {

    public static void main (String args[])
    {
       Scanner ob = new Scanner(System.in);
       int num1;
       int num2;
       String nombre;

       System.out.println("Como te llamas? ");
       nombre = ob.nextLine();

       System.out.println("Ingresa tu primer numero:");
       num1 = ob.nextInt(); 
       System.out.println("Ingresa tu segundo numero:");
       num2 = ob.nextInt();


       int op = num1+num2;

       System.out.println("Hola "+nombre+", el resultado de tu suma es: "+op);
       

    }
    
}
