package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * La clase Curso contiene informacion sobre el curso, su estado, el docente a
 * cargo y los alumnos que estan cursando.
 */
public class Curso implements Serializable {

    private static int sigIdCurso = 1;

    private final static int FINALIZADO = 0;
    private final static int HABILITADO = 1;
    private final static int CERRADO = 2;
    private final static int CANCELADO = 3;
    private final static int PROPUESTA = 4;

    private String nombreCurso;
    private int idCurso;
    private String descripcion;
    private int estadoCurso;
    private Profesor docente;
    private ArrayList<Alumno> alumnosCursando;
    private int curso_previo1;
    private int curso_previo2;
    private int tamanio_curso;

    /**
     * Constructor de la clase Curso.
     *
     * @param nombreCurso Nombre del curso.
     * @param descripcion Descripción del curso.
     * @param docente Profesor a cargo del curso.
     * @param tamanio_curso Tamaño máximo de alumnos en el curso.
     */
    public Curso(String nombreCurso, String descripcion, Profesor docente, int tamanio_curso) {
        this.nombreCurso = nombreCurso;
        this.descripcion = descripcion;
        this.docente = docente;
        this.tamanio_curso = tamanio_curso;
        this.idCurso = sigIdCurso;
        this.estadoCurso = 4;
        this.alumnosCursando = new ArrayList<>();
        this.curso_previo1 = 0;
        this.curso_previo2 = 0;

        sigIdCurso++;
    }

   /**
     * Constructor de la clase Curso con cursos previos.
     * 
     * @param nombreCurso    Nombre del curso.
     * @param descripcion    Descripción del curso.
     * @param docente        Profesor a cargo del curso.
     * @param tamanio_curso  Tamaño máximo de alumnos en el curso.
     * @param curso_previo1  ID del primer curso previo requerido.
     * @param curso_previo2  ID del segundo curso previo requerido.
     */
    public Curso(String nombreCurso, String descripcion, Profesor docente, int tamanio_curso, int curso_previo1, int curso_previo2) {
        this(nombreCurso, descripcion, docente, tamanio_curso);
        this.curso_previo1 = curso_previo1;
        this.curso_previo2 = curso_previo2;

    }

    /**
     * Settea el valor de la lista de los alumnos cursando este curso
     *
     * @param alumnosCursando ArrayList<Alumno>
     */
    public void setAlumnosCursando(ArrayList<Alumno> alumnosCursando) {
        this.alumnosCursando = alumnosCursando;
    }

    /**
     * Este metodo recibe un alumno por parametro para evaluar si es apto para
     * inscribirse a este curso, devolviendo un booleano que lo indica
     *
     * @param alu Alumno
     * @return boolean
     */
    public boolean alumnoApto(Alumno alu) {
        boolean apto = true;
        if (this.curso_previo1 != 0) {
            apto = alu.getCursoAprobado(this.curso_previo1);
        }
        if (this.curso_previo2 != 0) {
            apto = alu.getCursoAprobado(this.curso_previo2);
        }
        return apto;
    }

    //Metodos Lista
    /**
     * *
     * Agrega el cursante pasado por parametro de la lista
     *
     * @param alu Alumno
     */
    public void agregarCursante(Alumno alu) {
        alumnosCursando.add(alu);
    }

    /**
     * *
     * ELimina el cursante pasado por parametro de la lista
     *
     * @param alu Alumno
     */
    public void eliminarCursante(Alumno alu) {
        this.alumnosCursando.remove(alu);
    }

    // SETTERS
    /**
     * Settea el estado del curso
     *
     * @param estadoCurso int
     */
    public void setEstadoCurso(int estadoCurso) {
        this.estadoCurso = estadoCurso;
    }

    /**
     * Settea un curso previo para podes inscribirse a este curso,siendo el
     * parametro el id de este
     *
     * @param curso_previo1 int
     */
    public void setCurso_previo1(int curso_previo1) {
        this.curso_previo1 = curso_previo1;
    }

    /**
     * Settea un curso previo para podes inscribirse a este curso,siendo el
     * parametro el id de este
     *
     * @param curso_previo2 int
     */
    public void setCurso_previo2(int curso_previo2) {
        this.curso_previo2 = curso_previo2;
    }

    // GETTERS
    /**
     * Retorna el id que tendra la proxima instancia de esta clase
     *
     * @return int
     */
    public static int getSigIdCurso() {
        return sigIdCurso;
    }

    /**
     * Retorna un int que representa el estado finalizado del curso
     *
     * @return int
     */
    public static int getFinalizado() {
        return FINALIZADO;
    }

    /**
     * Retorna un int que representa el estado habilitado del curso
     *
     * @return int
     */
    public static int getHabilitado() {
        return HABILITADO;
    }

    /**
     * Retorna un int que representa el estado propuesto del curso
     *
     * @return int
     */
    public static int getPropuesto() {
        return PROPUESTA;
    }

    /**
     * Retorna un int que representa el estado cerrado del curso
     *
     * @return int
     */
    public static int getCerrado() {
        return CERRADO;
    }

    /**
     * Retorna un int que representa el estado cancelado del curso
     *
     * @return int
     */
    public static int getCancelado() {
        return CANCELADO;
    }

    /**
     * Retorna el nombre del curso
     *
     * @return String
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * Retorna el id del curso
     *
     * @return int
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * Retorna la descripcion del curso
     *
     * @return String
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Retorna el estado del curso
     *
     * @return int
     */
    public int getEstadoCurso() {
        return estadoCurso;
    }

    /**
     * Retorna el docente a cagor del curos
     *
     * @return Profesor
     */
    public Profesor getDocente() {
        return docente;
    }

    /**
     * Devuelve la lista de Alumnos que estan Inscriptos en la materia
     *
     * @return ArrayList<Alumno>
     */
    public ArrayList<Alumno> getAlumnosCursando() {
        return alumnosCursando;
    }

    /**
     * Retorna el iD de uno de los cursos previos requeridos. Si no tiene curso
     * previo retorna 0
     *
     * @return int
     */
    public int getCurso_previo1() {
        return curso_previo1;
    }

    /**
     * Retorna el iD de uno de los cursos previos requeridos. Si no tiene curso
     * previo retorna 0
     *
     * @return int
     */
    public int getCurso_previo2() {
        return curso_previo2;
    }

    /**
     * Devuelve el limite de alumnos que se pueden inscribir a un curso
     *
     * @return int
     */
    public int getTamanio_curso() {
        return tamanio_curso;
    }

    @Override
    public String toString() {
        return this.nombreCurso;
    }

}
