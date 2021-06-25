/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/

programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		const inteiro AMOSTRA_DE_PESQUISA = 3
		inteiro numFilhos = 0, totalFilhos = 0
		real salario = 0.0, maiorSalario = 0.0, totalSalario = 0.0, menosQueCem = 0.0

		para (inteiro i = 0; i < AMOSTRA_DE_PESQUISA; i++){
			escreva("Digite salário do habitante número " + (i + 1) + ":\n")
			leia (salario)
			escreva("Digite o número de filhos do habitante número " + (i + 1) + ":\n")
			leia (numFilhos)
			se (salario > maiorSalario) {
				maiorSalario = salario
			}

			se (salario < 100){
				menosQueCem++
			}
			
			totalSalario += salario
			totalFilhos += numFilhos
		}
		
		escreva ("Média de salario: " + Mat.arredondar((totalSalario / AMOSTRA_DE_PESQUISA),2.0))
		escreva ("\nMédia do número de filhos: " + (totalFilhos / AMOSTRA_DE_PESQUISA))
		escreva ("\nMaior Salario: " + Mat.arredondar(maiorSalario, 2.0))
		escreva ("\nPercentual de pessoas com salário até R$100,00: " +  Mat.arredondar((menosQueCem / AMOSTRA_DE_PESQUISA * 100), 0.0) + "%")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 943; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */