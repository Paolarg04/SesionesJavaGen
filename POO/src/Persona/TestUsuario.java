package Persona;

public class TestUsuario {
	
	public static void main (String [] args) {
		
		//Instancia de usuario
		
		Usuario Felipe = new Usuario ("Doctor", "DoctorFelipe", "paracetamol");
		
		//Cambiar la contrasenia
		Felipe.setPassword("paracetamol"); //error
	}

}
