/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/


programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias
	
		
		escreva ("Me dia quantos dias de idade você tem: ")
		leia (dias)

		anos = dias / 365
		meses = (dias % 365) / 30
		dias = dias % 30
		
		escreva ("Sua idade é " + anos + " anos, " + meses + " meses e " + dias + " dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */