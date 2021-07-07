/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package orientacaoAObjetos;

public class Paciente {

	public String exames[], receitas[];
	public String nome;
	public int idade;
	public double peso, tamanho;

	Paciente(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public void sePesar(double peso) {
		this.peso = peso;
	}
	
	public void medir(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public void receitarRemedio(String... receita) {
		
		for (int i = 0; i < receita.length; i++) {
			receitas[i] = receita[i];
		}
	}
	
	public void solicitarExames(String... exame) {

		for (int i = 0; i < exame.length; i++) {
			exames[i] = exame[i];
		}
	}
	
	public String[] historicoExames() {
		return exames;
	}
	
	public String[] historicoReceitas() {
		return receitas;
	}
	
}