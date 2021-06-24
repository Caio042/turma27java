/*Desenvolva um programa que receba um número e exiba se é par ou impar*/

programa
{
	
	funcao inicio()
	{
		inteiro numero
		logico par
		
		escreva("Digite um número\n")
		leia (numero)

		
		se (numero % 2 == 0){
			escreva ("O número " + numero + " é par")
		}
		senao{
			escreva ("O número " + numero + " é impar")
		}
		escreva ("\nfim de programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 90; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */