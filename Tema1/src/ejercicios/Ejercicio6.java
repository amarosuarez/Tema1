package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Definimos las variables donde se almacenarán el primer y segundo número y su multiplicación, resta y suma
		int num1, num2, suma, resta, mult;
		
		// Definimos la variable donde se almacenará la división
		float div;
				
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el primer número
		System.out.println("Introduce un número:");
		
		// Leemos el primer número del teclado
		num1 = sc.nextInt();
		
		// Le pedimos al usuario el segundo número
		System.out.println("Introduce otro número:");
		
		// Leemos el segundo número del teclado
		num2 = sc.nextInt();
		
		// Realizamos la suma
		suma = num1 + num2;
		
		// Realizamos la resta
		resta = num1 - num2;
		
		// Realizamos la multiplicación
		mult = num1 * num2;
		
		// Realizamos la división
		div = (float) num1 / num2;
		
		// Imprimimos la suma por pantalla
		System.out.println("La suma da: " + suma);
		
		// Imprimimos la resta por pantalla
		System.out.println("La resta da: " + resta);
		
		// Imprimimos la multiplicación por pantalla
		System.out.println("La multiplicacion da: " + mult);
		
		// Imprimimos la división por pantalla
		System.out.println("La división da: " + div);
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
