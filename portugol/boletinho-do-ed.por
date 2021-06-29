/*Boletinho do Ed*/

programa
{
	
	funcao inicio()
	{

		cadeia nomes[4]
		real notas[4]
		cadeia nomeDigitado

		para (inteiro i = 0; i < 4; i++){

			escreva("Digite o nome do " + (i + 1) + "º aluno: ")
			leia (nomes[i])
			
			escreva("Digite a nota do " + (i + 1) + "º aluno: ")
			leia (notas[i])
		}

		limpa()
		
		para (inteiro i = 0; i < 4; i++){
			escreva ("\nOi " + nomes[i] + "\t sua nota é " + notas[i])
			se ( notas[i] < 5){
				escreva (" - ainda não, estude mais")
			}
			senao {
				escreva (" - aprovado, continue o bom trabalho")
			}
		}
		

		/*adicionado a funcionalidade de pesquisar pelo nome do aluno*/
		
		escreva ("\nNota do aluno desejado : ")
		leia (nomeDigitado)

		limpa()
		
		para (inteiro i = 0; i < 4; i++){
			se (nomeDigitado == nomes[i]){
				escreva ("Oi " + nomes[i] + " sua nota é : " + notas[i])
				pare
			}
			se( i == 3 e nomeDigitado != nomes[i]){
				escreva ("aluno não encontrado")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 504; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */