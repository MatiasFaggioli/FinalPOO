package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * La clase Alumno extiende de Usuario y representa a un estudiante del
 * insituto. En este objeto se almacena informacion sobre los cursos aprobados,
 * los cursos que esta cursando, y notas obtenidas en esos cursos.
 *
 */
public class Alumno extends Usuario {

    private ArrayList<Curso> CursosAprobados;
    private ArrayList<Curso> CursosCursando;
    private HashMap<Integer, Integer> Notas;

    /**
     * Constructor de la clase Alumno.
     *
     * @param nombre Nombre completo del alumno.
     * @param pass Contraseña del alumno.
     * @param documento Documento/usuario del alumno.
     * @param mail Correo electronico del alumno.
     */
    public Alumno(String nombre, String pass, String documento, String mail) {
        super(nombre, pass, documento, mail);
        CursosAprobados = new ArrayList<>();
        CursosCursando = new ArrayList<>();
        Notas = new HashMap<>();
    }

    /**
     * Verifica si un curso se encuentra en la lista de cursos aprobados del
     * alumno utilizando el ID especificado por parametro y devuelve true si
     * este curso ha sido aprobado por el alumno y false en el caso contrario.
     *
     * @param id ID del curso.
     * @return true si el curso ha sido aprobado, false en caso contrario.
     */
    public boolean getCursoAprobado(int id) {
        boolean aux = false;
        for (int i = 0; i < CursosAprobados.size(); i++) {
            if (CursosAprobados.get(i).getIdCurso() == id) {
                aux = true;
                break;
            }
        }
        return aux;
    }

    /**
     * Verifica si un curso se encuentra en la lista de cursos cursando del
     * alumno utilizando el ID especificado por parametro y devuelve true si
     * este curso esta siendo cursado por el alumno y false en el caso
     * contrario.
     *
     *
     * @param id ID del curso.
     * @return true si el alumno está cursando el curso, false en caso
     * contrario.
     */
    public boolean getCursando(int id) {
        boolean aux = false;
        for (int i = 0; i < CursosCursando.size(); i++) {
            if (CursosCursando.get(i).getIdCurso() == id) {
                aux = true;
                break;
            }
        }
        return aux;
    }

    /**
     * Agrega un curso a la lista de cursos aprobados por el alumno.
     *
     * @param curs El curso que se va a agregar.
     */
    public void agregarCursoAprobado(Curso curs) {
        this.CursosAprobados.add(curs);
    }

    /**
     * Agrega un curso a la lista de cursos que el alumno está cursando.
     *
     * @param curs El curso que se va a agregar.
     */
    public void agregarCursoCursando(Curso curs) {
        this.CursosCursando.add(curs);
    }

    /**
     * Devuelve la lista entera de cursos aprobados por el alumno.
     *
     * @return Una lista de cursos aprobados.
     */
    public ArrayList<Curso> getCursosAprobados() {
        return CursosAprobados;
    }

    /**
     * Establece la lista de cursos aprobados por el alumno.
     *
     * @param CursosAprobados Una lista de cursos aprobados.
     */
    public void setCursosAprobados(ArrayList<Curso> CursosAprobados) {
        this.CursosAprobados = CursosAprobados;

    }

    /**
     * Devuelve la lista entera de cursos que el alumno está cursando.
     *
     * @return Una lista de cursos que se están cursando.
     */
    public ArrayList<Curso> getCursosCursando() {
        return CursosCursando;
    }

    /**
     * Verifica si el alumno está cursando un curso específicoutilizando por parametro el curso.
     *
     * @param curs El curso que se va a verificar.
     * @return true si el alumno está cursando el curso, false en caso
     * contrario.
     */
    public boolean isCursando(Curso curs) {
        return CursosCursando.contains(curs);
    }

    /**
     * Verifica si el alumno ha aprobado un curso específico utilizando por parametro el curso.
     *
     * @param curs El curso que se va a verificar.
     * @return true si el curso ha sido aprobado, false en caso contrario.
     */
    public boolean CursoAprobado(Curso curs) {
        boolean isAprobado = false;
        if (CursosAprobados.contains(curs)) {
            isAprobado = true;
        }
        return isAprobado;
    }

    /**
     * Remueve un curso de la lista de cursos que el alumno está cursando 
     * utilizando del ID del curso.
     *
     * @param id ID del curso que se va a remover.
     */
    public void removerCurso(int id) {
        for (int i = 0; i < CursosCursando.size(); i++) {
            if (CursosCursando.get(i).getIdCurso() == id) {
                CursosCursando.remove(i);
            }
        }
    }

    /**
     * Establece la lista de cursos que el alumno está cursando.
     *
     * @param CursosCursando Una lista de cursos que se están cursando.
     */
    public void setCursosCursando(ArrayList<Curso> CursosCursando) {
        this.CursosCursando = CursosCursando;
    }

    /**
     * Devuelve el hashmap de notas del alumno segun el id de un curso.
     *
     * @return Un hashmap donde la clave es el ID del curso y el valor es la
     * nota obtenida.
     */
    public HashMap<Integer, Integer> getNotas() {
        return Notas;
    }

    /**
     * Establece dentro del hashmap una nota para el alumno segun el id de un curso.
     *
     * @param Notas Un hashmap donde la clave es el ID del curso y el valor es la
     * nota obtenida.
     */
    public void setNotas(HashMap<Integer, Integer> Notas) {
        this.Notas = Notas;
    }

    /**
     * Indica si el usuario es un alumno.
     *
     * @return true si el usuario es un alumno, false en caso contrario.
     */
    @Override
    public boolean soyAlumno() {
        return true;
    }

    /**
     * Indica si el usuario es un profesor.
     *
     * @return true si el usuario es un profesor, false en caso contrario.
     */
    @Override
    public boolean soyProfesor() {
        return false;
    }

    /**
     * Indica si el usuario es un administrador.
     *
     * @return true si el usuario es un administrador, false en caso contrario.
     */
    @Override
    public boolean soyAdministrador() {
        return false;
    }
}
