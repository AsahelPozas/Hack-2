package org.generation.Exceptions;

public class ContactoInexistenteException extends RuntimeException {
    public ContactoInexistenteException() {
        super("El contacto es inexistente");
    }
}
