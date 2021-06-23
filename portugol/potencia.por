/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: D = (R + S), R* = (A+B)², S = (B+C)²*/
programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real a, b, c, r, s, d

		escreva ("defina o valor de \"a\": \n")
		leia(a)

		escreva ("defina o valor de \"b\": \n")
		leia(b)

		escreva ("defina o valor de \"c\": \n")
		leia(c)

		s = Matematica.potencia((b+c),2.0)
		r = Matematica.potencia((a+b),2.0)
		d = (r + s) / 2

		escreva ("O valor de \"d\" é " + d + "\nExplicação:\nd = (r + s) / 2\nr = (a+b)²\ns = (b+c)²")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */