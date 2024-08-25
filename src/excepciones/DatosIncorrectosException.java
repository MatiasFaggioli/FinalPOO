package excepciones;

/**
 * La clase DatosIncorrectosException es una excepción que se lanza cuando se
 * encuentran datos incorrectos en el inicio de sesion del sistema.
 */
public class DatosIncorrectosException extends Exception {

    /**
     * Constructor de la excepción DatosIncorrectosException.
     *
     * @param message Mensaje que describe la razón de la excepción.
     */
    public DatosIncorrectosException(String message) {
        super(message);
    }

}
