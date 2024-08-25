package excepciones;

/**
 * La clase UsuarioNoEncontradoException es una excepción que se lanza cuando un
 * usuario no se puede encontrar para iniciar sesion.
 */
public class UsuarioNoEncontradoException extends Exception {

    /**
     * Constructor de la excepción UsuarioNoEncontradoException.
     *
     * @param message Mensaje que describe la razón de la excepción.
     */
    public UsuarioNoEncontradoException(String message) {
        super(message);
    }

}
