package introducao;

import java.util.Scanner;

public class Pessoa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);

		String nomes[] = new String[3];
		int anoNascimento, menorIdade = 999, maiorIdade = 0, maiorIndex = 0, menorIndex = 0;
		int idades[] = new int[3];
		char sexos[] = new char[3];
		
		
		for (int i = 0; i < 3 ; i++) {
		
			System.out.println("Digite o nome da " + (i + 1) +"ª pessoa: ");
			nomes[i] = leitor.next();
			
			System.out.println("Digite o sexo (M - Masculino / F - Feminino / O - Outros) da " + (i + 1) + "ª pessoa:");
			sexos[i] = leitor.next().toUpperCase().charAt(0);
			
			System.out.println("Digite o ano de nascimento da " + (i + 1) +"ª pessoa:: ");
			anoNascimento = leitor.nextInt();
			
			idades[i] = 2021 - anoNascimento;
			
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				maiorIndex = i;
			}
			if (idades[i] > menorIdade) {
				menorIdade = idades[i];
				menorIndex = i;
			}
		}
		
		for (int i = 0; i < 3 ; i++) {
			System.out.println("Oi Senhore, " + nomes[i] + " sua idade é " + idades[i] + " anos");
		}
		
		
		System.out.println("O mais velho é " + nomes[maiorIndex] + " com " + idades[maiorIndex] + " anos");
		System.out.println("O mais novo é " + nomes[menorIndex] + " com " + idades[menorIndex] + " anos");
	}

}
