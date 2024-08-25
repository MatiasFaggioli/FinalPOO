package modelo;

/**
 * La clase Administrador extiende de Usuario y representa a un administrador del instituto.
 * Sobrescribe los métodos de la clase Usuario para identificar a un administrador.
 */
public class Administrador extends Usuario {

    /**
     * Constructor de la clase Administrador.
     * 
     * @param nombre    Nombre del administrador.
     * @param pass      Contraseña del administrador.
     * @param documento Documento del administrador.
     * @param mail      Correo electrónico del administrador.
     */
    public Administrador(String nombre, String pass, String documento, String mail) {
        super(nombre, pass, documento, mail);
    }

    /**
     * Indica si el usuario es un alumno.
     * 
     * @return false siempre, ya que este es un administrador.
     */
    @Override
    public boolean soyAlumno() {
        return false;
    }

    /**
     * Indica si el usuario es un profesor.
     * 
     * @return false siempre, ya que este es un administrador.
     */
    @Override
    public boolean soyProfesor() {
        return false;
    }

    /**
     * Indica si el usuario es un administrador.
     * 
     * @return true siempre, ya que este es un administrador.
     */
    @Override
    public boolean soyAdministrador() {
        return true;
    }
}
