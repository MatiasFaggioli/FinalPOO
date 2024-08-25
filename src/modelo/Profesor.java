package modelo;

/**
 * La clase Profesor extiende de Usuario y sobrescribe sus metodos de la clase
 * para identificarse como un profesor.
 */
public class Profesor extends Usuario {

    /**
     * Constructor de la clase Profesor.
     *
     * @param nombre Nombre del profesor.
     * @param pass Contraseña del profesor.
     * @param documento Documento del profesor.
     * @param mail Correo electrónico del profesor.
     */
    public Profesor(String nombre, String pass, String documento, String mail) {
        super(nombre, pass, documento, mail);
    }

    /**
     * Indica si el usuario es un alumno.
     *
     * @return false siempre, ya que este es un profesor.
     */
    @Override
    public boolean soyAlumno() {
        return false;
    }

    /**
     * Indica si el usuario es un profesor.
     *
     * @return true siempre, ya que este es un profesor.
     */
    @Override
    public boolean soyProfesor() {
        return true;
    }

    /**
     * Indica si el usuario es un administrador.
     *
     * @return false siempre, ya que este es un profesor.
     */
    @Override
    public boolean soyAdministrador() {
        return false;
    }
}
