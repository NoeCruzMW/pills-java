/**
 * Asignatura
 */
public class Asignatura {

    private String nombre;
    private double[] calificaciones;

    public Asignatura() {
        calificaciones = new double[3];
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param
     */
    public boolean setCalificacion(double calificacion, int corte) {
        if (corte >= 0 && corte <= 2) {
            this.calificaciones[corte] = calificacion;
            return true;
        }
        return false;
    }

    /**
     * @return the calificaciones
     */
    public double[] getCalificaciones() {
        return calificaciones;
    }

}