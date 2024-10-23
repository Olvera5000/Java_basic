package opclas;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Operacion {
    
    //Creamos atributos
    int suma;
    int resta;
    int num1;
    int num2;

    //Creo objeto Scanner
    Scanner scanner = new Scanner(System.in);
    

    //Creo primer metodo para leer los numeros
   public void leerNumeros()
   {
       
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero"));
   }

   //Creo segundo metodo para la operacion suma
   public void suma()
   {
     suma = num1+num2;
   }

   public void resta()
   {
     resta = num1-num2;
   }

   public void mosRes()
   {
    System.out.println("El resultado de su suma es: "+suma);
    System.out.println("El resultado de su resta es: "+resta);
   }
}