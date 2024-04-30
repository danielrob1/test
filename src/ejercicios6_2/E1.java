package ejercicios6_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        //Se declaran variables
        Scanner in = new Scanner(System.in);
        int numAlumnos = 0;
        String nombre = "";
        String fecha = "";
        String grupo = "";
        boolean repetido = false;
        System.out.println("¿Cuantos alumnos van a la excursion?");
        numAlumnos = in.nextInt();
        //HashSet que almacenara la lista de alumnos
        HashSet<Alumno> lista = new HashSet<>();
        for (int i = 0; i < numAlumnos; i++) {
            //Se van pidiendo los datos del alumno
            repetido = false;
            System.out.println("Se van a introducir los datos del alumno numero: " + (i + 1));
            System.out.println("¿Cómo se llama?: ");
            in.nextLine();
            nombre = in.next();
            System.out.println("¿Cual es su fecha de nacimiento?: ");
            in.nextLine();
            fecha = in.next();
            System.out.println("¿Cúal es su grupo?");
            in.nextLine();
            grupo = in.next();
            /**
             * Cuando se tienen los datos del alumno, se crea el objeto y se
             * comprueba que no sea igual a otro objeto introducido en el
             * HashSet
             */
            Alumno al = new Alumno(nombre, fecha, grupo);
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                if (it.next().equals(al)) {
                    repetido = true;
                    System.out.println("Este alumno ya se ha introducido anteriormente");
                    break;
                }
            }
            if (repetido == false) {
                System.out.println("Se ha añadido el alumno");
                lista.add(al);
            }
        }
        System.out.println("Lista de alumnos que van a la excursion: ");
        System.out.println(lista.toString());

    }

}
