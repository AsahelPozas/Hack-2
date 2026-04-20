package org.generation;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) throws DatosIncompletosException {
        if (nombre.isEmpty() || apellido.isEmpty()) throw new DatosIncompletosException();

        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    //Getters y Setters
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getTelefono(){
        return telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido (String apellido){
        this.apellido = apellido;
    }
    public void setTelefono (String telefono){
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
