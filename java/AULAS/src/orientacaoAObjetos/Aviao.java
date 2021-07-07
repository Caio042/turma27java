/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package orientacaoAObjetos;

public class Aviao {
	
	boolean ligado, tremDePousoAtivo = true, voando;
	int turbinas, velocidade;
	String modelo;
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo () {
		return modelo;
	}
	
	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("Ligando avião...");
		}
	}
	
	public void desligar() {
		if (ligado && !voando && velocidade == 0) {
			ligado = false;
			System.out.println("Desligando avião...");
		}
	}
	
	public void abrirTremDePouso() {
		
		if (!tremDePousoAtivo) {
			tremDePousoAtivo = true;
			System.out.println("Abrindo trem de pouso...");
		}
	}
	
	public void fecharTremDePouso() {
		
		if (tremDePousoAtivo) {
			tremDePousoAtivo = false;
			System.out.println("Fechando trem de pouso...");
		}
	}
	
	public void acelerar (int velocidade) {
		if (this.velocidade < velocidade) {
			this.velocidade = velocidade;
			System.out.println("Acelerando até velocidade: " + velocidade);
		}
	}
	
	public void desacelerar (int velocidade) {
		if (this.velocidade > velocidade) {
			this.velocidade = velocidade;
			System.out.println("Desacelerando até velocidade: " + velocidade);
		}
	}
	
	public void voar () {
		
		if (ligado) {
			
			if (velocidade < 100) {
				acelerar(100);
			}
			System.out.println("Decolando...");
			voando = true;
			fecharTremDePouso();
		}
	}
	
	public void pousar () {
		if (velocidade > 100) {
			desacelerar(100);
		}
		if (!tremDePousoAtivo) {
			abrirTremDePouso();
		}
		System.out.println("Pousando avião...");
		voando = false;
		
	}
}
