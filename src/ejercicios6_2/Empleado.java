package ejercicios6_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Empleado {
    private String nombre;
    private String rol;
    private static int salarioEquipo=0;
    private int salario;
    
    public Empleado(String nombreIn, String rolIn, int salarioIn){
        this.nombre=nombreIn;
        this.rol=rolIn;
        this.salario=salarioIn;
    }
     public void eliminarTarea(ArrayList<String> listaTareasIn, String tareaIn, HashSet<Empleado> equipoIn, HashMap<String, Empleado> tareasIn){
         if(listaTareasIn.contains(tareaIn)){
             listaTareasIn.remove(tareaIn);
             System.out.println("Se ha eliminado la tarea");
         } else System.out.println("No se ha podido eliminar la tarea");
         if(tareasIn.containsKey(tareaIn)){
             tareasIn.remove(tareaIn);
         }
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public static int getSalarioEquipo() {
        return salarioEquipo;
    }

    public static void setSalarioEquipo(int salarioEquipo) {
        Empleado.salarioEquipo = salarioEquipo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
    
}
