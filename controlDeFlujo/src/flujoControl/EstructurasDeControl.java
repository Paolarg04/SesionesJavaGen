package flujoControl;

import java.util.Scanner;
public class EstructurasDeControl {//Debe coincidir la clase con el nombre de nuestro documento

	public static void main(String[] args) {//Todo dentro del metodo main

//Recordar que para que algo se ejecute, siempre debe ir dentro del metodo principal
		
		
		//Primero definir una variable del tipo String donde alamacene un dato
		String citaProgramada = "28-09-23";// Dejamos en Null y despues lo cambiamos a una fecha "28-09-23"
		//La variable declarada, se inicia en null a proposito para tener un espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		
		if (citaProgramada != null ) {
			System.out.println("Ya hay una cita Programada una disculpita.");// Porque la variable ya esta ocupada o llena
		}else{ 
			System.out.println("Puede registrar su cita.");// Podemos registrar otra cita o una cita
		}
///////////////////////////////////////////////////
		
	// Seleccionando una opcion y almacenando la variable opcion 
		
		int opcion = 1;
		
		//Creamos un menu
		System.out.println("Menu del Diente Feliz Consultorio Dental");
		System.out.println("1 ¿Desea programar una cita? ");
		System.out.println("2. Verificar Cita Programada");
		System.out.println("3. Cancelar Cita");
		System.out.println("4. Salir del Menu");
		System.out.print("Seleccione una opcion del Menu (1-4)");
		
		switch (opcion) {
		case 1:
			System.out.println("Usted ha selecionado la opcion programar cita."); //Agrega la logica para programar una cita
			break;
		case 2: System.out.println("Usted ha seleccionado la opcion de verificar cita");
		break;
		case 3: System.out.println("Usted ha seleccionado la opcion de cancelar cita");
		break;
		case 4: System.out.println("Usted ha seleccionado la opcion salir del menu");
		break;
		default:
			System.out.println("La opcion que usted selecciono no es valida. Por favor, seleccione una opcion de nuestro menu (1-4)");
			break;
		}//switch cierre
		
		
		
/////////////////////ACTIVIDAD//////////////////////
		
	    Scanner input = new Scanner(System.in);  // Create a Scanner object para solicitar un input
	    System.out.println("Ingrese una edad: ");

		int edad = input.nextInt() ; //se lee el input del usuario y con el metodo nextInt lo tenemos en entero
		
		if (edad<18) { //verificamos si menor de edad o mayor
			System.out.println("Viene con un acompañante mayor de edad \n"); // se pregunta si tiene acompañante
			System.out.println("Ingrese un true para si y un false para no \n"); // 
			boolean verdad = input.nextBoolean(); // un input boleano del usuario para saber si va acompañado
			
			String verificarMensaje=verdad? "se le da servicio": "no se le da servicio a menores sin acompañante adulto";// condicional ternario para saber si llego acompañado y mostarr el mensaje adecuado
			System.out.println(verificarMensaje); //imprimir el mensaje en consola
		}
		else {
			System.out.println("si es mayor de edad le proporcionamos servicio"); //imprimir mensaje en consola si es mayor de edad 
		}
		System.out.println("Fin del programa");
		input.close();
		
		
		
		
		
		
		
	}//metodo

}//clase
