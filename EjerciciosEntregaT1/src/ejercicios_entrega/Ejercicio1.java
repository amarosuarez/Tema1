package ejercicios_entrega;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenará el número introducido por el usuario
		float num;
		
		// Definimos la variable donde se almacenará el número redondeado
		int numRedondeado;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario un número con decimales
		System.out.println("Introduzca un número con decimales:");
		
		// Leemos el número del teclado
		num = sc.nextFloat();
		
		// Casteamos el número
		numRedondeado = (int) num;
		
		// Redondeamos el número
		num = (float) (num - numRedondeado) >= 0.5 ? numRedondeado++ : numRedondeado;
		
		// Mostramos el número redondeado por pantalla
		System.out.println("El número redondeado es: " + numRedondeado);
		
		// Cerramos el objeto Scanner
		sc.close();
		
		// Amaro Suárez
	}
	
}
