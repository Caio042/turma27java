/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package orientacaoAObjetos;

public class Patinete {

	int rodas;
	String marca;
	int velocidade = 0;
	boolean eletrico, temFreio;
	
	Patinete(int rodas, String marca, boolean eletrico, boolean temFreio){
		this.rodas = rodas;
		this.marca = marca;
		this.eletrico = eletrico;
		this.temFreio = temFreio;
	}
	
	public void empurraComOPe() {
		velocidade++;
	}
	
	public void frearComPe() {
		if (velocidade > 0) {
			velocidade--;
		}
	}
	
	public void acelerar() {
		if (eletrico) {
			velocidade += 5;
		}
	}
	
	public void frearComFreio() {
		if (temFreio) {
			if (velocidade > 5) {
			velocidade -= 5;
			}
			else {
				velocidade = 0;
			}
		}
	}
	
}
