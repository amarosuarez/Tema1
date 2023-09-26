package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Definimos las variables donde se almacenarán el nombre y la dirección
		String nombre, direccion;
		
		// Definimos la variable donde se almacenará el teléfono
		int telf;
		
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario su nombre
		System.out.println("Introduzca su nombre:");
		
		// Leemos el nombre del teclado
		nombre = sc.nextLine();
		
		// Le pedimos al usuario su dirección
		System.out.println("Introduzca su dirección:");
		
		// Leemos la dirección del teclado
		direccion = sc.nextLine();
		
		// Le pedimos al usuario su teléfono
		System.out.println("Introduzca su teléfono:");
		
		// Leemos el teléfono del teclado
		telf = sc.nextInt();
		
		// Imprimimos el nombre por pantalla
		System.out.println("Nombre: " + nombre);
		
		// Imprimimos la dirección por pantalla
		System.out.println("Dirección: " + direccion);
		
		// Imprimimos el teléfono por pantalla
		System.out.println("Teléfono: " + telf);
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
