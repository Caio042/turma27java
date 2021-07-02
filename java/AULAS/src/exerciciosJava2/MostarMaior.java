/*1- Faça um programa que 
 * receba três inteiros e diga qual deles é o maior.*/

package exerciciosJava2;

import java.util.Scanner;

public class MostarMaior {

	public static void main(String[] args) {
		
		//objeto para ler o que o usuario digita no console
		Scanner leitor = new Scanner (System.in);
		
		int numero1, numero2, numero3, maior = 0;
		
		
		//entrada de dados
		System.out.println("Digite o primeiro valor:");
		numero1 = leitor.nextInt();
		if (numero1 > maior) {
			maior = numero1;
		}
		System.out.println("Digite o primeiro valor:");
		numero2 = leitor.nextInt();
		if (numero2 > maior) {
			maior = numero2;
		}
		System.out.println("Digite o primeiro valor:");
		numero3 = leitor.nextInt();
		if (numero3 > maior) {
			maior = numero3;
		}
		
		System.out.println("Dos número digitados o maior é " + maior);
	}
}