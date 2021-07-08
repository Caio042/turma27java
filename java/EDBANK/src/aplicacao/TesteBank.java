package aplicacao;

import entidades.Conta;

public class TesteBank {

	public static void main(String[] args) {
			
		Conta cliente = new Conta(87456, "Jesuina");
		
		System.out.println("Cliente: " + cliente.getNomeCliente());
		System.out.println("Saldo atual: " + cliente.getSaldo());
		
		cliente.credito(100);
		
		System.out.println("Cliente: " + cliente.getNomeCliente());
		System.out.println("Saldo atual: " + cliente.getSaldo());
		
		cliente.debito(50);
		
		System.out.println("Cliente: " + cliente.getNomeCliente());
		System.out.println("Saldo atual: " + cliente.getSaldo());
		
		cliente.debito(500);
		cliente.debito(-50);
	}

}
