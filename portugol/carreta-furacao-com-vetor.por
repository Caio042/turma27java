/*Carreta Furacão com vetor*/
programa
{
	
	funcao inicio()
	{
		cadeia carretaFuracao[5]

		para (inteiro i = 0; i < 5; i++){
			escreva("Digite o nome do " + (i + 1) + "º personagem da carreta furacão: ")
			leia (carretaFuracao[i])
		}

		para (inteiro i = 4; i >= 0 ; i--){
			escreva((i + 1) + "º personagem da carreta furacão: " + carretaFuracao[i] + "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 45; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */