package ejercicios6_2;

import java.util.HashMap;

public class Desarrollador extends Empleado {

    public Desarrollador(String nombre, String rol, int salarioMensual) {
        super(nombre, rol, salarioMensual);
    }

    public void completarTarea(HashMap<String, Empleado> tareasIn, String tareaIn, Empleado empleadoIn) {
        if (tareasIn.containsKey(tareaIn) && tareasIn.get(tareaIn).getNombre().equals(empleadoIn.getNombre())) {
            System.out.println("Se ha completado la tarea ");
            tareasIn.remove(tareaIn);
        } else {
            System.out.println("No se ha podido marcar como completada la tarea");
        }

    }
}
