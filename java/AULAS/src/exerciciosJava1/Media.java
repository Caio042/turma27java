/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

package exerciciosJava1;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		//objeto para ler o que o usuario digita no console
		Scanner leitor = new Scanner (System.in);
		
		//entrada de dados
		System.out.println("Digite a primeira nota");
		double nota1 = leitor.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = leitor.nextDouble();
		System.out.println("Digite a terceira nota");
		double nota3 = leitor.nextDouble();
		
		double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("A media das notas é " + media +"\nPeso das notas:\nPrimeira nota: peso 2\nSegunda nota: peso 3\nTerceira nota: peso 5");
	}
}