
/**
 * Write a description of class Programa here.
 * 
 * @author (Leonardo) 
 * @version (1.0)
 */
public class Programa
{
    /**
     * Constructor for objects of class Programa
     */
    public static void main (String args[])
    {
        Perro miPerro = new Perro(4, "Canelo", 6.50f);
            miPerro.alimentar(1);
            miPerro.Interactuar();
            miPerro.imprimeInformation();
    }
}