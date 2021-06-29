/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{

		inteiro numeros[10]
		inteiro media = 0, maior = 0, contador =  0

		Util.sorteia(0,10)
		para (inteiro i = 0; i < 10; i++){
			numeros[i] = Util.sorteia(0,10)
			media += numeros[i]
			escreva("\nPosição " + (i+1) +": "+ numeros[i])
			se (numeros[i] > maior){
				maior = numeros[i]
			}
		}

		media /= 10
		
		para (inteiro i = 0; i < 10; i++){
			se (numeros[i] == maior){
				contador++
			}
		}

		escreva ("\nMédia = " + media + "\nMaior número: " + maior + " ocorrências: " + contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 849; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */