package Figura;

public class TestFiguras {

	public static void main(String[] args) {
		
		//Generar las instancias de nuestras clases
		
		//1. Instancia de la clase figura
//		Figura Generica = new Figura();	//La clase Figura es abstracta, pierde la capacidad de instanciar
		
		//2. Instancia de un rectángulo
		Figura rectangulo = new Rectangulo(5.0, 6.5);
		
		//3. Instancia de un circulo
		Figura circulo = new Circulo(3.14, 3.0);
		
		
		//Invocación del método
		System.out.println( rectangulo.calcularArea() );
		System.out.println( circulo.calcularArea() );
		
	}//Método main
	
}//Class TestFiguras
