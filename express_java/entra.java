package express_java;
import java.util.Scanner;

public class entra {

    public static void main (String arg[])
    {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Escribe un numero del 1 al 10");
        int num1 = scanner.nextInt();

        System.out.print("Escribe otro numero: ");
        int num2 = scanner.nextInt();


        int ope = num1 + num2;

        System.out.println("Su suma es: "+ ope);
    }
}
