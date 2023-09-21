package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		// Creamos las variables, respectivas a cada nota y para la media
		int primeraNota, segundaNota;
		float notaMedia;
				
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que ingrese la primera nota y lo guardamos en la variable
		System.out.println("Ingrese la primera nota: ");
		primeraNota = sc.nextInt();
		
		// Le pedimos al usuario la segunda nota y lo guardamos en la variable
		System.out.println("Ingrese la segunda nota: ");
		segundaNota = sc.nextInt();
		
		// Calculamos la nota media
		notaMedia = (float) (primeraNota + segundaNota) / 2;
		
		// Mostramos la media en pantalla
		System.out.println("La media es: " + notaMedia);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
