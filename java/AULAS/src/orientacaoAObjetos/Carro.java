package orientacaoAObjetos;

public class Carro {
	
	public String modelo, fabricante;
	public int ano, qntPortas, velocidade = 0;
	public boolean ligado;
	
	
	public void ligarCarro() {
		ligado = true;
	}
	
	public void desligarCarro() {
		if (velocidade == 0) {
			ligado = false;
		}
	}
	
	public void acelerar() {
		if (ligado) {
			System.out.println("Vrum, vrum...");
			velocidade++;
		}
	}
	
	public void frear() {
		System.out.println("Skrrrrr...");
		velocidade--;
	}
}
