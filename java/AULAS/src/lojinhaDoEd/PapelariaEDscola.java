package lojinhaDoEd;

import java.util.Scanner;

public class PapelariaEDscola {
 

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		char op = 'S';
		String produto[]= {"L�pis 2.0","Borracha Rosa","Caderno   ",
				"Lapiseira 7.0","Lapiseira 9.0","Tesoura   ",
				"Caneta Azul","Caneta Rosa","Caneta Preta","Cola Bast�o"};

		double preco[] = {2.00, 0.50, 15.00, 3.50, 3.60, 0.70, 0.70, 0.70, 0.70, 1.50};
		int estoque[] = new int[10];
		int carrinho[] = new int[10];
		String codigo[] = new String[10];
		double subtotal = 0;

		//atribuir 10 itens em cada produto em estoque
		for(int i=0;i<estoque.length;i++) {
			estoque[i] = 10;
		}
		
		//inicializar carrinho com zero
		for(int i=0;i<carrinho.length;i++) {
			carrinho[i] = 0;
		}

		//criar c�digo
		for(int i=0;i<codigo.length;i++) {
			String aux;
			if (i < 9) {
				aux = "ED-0" + (i+1);
			} else{
				aux = "ED-" + (i+1);
			}
			codigo[i] = aux;
		}

		
		System.out.println("============= Papelaria EDscola =============");
		
		while (op == 'S') {
			
			
			//listar na tela
			System.out.println("\n");
			for(int i=0;i<produto.length;i++) {
				System.out.printf("\nProduto: %s \t\tC�digo: %s \t\tValor: R$ %.2f   \t\tQuantidade em estoque: %d",produto[i], codigo[i], preco[i], estoque[i]);
			}



			String auxCod;
			int auxQnt;
			int auxIndex = 99;

			//comprar ou sair
			System.out.println("\n\nDeseja comprar um produto? (S/N)");
			op = leitor.next().toUpperCase().charAt(0);
			if (op != 'S') {
				System.out.println("deseja sair? (S/N)");
				char sair = leitor.next().toUpperCase().charAt(0);
				if (sair == 'S') {
					break;
				} else {
					op = 'S';
					continue;
				}
			}

			//identificar o c�digo do produto
			while (auxIndex == 99) {
				System.out.println("Digite o c�digo do produto desejado: ");
				auxCod = leitor.next().toUpperCase();
	
				for (int i = 0; i < 10; i++) {
					if (codigo[i].equals(auxCod)) {
						auxIndex = i;
						break;
					}
					if (i == 9) {
	
						System.out.println("Produto nao est� na lista");
	
					}
				}
			}
			
			System.out.println("O produto escolinho foi: " + produto[auxIndex] + "\nConfirma o poduto escolhido? (S/N)");
			char confirma = leitor.next().toUpperCase().charAt(0);
			if (confirma != 'S') {
				continue;
			}
			
			//pede quantidade
			System.out.println("Digite a quantidade do produto desejado: ");
			auxQnt = leitor.nextInt();
			while (auxQnt <= 0) {
				System.out.println("Por favor, digite uma quantidade v�lida: ");
				auxQnt = leitor.nextInt();
			}

			//realiza compra
			if (auxQnt <= estoque[auxIndex]) {
				carrinho[auxIndex] += auxQnt;
				estoque [auxIndex] -= auxQnt; 
			} else {
				System.out.println("N�o foi poss�vel concluir a compra, n�o h� itens suficiente em estoque");
			}
			
			//listar carrinhos de compras
			System.out.println("\n\nSeu carrinho de compras: ");
			subtotal = 0;
			for(int i = 0 ; i < carrinho.length; i++) {
				if (carrinho[i] != 0) {
					System.out.printf("Produto: %s \tquantidade: %d \tpre�o unitario: %.2f \n", produto[i], carrinho[i], preco[i]);
					subtotal += carrinho[i] * preco[i];
				}
			}
			
			System.out.printf("Subtotal: R$ %.2f \n", subtotal);
			
			auxIndex = 99;
			
			char retirar;
			do {
				System.out.println("Deseja retirar algum item do carrinho? (S/N)");
				retirar = leitor.next().toUpperCase().charAt(0);
				if (retirar == 'S') {
					for(int i = 0 ; i < carrinho.length; i++) {
						if (carrinho[i] != 0) {
							System.out.printf("Produto: %s \t c�digo: %s \t quantidade: %d \tpre�o unitario: %.2f \n", produto[i], codigo[i], carrinho[i], preco[i]);
						}
					}
					System.out.println("Digite o c�digo do item que deseja tirar do carrinho: ");
					auxIndex = 99;
					while (auxIndex == 99) {

						auxCod = leitor.next().toUpperCase();
			
						for (int i = 0; i < 10; i++) {
							if (codigo[i].equals(auxCod)) {
								auxIndex = i;
								break;
							}
							if (i == 9) {
			
								System.out.println("Produto nao est� na lista");
			
							}
						}
					}
					System.out.println("Produto " + produto[auxIndex] + " retirado do carrinho");
					carrinho[auxIndex] = 0;
					estoque [auxIndex] = 10; 
				}
			} while(retirar == 'S');
		}
		
		//finaliza��o
		System.out.println("\n\nSeu carrinho de compras: ");
		subtotal = 0;
		for(int i = 0 ; i < carrinho.length; i++) {
			if (carrinho[i] != 0) {
				System.out.printf("Produto: %s \tquantidade: %d \tpre�o unitario: %.2f \n", produto[i], carrinho[i], preco[i]);
				subtotal += carrinho[i] * preco[i];
			}
		}
		
		System.out.printf("Subtotal: R$ %.2f \n", subtotal);
		System.out.println("\n\nMuito obrigado pela preferencia, volte sempre");

	}

}
