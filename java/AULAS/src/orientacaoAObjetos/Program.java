package orientacaoAObjetos;

public class Program {

	public static void main(String[] args) {

		//aviao
		
		Aviao boeing = new Aviao();
		
		boeing.setModelo("Boeing 747");

		System.out.println("Modelo: " + boeing.getModelo());
		
		boeing.ligar();
		boeing.acelerar(150);
		boeing.voar();
		boeing.pousar();
		boeing.desacelerar(0);
		boeing.desligar();
		
		
		// produto eletronico
	
		ProdutoEletronico celular = new ProdutoEletronico();
		
		celular.fabricante = "Motorola";
		celular.fonteDeAlimentacao = "Bateria";
		celular.movel = true;
		celular.tipo = "Telefone Móvel";
		celular.usoDeEnergiaPorhora = 50.0;
				
		System.out.println("Celular\nFabricante: " + celular.fabricante + "\nFonte de alimentação: " + celular.fonteDeAlimentacao + "\nTipo: " + celular.tipo + "\nEnergia gasto por hora: " + celular.usoDeEnergiaPorhora);
		
		if(celular.movel) {
			System.out.println("É um dispositivo móvel");
		}else {
			System.out.println("Não é um dispositivo móvel");
		}
		
		celular.ligar();
		celular.desligar();
		
		
		// cliente
		
		Cliente cleuzo = new Cliente("Cleuzo da Silva", "cleuzonograu@yahoo.com", "cria013", "478.548.548-54");
		
		System.out.println(cleuzo.informacoes());
		cleuzo.mudarSenha("123456");
		
		
		//funcionario
		
		Funcionario oscar = new Funcionario("Oscar Filho",  "porteiro", 0035,  8);
		oscar.setSalario(2500);
		System.out.println("Funcionario " + oscar.nome +" cargo: " + oscar.funcao + " salario liquido: " + oscar.impostoSobreSalario());
		
		oscar.promover("Chefe dos porteiros", 1000);
		
		System.out.println("Funcionario " + oscar.nome +" cargo: " + oscar.funcao + " salario liquido: " + oscar.impostoSobreSalario());
		
		oscar.darAumento(200);
		
		System.out.println("Funcionario " + oscar.nome +" cargo: " + oscar.funcao + " salario liquido: " + oscar.impostoSobreSalario());
		
		
		
		
		//Patinete
		
		Patinete simples = new Patinete(2, "Caloi", false, true);
		
		System.out.println("Marca: " + simples.marca + "\nQuantidade de rodas: " + simples.rodas);
		
		simples.empurraComOPe();
		simples.empurraComOPe();
		simples.acelerar();
		
		System.out.println("Velocidade: " + simples.velocidade + " KM/h");
		
		simples.frearComFreio();
		
		System.out.println("Velocidade: " + simples.velocidade + " KM/h");
		
		
		
		//Conta Bancaria
		
		ContaBancaria itau = new ContaBancaria("Poupança", 548751, true);
		
		itau.credito(505.75);
		itau.debito(200);
		
		System.out.println("Conta: " + itau.numeroConta + "\nSaldo: " + itau.mostrarSaldo());
		
		
		
		
		//Paciente
		//Ainda nao funciona, rever
		/*
		Paciente osvaldo = new Paciente("Osvaldo Costa", 46);
		
		osvaldo.solicitarExames("Exame de sangue", "exame de urina", "exame toxicologico");
		osvaldo.receitarRemedio("Dipirona", "Vitamina C", "Maracujina", "Não manjo muito de nomes de remedios");
		
		for (int i = 0; i < osvaldo.historicoExames().length; i++) {
			System.out.println(osvaldo.historicoExames());
		}
		*/
	}
}
