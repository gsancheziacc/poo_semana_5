
/**
 * @author Gabriel Sánchez Arrisi 
 * @version 1.0.0
 */
public class Empleado
{
    //Atributos
    private String nombre;
    private String apellido;
    private double sueldo;
    private int edad;

    //Constructor sin parámetros
    public Empleado()
    {
        this.nombre = "";
        this.apellido = "";
        this.sueldo = 0.0;
        this.edad = 0;
    }
    
    //Constructor con parámetros
    public Empleado(String nombre, String apellido, double sueldo, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.edad = edad;
    }

    /*
     * Método para obtener el nombre completo del empleado
     * @return      Devuelve el nombre completo del colaborador
     */
    public String devuelveNombre()
    {
        return this.nombre + " " + this.apellido;
    }
    
    /*
     * Método para obtener el sueldo liquido del empleado
     * @return      Devuelve el sueldo liquido del empleado
     */
    public double devuelveSueldoLiquido()
    {
        /*retención corresponde al cálculo del 100% (sueldo) - 10% de la retención de honorarios del empleado, 
        represetado como double*/
        final double retencion = 0.90;
        return this.sueldo * retencion;
    }
}
