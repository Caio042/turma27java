/*Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/

programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		inteiro numero1, numero2, numero3, numero4

		escreva ("Digite o 1º número\n")
		leia (numero1)
		escreva ("Digite o 2º número\n")
		leia (numero2)
		escreva ("Digite o 3º número\n")
		leia (numero3)
		escreva ("Digite o 4º número\n")
		leia (numero4)

		se (Mat.potencia(numero3,2.0) >= 1000) {
			escreva ("numero: " + numero3 + " ao quadrado: " + Mat.potencia(numero3,2.0))
		}
		senao {
			escreva ("numero 1: " + numero1 + " ao quadrado: " + Mat.potencia(numero1,2.0))
			escreva ("\nnumero 2: " + numero2 + " ao quadrado: " + Mat.potencia(numero2,2.0))
			escreva ("\nnumero 3: " + numero3 + " ao quadrado: " + Mat.potencia(numero3,2.0))
			escreva ("\nnumero 4: " + numero4 + " ao quadrado: " + Mat.potencia(numero4,2.0))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */