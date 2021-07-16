/*
 * Crear un programa donde se introduzcan los tres ángulos internos de un
 * triángulo y se determine si el triángulo es válido o no.
 */

import java.util.Scanner;
public class AngulosTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solicitamos el primer ángulo
		System.out.println ("Por favor introduce el primer ángulo del triángulo:");
		Scanner angulo1 = new Scanner (System.in);		
		float anguloingresado1 = angulo1.nextFloat();
		
		//Solicitamos el segundo ángulo
		System.out.println ("Por favor introduce el segundo ángulo del triángulo:");
		Scanner angulo2 = new Scanner (System.in);		
		float anguloingresado2 = angulo2.nextFloat();
				
		//Solicitamos el tercer ángulo
		System.out.println ("Por favor introduce el tercer ángulo del triángulo:");
		Scanner angulo3 = new Scanner (System.in);		
		float anguloingresado3 = angulo3.nextFloat();

		float sumadeangulos = anguloingresado1 + anguloingresado2 + anguloingresado3;
		
		if (sumadeangulos == 180) {
			System.out.println ("La suma de los angulos internos es " + sumadeangulos + " y por tanto es un triangulo válido.");
		} else {
			System.out.println ("La suma de los angulos internos es " + sumadeangulos + " y por tanto es un triangulo inválido.");
		}
	}
}