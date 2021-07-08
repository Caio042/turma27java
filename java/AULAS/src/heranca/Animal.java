package heranca;

public class Animal {
	public String nome, sexo, alimentacao;
	public int idade;
	public double peso, comprimento, altura;
	private boolean domestico;
	
	public Animal(String nome, String sexo, int idade, boolean domestico) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.domestico = domestico;
	}

	public void emitirSom() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getAlimentacao() {
		return alimentacao;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isDomestico() {
		return domestico;
	}
	
}
