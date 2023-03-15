package ui;
import model.Entrenador;
import model.Futbolista;
import model.Persona;
import model.Doctor;
import java.util.ArrayList;
import java.util.Scanner;

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
entrevista curarlesión11   */


public class Main{ 
 
  static Scanner entrada = new Scanner(System.in);
  static ArrayList<Persona> equipo = new ArrayList<Persona>();
  static ArrayList<Futbolista> players = new ArrayList<Futbolista>();
  static ArrayList<Doctor> ciruganos = new ArrayList<Doctor>();
  static ArrayList<Entrenador> managers = new ArrayList<Entrenador>();
  static String nombre;
  static String apellido;
  static int edad;
  static char letra;
  public static void main(String[] args){
    numerantes();
    metodos();
    menu();
  }
//metodo de integrantes
  public static void numerantes(){ 
    int opcion;

    do{
      do{

        System.out.println("Digite el tipo de persona: 1. Jugador, 2. Entrenador, 3. Doctor.");
        opcion = entrada.nextInt();

      } while(opcion != 1 && opcion != 2 && opcion != 3) ;


      switch (opcion){
        case 1: jugador();
        break;
        case 2: entrenador();
        break;
        case 3: doc(); 
        break;

      }

      System.out.println("Desea ingresar otra persona?, s para si, n para no: ");

      letra = entrada.next().charAt(0);
      if(letra == 'n'){
        break;
      }
    } while(letra == 's') ;
  } 
  //jugador
  public static void jugador(){
  
    entrada.nextLine();
    System.out.println("Digite nombre: ");
    nombre = entrada.nextLine();
    System.out.println("Digite nombre 2: ");
    apellido = entrada.nextLine();
    System.out.println("Digite edad: ");
    edad = entrada.nextInt();
    System.out.println("Digite dorsal: ");
    int dorsal = entrada.nextInt();
    entrada.nextLine();
    System.out.println("Digite posicion: ");
    String posicion = entrada.nextLine();


    Futbolista jugador = new Futbolista(nombre, apellido, edad, dorsal, posicion) ; 


    equipo.add(jugador);
    players.add(jugador);
  }
  //entreandor
  public static void entrenador(){
  
  
    entrada.nextLine();
    System.out.println("Digite nombre: ");

    nombre = entrada.nextLine();
    System.out.println("Digite nombre 2: ");
    apellido = entrada.nextLine();
    System.out.println("Digite edad: ");
    edad = entrada.nextInt();
    entrada.nextLine();
    System.out.println("Digite metodo: ");
    String metodo = entrada.nextLine();
  

    Entrenador entrenador = new Entrenador(nombre, apellido, edad, metodo) ; 
  
    equipo.add(entrenador);
    managers.add(entrenador);
  }
  //doctores
  public static void doc(){
  
  
    entrada.nextLine();
    System.out.println("Digite nombre: ");
    nombre = entrada.nextLine();
    System.out.println("Digite nombre 2: ");
    apellido = entrada.nextLine();
    System.out.println("Digite edad: ");
    edad = entrada.nextInt();
    entrada.nextLine();
    System.out.println("Digite titulacion: ");
    String titulacion = entrada.nextLine();
   
    System.out.println("Digite exp: ");
    int experiencia = entrada.nextInt();
  
   
    Doctor doctors = new Doctor(nombre, apellido, edad, titulacion, experiencia) ; 
    
    equipo.add(doctors);
    ciruganos.add(doctors);
  }
  //mostrar equipo
  public static void metodos(){ 

    for(Persona people: equipo ){

      System.out.println(people); 
      System.out.println("");
    }
  }

  public static void names(){

    for(Persona people: equipo ){

      System.out.print(people.getNombre());
      System.out.print(" ");
    
    }
  }

  public static void namesf(){

    for(Futbolista people:  players){

      System.out.println(people.getNombre());
      System.out.println(" ");
    
    }
  }

  public static void namesd(){

    for(Doctor people: ciruganos){

      System.out.print(people.getNombre());
      System.out.print(" ");
    
    }
  }

  public static void namese(){

    for(Entrenador people: managers){

      System.out.println(people.getNombre());
      System.out.print(" ");
    
    }
  }

  public static void menu(){
    int opcion; 
    do{
      do{ 
        System.out.println("Digite 1. Viaje de equipo, 2. Partido, 3. Lesion: ");
        opcion = entrada.nextInt();
      }while(opcion < 1 || opcion > 6);

      switch(opcion){
        case 1: viaje();
        break;
        case 2: partido();
        break;
        case 3: lesion(); 
        break;
      }

      System.out.println("Desea ingresar otra opcion?, s para si, n para no: ");

      letra = entrada.next().charAt(0);
  
    }while(letra == 's') ;
  }


  public static void viaje(){
    String lugar;
    entrada.nextLine();
    System.out.println("Digite la ubicacion del viaje: ");
    lugar = entrada.nextLine();
    System.out.print("El viaje sera con: ");
    names();
    System.out.println("en \n" +lugar);
  }

  public static void partido(){
    String equipob;
    int gol1, gol2;
    entrada.nextLine();
    System.out.println("Digite equipo b: ");
    equipob = entrada.nextLine();

    System.out.println("El equipo local madrid se enfrentara versus: " +equipob);
    System.out.println("El madrid cuenta con los jugadores: ");
    namesf();
    System.out.print("y sus entrenadores: ");
    namese();


    gol1 = (int)(Math.random()*10);
    gol2 = (int)(Math.random()*10);

    System.out.println("El resultado es\n"+"Madrid: "+gol1+ " - "+ gol2+" "+equipob);
  }

  public static void lesion(){
    String name;
    entrada.nextLine();
    System.out.println("Digite el nombre del jugador lesionado: ");
    name = entrada.nextLine();

    System.out.println("Doctores que pueden sanar a "+name);
    namesd();
  }

}