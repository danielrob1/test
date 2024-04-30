package ejercicios6_2;

import java.util.Objects;

public class Alumno {

    private String nombre;
    private String fechaNac;
    private String grupo;

    public Alumno(String nombreIn, String fechaNacIn, String grupoIn) {
        this.nombre = nombreIn;
        this.fechaNac = fechaNacIn;
        this.grupo = grupoIn;
    }

    /**
     * Se modifica el metodo equals para poder comparar los objetos y así
     * asegurar que no se introducen dos alumnos iguales
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.fechaNac, other.fechaNac)) {
            return false;
        }
        return Objects.equals(this.grupo, other.grupo);
    }
    /**
     * Al modificar equals, es necesrio modificar hashcode
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.fechaNac);
        hash = 41 * hash + Objects.hashCode(this.grupo);
        return hash;
    }
    /**
     * Se modifica toString para mostrar los datos de los alumnos
     * @return 
     */
     @Override
    public String toString() {
        return "Alumno: " + this.getNombre() + " Fecha de nacimiento: " + this.getFechaNac() + " Grupo: " + this.getGrupo() ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

}
