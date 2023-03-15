package model;

/* Ejercicio 10: Crear un programa para simular un equipo de futbol
(futbolista, entrenador y doctor), para lo cual tendremos lo siguiente:
Una super clase Persona, que tendrá los siguientes datos: nombre,
apellido, edad.
La sub clase Futbolista tendrá los siguientes datos: dorsal y
posición.
La sub clase Entrenador tendrá de dato la estrategia que utiliza.
La sub clase Doctor, la titulación y los años de experiencia.
Hacer un menú donde se tengan las siguientes opciones: Viaje de
equipo, entrenamiento, partido de futbol, planificar entrenamiento,
entrevista curarlesión   */

public class Persona {

//atributos
    protected String nombre;
    protected String apellido;
    protected int edad;


    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad ;
    }

}