package logicOperators;

public class Exercise {
	public static void main(String[]args) {
		
		//Enrique, Paola y Mariana compran un iphone 15. Si el total de la compra supera los 25mil pesos, por lo tanto obitnenen un 10% de descuento. La tienda en estos momentos cuenta con una promoción de 12 meses sin intereses, por lo tanto, deciden pagar con la TDC de Mariana. ¿ Cuál sería el costo total de los equipos?¿Aplica descuento? ¿Cuál sería el costo total con descuento? ¿Cuánto pagarían mensualmente?	
		
		
		 double precioIphone = 19500; // Precio de un iPhone 15
	       	int cantidadIphones = 3; // Cantidad de iPhones comprados
	        double descuentoPorcentaje = 0.10; // 10% de descuento si el total supera los 25,000 pesos
	        double precioTotalSinDescuento = precioIphone * cantidadIphones; // Precio total sin descuento
	        double precioTotalConDescuento = precioTotalSinDescuento; // Inicialmente, el precio total con descuento es igual al precio total sin descuento
	        // Verificar si el total supera los 25,000 pesos para aplicar el descuento
	        if (precioTotalSinDescuento > 25000) {
	            precioTotalConDescuento = precioTotalSinDescuento * (1 - descuentoPorcentaje);
	        }

	        // Calcular el costo total con descuento
	        double costoTotalConDescuento = precioTotalConDescuento;

	        // Aplicar la promoción de 12 meses sin intereses
	        int mesesSinIntereses = 12;
	        double costoMensual = costoTotalConDescuento / mesesSinIntereses;

	        // Imprimir los resultados
	        System.out.println("El costo total de los equipos es: $" + precioTotalSinDescuento);
	        if (precioTotalSinDescuento > 25000) {
	            System.out.println("Se aplicó un descuento del 10%");
	        }
	        System.out.println("Costo total con descuento: $" + costoTotalConDescuento);
	        System.out.println("Monto a pagar mensualmente (a 12 meses sin intereses): $" + costoMensual);


		
	}
}