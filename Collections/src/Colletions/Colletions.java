package Colletions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Colletions {

public static void main(String[] args) {
		
	/*
	//Array
	//Tipo de dato del array, nombre, instancia del objeto arreglo, los datos
	String[] listaDeCompras = new String[] {"Leche", "Pan", "Huevos"};
	
	
	//Esta impresion solo muestra el espacio de memoria
	System.out.println(listaDeCompras);
	

	//Imprimir info de listaDeCompras con un forEch
	//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir
	for(String productoAImprimir : listaDeCompras) {
		System.out.println(productoAImprimir);
	}//forEach
	*/

	
	
	//Implementacion de un arrayList
	//Clase General (Interfaz), tipo de dato que usare, nombre de mi estructura de datos, instancia de dicha clase general
	List<String> listaDeContactos = new ArrayList<>();
	
	
	//Agrego elementos del tipo String a mi arrayList llamado listaDeContatos
	listaDeContactos.add("Felipe");
	listaDeContactos.add("Roberto");
	listaDeContactos.add("Alicia");
	listaDeContactos.add("Fatima");
	
	
	//Obtener un elemento de la lista = asignarlo a una variable
	String datoFelipe = listaDeContactos.get(0);
	System.out.println(datoFelipe);
	
	//Borrar un elemento de la lista
	listaDeContactos.remove(1);
	System.out.println(listaDeContactos);
	
	
	
	//Implementacion de un conjunto (SET)
	//Sintaxis
	//Interface de donde implemento + tipo de dato que usare+ nombre que le doy al conjunto + instancia de la clase especifica
	Set<String> cartasDeJuego = new HashSet<>();
	
	
	//Agregar elementos
	cartasDeJuego.add("As de Corazones");
	cartasDeJuego.add("2 de picas");
	cartasDeJuego.add("Reina de Treboles");
	
	
	//No puedo saber posiciones, solo saber si lo contiene
	if(cartasDeJuego.contains("Reina de Treboles")) {
		System.out.println("La reina de treboles si esta en el conjunto");
	}else {
		System.out.println("No encuentro el elemnto solicitado");
	}
	
	
	
	
	//Implementacion de un mapa (hashMap)
	Map <String, String> libretaDirecciones = new HashMap<>();
	
	
	//Agregar elementos a mi libreta de direcciones, donde mi K=nombre y mi V=direccion
	libretaDirecciones.put("Felipe", "Tlalnepantla");
	libretaDirecciones.put("Doctor Simi", "CDMX");
	libretaDirecciones.put("Konoha", "Naruto");
	
	
	//Metodo para sacar informacion de la libreta, creando una nuevas Variables
	String direccionDeFelipe = libretaDirecciones.get("Felipe");
	String direccionDeNaruto = libretaDirecciones.get("Naruto"); //null
	
	
	//Impresion
	System.out.println(direccionDeFelipe);
	System.out.println(direccionDeNaruto);
	
	
	
	
	
	
	
	
	}//metodo main
	
	
}//Collections



/*
 * 
 * Colecciones
 * 
 * 
 * - Arrays (arreglos
 * 
 * 
 * Es una estructura de datos lineal que contiene elementos del mismo tipo. Los elementos estan almacenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a traves de un indice. Las principales caracteristicas de un array son:
 * 
 * 		- Es una estructura de datos fija, generalmente almacena datos del mismo tipo
 * 		- La longitud de un array se establece al momento de crearlo, y no cambia.
 * 		- Podemos acceder a elementos por medio de un indice
 * 		- Los arrays pueden contener datos primitivos y objetos
 * 		- No proporciona matodos adicionales para agregar o eliminar elementos
 * 
 * 
 * Un ejemplo de array es una lista de compras del supermercado
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * - Arraylist
 * 
 * 
 * Es una implementacion de una lista (List), es decir, que esta en un nivel abajo de lasl istas. Utiliza un array dinamico que permite almacenar datos.
 * 
 * Sus principales caracteristicas son:
 * 
 * - Tamanio dinamico, a diferencia de los arrays tradicionales, el tamanio de un arraysList si se puede modificar.
 * - Acceso rapido, podemos acceder a un elemento del arrayList por su posicion o indice.
 * - Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos.
 * 
 * 
 * 
 * 
 * 
 * 
 * Set (conjunto)
 * 
 * Estructura de datos que almacena datos unicos sin orden especifico. Las principales caracteristicas de un set son:
 * 
 * 		- No hay elementos duplicados, ya que los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operacion se ignora.
 * 		- No hay un orden especifico, los elementos se almacenan sin orden especifico.
 * 		- La busqueda es mas sencilla, ya que al no tener elementos duplicados se usa una funcion hash para encontrar elemento deseado.
 * 
 * 
 * 
 * 
 * Map (mapas)
 * 
 * Un mapa es una estructura de datos que almacena pares de clave-valor.
 * 
 * - Almacenamiento con pares K-V
 * - Sin orden especifico (similar a un Set)
 * - Busqueda rapida, la busqueda se hace por medio de un valor (key) y usa una funcion interna hash para buscar elementos.
 * 
 * 
 * 
 * 
 * Agenda telefonica (agregar, modificar, eliminar)
 * 
 * 
 * 
 */



