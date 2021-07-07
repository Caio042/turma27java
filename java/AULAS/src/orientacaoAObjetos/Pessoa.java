package orientacaoAObjetos;

public class Pessoa {

	public String nome;
	public char sexo;
	public int anoNascimento;
	
	public void mostrarIdade() {
		System.out.println(2021 - anoNascimento);
	}
	
	public int calcularIdade() {
		return 2021-anoNascimento;
	}
	
	public int calcularIdade(int anoAtual) {
		return anoAtual-anoNascimento;
	}
}
