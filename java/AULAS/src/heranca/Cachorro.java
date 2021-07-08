package heranca;

public class Cachorro extends Animal {

	private String raca;
	private boolean fofinho;
	private final String alimentacao = "Onívoro";
	
	
	public Cachorro(String nome, String sexo, int idade, boolean domestico, String raca, boolean fofinho) {
		super(nome, sexo, idade, domestico);
		this.raca = raca;
		this.fofinho = fofinho;
	}


	public String getRaca() {
		return raca;
	}


	public boolean isFofinho() {
		return fofinho;
	}
	
	
	public void correr() {
		System.out.println("Infelizmente nossa equipe não conseguiu definir o barulho de um cachorro correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au au au");
	}
	
	public void rosnar() {
		System.out.println("Grrrrr");
	}
	
	public void correrAtrasDeMoto(boolean motoEstaPassando) {
		
		if (motoEstaPassando) {
			System.out.println("*O cachorro está muito bravo correndo atrás da moto*");
		}
	}
	
}
