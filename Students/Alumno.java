/**
 * Alumno
 */
public class Alumno {

    private String nombre;
    private String matricula;
    private int numAsignaturas;
    private Asignatura[] asignaturas;

    public Alumno() {

    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @param numAsignaturas the numAsignaturas to set
     */
    public void setNumAsignaturas(int numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
        this.asignaturas = new Asignatura[this.numAsignaturas];
    }

    /**
     * @return the numAsignaturas
     */
    public int getNumAsignaturas() {
        return numAsignaturas;
    }

    public void setAsignatura(Asignatura asig, int num) {
        this.asignaturas[num] = asig;
    }

    /**
     * @return the asignaturas
     */
    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }
}