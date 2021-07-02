/*3- Faça um programa que receba a idade de uma 
pessoa e mostre na saída em qual
categoria ela se encontra:
* 10-14 infantil
* 15-17 juvenil
* 18-25 adulto*/
package exerciciosJava2;

import java.util.Scanner;

public class CategoriasNadador {

	public static void main(String[] args) {
		
		//objeto para ler o que o usuario digita no console
		Scanner leitor = new Scanner (System.in);
				
				
		final int infantilMin = 10, infantilMax = 14, 
				juvenilMin = 15, juvenilMax = 17, 
				adultoMin = 18, adultoMax = 25;
		int idade;
		String classificacao;
		
		System.out.println("Digite a idade do nadador(a):");
		idade = leitor.nextInt();
		
		
		if (idade >= infantilMin && idade <= infantilMax){
			classificacao = "categoria infantil";
		}
		else if (idade >= juvenilMin && idade <= juvenilMax){
			classificacao = "categoria juvenil";
		}
		else if (idade >= adultoMin && idade <= adultoMax){
			classificacao = "categoria adulto";
		}
        else {
        	classificacao = "nenhuma categoria, fora da faixa de classificação";
		}
		
		System.out.println("nadador(a) pertence a " + classificacao);
	}
}