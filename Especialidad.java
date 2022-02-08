import java.util.Random;
/**
 * @author Gabriel Sánchez Arrisi 
 * @version 1.0.0
 */
public class Especialidad
{
    //Variables
    private int id;
    private String nombre;

    //Constructor sin parámetros
    public Especialidad()
    {
        this.id = generarId();
        this.nombre = "";
    }

    private int generarId() 
    {
        Random rand = new Random();
        return rand.nextInt(50);
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
