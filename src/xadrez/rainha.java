package xadrez;
import java.lang.Math;
public class rainha extends pecagenerica{

	rainha(char coluna,char linha,char nome) {
		super(coluna, linha, nome);
	}
void movimentorainha(Movimento acao) {
	int li=acao.afetadolinha,lf=acao.destinolinha,ci=acao.afetadocoluna,cf=acao.destinocoluna;
	int j=xadrez.tabuleiroxadrez.buscar(acao.destinocoluna,acao.destinolinha),i=xadrez.tabuleiroxadrez.buscar(acao.afetadocoluna,acao.afetadolinha);
	if((ci==cf && super.colunalivre(acao))||(li==lf && super.linhalivre(acao))||(Math.abs(lf-li)==Math.abs(cf-ci)&& super.diagonallivre(acao))) {
		if(xadrez.tabuleiroxadrez.tab[j].nome=='-') {
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		else if(xadrez.tabuleiroxadrez.tab[i].nome=='q'&& (int)xadrez.tabuleiroxadrez.tab[j].nome<91) {
			xadrez.tabuleiroxadrez.removepeca(j);
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		else if(xadrez.tabuleiroxadrez.tab[i].nome=='Q'&& (int)xadrez.tabuleiroxadrez.tab[j].nome>91) {
			xadrez.tabuleiroxadrez.removepeca(j);
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		}
	}
}
