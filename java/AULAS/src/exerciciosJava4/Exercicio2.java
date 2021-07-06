/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/


package exerciciosJava4;

public class Exercicio2 {

	public static void main(String[] args) {

		double numeros[] = new double[10];
		double media = 0, maior = 0;
		int contador =  0;
		
		for (int i = 0; i < 10; i++){
			numeros[i] = Math.random() * 10;
			
			media += numeros[i];
			System.out.printf("Posição %d: %.2f \n", (i+i), numeros[i]);
			if (numeros[i] > maior){
				maior = numeros[i];
			}
		}
		
		media /= 10;
		
		for (int i = 0; i < 10; i++){
			if (numeros[i] == maior){
				contador++;
			}
		}

		System.out.printf("\nMédia = %.2f \nMaior número: %.2f ocorrências: %d", media, maior, contador);
		
	}

}
