#  Agenda Telefónica en Java

Proyecto desarrollado como parte de un Hackathon. Consiste en una aplicación de consola que permite gestionar una agenda de contactos aplicando Programación Orientada a Objetos (POO) en Java.

---

##  Descripción

La aplicación permite crear y administrar una agenda telefónica con funcionalidades completas de gestión de contactos (CRUD), validaciones y control de capacidad.

Cada contacto está definido por:

* Nombre
* Apellido
* Teléfono

Dos contactos se consideran iguales si tienen el mismo nombre y apellido (sin distinguir mayúsculas y minúsculas).

---

## ️ Funcionalidades

*  Añadir contacto
*  Buscar contacto
*  Listar contactos (ordenados alfabéticamente)
* ️ Modificar teléfono
*  Eliminar contacto
*  Ver espacios disponibles
*  Validar si la agenda está llena
*  Evitar contactos duplicados
* ️ Validación de datos (nombre y apellido no vacíos)

---

##  Estructura del Proyecto

```
src/
└── org.generation/
    ├── Main.java  
    │   # Punto de entrada de la aplicación.
    │   # Contiene el menú interactivo en consola.
    │
    ├── Agenda.java  
    │   # Lógica de negocio.
    │   # Gestiona operaciones como agregar, buscar y eliminar contactos.
    │
    ├── Contacto.java  
    │   # Modelo de datos.
    │   # Representa la estructura de un contacto (nombre, teléfono, etc.).
    │
    └── exceptions/
        ├── AgendaLlenaException.java  
        │   # Se lanza cuando se intenta agregar un contacto y la agenda está llena.
        │
        ├── ContactoInexistenteException.java  
        │   # Se lanza cuando no se encuentra un contacto solicitado.
        │
        └── DatosIncompletosException.java  
            # Se lanza cuando faltan datos obligatorios al crear un contacto.
```

---

##  Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Programación Orientada a Objetos (POO)
* Colecciones

---

## ️ Ejecución

1. Clonar el repositorio:

```
git clone https://github.com/AsahelPozas/Hack-2.git
```

2. Abrir el proyecto en IntelliJ

3. Ejecutar:

* Abrir `Main.java`
* Click en ️ Run

---

##  Ejemplo de uso

```
 AGENDA TELEFÓNICA
1. Añadir contacto
2. Listar contactos
3. Buscar contacto
4. Eliminar contacto
5. Modificar teléfono
6. ¿Agenda llena?
7. Espacios disponibles
0. Salir
```

