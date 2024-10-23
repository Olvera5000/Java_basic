package express_java;
import java.util.Scanner;
public class entra3 {

    public static void main(String args[])
    {
        Scanner objetosca = new Scanner(System.in);
        String nombre; 
        int num1; 
        int num2; 
        int num3;

        System.out.print("¿Cual es su nombre? ");
        nombre = objetosca.nextLine();

        System.out.println("Su primer numero: ");
        num1 = objetosca.nextInt();
        System.out.println("Su segundo numero: ");
        num2 = objetosca.nextInt();
        System.out.println("Su tercer numero: ");
        num3 = objetosca.nextInt();

        System.out.println("Hola, "+nombre+"!");

        if (num1>num2 && num1>num3)
        {
            System.out.println("Su numero mayor es: "+num1);
        }

        else if (num2>num1 && num2>3)
        {
            System.out.println("Su numero mayor es: "+num2);
        }

        else
        {
            System.out.println("Su numero mayor es el: "+num3);
        }

        

        
    }
    
}
