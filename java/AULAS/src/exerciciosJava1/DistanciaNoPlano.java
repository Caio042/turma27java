/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distancia entre eles. 
A fórmula que efetua tal calculo é:
d =  √(x2-x1)² + (y2-y1)²*/

package exerciciosJava1;

import java.util.Scanner;

public class DistanciaNoPlano {

	public static void main(String[] args) {
		
		//objeto para ler o que o usuario digita no console
		Scanner leitor = new Scanner (System.in);
				
		//entrada de dados
		System.out.println("Digite o valor de x1:");
		double x1 = leitor.nextDouble();
		System.out.println("Digite o valor de y1:");
		double y1 = leitor.nextDouble();
		System.out.println("Digite o valor de x2:");
		double x2 = leitor.nextDouble();
		System.out.println("Digite o valor de y2:");
		double y2 = leitor.nextDouble();
		
		//calculo da distancia entre 2 planos
		double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		//saida
		System.out.printf("A distancia entre os dois pontos no plano é %.2f", d);
	}
}