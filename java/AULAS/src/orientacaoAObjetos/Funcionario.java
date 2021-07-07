/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

package orientacaoAObjetos;

public class Funcionario {
	
	String nome, funcao;
	int matricula, cargaDiaria;
	double salario;
	
	public Funcionario (String nome, String funcao, int matricula, int cargaDiaria) {
		this.nome = nome;
		this.funcao = funcao;
		this.matricula = matricula;
		this.cargaDiaria = cargaDiaria;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void darAumento(double aumento) {
		this.salario += aumento;
	}
	
	public void promover(String novaFuncao, double aumento) {
		this.funcao = novaFuncao;
		this.salario += aumento;
	}
	
	public double impostoSobreSalario() {
		return salario * 0.9;
	}
	
	
}
