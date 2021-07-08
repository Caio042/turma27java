package heranca;

public class Cavalo extends Animal {
	public String raca;
	public final String alimentacao = "Herbívoro";
	
	public void correr() {
		System.out.println("Pócoto, pócoto, pócoto... ");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("iiirrrrí");
	}

	public Cavalo(String nome, String sexo, int idade, boolean domestico, String raca) {
		super(nome, sexo, idade, domestico);
		this.raca = raca;
	}
	
	
	
}
