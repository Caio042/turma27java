package introducao;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		//objeto para ler o que o usuario digita no console
		Scanner leitor = new Scanner (System.in);
		
		//entrada de dados
		System.out.println("Digite um numero, diremos se � par ou impar");
		int numero = leitor.nextInt();
		
		if (numero < 0) {
			if (numero == 0) {
				System.out.println("mlkNeutro");
			} else if (numero % 2 == 0) {
				System.out.println("N�mero " + numero + " � par");
			}else {
				System.out.println("N�mero " + numero + " � impar");
			}
		}
		else {
			System.out.println("Precisa ser um n�mero positivo");
		}
	}
}