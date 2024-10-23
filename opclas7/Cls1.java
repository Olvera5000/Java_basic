package opclas7;

public class Cls1 {
    

    public static void main (String args[])
    {
        Pr1 concat = new Pr1();


        //Sin return
        concat.primerosMensajes("Hola! ", "Soy Luis sin return...");
        
        //con return
        String primeString = concat.primerStringReturn("Hola buenas...,", " Tengo return...");
    } 

}
