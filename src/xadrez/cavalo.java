package xadrez;
import java.lang.Math;
public class cavalo extends pecagenerica {
	cavalo(char coluna, char linha,char nome) {
		super(coluna, linha, nome);
	}
void movimentocavalo(Movimento acao) {
	int li=acao.afetadolinha,lf=acao.destinolinha,ci=acao.afetadocoluna,cf=acao.destinocoluna;
	int j=xadrez.tabuleiroxadrez.buscar(acao.destinocoluna,acao.destinolinha),i=xadrez.tabuleiroxadrez.buscar(acao.afetadocoluna,acao.afetadolinha);
	if((Math.abs(lf-li)==2 && Math.abs(cf-ci)==1)||(Math.abs(lf-li)==1 && Math.abs(cf-ci)==2)) {
		if(xadrez.tabuleiroxadrez.tab[j].nome=='-') {
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		else if(xadrez.tabuleiroxadrez.tab[i].nome=='H'&& (int)xadrez.tabuleiroxadrez.tab[j].nome>91) {
			xadrez.tabuleiroxadrez.removepeca(j);
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		else if(xadrez.tabuleiroxadrez.tab[i].nome=='h'&& (int)xadrez.tabuleiroxadrez.tab[j].nome<91) {
			xadrez.tabuleiroxadrez.removepeca(j);
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		}
	}
}