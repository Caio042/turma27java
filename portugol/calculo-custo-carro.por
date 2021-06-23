/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real custoFabrica, custoTotal
		escreva ("Digite o custo de fábrica do carro\n")
		leia (custoFabrica)

		custoTotal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45)

		escreva ("Adicionando 28% de porcentem do distribuidor e 45% porcento de impostos o custo total ao consumidor será: R$" + Matematica.arredondar(custoTotal, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */