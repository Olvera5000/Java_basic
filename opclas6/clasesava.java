package opclas6;

public class clasesava {
     
    int suma;
    
    //metodo sin retornar (Void)

    public void met_sin_return(int numero1, int numero2)
    {
      suma =numero1+numero2;
    }

    //metodo con return
    
    public int con_ret(int nume1, int nume2)
    {
        int sumam = nume1+nume2; 

        return sumam;
    }


    public void resultado_sin_return()
    {
        System.out.println("Su resultado sin return es: "+suma);
    }

    
}
