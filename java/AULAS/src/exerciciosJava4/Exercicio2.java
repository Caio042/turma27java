/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/


package exerciciosJava4;

public class Exercicio2 {

	public static void main(String[] args) {

		double numeros[] = new double[10];
		double media = 0, maior = 0;
		int contador =  0;
		
		for (int i = 0; i < 10; i++){
			numeros[i] = Math.random() * 10;
			
			media += numeros[i];
			System.out.printf("Posi��o %d: %.2f \n", (i+i), numeros[i]);
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

		System.out.printf("\nM�dia = %.2f \nMaior n�mero: %.2f ocorr�ncias: %d", media, maior, contador);
		
	}

}
