package xadrez;
import java.lang.Math;
public class bispo extends pecagenerica{

	bispo(char coluna, char linha,char nome) {
		super(coluna, linha, nome);
	}
void movimentobispo(Movimento acao) {
	int li=acao.afetadolinha,lf=acao.destinolinha,ci=acao.afetadocoluna,cf=acao.destinocoluna;
	int j=xadrez.tabuleiroxadrez.buscar(acao.destinocoluna,acao.destinolinha),i=xadrez.tabuleiroxadrez.buscar(acao.afetadocoluna,acao.afetadolinha);
	if(Math.abs(lf-li)==Math.abs(cf-ci)&& super.diagonallivre(acao)) {
		if(xadrez.tabuleiroxadrez.tab[j].nome=='-') {
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		else if(xadrez.tabuleiroxadrez.tab[i].nome=='b'&& (int)xadrez.tabuleiroxadrez.tab[j].nome<91) {
			xadrez.tabuleiroxadrez.removepeca(j);
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		else if(xadrez.tabuleiroxadrez.tab[i].nome=='B'&& (int)xadrez.tabuleiroxadrez.tab[j].nome>91) {
			xadrez.tabuleiroxadrez.removepeca(j);
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		}	
	}
}
