package opclas2;
import java.util.Scanner;
public class opera {

    Scanner scanner = new Scanner(System.in); 
    //atributos
    int num1;
    int num2;
    int multi;
    

    //primer metodo
    public void readdata()
    {
       System.out.println("Primer numero: ");
       num1 = scanner.nextInt();
       
       System.out.println("Segundo numero: ");
       num2 = scanner.nextInt();
    }


    //Segundo metodo
    public void multiplicar()
    {
        multi = num1*num2;
    }

    public void mosdata()
    {
        System.out.println("Su resultado de la multiplicacion es: "+multi);
    }

}
