
/**
 * @author Gabriel Sánchez Arrisi 
 * @version 1.0.0
 */
public class Desarrollador extends Empleado
{
    // instance variables - replace the example below with your own
    private String cargo;
    private Especialidad especialidad;

    //Constructor de clase con parámetros
    public Desarrollador(String nombre, String apellido, double sueldo, int edad, String cargo)
    {
        super(nombre,apellido,sueldo,edad);
        this.cargo = cargo;
    }
    
    public Especialidad getEspecialidad()
    {
        return this.especialidad;
    }
    
    public void setEspecialidad(String nombre)
    {
        Especialidad especialidad = new Especialidad();
        especialidad.setNombre(nombre);
        this.especialidad = especialidad;
    }

}
