/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/

programa
{
	
	funcao inicio()
	{
		
		inteiro idade
		const inteiro INFANTIL_A_MIN = 5, INFANTIL_A_MAX = 7, INFANTIL_B_MIN = 8, INFANTIL_B_MAX = 11
		const inteiro JUVENIL_A_MIN = 12, JUVENIL_A_MAX = 13, JUVENIL_B_MIN = 14, JUVENIL_B_MAX = 17
		const inteiro ADULTO = 18
		cadeia classificacao = "Muito novo/a para uma classificação"
		
		escreva("Digite a idade do nadador/a: \n")
		leia (idade)
		
		se (idade >= INFANTIL_A_MIN e idade <= INFANTIL_A_MAX){
			classificacao = "Nadador/a Infantil A"
		}

		se (idade >= INFANTIL_B_MIN e idade <= INFANTIL_B_MAX){
			classificacao = "Nadador/a Infantil B"
		}

		se (idade >= JUVENIL_A_MIN e idade <= JUVENIL_A_MAX){
			classificacao = "Nadador/a Juvenil A"
		}

		se (idade >= JUVENIL_B_MIN e idade <= JUVENIL_B_MAX){
			classificacao = "Nadador/a Juvenil B"
		}

		se (idade >= ADULTO){
			classificacao = "Nadador/a Adulto"
		}

		escreva (classificacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1103; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */