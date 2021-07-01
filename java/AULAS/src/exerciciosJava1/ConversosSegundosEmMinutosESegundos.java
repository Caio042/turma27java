/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package exerciciosJava1;

import java.util.Scanner;

public class ConversosSegundosEmMinutosESegundos {

	public static void main(String[] args) {
		//declaração de variaveis
		int segundos = 0, horas = 0, minutos = 0;
				
		//objeto para ler o que o usuario digita no console
		Scanner leitor = new Scanner (System.in);
		
		//entrada de dados
		System.out.println("Digite o tempo do evento em segundos: ");
		segundos = leitor.nextInt();
		
		horas = segundos / 60 / 60;
		minutos = (segundos / 60) % 60;
		segundos = (segundos % 60) % 60;
		
		System.out.println("O evento irá durar " + horas + " horas, " + minutos + " minutos e " + segundos + " segundo");
	}
}