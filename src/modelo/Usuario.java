package modelo;

import java.io.Serializable;

/**
 * La clase abstracta Usuario representa un usuario del sistema. Implementa la
 * interfaz Serializable y define los atributos y métodos comunes a todos los
 * tipos de usuarios.
 */
public abstract class Usuario implements Serializable {

    private String nombre;
    private int pass;
    private String documento;
    private String mail;
    private boolean debeCambiarContrasenia;
    private boolean cuentaSuspendida;
    private String mensajeDeSuspension;

    /**
     * Constructor de la clase Usuario.
     *
     * @param nombre Nombre del usuario.
     * @param pass Contraseña del usuario.
     * @param documento Documento del usuario.
     * @param mail Correo electrónico del usuario.
     */
    public Usuario(String nombre, String pass, String documento, String mail) {
        this.nombre = nombre;
        this.pass = pass.hashCode();
        this.documento = documento;
        this.mail = mail;
        this.debeCambiarContrasenia = true;
        this.cuentaSuspendida = false;
    }

    /**
     * Devuele un booleano indicando si el Usuario es un Alumno
     *
     * @return booleano
     */
    public abstract boolean soyAlumno();

    /**
     * Devuele un booleano indicando si el Usuario es un Profesor
     *
     * @return boolean
     */
    public abstract boolean soyProfesor();

    /**
     * Devuele un booleano indicando si el Usuario es un Administrador
     *
     * @return boolean
     */
    public abstract boolean soyAdministrador();

    /**
     * Devuelve el valor si la cuenta esta deshabilitada
     *
     * @return bolean
     */
    public boolean isCuentaDeshabilitada() {
        return cuentaSuspendida;
    }

    /**
     * Setea un valor al atributo mensajeDeSuspension
     *
     * @param mensaje
     * @param cuentaDeshabilitada String
     */
    public void setmensajeDeSuspension(String mensaje) {
        if (isCuentaDeshabilitada()) {
            this.mensajeDeSuspension = mensaje;
        }
    }

    /**
     * Setea un valor al atributo cuenta deshabilitada
     *
     * @param cuentaDeshabilitada boolean
     */
    public void setCuentaDeshabilitada(boolean cuentaDeshabilitada) {
        this.cuentaSuspendida = cuentaDeshabilitada;
    }

    /**
     * Devuelve el valor del atributo nombre
     *
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Settea el valor al atributo nombre
     *
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el valor del atributo pass
     *
     * @return int
     */
    public int getPass() {
        return pass;
    }

    /**
     * Setea valor al atributo pass
     *
     * @param pass recibe un string que es convertido a hashcode
     */
    public void setPass(String pass) {
        this.pass = pass.hashCode();
    }

    /**
     * Retorna el valor del atributo documento
     *
     * @return String documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Establece valor al atributo documento
     *
     * @param documento String a settear
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Retorna el valor del atributo mail
     *
     * @return String
     */
    public String getMail() {
        return mail;
    }

    /**
     * Retorna el valor del atributo cuentaSuspendida
     *
     * @return boolean
     */
    public boolean isCuentaSuspendida() {
        return cuentaSuspendida;
    }

    /**
     * Devuelve el valor del atributo mesanjeDeSuspension
     *
     * @return String
     */
    public String getMensajeDeSuspension() {
        return mensajeDeSuspension;
    }

    /**
     * Establece valor al atributo mail
     *
     * @param mail String a settear
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Devuelve el valor del atributo debeCambiarContraseña
     *
     * @return boolean
     */
    public boolean isDebeCambiarContrasenia() {
        return debeCambiarContrasenia;
    }

    /**
     * Establece si el usuario debe cambiar la contraseña
     *
     * @param debeCambiarContrasenia booleano
     */
    public void setDebeCambiarContrasenia(boolean debeCambiarContrasenia) {
        this.debeCambiarContrasenia = debeCambiarContrasenia;
    }

    @Override
    public String toString() {
        return nombre + " " + documento;
    }

}
