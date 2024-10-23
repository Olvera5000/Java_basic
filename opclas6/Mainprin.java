package opclas6;
import java.util.Scanner;


public class Mainprin {


  public static void main (String args[])
  {
    Scanner scan = new Scanner(System.in);

    //Solicito datos de entrada
    System.out.println("Ingresa el primero  numero: ");
    int n1 = scan.nextInt();
    System.out.println("Ingresa el segundo numero: ");
    int n2 = scan.nextInt();
    
    

    //obejto invoco clase
    clasesava metoretsinret = new clasesava();

    //sin return
    metoretsinret.met_sin_return(n1, n2);
    metoretsinret.resultado_sin_return();

    //metodo con return
    int con_ret = metoretsinret.con_ret(n1, n2);

    System.out.println("Su resultado con retorno es: "+con_ret);
  }


}
