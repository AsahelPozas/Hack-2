package org.generation;
import java.util.HashMap;
import java.util.TreeSet;

public class Agenda {

    public static void main(String[] args) {

        Contacto c1 = new Contacto("Luis", "bbVV", "asdsadsad");
        Contacto c2 = new Contacto("luis", "BB vv", "asdsadsad");

        TreeSet<Contacto> arbol = new TreeSet<>(
                (contacto1, contacto2) -> {
                    String nombre1 = contacto1.getNombre() + contacto1.getApellido();
                    String nombre2 = contacto2.getNombre() + contacto2.getApellido();

                    return nombre1.compareToIgnoreCase(nombre2);
                });

        arbol.add(c2);
        arbol.add(c1);

        System.out.println(arbol);

    }

}
