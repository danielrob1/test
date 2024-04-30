package ejercicios6_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        //Se declaran variables
        Scanner in = new Scanner(System.in);
        HashSet<Evento> calendario = new HashSet<>();
        int opcion = 0;
        String nombreEvento = "";
        String nombreArtista = "";
        String fecha = "";
        String ubicacion = "";
        int cantidad = 0;
        int precioTickets = 0;
        boolean encontrado = false;
        while (true) {
            encontrado = false;
            Iterator it = calendario.iterator();
            System.out.println("Bienvenido a Entradas Triunfales SL., ¿Qué deseas hacer?");
            System.out.println("1 - Agregar un evento al calendario\n2 - Vender tickets para un evento\n3 - Calcular los ingresos de un evento\n4 - Mostrar todos los eventos del calendario\n5 - Eliminar un evento\n6 - Salir del programa ");
            opcion = in.nextInt();
            in.nextLine();
            if (opcion == 1) {
                /**
                 * Cuando el usuario pulsa 1, se van pidiendo los datos del
                 * evento y al final se añadan al HashSet de eventos
                 */
                System.out.println("¿Cómo se llama el evento?");
                nombreEvento = in.nextLine();
                System.out.println("¿Qué artista va a acudir?");
                nombreArtista = in.nextLine();
                System.out.println("¿Cual es la fecha del evento?");
                fecha = in.nextLine();
                System.out.println("¿Dónde se va a celebrar?");
                ubicacion = in.nextLine();
                System.out.println("¿Cual es el precio de cada ticket?");
                precioTickets = in.nextInt();
                in.nextLine();
                Evento ev1 = new Evento(nombreEvento, nombreArtista, fecha, ubicacion, precioTickets);
                calendario.add(ev1);
            } else if (opcion == 2) {
                System.out.println("¿De que evento se van a vender los tickets?");
                nombreEvento = in.nextLine();
                System.out.println("¿Cúantos tickets se van a vender?");
                cantidad = in.nextInt();
                in.nextLine();
                while (it.hasNext()) {
                    /**
                     * Se recorre todo el HashSet buscando el evento que ha
                     * introducio el usuario, si no existe se informa al usuario
                     */
                    Evento eventoTemp = (Evento) it.next();
                    if (eventoTemp.getNombre().equals(nombreEvento)) {
                        encontrado = true;
                        eventoTemp.venderTickets(cantidad);
                        break;
                    }
                }
                if (encontrado == false) {
                    System.out.println("Evento no encontrado");
                }

            } else if (opcion == 3) {
                System.out.println("¿De que evento se necesita saber los ingresos?");
                nombreEvento = in.nextLine();
                while (it.hasNext()) {
                    Evento eventoTemp = (Evento) it.next();
                    if (eventoTemp.getNombre().equals(nombreEvento)) {
                        encontrado = true;
                        System.out.println("Los ingresos del evento son: ");
                        System.out.println(eventoTemp.calcularIngresos());
                    }
                }
                if (encontrado == false) {
                    System.out.println("Evento no encontrado");
                }
            } else if (opcion == 4) {
                System.out.println(calendario.toString());
            } else if (opcion == 5) {
                System.out.println("¿Qué evento se va a eliminar?");
                nombreEvento = in.nextLine();
                while (it.hasNext()) {
                    Evento eventoTemp = (Evento) it.next();
                    if (eventoTemp.getNombre().equals(nombreEvento)) {
                        encontrado = true;
                        System.out.println("Se ha eliminado el evento del calendario");
                        calendario.remove(eventoTemp);
                    }
                }
                if (encontrado == false) {
                    System.out.println("Evento no encontrado");
                }
            } else if (opcion == 6) {
                System.out.println("Has salido del programa");
                break;
            } else {
                System.out.println("Opcion no valida");
            }

        }
    }

}
