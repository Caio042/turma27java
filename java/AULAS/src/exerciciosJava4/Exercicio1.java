/*1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

package exerciciosJava4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int pontuacao[] = new int[5];
		int maior = 0;
		
		for (int i = 0; i < 5;i++) {
			
			System.out.println("Digite a " + (i+1) + "� pontua��o: ");
			pontuacao[i] = leitor.nextInt();
			
			if (pontuacao[i] > maior){
				maior = pontuacao[i];
			}
		}
		
		System.out.println("maior pontua��o: " + maior);
		
	}
}
