package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Definimos las variables a usar
		String nombre, direccion;
		int telf;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario su nombre y lo guardamos en la variable
		System.out.println("Introduzca su nombre:");
		nombre = sc.nextLine();
		
		// Le pedimos al usuario su dirección y lo guardamos en la variable
		System.out.println("Introduzca su dirección:");
		direccion = sc.nextLine();
		
		// Le pedimos al usuario su teléfono y lo guardamos en la variable
		System.out.println("Introduzca su teléfono:");
		telf = sc.nextInt();
		
		// Imprimimos los datos por pantalla
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + telf);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
