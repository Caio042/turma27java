/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package orientacaoAObjetos;

public class ProdutoEletronico {
	public String fabricante, tipo, fonteDeAlimentacao;
	public boolean movel, ligado;
	public Double usoDeEnergiaPorhora;
	
	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("ligando...");
		}
	}
	
	public void desligar() {
		if (ligado) {
			ligado = false;
			System.out.println("desligando...");
		}
	}
}
