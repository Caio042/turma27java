programa
{
	
	funcao inicio()
	{
		//declaracao das variaveis necessarias
		inteiro idade, anoNascimento
		cadeia nome

		//ler e armazenar o nome do usuario na variavel
		escreva ("Digite seu nome\n")
		leia (nome)

		//ler e armazenar o ano de nascimento do usuario
		escreva ("\ndigite seu ano de nascimento\n")
		leia (anoNascimento)

		//calculo da idade (nao preciso)
		idade = 2021 - anoNascimento

		//Devolucao das informacoes
		escreva ("Olá " + nome + ", sua idade é : " + idade + " anos")
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