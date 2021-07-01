/*/*Escreva um sistema que leia três números inteiros e 
 * positivos (A, B, C) e calcule a seguinte expressão: 
 * D = (R + S), R* = (A+B)², S = (B+C)²*/

package exerciciosJava1;

import java.util.Scanner;

public class Potencia {
		
		public static void main(String[] args) {
			//declaração de variaveis
			double a = 0, b = 0, c = 0, d = 0, r = 0, s = 0; 
					
			//objeto para ler o que o usuario digita no console
			Scanner leitor = new Scanner (System.in);
			
			//entrada de dados
			System.out.println("defina o valor de \"a\":");
			a = leitor.nextDouble();
			System.out.println("defina o valor de \"b\":");
			b = leitor.nextDouble();
			System.out.println("defina o valor de \"c\":");
			c = leitor.nextDouble();
			
			// Calculos
			r = Math.pow((a + b), 2);
			s = Math.pow((b + c), 2);
			d = (r + s) / 2;
			
			System.out.println("O valor de \"d\" é " + d + "\nExplicação:\nd = (r + s) / 2\nr = (a+b)²\ns = (b+c)²");
			
	}
}