/**
 * <h2>Clase Empleado, se utiliza para crear y leer
 * empleados de una BBDD</h2>
 * 
 * Busca información de javadoc en <a href="http://google.es">google</a>
 * 
 * @author rachel & RCL76 QUE ES EL COLABORADOR DE ESTE PROYECTO
 * @version 1.0
 * @since 29/11/2017
 *
 */
public class Empleado {
	/**
	 * Atributo Nombre del empleado
	 */
    private String nombre;
    
    /**
     * Atributo apellido del empleado
     */
    private String apellido;
    
    /**
     * Atributo salario bruto que recibe al mes
     */
    private double salario;

    /**
     * Constructor con 3 parámetros
     * Crea objetos de tipo Empleado, con nombre, apellido y sueldo
     * <ol>
     * <li>@param nombre nombre del empleado</li>
     * <li>@param apellido</li> 
     * <li>@param salario</li> 
     * </ol>
     */
    public Empleado(String nombre, String apellido, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }
    
    /**
     * Sube el salario al empleado según una cantidad
     * @see Empleado
     * @param subida
     */
    public void subirSalario (double subida){
           salario=salario + subida;
    }
 
    /**
     * Comprueba que el nombre no esté vacío
     * 
     * @return
     * <ul>
     * <li>true: el nombre no es una cadena vacía</li>
     * <li>false: el nombre está vacío</li>
     * </ul>
     */
    private boolean comprobar(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
   
}
