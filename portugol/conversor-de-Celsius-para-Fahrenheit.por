programa
{
	
	funcao inicio()
	{
		cadeia nome
		real grausCelsius, grausFahrenheit
		
		escreva("Escreva seu nome\n")
		leia (nome)

		escreva ("\nDigite a temperatura em graus celsius\n")
		leia (grausCelsius)

		grausFahrenheit = 1.8 * grausCelsius + 32
		escreva ("Olá " + nome + " a temperatura " + grausCelsius + " ºC" + " convertida em Fahrenheit é " + grausFahrenheit + " ºF")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */