package introducao;

import java.util.Locale;
import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // transforma o programa na localiza��o
		
		int anoNascimento;
		String nome;
		double salario;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Escreva seu nome:");
		nome = leitor.next();
		
		System.out.println("Escreva seu ano de nascimento:");
		anoNascimento = leitor.nextInt();		
		
		System.out.println("Escreva seu salario:");
		salario = leitor.nextDouble();
		
		int aaa = 55545554; //%d
		double vvv = 456.4564; //%f
		char bbb = 'd'; // %c
		
		String ccc = "Taz M�nia"; //%s

		System.out.printf("Ol� %s sua idade �: %d, e seu salario � %.2f\n",nome,(2021 - anoNascimento), salario);
		
		System.out.printf("%s abulule abulule %.2f bro %d sei l� %c",ccc , vvv, aaa, bbb); // formata pra exibir o double com 2 casas decimais
	}

}
