/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package exerciciosJava2;

import java.util.Scanner;

public class ParRaizImparPotencia {

	public static void main(String[] args) {
		
		//objeto para ler o que o usuario digita no console
		Scanner leitor = new Scanner (System.in);

		
		double numero = 0, calculo = 0;
		
		System.out.println("Digite um número, \nse for par farei a raiz quadrada, \nse for impar elevarei ao quadrado");
		numero = leitor.nextDouble();
		
		
		
		if (numero % 2 == 0) {
			calculo = Math.sqrt(numero);
			System.out.printf("Número %.2f é par, sua raiz quadrada é %.2f\n", numero, calculo);
		}else {
			calculo = Math.pow(numero, 2);
			System.out.printf("Número %.2f é par, elevado a 2 é %.2f\n", numero, calculo);
		}
		
	}
}