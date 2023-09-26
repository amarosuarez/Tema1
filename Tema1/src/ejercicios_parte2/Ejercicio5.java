package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Definimos las variables donde se almacenarán las notas del primer, segundo, tercer trimestre y la media del boletin
		int notaPrimerT, notaSegundoT, notaTercerT, mediaBoletin;
		
		// Definimos la variable donde se almacenará la nota del expediente académico
		float expedienteAcademico;
		
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario la nota del primer trimestre
		System.out.println("Introduce la nota del primer trimestre en formato entero:");
		
		// Leemos la nota del teclado
		notaPrimerT = sc.nextInt();
		
		// Le pedimos al usuario la nota del segundo trimestre
		System.out.println("Introduce la nota del primer trimestre en formato entero:");
		
		// Leemos la nota del teclado
		notaSegundoT = sc.nextInt();
		
		// Le pedimos al usuario la nota del tercer trimestre
		System.out.println("Introduce la nota del tercer trimestre en formato entero:");
		
		// Leemos la nota del teclado
		notaTercerT = sc.nextInt();
		
		// Calculamos la media del boletin
		mediaBoletin = (notaPrimerT + notaSegundoT + notaTercerT) / 3;
		
		// Mostramos la nota del boletin por pantalla
		System.out.println("La media en el boletín es: " + mediaBoletin);
		
		// Calculamos la media del expediente académico
		expedienteAcademico = (float) (notaPrimerT + notaSegundoT + notaTercerT) / 3;
		
		// Mostramos la nota del expediente academico por pantalla
		System.out.println("La media en el expediente académico es: " + expedienteAcademico);
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
