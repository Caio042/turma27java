/*2- Fa�a um programa que entre com 
 * tr�s n�meros e coloque em ordem crescente.*/

package exerciciosJava2;

import java.util.Scanner;

public class OrdernarNumeros {
	public static void main (String[] Args) {
		
		//objeto para ler o que o usuario digita no console
		Scanner leitor = new Scanner (System.in);
		
		int n1, n2, n3;
		System.out.println("Digite o primeiro valor:");
		n1 = leitor.nextInt();

		System.out.println("Digite o primeiro valor:");
		n2 = leitor.nextInt();

		System.out.println("Digite o primeiro valor:");
		n3 = leitor.nextInt();

		if (n1 > n2)
        {
            n2 = n1 - n2;
            n1 = n1 - n2;
            n2 = n1 + n2;
        }
        if (n1 > n3)
        {
            n3 = n1 - n3;
            n1 = n1 - n3;
            n3 = n1 + n3;
        }
        if (n2 > n3)
        {
            n3 = n2 - n3;
            n2 = n2 - n3;
            n3 = n2 + n3;
        }
        System.out.println("Os n�mero digitados em ordem crescente s�o " + n1 + ", " + n2 + ", " + n3);
	}
}