package ejercicios_entrega;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Definimos la variable donde se guardarán los milímetros
		int milimetros;
		
		// Definimos la variable donde se guardarán los milímetros en centímetros
		float milimetrosCentimetros;
		
		// Definimos la variable donde se guardarán los centímetros
		int centimetros;
		
		// Definimos la variable donde se guardarán los metros
		int metros;
		
		// Definimos la variable donde se guardarán los metros en centímetros
		int metrosCentimetros;
		
		// Definimos la variable donde se guardará la suma
		float suma;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario los milimetros
		System.out.println("Introduzca los milímetros:");
		
		// Leemos los milímetros del teclado
		milimetros = sc.nextInt();
		
		// Le pedimos al usuario los centimetros
		System.out.println("Introduzca los centímetros:");
		
		// Leemos los centimetros del teclado
		centimetros = sc.nextInt();
		
		// Le pedimos al usuario los metros
		System.out.println("Introduzca los metros:");
		
		// Leemos los metros del teclado
		metros = sc.nextInt();
		
		// Pasamos los milímetros a centímetros
		milimetrosCentimetros = (float) milimetros / 10;
		
		// Pasamos los metros a centímetros
		metrosCentimetros = metros * 10;
		
		// Hacemos la suma
		suma = (float) metrosCentimetros + centimetros + milimetrosCentimetros;
		
		System.out.println("La suma de las tres longitudes da: " + suma + " centímetros");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}


