package ejercicios6_2;

public class Evento {

    private String nombre;
    private String artista;
    private String fecha;
    private String ubicacion;
    private int precioTickets;
    private int cantidadTickets;
    private int aforo;
    private int ticketsVendidos;

    public Evento(String nombreIn, String artistaIn, String fechaIn, String ubicacionIn, int precioTicketsIn) {
        this.nombre = nombreIn;
        this.artista = artistaIn;
        this.fecha = fechaIn;
        this.ubicacion = ubicacionIn;
        this.precioTickets = precioTicketsIn;
        //Suponemos que cada evento tiene un maximo de 20 tickets
        this.cantidadTickets = 20;
        this.aforo = 20;
        this.ticketsVendidos = 0;
    }

    @Override
    public String toString() {
        return "Nombre del evento: " + this.getNombre() + ", Nombre del artista: " + this.getArtista() + ", Fecha: " + this.getFecha()
                + ", Ubicacion: " + this.getUbicacion() + ", Precio de los tickets: " + this.getPrecioTickets() + ", Cantidad de tickets disponible:  " + this.getCantidadTickets()
                + ", Aforo maximo " + this.getAforo() + ", Tickets vendidos " + this.getTicketsVendidos() + "\n";
    }

    public void venderTickets(int cantidadIn) {
        /**
         * Se controla que no se vendan mas tickets de la cantidad máxima y si
         * no quedan tickets
         */
        if (cantidadIn > 20) {
            System.out.println("No puedes vender más del máximo permitido");
        } else {

            if (cantidadTickets <= 0) {
                System.out.println("Ya no quedan más tickets");
            } else {
                System.out.println("Se han vendido los tickets");
                this.setCantidadTickets(cantidadTickets - cantidadIn);
                this.setTicketsVendidos(ticketsVendidos + cantidadIn);
            }
        }
    }

    public int calcularIngresos() {
        return (this.ticketsVendidos * this.precioTickets);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPrecioTickets() {
        return precioTickets;
    }

    public void setPrecioTickets(int precioTickets) {
        this.precioTickets = precioTickets;
    }

    public int getCantidadTickets() {
        return cantidadTickets;
    }

    public void setCantidadTickets(int cantidadTickets) {
        this.cantidadTickets = cantidadTickets;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getTicketsVendidos() {
        return ticketsVendidos;
    }

    public void setTicketsVendidos(int ticketsVendidos) {
        this.ticketsVendidos = ticketsVendidos;
    }

}
