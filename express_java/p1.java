package express_java;
import java.util.Scanner;
public class p1 {

    public static void main(String args[])
    {
        Scanner lec = new Scanner(System.in);
        int dep;
        String nombre; 

        System.out.println("Cual es su nombre? ");
        nombre = lec.nextLine();

        System.out.println("De que departamento vienes? ");
        dep = lec.nextInt();

        if(dep==1)
        {

            System.out.println("************* DPTO. ATENCION AL CLIENTE COCA-COLA **************");
            System.out.println("Cual es su antiguedad (años): ");
            int antiguedad = lec.nextInt();
             
             if(antiguedad==1)
             {
                System.out.println(nombre+", con clave 1, "+"tienes "+antiguedad+" años de antiguedad, recibes 6 dias de vacaciones.");
             } 
             else if (antiguedad >= 2 && antiguedad <=6 )
             {
                System.out.println(nombre+", con clave 1, "+"tienes "+antiguedad+" años de antiguedad, recibes 14 dias de vacaciones.");
             }
             else if (antiguedad >=7 )
             {
                System.out.println(nombre+", con clave 1, "+"tienes "+antiguedad+" años de antiguedad, recibes 20 dias de vacaciones.");
             }
        }
/////////////////////////////////////////////////////
        if(dep==2)
        {

            System.out.println("************* DPTO. LOGISTICA COCA-COLA **************");
            System.out.println("Cual es su antiguedad (años): ");
            int antiguedad = lec.nextInt();
             
             if(antiguedad==1)
             {
                System.out.println(nombre+", con clave 2, "+"tienes "+antiguedad+" años de antiguedad, recibes 7 dias de vacaciones.");
             } 
             else if (antiguedad >= 2 && antiguedad <=6 )
             {
                System.out.println(nombre+", con clave 2, "+"tienes "+antiguedad+" años de antiguedad, recibes 15 dias de vacaciones.");
             }
             else if (antiguedad >=7 )
             {
                System.out.println(nombre+", con clave 2, "+"tienes "+antiguedad+" años de antiguedad, recibes 22 dias de vacaciones.");
             }
        }
/////////////////////////////////////////////////////////////


        if(dep==3)
             {
     
                 System.out.println("************* DPTO. GERENCIA COCA-COLA **************");
                 System.out.println("Cual es su antiguedad (años): ");
                 int antiguedad = lec.nextInt();
                  
                  if(antiguedad==1)
                  {
                    System.out.println(nombre+", con clave 3, "+"tienes "+antiguedad+" años de antiguedad, recibes 10 dias de vacaciones.");
                  } 
                  else if (antiguedad >= 2 && antiguedad <=6 )
                  {
                    System.out.println(nombre+", con clave 3, "+"tienes "+antiguedad+" años de antiguedad, recibes 20 dias de vacaciones.");
                  }
                  else if (antiguedad >=7 )
                  {
                    System.out.println(nombre+", con clave 3, "+"tienes "+antiguedad+" años de antiguedad, recibes 30 dias de vacaciones.");
                  }
             }
     
    }
    
}