package model;

public class Doctor extends Persona {
    
    protected String titulacion;
    protected int aniosex;


    public Doctor(String nombre, String apellido, int edad, String titulacion, int aniosex){
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosex = aniosex;
    }

    public String getNombre(){
        return nombre;
    }


    @Override
    public String toString() {
        return "Medico: \n" +super.toString() +" Titulacion: " + titulacion + ", Anios exp: " + aniosex ;
    }

}