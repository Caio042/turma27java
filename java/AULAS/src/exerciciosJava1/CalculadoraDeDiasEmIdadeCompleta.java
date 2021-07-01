/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

package exerciciosJava1;

import java.util.Scanner;

public class CalculadoraDeDiasEmIdadeCompleta {

	public static void main(String[] args) {
		//declaração de variaveis
		int anos = 0, meses = 0, dias = 0;
		
		//objeto para ler o que o usuario digita no console
		Scanner leitor = new Scanner (System.in);
		
		//entrada de dados
		System.out.println("Me dia quantos dias de idade você tem: ");
		dias = leitor.nextInt();
	
		//calculos para transformar dividir os dias em anos, meses e dias
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = dias % 30;
		
		//saida de dados
		System.out.println("Sua idade é " + anos + " anos, " + meses + " meses e " + dias + " dias.");
	}
	
}