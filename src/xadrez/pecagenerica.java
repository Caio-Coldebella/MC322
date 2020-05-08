package xadrez;

public class pecagenerica {
	char coluna;
	char linha;
	char nome;
	pecagenerica(char coluna,char linha,char nome){
		this.coluna=coluna;
		this.linha=linha;
		this.nome=nome;
	}
	public boolean linhalivre(Movimento acao) {
		int li=acao.afetadolinha,ci=acao.afetadocoluna,cf=acao.destinocoluna;
		int k,l,m;
		if(cf>ci) {
			k=ci+1;
			l=cf;
			for(m=k;m<l;m++) {
				int p=xadrez.tabuleiroxadrez.buscar((char)m, (char)li);
				if(xadrez.tabuleiroxadrez.tab[p].nome!='-') {
					return false;}}
			return true;}
		else if(ci>cf) {
			k=cf+1;
			l=ci;
			for(m=k;m<l;m++) {
				int p=xadrez.tabuleiroxadrez.buscar((char)m, (char)li);
				if(xadrez.tabuleiroxadrez.tab[p].nome!='-') {
					return false;}}
			return true;}
		return false;
	}
	public boolean colunalivre(Movimento acao) {
		int li=acao.afetadolinha,lf=acao.destinolinha,ci=acao.afetadocoluna;
		int k,l,m;
		if(lf>li) {
			k=li+1;
			l=lf;
			for(m=k;m<l;m++) {
				int p=xadrez.tabuleiroxadrez.buscar((char)ci, (char)m);
				if(xadrez.tabuleiroxadrez.tab[p].nome!='-') {
					return false;}}
			return true;}
		else if(li>lf) {
			k=lf+1;
			l=li;
			for(m=k;m<l;m++) {
				int p=xadrez.tabuleiroxadrez.buscar((char)ci, (char)m);
				if(xadrez.tabuleiroxadrez.tab[p].nome!='-') {
					return false;}}
			return true;}
		return false;
	}
	public boolean diagonallivre(Movimento acao) {
		int li=acao.afetadolinha,lf=acao.destinolinha,ci=acao.afetadocoluna,cf=acao.destinocoluna;
		int k,l,m,n;
		if(lf>li && cf>ci) {
			k=li+1;
			l=lf;
			n=ci+1;
			for(m=k;m<l;m++) {
				int p=xadrez.tabuleiroxadrez.buscar((char)n, (char)m);
				n++;
				if(xadrez.tabuleiroxadrez.tab[p].nome!='-') {
					return false;}}
			return true;}
		else if(lf>li && ci>cf) {
			k=li+1;
			l=lf;
			n=ci-1;
			for(m=k;m<l;m++) {
				int p=xadrez.tabuleiroxadrez.buscar((char)n, (char)m);
				n--;
				if(xadrez.tabuleiroxadrez.tab[p].nome!='-') {
					return false;}}
			return true;}
		else if(li>lf && cf>ci) {
			k=lf+1;
			l=li;
			n=ci+1;
			for(m=k;m<l;m++) {
				int p=xadrez.tabuleiroxadrez.buscar((char)n, (char)m);
				n++;
				if(xadrez.tabuleiroxadrez.tab[p].nome!='-') {
					return false;}}
			return true;}
		else if(li>lf && ci>cf) {
			k=lf+1;
			l=li;
			n=ci-1;
			for(m=k;m<l;m++) {
				int p=xadrez.tabuleiroxadrez.buscar((char)n, (char)m);
				n--;
				if(xadrez.tabuleiroxadrez.tab[p].nome!='-') {
					return false;}}
			return true;}
		return false;
	}
}