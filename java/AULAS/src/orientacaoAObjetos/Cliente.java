/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package orientacaoAObjetos;

public class Cliente {
	
	public String nome, email;
	private String senha;
	public String cpf;
	
	public Cliente (String nome, String email, String senha, String cpf) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
	}
	
	public void mudarSenha(String novaSenha) {
		senha = novaSenha;
	}
	
	public String informacoes() {
		return "Nome: " + nome + "\nEmail: " + email + "\nCPF: " + cpf;
	}
	
	
}
