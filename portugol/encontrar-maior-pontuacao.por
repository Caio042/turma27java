/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/


programa
{
	
	funcao inicio()
	{
		inteiro pontuacao[5]
		inteiro maior = 0

		para (inteiro i = 0; i < 5;i++){

			escreva("Digite a " + (i+1) + "ª pontuação: ")
			leia (pontuacao[i])

			se (pontuacao[i] > maior){
				maior = pontuacao[i]
			}
		}

		escreva ("maior pontuação: " + maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */