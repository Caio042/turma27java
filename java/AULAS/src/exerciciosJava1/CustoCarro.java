/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

package exerciciosJava1;

import java.util.Scanner;

public class CustoCarro {

	public static void main(String[] args) {
		double custoTotal, custoFabrica;
		
		//objeto para ler o que o usuario digita no console
		Scanner leitor = new Scanner (System.in);
				
		//entrada de dados
		System.out.println("Digite o custo de fábrica do carro");
		custoFabrica = leitor.nextDouble();
		
		
		custoTotal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
		System.out.printf("Adicionando 28%% de porcentem do distribuidor e 45%% porcento de impostos o custo total ao consumidor será: R$ %.2f ", custoTotal);
	}
}