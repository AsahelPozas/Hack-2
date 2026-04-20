package org.generation.Exceptions;

public class DatosIncompletosException extends RuntimeException {
    public DatosIncompletosException() {
        super("El contacto no tiene los datos requeridos");
    }
}
