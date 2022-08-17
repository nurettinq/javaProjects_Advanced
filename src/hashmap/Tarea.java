package hashmap;


public class Tarea {
    int prioridad;
    String descripcion;
    Empleado empleado;

    public Tarea(int prioridad, String descripcion, Empleado empleado) {
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.empleado = empleado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}