package opclas4;
import java.util.Scanner;

public class class_banco {
     
    Scanner scanner = new Scanner(System.in);
    //atributos 
    int saldo;
    int Cantidad;
    int din_dis= 2000;
    int din_ent;
    int opret;
    int opabo;

    //Metodo para leer el dinero entrate
    public void leerCant()
    {
      System.out.println("Ingresa la cantidad de dinero: ");
      din_ent = scanner.nextInt();
    }

    public void retiroDin()
    {
      opret = din_dis-din_ent;
    }

    public void abonoDin()
    {
      opabo = din_dis+din_ent;
    }

    public void abo_ret()
    {
        System.out.println("Cantidad disponible despues de retiro: "+opret);
        System.out.println("Cantidad disponible despues de abonar: "+opabo);
    }
    
}
