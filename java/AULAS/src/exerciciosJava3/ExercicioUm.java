/*1- Informar todos os n�meros de 1000 a 1999 
 * que quando divididos por 11
 * obtemos resto = 5. (FOR)*/

package exerciciosJava3;

public class ExercicioUm {

	public static void main(String[] args) {
		
		System.out.println("Todos os n�meros que dividos por 11, o resto � 5");
		
		for (int i = 1000; i <= 1999; i ++) {
		
			if (i % 11 == 5) {
				System.out.println(i);
			}
		}	
	}
}