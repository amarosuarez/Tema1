package ejercicios_entrega;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenará el número introducido por el usuario
		int num, resto;
		
		boolean mensaje;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario un número entero
		System.out.println("Introduzca un número entero:");
		
		// Leemos el número del teclado
		num = sc.nextInt();
		
		// Calculamos el resto
		resto = num % 7;
		
		// Mostramos el mensaje por pantalla
		System.out.println(resto == 0 ? "Tu número ya es múltiplo de 7" : "Tienes que sumarle " + (7 - resto) + " para que sea múltiplo de 7");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
