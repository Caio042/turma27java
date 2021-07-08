package heranca;

public class Zoologico {

	public static void main(String[] args) {
		
		
		Cavalo alipio = new Cavalo("Alipio", "macho", 7, true, "Malhado");
		
		alipio.emitirSom();
		alipio.correr();

		
		Cachorro caramela = new Cachorro("Caramela", "femea", 5, true, "Vira-lata", true);
		
		caramela.correr();
		caramela.emitirSom();
		caramela.correrAtrasDeMoto(true);
		
		if (caramela.isFofinho()) {
			System.out.println("Ownnt");
		}
		
		
		Preguica preguica = new Preguica("Antonia", "femea", 25, false);
		
		preguica.emitirSom();
		preguica.subirEmArvore();
		
		if (preguica.isFofinho()) {
			System.out.println("É fofinha, mas é perigosa, cuidado");
		}
		
	}

}
