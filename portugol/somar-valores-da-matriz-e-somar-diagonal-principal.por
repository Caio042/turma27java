/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro soma = 0, diagonal = 0

		para (inteiro i = 0; i < 3; i++){
			para (inteiro j = 0; j < 3; j++){
				escreva ("Digite o valor da linha " + (i+1) + " e coluna " + (j+1) + ": ")
				leia (matriz[i][j])
				soma += matriz[i][j]
				se (i == j){
					diagonal += matriz[i][j]
				}
			}
			escreva ("\n")
		}

		escreva ("Soma de todos os valores da matriz : " + soma + "\nSoma da diagonal principal: " + diagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 680; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 10, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */