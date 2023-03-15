package model;

public class Futbolista extends Persona {

    protected int dorsal;
    protected String posicion;

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Futbolista: \n" +super.toString() + " Dorsal: " +dorsal + ", Posicion: " + posicion;
    }

}