/*2- Ler 10 n�meros e imprimir 
 * quantos s�o pares e quantos s�o �mpares. (FOR)*/

package exerciciosJava3;

import java.util.Scanner;

public class ExercicioDois {
	public static void main (String[] args){
		
		Scanner leitor = new Scanner (System.in);
		
		int par = 0, impar = 0;
		
		for (int i = 0; i < 10; i++) {
			
			// le 10 numeros
			System.out.println("Digite o " + (i +1) + "� n�mero: ");
			int numero = leitor.nextInt();
			
			//se for par, armazena o valor em uma vari�vel
			//se for �mpar, em outra vari�vel
			if (numero <= 0) {
				System.out.println("N�mero inv�lido");
			}
			else if (numero % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("N�meros pares: " + par + "\nN�mero �mpares: " + impar);
	}
}