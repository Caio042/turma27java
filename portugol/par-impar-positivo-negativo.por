/*Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/

programa
{
	
	funcao inicio()
	{
		inteiro numero = 0

		escreva("Digite um número\n")
		leia (numero)

		//par
		se ( numero % 2 == 0){
			//positivo
			se (numero >= 0) {
				escreva ("numero: " + numero + " é par e positivo")
			}
			//negativo
			senao {
				escreva ("numero: " + numero + " é par e negativo")
			}
		}
		//impar
		senao{
			//positivo
			se (numero >= 0) {
				escreva ("numero: " + numero + " é impar e positivo")
			}
			//negativo
			senao {
				escreva ("numero: " + numero + " é impar e negativo")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */