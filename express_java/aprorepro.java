package express_java;
public class aprorepro {
    
    public static void main (String args[])
    {
        int mat = 5;
        int bio = 8;
        int quim = 7;   
        int prom;

        prom = (mat+bio+quim)/3;

        if(prom>=6)
        {
            System.out.println("Aprobaste con: "+prom);
        }

        else
        {
            System.out.println("Reprobaste con: "+prom);
        }
    }
    
}
