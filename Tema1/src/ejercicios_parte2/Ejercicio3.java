package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Declaramos la variable donde se almacenará si es par o no
		boolean esPar;
		
		// Definimos la variable donde se almacenará el número introducido por el usuario
		int num;
		
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario un número
		System.out.println("Introduzca un número:");
		
		// Leemos el número del teclado
		num = sc.nextInt();
		
		// Confirmamos que el número sea par
		esPar = num % 2 == 0;
		
		// Imprimimos el mensaje por pantalla
		System.out.println(esPar ? "Su número es par" : "Su número es impar");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
