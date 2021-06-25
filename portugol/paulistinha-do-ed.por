/*Paulistinha do ED
4 VARIAVEIS NOME DE UM TIME DE SÃO PAULO
TIME1 = "CORINTHIANS"
TIME2="PALMEIRAS"
TIME3 = "SAO PAULO"
TIME4="SANTOS"
4 variaveis de pontos 
PONTOS1, PONTOS2, PONTOS3, PONTOS4

perguntar se o time ganhou, perdeu ou empatou
recebendo characteres 'g', 'p', 'e'
ganhar = 3 pontos
empate = 1 pontos
perda = 0 pontos

Após 4 rodadas exibir o resultado
*/
programa
{
	inclua biblioteca Tipos
	inclua biblioteca Texto
	
	funcao inicio()
	{
		const cadeia TIME_1 = "CORINTHIANS", TIME_2 = "PALMEIRAS", TIME_3 = "SAO PAULO", TIME_4 = "SANTOS"
		inteiro pontos1 = 0, pontos2 = 0, pontos3 = 0, pontos4 = 0
		caracter resultado = ' '

		escreva("GRUPO: ROOM 3 ")
		escreva("Gustavo Augusto, Jaque, Caroline, Caio Lima, Luan, Fabio e Marlon\n")

		para (inteiro i = 1; i <=4; i++){
			escreva ("RODADA " + i + "\n" + TIME_1 + " ganhou(G), empatou (E) ou perdeu (P)? ")
			leia (resultado)
			se (Texto.caixa_alta(Tipos.caracter_para_cadeia(resultado)) == "G"){
				pontos1 += 3
			} senao se (Texto.caixa_alta(Tipos.caracter_para_cadeia(resultado)) == "E"){
				pontos1++
			}
			escreva ("RODADA " + i + "\n" + TIME_2 + " ganhou(G), empatou (E) ou perdeu (P)? ")
			leia (resultado)
			se (Texto.caixa_alta(Tipos.caracter_para_cadeia(resultado)) == "G"){
				pontos2 += 3
			} senao se (Texto.caixa_alta(Tipos.caracter_para_cadeia(resultado)) == "E"){
				pontos2++
			}
			escreva ("RODADA " + i + "\n" + TIME_3 + " ganhou(G), empatou (E) ou perdeu (P)? ")
			leia (resultado)
			se (Texto.caixa_alta(Tipos.caracter_para_cadeia(resultado)) == "G"){
				pontos3 += 3
			} senao se (Texto.caixa_alta(Tipos.caracter_para_cadeia(resultado)) == "E"){
				pontos3++
			}
			escreva ("RODADA " + i + "\n" + TIME_4 + " ganhou(G), empatou (E) ou perdeu (P)? ")
			leia (resultado)
			se (Texto.caixa_alta(Tipos.caracter_para_cadeia(resultado)) == "G"){
				pontos4 += 3
			} senao se (Texto.caixa_alta(Tipos.caracter_para_cadeia(resultado)) == "E"){
				pontos4++
			}
		}
		
		escreva ("PLACAR\n")
		escreva (TIME_1 + " pontos: " + pontos1 + "\n")
		escreva (TIME_2 + " pontos: " + pontos2 + "\n")
		escreva (TIME_3 + " pontos: " + pontos3 + "\n")
		escreva (TIME_4 + " pontos: " + pontos4 + "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 364; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */