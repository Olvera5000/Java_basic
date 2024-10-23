package express_java;
import java.util.Scanner;

public class For {

    public static void main (String args[])
    {
      Scanner scan = new Scanner (System.in);
      int num;
      int i=0;

      System.out.print("Escriba su numero a multiplicar: ");
      num = scan.nextInt();

      for(i=1; i<=10; i++)
      {
       int multi = num*i;
        System.out.println(num+"X"+i+"="+multi);
      }
    }
}
