package ejercicios_entrega;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenarán los metros
		float metros;
		
		// Definimos la variable donde se almacenarán los centimetros
		float centimetros;
		
		// Definimos la variable donde se almacenarán los centímetros sin decimales
		int centimetrosSinDecimales;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario los metros
		System.out.println("Introduzca la longitud en metros");
		
		// Leemos los metros del teclado
		metros = sc.nextFloat();
		
		// Convertimos los metros a centimetros
		centimetros = metros * 100;
		
		// Le quitamos los decimales a los centímetros
		centimetrosSinDecimales = (int) centimetros;
		
		// Mostramos los centímetros por pantalla
		System.out.println("Son " + centimetrosSinDecimales + " cm");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
