package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		// Definimos las variables donde se guardarán la primera y segunda nota
		int primeraNota, segundaNota;
		
		// Definimos la variable donde se guardará la nota media
		float notaMedia;
				
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que ingrese la primera nota
		System.out.println("Ingrese la primera nota: ");
		
		// Leemos la primera nota del teclado
		primeraNota = sc.nextInt();
		
		// Le pedimos al usuario la segunda nota
		System.out.println("Ingrese la segunda nota: ");
		
		// Leemos la segunda nota del teclado
		segundaNota = sc.nextInt();
		
		// Calculamos la nota media
		notaMedia = (float) (primeraNota + segundaNota) / 2;
		
		// Mostramos la media en pantalla
		System.out.println("La media es: " + notaMedia);
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
