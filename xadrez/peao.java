package xadrez;

public class peao extends pecagenerica{
	boolean primeiromovimento;
	peao(char coluna, char linha,char nome) {
		super(coluna, linha, nome);
		this.primeiromovimento=true;
	}
void movimentopeao(Movimento acao) {
	int j=xadrez.tabuleiroxadrez.buscar(acao.destinocoluna,acao.destinolinha),i=xadrez.tabuleiroxadrez.buscar(acao.afetadocoluna,acao.afetadolinha);
	peao p=(peao)xadrez.tabuleiroxadrez.tab[i];
	if(xadrez.tabuleiroxadrez.tab[i].nome=='p') {
		if(acao.destinolinha>acao.afetadolinha && acao.afetadocoluna==acao.destinocoluna) {/* se move para frente*/
			if(acao.destinolinha-acao.afetadolinha==1) { /*move uma casa*/
				if(xadrez.tabuleiroxadrez.tab[j].nome=='-') {
					p.primeiromovimento=false;
					xadrez.tabuleiroxadrez.trocaposicao(i, j);}}
			else if(acao.destinolinha-acao.afetadolinha==2 && p.primeiromovimento==true) { /*move duas casas*/
				p.primeiromovimento=false;
				int k=xadrez.tabuleiroxadrez.buscar(acao.destinocoluna,(char)(((int)acao.destinolinha)-1));
				if(xadrez.tabuleiroxadrez.tab[j].nome=='-'&& xadrez.tabuleiroxadrez.tab[k].nome=='-') {
					xadrez.tabuleiroxadrez.trocaposicao(i, j);}}}
		else if(acao.destinolinha-acao.afetadolinha==1 && acao.afetadocoluna!=acao.destinocoluna && (int)xadrez.tabuleiroxadrez.tab[j].nome<91) {
			p.primeiromovimento=false;
			xadrez.tabuleiroxadrez.removepeca(j);
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		}
	else if(xadrez.tabuleiroxadrez.tab[i].nome=='P') {
		if(acao.destinolinha<acao.afetadolinha && acao.afetadocoluna==acao.destinocoluna) {
			if(acao.afetadolinha-acao.destinolinha==1 && xadrez.tabuleiroxadrez.tab[j].nome=='-') {
				p.primeiromovimento=false;
				xadrez.tabuleiroxadrez.trocaposicao(i, j);}
			else if(acao.afetadolinha-acao.destinolinha==2 && p.primeiromovimento==true) {
				p.primeiromovimento=false;
				int k=xadrez.tabuleiroxadrez.buscar(acao.destinocoluna,(char)(((int)acao.destinolinha)+1));
				if(xadrez.tabuleiroxadrez.tab[j].nome=='-'&& xadrez.tabuleiroxadrez.tab[k].nome=='-') {
					xadrez.tabuleiroxadrez.trocaposicao(i, j);}}}
		else if(acao.afetadolinha-acao.destinolinha==1 && acao.afetadocoluna!=acao.destinocoluna && (int)xadrez.tabuleiroxadrez.tab[j].nome>91) {
			p.primeiromovimento=false;
			xadrez.tabuleiroxadrez.removepeca(j);
			xadrez.tabuleiroxadrez.trocaposicao(i, j);}
		}
	}
}