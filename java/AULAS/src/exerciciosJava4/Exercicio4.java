/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

package exerciciosJava4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
			Scanner leitor = new Scanner(System.in);
		
			int matriz[][] = new int[3][3];
			int soma = 0, diagonal = 0;
	
			for (int i = 0; i < 3; i++){
				for (int j = 0; j < 3; j++){
					System.out.println ("Digite o valor da linha " + (i+1) + " e coluna " + (j+1) + ": ");
					matriz[i][j] = leitor.nextInt();
					soma += matriz[i][j];
					if (i == j){
						diagonal += matriz[i][j];
					}
				}
				System.out.println ();
			}
	
			System.out.println ("Soma de todos os valores da matriz : " + soma + "\nSoma da diagonal principal: " + diagonal);

	}

}
