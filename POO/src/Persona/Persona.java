package Persona;

public class Persona {

	//1 Atributos (info de como se mostrara mi objeto cuando se instancie)
	String nombre;
	String apellido;
	byte edad; //para tener una correcta asignacion de memoria
	String telefono;
	String email;
	
	
	//2 Constructor con parametros
	Persona(String nombre, String apellido, byte edad, String telefono, String email){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
	}//cierre constructor
	
	
	
	//3 Metodos (lo que podria hacer mi objeto)
	void ImprimirInfo (){
		System.out.println("El nombre es: " + nombre);
		System.out.println("El apellido es: " + apellido);
		System.out.println("El edad es: " + edad);
		System.out.println("El telefono es: " + telefono);
		System.out.println("El email es: " + email);	
	}//cierre impirmirInfo
	
	
	
	void saludar () {
		System.out.println("Hola, te mando saluditos");
	}//cierre saludar
	


		
	

} //cierre POO
