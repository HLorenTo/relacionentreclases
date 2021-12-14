package mision_tic_2022_relaciones_entre_clases;
public class Banco {
    private String nombre;
    private Empleado empleados [];

    public Banco(String nombre, Empleado[] empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }
    public void agregarEmpleado (Empleado nuevoEmpleado, int index){
        this.empleados[index]=nuevoEmpleado;
        System.out.println("Empleado agregado");
    }
}
