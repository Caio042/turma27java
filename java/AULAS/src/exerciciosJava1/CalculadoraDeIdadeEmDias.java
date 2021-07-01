/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

package exerciciosJava1;

import java.util.Scanner;

public class CalculadoraDeIdadeEmDias {

	public static void main(String[] args) {
		
		//declaração de variaveis
		int anos = 0, meses = 0, dias = 0;
		
		//objeto para ler o que o usuario digita no console
		Scanner leitor = new Scanner (System.in);
		
		//entrada de dados
		System.out.println("Digite quantos anos de vida você tem:");
		anos = leitor.nextInt();
		System.out.println(anos + " anos e quantos meses:");
		meses = leitor.nextInt();
		System.out.println(anos + " anos, " + meses + " e quantos dias:");
		dias = leitor.nextInt();
		
		//transformar meses e anos em dias
		dias = dias + (meses * 30) + (anos * 365);
		
		//saida dos dados
		System.out.println("Sua idade em dias é " + dias + " dias");
	}
}