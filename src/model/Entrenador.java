package model;

public class Entrenador extends Persona{

    protected String estrategia;

    public Entrenador(String nombre, String apellido, int edad, String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return "Entrenador: \n" +super.toString()+" Estrategia: " + estrategia;
    }

    
    
}
