/*Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
A fórmula que efetua tal cálculo é:
d =  √(x2-x1)² + (y2-y1)²*/
programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real x1,x2,y1,y2,d
		
		escreva("Digite o valor de x1:\n")
		leia (x1)
		escreva("Digite o valor de y1:\n")
		leia (y1)
		escreva("Digite o valor de x2:\n")
		leia (x2)
		escreva("Digite o valor de y2:\n")
		leia (y2)
		
		d = Matematica.raiz((Matematica.potencia((x2-x1),2.0) + Matematica.potencia ((y2 - y1),2.0)), 2.0) 

		escreva ("A distancia entre os dois pontos no plano é " + Matematica.arredondar(d, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 221; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */