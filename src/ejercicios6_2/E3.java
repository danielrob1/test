package ejercicios6_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {
        //Se declaran variables
        Scanner in = new Scanner(System.in);
        ArrayList<String> listaTareas = new ArrayList<>();
        HashMap<String, Empleado> tareas = new HashMap<>();
        HashSet<Empleado> equipo = new HashSet<>();
        String tarea = "";
        String empleado = "";
        //Se instancia al jefe y los dos posibles empleados
        Jefe jefe1 = new Jefe("Javier", "Jefe de Equipo", 1989);
        Desarrollador dev1 = new Desarrollador("Ana", "Desarrolladora Senior", 1989);
        Desarrollador dev2 = new Desarrollador("Jorge", "Desarrollador Junior", 1900);
        int opcion = 0;
        //Se llena la lista de tareas
        while (listaTareas.size() < 5) {
            System.out.println("Introduce una tarea: ");
            tarea = in.nextLine();
            if (listaTareas.contains(tarea)) {
                System.out.println("La tarea ya existe");
            } else {
                listaTareas.add(tarea);
            }
        }
        while (true) {
            System.out.println("Jefe " + jefe1.getNombre() + ", ¿Qué quieres hacer?");
            System.out.println("Pulsa 1 para crear una nueva tarea ");
            System.out.println("Pulsa 2 para asignar una tarea a un usuario");
            System.out.println("Pulsa 3 para eliminar una tarea");
            System.out.println("Pulsa 4 para contratar a un empleado");
            System.out.println("Pulsa 5 para elegir a un empleado");
            System.out.println("Pulsa 6 para reunir a los empleados");
            System.out.println("Pulsa 7 para salir");
            opcion = in.nextInt();
            in.nextLine();
            if (opcion == 1) {
                if (listaTareas.size() >= 5) {
                    System.out.println("Ya hay 5 ytipos de tareas, no puedes añadir mas");
                } else {
                    System.out.println("¿Qué tarea quieres añadir?");
                    tarea = in.nextLine();
                    jefe1.crearTarea(listaTareas, tarea);
                }
            } else if (opcion == 2) {
                if (equipo.isEmpty()) {
                    System.out.println("No tienes empleados, no puedes asignar tareas");
                } else {
                    System.out.println("¿Qué tarea quieres asignar?");
                    tarea = in.nextLine();
                    System.out.println("¿A que empleado se la asignas?");
                    empleado = in.nextLine();
                    if (empleado.equals("Ana")) {
                        jefe1.asignarTarea(listaTareas, tarea, equipo, tareas, dev1);
                    } else {
                        jefe1.asignarTarea(listaTareas, tarea, equipo, tareas, dev2);
                    }
                }
            } else if (opcion == 3) {
                System.out.println("¿Qué tarea quieres eliminar?");
                tarea = in.nextLine();
                jefe1.eliminarTarea(listaTareas, tarea, equipo, tareas);
            } else if (opcion == 4) {
                System.out.println("¿Que empleado quieres contratar? Empleados disponibles: Ana, Jorge");
                empleado = in.nextLine();
                if (empleado.equals("Ana")) {
                    jefe1.contratarEmpleado(dev1, equipo);
                } else {
                    jefe1.contratarEmpleado(dev2, equipo);
                }

            } else if (opcion == 5) {
                System.out.println("¿A que empleado vas a elegir?");
                empleado = in.nextLine();
                if (empleado.equals(dev1.getNombre())) {
                    jefe1.elegirEmpleado(dev1);
                } else if (empleado.equals(dev2.getNombre())) {
                    jefe1.elegirEmpleado(dev2);
                } else {
                    System.out.println("No se ha encontrado al empleado");
                }
            } else if (opcion == 6) {
                jefe1.reunir(tareas);
            } else if (opcion == 7) {
                break;
            } else {
                System.out.println("Opcion no valida.");
            }
        }

    }

}
