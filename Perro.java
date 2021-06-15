
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro
{
    // instance variables - replace the example below with your own
    // Doble barra para agregar comentario de referencia en el texto
    private int Edad=0;
    private String Nombre="Perro";
    // Luego de usar una variable tipo "float" hay que agregar una f al final
    private float Peso=1.0f;
    /**
     * Constructor for objects of class Perro
     */
    public int edadhumana()
    {
        // initialise instance variables
        return Edad*7;
        
    }
    public String Interactuar(){
        return "Guau";
    }
    public void imprimeInformation(){
        System.out.println ("Es un perro comiendo carne"+Edad+"años, y me llamo:"+Nombre);
    }
    Perro (int pEdad, String pNombre, float pPeso){
        Edad=pEdad;
        Nombre=pNombre;
        Peso=pPeso;
    }
    public void alimentar (int tipodecomida){
        if (tipodecomida==0)
            System.out.println("Es un perro comiendo carne");
        else
            System.out.println("Es un perro comiendo croquetas");
    }
}