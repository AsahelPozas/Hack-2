package org.generation;
import org.generation.Exceptions.AgendaLlenaExceptions;
import org.generation.Exceptions.ContactoInexistenteException;

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
        if (agenda.size() == tamaño ) throw new AgendaLlenaExceptions();
        agenda.add(c);

    }

    public boolean existeContacto(Contacto c) {
        if (agenda.contains(c)) {
            System.out.println("Este contacto sí existe");
            return true;
        } else {
            System.out.println("Este contacto no existe");
            return false;
        }
    }

    public void listarContactos() {
        for (Contacto c: agenda ){
            System.out.println(c);
        } if (agenda.isEmpty()) System.out.println("No hay contactos añadidos");
    }

    public void buscaContacto(String nombre, String apellido){
        for (Contacto c: agenda ){
            if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido) ) {
                System.out.println("Contacto encontrado: " + c);
                return;
            }
        }
        throw new ContactoInexistenteException();
    }

    public void eliminarContacto(Contacto c) {
        if (agenda.remove(c)) {
            System.out.println("El contacto se borro correctamente");
        } else {
            System.out.println("El contacto no existe");
        }
    }

    public void modificarTelefono(String nombre, String apellido, String nuevoTelefono){
        Contacto c = new Contacto(nombre, apellido, nuevoTelefono);
        if (agenda.remove(c)) {
            agenda.add(c);
            System.out.println("El teléfono ha sido modificado exitosamente");
        } else {
            throw new ContactoInexistenteException();
        }
    }

    public void agendaLlena(){
        if (agenda.size() == tamaño) {
            System.out.println("La agenda está llena");
        } else {
            System.out.println("La agenda tiene espacio disponible");
        }
    }

    public void espacioLibres(){
        int libres = tamaño - agenda.size();
        if (libres == 0) {
            System.out.println("Ya no hay espacio");
        } else {
            System.out.println("Quedan " + libres + "espacios");
        }
    }

}
