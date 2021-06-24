/*Desenvolva um programa que recebe o nome da pessoa e o ano em que nasceu
Calcule a idade da pessoa e 
se ela tiver mais de 35 anos exiba na tela que ela é cringe */

programa
{
	
	funcao inicio()
	{
		inteiro idade, ano
		cadeia nome

		escreva ("Digite seu nome\n")
		leia (nome)

		escreva ("Digite seu ano de nascimento\n")
		leia (ano)

		idade = 2021 - ano

		se (idade >= 35) {
			escreva (nome + ", sua idade é " + idade + ", você é cringe\n")
		}
		senao {
			escreva (nome + ", sua idade é " + idade + ", você não é cringe\n")
		}

		escreva ("fim de programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 205; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */