package opclas5;

import javax.swing.JOptionPane;

public class Main {

    public static void main (String args [])
    {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su primer numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo numero: "));
        
        //Creo mi objeto para traer los datos de clases.java
        
        Clases obj = new Clases();

        // Instancio/llamo mis metodos
        obj.suma(n1, n2);
        obj.resta(n1, n2);
        obj.resultado(n1, n2);

        //Los metodos que returnan un dato a diferencia de void, se returnan de la siguiente manera
        

        int data_return = obj.data_return(n1, n2);
       //asi lo muestro en consola, llamo al metodo
        System.out.println("SU resultado de su metodo return es: "+data_return);
        

    } 
}

