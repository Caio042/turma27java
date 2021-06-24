/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.*/

programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{

		cadeia codigo
		const real VALOR_HORA_TRABALHADA = 10.00, VALOR_HORA_EXCEDENTE = 20.00
		const inteiro LIMITE_HORAS = 50
		real salario = 0.0, salarioExcedente = 0.0, salarioTotal = 0.0
		inteiro horas = 0, hExcedentes = 0
		escreva("Digite o código do operário\n")
		leia (codigo)

		escreva ("Digite a quantidade de horas trabalhadas\n")
		leia (horas)

		se (horas > LIMITE_HORAS){
			hExcedentes = horas - LIMITE_HORAS
			salario = LIMITE_HORAS * VALOR_HORA_TRABALHADA
		}
		senao {
			salario = horas * VALOR_HORA_TRABALHADA
		}

		
		salarioExcedente = hExcedentes * VALOR_HORA_EXCEDENTE
		salarioTotal = salario + salarioExcedente

		escreva ("Funcionario código: " + codigo) 
		escreva ("\nSalario base: R$ " + Matematica.arredondar(salario, 2))
		escreva ("\nsalario excedente: R$ " + Matematica.arredondar(salarioExcedente,2) + " (com base em " + hExcedentes + " horas excedentes)")
		escreva ("\nSalario total: " + Matematica.arredondar(salarioTotal,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */