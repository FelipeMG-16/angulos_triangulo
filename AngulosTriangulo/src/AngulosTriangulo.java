/*
 * Crear un programa donde se introduzcan los tres �ngulos internos de un
 * tri�ngulo y se determine si el tri�ngulo es v�lido o no.
 */

import java.util.Scanner;
public class AngulosTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solicitamos el primer �ngulo
		System.out.println ("Por favor introduce el primer �ngulo del tri�ngulo:");
		Scanner angulo1 = new Scanner (System.in);		
		float anguloingresado1 = angulo1.nextFloat();
		
		//Solicitamos el segundo �ngulo
		System.out.println ("Por favor introduce el segundo �ngulo del tri�ngulo:");
		Scanner angulo2 = new Scanner (System.in);		
		float anguloingresado2 = angulo2.nextFloat();
				
		//Solicitamos el tercer �ngulo
		System.out.println ("Por favor introduce el tercer �ngulo del tri�ngulo:");
		Scanner angulo3 = new Scanner (System.in);		
		float anguloingresado3 = angulo3.nextFloat();

		float sumadeangulos = anguloingresado1 + anguloingresado2 + anguloingresado3;
		
		if (sumadeangulos == 180) {
			System.out.println ("La suma de los angulos internos es " + sumadeangulos + " y por tanto es un triangulo v�lido.");
		} else {
			System.out.println ("La suma de los angulos internos es " + sumadeangulos + " y por tanto es un triangulo inv�lido.");
		}
	}
}