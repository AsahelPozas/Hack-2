package org.generation;
import java.util.HashMap;
import java.util.TreeSet;

public class Agenda {
    private TreeSet<Contacto> agenda;
    private int tamaño;

    public Agenda () {
        this.tamaño = 3;
        this.agenda = new TreeSet<>(
                (contacto1, contacto2) -> {
                    String nombre1 = contacto1.getNombre() + contacto1.getApellido();
                    String nombre2 = contacto2.getNombre() + contacto2.getApellido();

                    return nombre1.compareToIgnoreCase(nombre2);
                });
    }
    public Agenda (int t) {
        this.tamaño = t;
        this.agenda = new TreeSet<>(
                (contacto1, contacto2) -> {
                    String nombre1 = contacto1.getNombre() + contacto1.getApellido();
                    String nombre2 = contacto2.getNombre() + contacto2.getApellido();

                    return nombre1.compareToIgnoreCase(nombre2);
                });
    }

    public void añadirContacto(Contacto c) {

    }

    existeContacto(Conctacto c):

    listarContactos():

    buscaContacto(String nombre):

    eliminarContacto(Contacto c):

    modificarTelefono(String nombre, String apellido, String nuevoTelefono):

    agendaLlena():

    espacioLibres():


}
