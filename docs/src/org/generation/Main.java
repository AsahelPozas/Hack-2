package org.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda ag;

        System.out.println("--- Tamaño agenda ----");
        System.out.println("1. Seleccionar tamaño");
        System.out.println("2. Tamaño por defecto");

        int opcionAgenda;
        opcionAgenda = sc.nextInt();

        switch (opcionAgenda) {
            case 1:
                System.out.println("Selecciona el tamaño de tu agenda: ");
                int n = sc.nextInt();
                ag = new Agenda(n);
                break;
            case 2:
                System.out.println("Tamaño por defecto: ");
                ag = new Agenda();
                break;
            default:
                System.out.println("Muy gracioso ");
                System.exit(0);
                ag = new Agenda();
        }


        int opcion;
        do {
            System.out.println("--- Agenda telefonica ---");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Modificar teléfono");
            System.out.println("6. Ver si agenda está llena");
            System.out.println("7. Espacios disponibles");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Ingresa el nombre de tu contacto: ");
                        String nombre = sc.nextLine();
                        System.out.println("Ingresa el apellido de tu contacto: ");
                        String apellido = sc.nextLine();
                        System.out.println("Ingresa el teléfono de tu contacto: ");
                        String telefono = sc.nextLine();
                        ag.añadirContacto(new Contacto(nombre, apellido, telefono));
                        System.out.println("Tu contacto ha sido añadido exitosamente");
                        break;
                    case 2:
                        ag.listarContactos();
                        break;
                    case 3:
                        System.out.println("Ingresa el nombre de tu contacto: ");
                        nombre = sc.nextLine();
                        System.out.println("Ingresa el apellido de tu contacto: ");
                        apellido = sc.nextLine();
                        ag.buscaContacto(nombre, apellido);
                        break;
                    case 4:
                        System.out.println("Ingresa el nombre de tu contacto: ");
                        nombre = sc.nextLine();
                        System.out.println("Ingresa el apellido de tu contacto: ");
                        apellido = sc.nextLine();
                        telefono = "";
                        ag.eliminarContacto(new Contacto(nombre, apellido, telefono));
                        break;
                    case 5:
                        System.out.println("Ingresa el nombre de tu contacto: ");
                        nombre = sc.nextLine();
                        System.out.println("Ingresa el apellido de tu contacto: ");
                        apellido = sc.nextLine();
                        System.out.println("Ingresa el teléfono de tu contacto: ");
                        telefono = sc.nextLine();
                        ag.modificarTelefono(nombre, apellido, telefono);
                        break;
                    case 6:
                        ag.agendaLlena();
                        break;
                    case 7:
                        ag.espacioLibres();
                        break;
                    case 0:
                        System.out.println("Hasta luego");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (opcion!= 0);
        sc.close();

    }
}
