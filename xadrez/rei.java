package xadrez;
import java.lang.Math;
public class rei extends pecagenerica{

	rei(char coluna, char linha,char nome) {
		super(coluna, linha,nome);
	}
void movimentorei(Movimento acao) {
	int li=acao.afetadolinha,lf=acao.destinolinha,ci=acao.afetadocoluna,cf=acao.destinocoluna;
	int j=xadrez.tabuleiroxadrez.buscar(acao.destinocoluna,acao.destinolinha),i=xadrez.tabuleiroxadrez.buscar(acao.afetadocoluna,acao.afetadolinha);
	if((li==lf && Math.abs(ci-cf)==1)||(ci==cf && Math.abs(li-lf)==1)||(Math.abs(li-lf)==1 && Math.abs(ci-cf)==1)) {
		if(xadrez.tabuleiroxadrez.tab[j].nome=='-') {
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		else if(xadrez.tabuleiroxadrez.tab[i].nome=='k'&& (int)xadrez.tabuleiroxadrez.tab[j].nome<91) {
			xadrez.tabuleiroxadrez.removepeca(j);
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		else if(xadrez.tabuleiroxadrez.tab[i].nome=='K'&& (int)xadrez.tabuleiroxadrez.tab[j].nome>91) {
			xadrez.tabuleiroxadrez.removepeca(j);
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
	}
	}
}
