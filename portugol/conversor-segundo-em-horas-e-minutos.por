/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
programa
{
	
	funcao inicio()
	{

		inteiro segundos, minutos, horas
		
		escreva("Escreva quanto tempo durará o evento em segundos: \n")
		leia (segundos)

		horas = segundos / 60 / 60
		minutos = (segundos / 60) % 60
		segundos = (segundos % 60) % 60

		escreva ("O evento irá durar " + horas + " horas, " + minutos + " minutos e " + segundos + " segundo")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 518; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */