package entidades;

public class ContaEstundantil extends Conta {
	
	private double limiteEstudantil;

	public ContaEstundantil(int numero, String nomeCliente, double limiteEstudantil) {
		super(numero, nomeCliente);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	public void usarLimite(double valor) {
		if (valor <= 0) {
			System.out.println("valor inv�lido, imposs�vel realizar opera��o");
		} else if (valor > this.limiteEstudantil) {
			System.out.println("Imposs�vel realizar opera��o, n�o h� limite suficiente");
		} else {
			this.limiteEstudantil -= valor;
			super.credito(valor);
			System.out.println("Limite utilizado");
		}
	}
	
}
