package modelo;

import java.util.ArrayList;
import excepciones.DatosIncorrectosException;
import excepciones.UsuarioNoEncontradoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * La clase Instituto contiene una lista de cursos y usuarios. Proporciona
 * métodos para gestionar estos cursos y usuarios, así como para serializar y
 * deserializar los datos del instituto.
 */
public class Instituto implements Serializable {

    public static final String NOMBRE_ARCHIVO = "instituto.ser";
    private ArrayList<Curso> cursos;
    private ArrayList<Usuario> Usuarios;

    /**
     * Constructor de la clase Instituto. Inicializa las listas de cursos y
     * usuarios.
     */
    public Instituto() {
        this.cursos = new ArrayList<>();
        this.Usuarios = new ArrayList<>();

    }

    /**
     * Guarda un objeto en un archivo '.ser' con el nombre que se le pasa por
     * parametro.
     *
     * @param nombreArchivo
     */
    public void serealizar(String nombreArchivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(this);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos: " + e.getMessage());
        }
    }

    /**
     * Deserializa un objeto Instituto desde un archivo con el nombre
     * proporcionado por parametro. Si el archivo no existe o no se encuentra,
     * crea un nuevo Instituto con un administrador predeterminado y lo guarda.
     *
     * @param nombreArchivo Nombre del archivo desde el cual se deserializará el
     * objeto.
     * @return Instituto deserializado.
     */
    public static Instituto deserealizar(String nombreArchivo) {
        Instituto insti = null;
        try {
            File file = new File(nombreArchivo);
            if (!file.exists()) {
                throw new FileNotFoundException("El archivo no existe: " + nombreArchivo);
            }
            try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(file))) {
                insti = (Instituto) entrada.readObject();
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El archivo " + nombreArchivo + " no se encontró, se creará uno nuevo.");
            Administrador admin = new Administrador("ADMINISTRADOR", "777", "777", "");
            insti = new Instituto();
            insti.agregarUsuario(admin);
            insti.serealizar(nombreArchivo);
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar los datos: " + e.getMessage());
        }
        return insti;
    }

    /**
     * Devuelve el usuario que coincida con el nombre de usuario y contraseña
     * ingresada, en el caso que el usuario sea correcto devuelve el objeto
     * usuario, Si el user no es correcto devuelve una excepcion de que no se
     * encontro el usuario
     *
     * @param dni (Utilizado como usuario)
     * @param pass contraseña que se convierte a hashcode
     * @return Usuario
     * @throws DatosIncorrectosException caso que el user exista y la contraseña
     * sea erronea
     * @throws UsuarioNoEncontradoException caso en el que el user no exista
     */
    public Usuario login(String dni, int pass) throws DatosIncorrectosException, UsuarioNoEncontradoException {
        Usuario aux = null;
        int contador = 0;
        while (contador < Usuarios.size() && !(aux = Usuarios.get(contador)).getDocumento().equals(dni)) {

            contador++;
        }
        if (contador >= Usuarios.size()) {
            throw new UsuarioNoEncontradoException("USUARIO NO ENCONTRADO");
        }
        if (pass != aux.getPass()) {
            throw new DatosIncorrectosException("DATOS NO VALIDOS INTENTA DE NUEVO");
        }
        return aux;
    }

    /**
     * Busca un curso en la lista mediante su codigo de identificacion
     *
     * @param id codigo identificador del curso
     * @return curso encontrado, en el caso de no encontrar devuele NULL
     */
    public Curso getCurso(int id) {
        Curso aux = null;
        int contador = 0;
        while (contador < cursos.size() && !(((aux = cursos.get(contador)).getIdCurso()) == id)) {
            contador++;
        }
        if (contador >= cursos.size()) {
            aux = null; // si el contador es mayor al tamaño, significa que no fue encontrado el curso
        }
        return aux;
    }

    /**
     * Agrega un objeto Curso a la lista de cursos
     *
     * @param curso curso a agregar
     */
    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    /**
     * Devuelve la lista de cursos del instituto
     *
     * @return ArrayList<Curso>
     */
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    //METODOS USUARIOS
    /**
     * Devuelve la primer coincidencia con la lista de usuarios en funcion del
     * parametro
     *
     * @param dni dni del usuario
     * @return clase Usuario, retorna NULL si no lo encuentra
     */
    public Usuario getUsuario(String dni) {
        Usuario aux = null;
        int contador = 0;
        while (contador < Usuarios.size() && !(aux = Usuarios.get(contador)).getDocumento().equals(dni)) {
            contador++;
        }
        if (!(aux.getDocumento().equals(dni))) {
            aux = null;
        }
        return aux;
    }

    /**
     * Devuelve la lista de usuarios del instituto
     *
     * @return ArrayList<Usuario>
     */
    public ArrayList<Usuario> getUsuarios() {
        return Usuarios;
    }

    /**
     * Remueve de la lista Usuarios el usuario con el DNI pasado por parametro
     *
     * @param dni string
     */
    public void removerUsuario(String dni) { // sobreescribir para eliminar por obj
        Usuario aux;
        for (int i = 0; i < Usuarios.size(); i++) {
            aux = Usuarios.get(i);
            if (aux.getDocumento().equals(dni)) {
                Usuarios.remove(i);
                break;
            }
        }
    }

    /**
     * Agrega un usuario a la lista de usuarios de la clase
     *
     * @param usu usuario a agregar tipo Usuario
     */
    public void agregarUsuario(Usuario usu) {
        this.Usuarios.add(usu);
    }

    /**
     * Devuelve la cantidad de usuarios cargada en el el
     * atributoArrayList<Usuario> Usuarios
     *
     * @return int largo de la cadena
     */
    public int cantidadDeUsuarios() {
        return Usuarios.size();
    }

    /**
     * Asigna valor al atributo ArrayList<Curso> Cursos
     *
     * @param cursos ArrayList<Curso> a establecer valor
     */
    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    /**
     * Asigna valor al atributo ArrayList<Usuario> Usuarios
     *
     * @param Usuarios ArrayList<Usuario> a establecer valor
     */
    public void setUsuarios(ArrayList<Usuario> Usuarios) {
        this.Usuarios.clear();
        this.Usuarios = Usuarios;
    }

    /**
     * Elimina un curso de la lista de cursos en función de su ID pasado por
     * parametro.
     *
     * @param id ID del curso a eliminar.
     */
    public void eliminarCurso(int id) {
        Curso aux = null;
        int contador = 0;
        while (contador < cursos.size() && !((aux = cursos.get(contador)).getIdCurso() == id)) {
            contador++;
        }
        if (aux.getIdCurso() == id) {
            cursos.remove(aux);
        }
    }

}
