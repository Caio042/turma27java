package exerciciosJava4;

import java.util.Scanner;

public class LojinhaDoED {

	static Scanner leitor = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		String auxCod;
		int auxQnt;
		char op = 'S';
		String produto[]= {"Lápis 2.0","Borracha Rosa","Caderno de Desenho",
				"Lapiseira 7.0","Lapiseira 9.0","Caneta Ponta 1.0",
				"Caneta Azul","Caneta Rosa","Caneta Preta","Cola Bastão"};
		
		int estoque[]= {10,10,10,10,10,10,10,10,10,10};
		
		double preco[] = {2.00, 0.50, 15.00, 3.50, 3.60, 0.70, 0.70, 0.70, 0.70, 1.50};
		
		int carrinho[] = new int[10];
		
		String codigo[] = new String[10];
		
		while (op == 'S') {
				
			for(int i=0;i<produto.length;i++) {
				  if(produto[i] != null)
				  System.out.println("Produto:"+""+produto[i]+"Código:"+codigo[i]+""+"Valor: "+preco[i]);
			}
			
			
			
			for (int i = 0; i < 10; i++) {
				
				System.out.println("Deseja comprar um produto? (S/N)");
				op = leitor.next().toUpperCase().charAt(0);
				if (op != 'S') {
					break;
				}
				System.out.println("Digite o código do produto desejado: ");
				auxCod = leitor.next().toUpperCase();
				System.out.println("Digite a quantidade do produto desejado: ");
				auxQnt = leitor.nextInt();
				for (int y = 0; y < 10; y++) {
					if (codigo[y].equals(auxCod)) {
						if (auxQnt >= estoque[y]) {
							carrinho[y] = auxQnt;
							estoque [y] -= auxQnt; 
							break;
						} else {
							System.out.println("Não foi possível concluir a compra, não há itens suficiente em estoque");
						}
					}
					
					if (y == 10) {
						System.out.println("Produto nao está na lista");
					}
				}
			}
		}
		
		
	}

}
