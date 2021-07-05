/*2- Ler 10 números e imprimir 
 * quantos são pares e quantos são ímpares. (FOR)*/

package exerciciosJava3;

import java.util.Scanner;

public class ExercicioDois {
	public static void main (String[] args){
		
		Scanner leitor = new Scanner (System.in);
		
		int par = 0, impar = 0;
		
		for (int i = 0; i < 10; i++) {
			
			// le 10 numeros
			System.out.println("Digite o " + (i +1) + "º número: ");
			int numero = leitor.nextInt();
			
			//se for par, armazena o valor em uma variável
			//se for ímpar, em outra variável
			if (numero <= 0) {
				System.out.println("Número inválido");
			}
			else if (numero % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Números pares: " + par + "\nNúmero ímpares: " + impar);
	}
}