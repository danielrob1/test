package ejercicios6_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Jefe extends Empleado {

    public Jefe(String nombre, String rol, int salarioMensual) {
        super(nombre, rol, salarioMensual);
    }

    public void crearTarea(ArrayList<String> listaTareasIn, String tareaIn) {
        if (listaTareasIn.contains(tareaIn)) {
            System.out.println("La tarea ya existe");
        } else {
            listaTareasIn.add(tareaIn);
            System.out.println("He añadido la tarea " + tareaIn);
        }

    }

    public void asignarTarea(ArrayList<String> listaTareasIn, String tareaIn, HashSet<Empleado> equipoIn, HashMap<String, Empleado> tareasIn, Empleado empleadoIn) {
        if (listaTareasIn.contains(tareaIn) && equipoIn.contains(empleadoIn)) {
            System.out.println("Se ha asignado la tarea " + tareaIn + " al empleado " + empleadoIn.getNombre());
            tareasIn.put(tareaIn, empleadoIn);
        } else {
            System.out.println("No se ha podido asignar la tarea");
        }
    }

    public void contratarEmpleado(Empleado empleadoIn, HashSet<Empleado> equipoIn) {
        if (equipoIn.contains(empleadoIn)) {
            System.out.println("El empleado ya forma parte de la plantilla");
        } else if ((empleadoIn.getSalarioEquipo() + empleadoIn.getSalario()) > 8000) {
            System.out.println("No hay presupuesto suficiente para contratar a este empleado");

        } else {
            System.out.println("Se ha contratado al empleado " + empleadoIn.getNombre());
            equipoIn.add(empleadoIn);
            empleadoIn.setSalarioEquipo(empleadoIn.getSalarioEquipo() + empleadoIn.getSalario());
        }

    }

    public void elegirEmpleado(Empleado empleadoIn) {
        if (empleadoIn instanceof Jefe) {
            System.out.println(empleadoIn.getNombre() + " es jefe, puede crear tareas, asignarlas, eliminarlas y contratar");
        } else {
            System.out.println(empleadoIn.getNombre() + " es Desarrollador, puede marcar tareas como completadas y eliminar tareas");
        }
    }

    public void reunir(HashMap<String, Empleado> tareasIn) {
        if (tareasIn.isEmpty()) {
            System.out.println("No hay tareas asignadas");
        } else {
            Iterator it = tareasIn.keySet().iterator();
            String tarea = "";
            while (it.hasNext()) {
                tarea = (String) it.next();
                System.out.println(tarea + " - " + tareasIn.get(tarea).getNombre());

            }
        }
    }

}
