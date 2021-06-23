/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/


programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias
	
		escreva ("Digite quantos anos você tem\n")
		leia (anos)
		escreva("Você tem " + anos + " e quantos meses?\n")
		leia (meses)
		escreva ("Você tem " + anos + ", " + meses + " meses e quantos dias?\n")
		leia (dias)

		dias = dias + (meses * 30) + (anos * 365)

		escreva ("Sua idade total em dias é " + dias + " dias.")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 510; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */