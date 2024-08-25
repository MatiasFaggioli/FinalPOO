package test;

import modelo.Instituto;
import vista.*;

/**
 * La clase Final_poo es el main principal de la aplicación. Esta clase se
 * encarga de iniciar la interfaz visual de usuario al deserializar un objeto
 * Instituto desde un archivo '.ser'.
 */
public class Final_poo {

    /**
     * Método main que inicia la aplicación.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Login pantallaLogear = new Login(Instituto.deserealizar("instituto.ser"));
        pantallaLogear.setVisible(true);
        pantallaLogear.setLocationRelativeTo(null);
    }

}
