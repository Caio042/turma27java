package orientacaoAObjetos;

import java.util.Scanner;

public class CadFriends {

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		Pessoa amigo1 = new Pessoa();
		Pessoa amigo2 = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		amigo1.nome = leitor.next();

		System.out.println("Digite seu sexo: ");
		amigo1.sexo = leitor.next().toUpperCase().charAt(0);
		
		System.out.println("Digite seu ano de nascimento: ");
		amigo1.anoNascimento = leitor.nextInt();
		
		System.out.println(amigo1.nome + " sua idade � " + amigo1.calcularIdade());

		System.out.println("Digite seu nome: ");
		amigo2.nome = leitor.next();

		System.out.println("Digite seu sexo: ");
		amigo2.sexo = leitor.next().toUpperCase().charAt(0);
		
		System.out.println("Digite seu ano de nascimento: ");
		amigo2.anoNascimento = leitor.nextInt();
		
		//amigo 2 viajou no tempo e j� est� em 2030
		System.out.println(amigo2.nome + " sua idade � " + amigo2.calcularIdade(2030));
		
		System.out.printf("Meus amigos s�o %s e %s \n", amigo1.nome, amigo2.nome);
		
		if (amigo1.calcularIdade() > amigo2.calcularIdade(2030)) {
			
			System.out.printf("Amigo %s � mais velho que %s", amigo1.nome, amigo2.nome);
			
		} else if (amigo1.calcularIdade() < amigo2.calcularIdade(2030)) {
			
			System.out.printf("Amigo %s � mais velho que %s", amigo2.nome, amigo1.nome);
			
		} else {
			
			System.out.println("Ambos tem a mesma idade");
		}
	}
}
