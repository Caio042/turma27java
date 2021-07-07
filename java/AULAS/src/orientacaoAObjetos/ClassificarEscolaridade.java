/*até 16 anos - fundamental
acima de 16 e abaixo de 21 -= medio
acima de 21 - superior
oi, aluno/a/e, vc tem x anos de idade e é do ensino xxx.
*/

package orientacaoAObjetos;

import java.util.Scanner;

public class ClassificarEscolaridade {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Pessoa alune = new Pessoa();
		
		
		System.out.println("Digite o nome do aluno/a/e: ");
		alune.nome = leitor.next();
		
		System.out.println("Digite o ano de nascimento do aluno/a/e: ");
		alune.anoNascimento = leitor.nextInt();
		
		if (alune.calcularIdade() < 16) {
			System.out.println("oi, aluno/a/e, vc tem " + alune.calcularIdade() +" anos de idade e é do ensino fundamental.");
		} else if (alune.calcularIdade() < 21) {
			System.out.println("oi, aluno/a/e, " + alune.nome +  " vc tem " + alune.calcularIdade() +" anos de idade e é do ensino médio.");
		} else {
			System.out.println("oi, aluno/a/e, vc tem " + alune.calcularIdade() +" anos de idade e é do ensino superior.");
		}
	}

}
