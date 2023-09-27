package dataTypes;
import java.lang.Double;

public class DatosPrimitivos {
	public static void main(String[] args) {
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de informacion mas basicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dobble, boolean, char
		 */
		//BYTE. Vmin y Vmax
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		System.out.println("El valor minimo de Byte es: " + minByte);
		System.out.println("El valor maximo de Byte es: " + maxByte);
		// System.out.println();//sysout + ctrl + space
		
		//short.Vmin y VMax
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor minimo de Short es " + minShort);
		System.out.println("El valor maximo de Short es: " + maxShort);
		
		//chair.Vmin y VMax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor minimo de Character es: " + minChar);
		System.out.println("El valor maximo de Character es: " + maxChar);
		
		//Long
		long isbn = 9788499169019L;
		System.out.println(isbn);
		
		//float
		float salary = 15000f;
		System.out.println(salary);
		
		//double
		double ISR = 1239.45d;
		System.out.println(ISR);
		
		//int
		// Integer.ValorMin y Integer.ValorMAX
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor mínimo de int es: " + minInt);
		System.out.println("El valor máximo de int es: " + maxInt);
		
		// Long.ValorMin y Long.ValorMAX
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor mínimo de long es: " + minLong);
		System.out.println("El valor máximo de long es: " + maxLong);
		
		// Float.ValorMin y Float.ValorMAX
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("El valor mínimo de float es: " + minFloat);
        System.out.println("El valor máximo de float es: " + maxFloat);
        
        // double ValorMinimo y Valor MAximo
        double minDouble = Double.MIN_VALUE;
	    double maxDouble = Double.MAX_VALUE;
	    System.out.println("El valor mínimo de double es: " + minDouble);
	    System.out.println("El valor minimo de double es: " + maxDouble);

	    
	    char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.print(aChiquita);
		
		/*Casteo (Conversión de tipos en Java).
	     * -- Automático (dato más pequeño a un dato más grande)
	     * -- Manual (tipo de dato más grande a tipo de dato mas pequeño)
	     */
	    
	    int myNumber = 125;
	    System.out.println(myNumber);
	    //int < double
	    double myCasting = myNumber;
	    System.out.println(myCasting);
	    
	    short edad = 25;
	    int valorEdad = edad;
	    System.out.println(edad);
	    System.out.println(valorEdad);
	    
	    //--Manual
	    int myNewCasting = (int) myCasting;
	    System.out.println(myNewCasting);
	    
	    //Convertir de float a int
	    float myFloat = 1.99f;
	    System.out.println(myFloat);
	    //Conversion
	    int myNewFloat = (int) myFloat;
	    System.out.println(myNewFloat);
	    
	    //Convertir de char a int
	    char myChar = 'M';
	    int myNewChar = myChar;
	    System.out.println(myNewChar);
	    
	}
}
