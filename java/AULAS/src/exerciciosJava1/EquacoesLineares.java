/*Um sistema de equações lineares do tipo:

ax + by = c
dx + ey = f 
pode ser resolvido segundo mostrado abaixo :
x = (ce-bf) / (ae - bd)
y = (dx-bf) / (ae - bd)
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.*/

package exerciciosJava1;

import java.util.Scanner;

public class EquacoesLineares {

	public static void main(String[] args) {
		
		
		//objeto para ler o que o usuario digita no console
				Scanner leitor = new Scanner (System.in);
						
		//entrada de dados
		System.out.println("Digite o valor de a:");
		double a = leitor.nextDouble();
		System.out.println("Digite o valor de b:");
		double b = leitor.nextDouble();
		System.out.println("Digite o valor de c:");
		double c = leitor.nextDouble();
		System.out.println("Digite o valor de d:");
		double d = leitor.nextDouble();
		System.out.println("Digite o valor de e:");
		double e = leitor.nextDouble();
		System.out.println("Digite o valor de f:");
		double f = leitor.nextDouble();
		
		//calculo de x e y
		double x = (c*e - b*f) / (a*e - b*d);
		double y = (a*f - c*d) / (a*e - b*d);
		
		System.out.println("Valor de x: " + x + "\nValor de y: " + y);
	}

}
