package express_java;
public class clase1 {

    //atributos
    String marca;
    String modelo;
    String color;
    String ano;

    public static void main(String args[])
    {   
        //creo este objeto llamado coche1
        clase1 coche1 = new clase1();
        //creo otro objeto llamado coche2
        clase1 coche2 = new clase1();

        //Asigno valores a los parametros de coche1
        coche1.marca = "Renault";
        coche1.modelo = "Seltos";
        coche1.color = "Rojo";
        coche1.ano = "2020";
        //Asigno valores a los parametros de coche2
        coche2.marca = "Volkswagen";
        coche2.modelo = "Vento";
        coche2.color = "Rojo";
        coche2.ano = "2021";

        //Imprimo los datos de coche1
        System.out.println("Datos de coche 1: "+" Marca: "+coche1.marca+" Modelo: "+coche1.modelo+" Color: "+coche1.color+" Año:"+coche1.ano);
        //Imprimo los datos de coche2
        System.out.println("Datos de coche 2: "+" Marca: "+coche2.marca+" Modelo: "+coche2.modelo+" Color: "+coche2.color+" Año:"+coche2.ano);
    }

}
