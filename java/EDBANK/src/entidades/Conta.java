package entidades;

public class Conta {
	private int numero;
	private String nomeCliente;
	private double saldo;
	
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}
	
	
	
	public void credito(double valorCredito) {
		if (valorCredito > 0) {
			this.saldo += valorCredito;
			System.out.println("Crédito realizado");
		} 
		else {
			System.out.println("valor inválido, impossível realizar operação");
		}
	}
	
	public void debito(double valorDebito) {
		if (valorDebito <= 0){
			System.out.println("valor inválido, impossível realizar operação");
		} 
		else if (valorDebito >= this.saldo) {
			System.out.println("Impossível realizar operação, não há saldo suficiente em conta");
		}
		else {
			this.saldo -= valorDebito;
			System.out.println("Débito realizado");
		} 
	}



	public int getNumero() {
		return numero;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	
}
