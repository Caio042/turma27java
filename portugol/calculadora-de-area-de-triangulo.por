/*Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.*/

programa
{
	
	funcao inicio()
	{
		real base = 0.0, altura = 0.0, area = 0.0
		escreva ("Digite a base do triangulo: ")
		leia (base)
		escreva ("Digite a altura do triangulo: ")
		leia (altura)

		se (base > 0 e altura > 0){
			area = base * altura / 2
			escreva ("área do triangulo: " + area)
		}
		senao {
			escreva ("valores do triangulo inválidos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */