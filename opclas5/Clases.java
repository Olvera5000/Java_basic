package opclas5;

public class Clases {

    //atributos
    int suma;
    int resta;

    //Métodos con sus parámetros
    public void suma(int numero1, int numero2)
    {
      suma = numero1+numero2;
    }
    public void resta(int numero1, int numero2)
    {
      resta = numero1-numero2;
    }
    
    //metodo que retorna un valor, por eso usa int,
    public int data_return(int numero1, int numero2)
    {
      int multi = numero1*numero2;

      return multi;
    }


    public void resultado(int numero1, int numero2)
    {
      System.out.println("El resultado de la suma es: "+ suma);
      System.out.println("El resultado de la resta es: "+ resta);
    }
    
}

