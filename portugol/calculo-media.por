/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3, media
		
		escreva("Digite a primeira nota\n")
		leia (nota1)
		escreva("Digite a segunda nota\n")
		leia (nota2)
		escreva("Digite a terceira nota\n")
		leia (nota3)

		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10

		escreva ("A media das notas é " + media +"\nPeso das notas:\nPrimeira nota: peso 2\nSegunda nota: peso 3\nTerceira nota: peso 5")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */