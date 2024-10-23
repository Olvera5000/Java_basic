package express_java;
import java.util.Scanner;

public class entra2
{
       public static void main (String args[])
    {
        //Creo mi objeto scanner, le voy a poner objeto
        Scanner objeto = new Scanner(System.in);
        String palabra;
        int numero1;

      System.out.println("escribe algo: ");
      //Cuando mandamos a llamar el método "next", la parte que le sigue cambia, si son caracteres es Line, si son numeros es int
      palabra = objeto.nextLine();

      System.out.println("escribe un numero: ");
      //Cuando mandamos a llamar el método "next", la parte que le sigue cambia, si son caracteres es Line, si son numeros es int
      numero1 = objeto.nextInt();

      System.out.print("Escribio: " + palabra);
      System.out.print("Escribio: " + numero1);
    }

}