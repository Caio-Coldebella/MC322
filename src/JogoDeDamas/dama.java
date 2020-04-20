package JogoDeDamas;

public class dama extends pecagenerica {
	dama(char tipo,String posicao){
		super(tipo,posicao);
		casta=2;
	}
	static void moverdama(dama ini,pecacomum fim) {
		if(ini.tipo=='B') {
			if(ini.posicao.charAt(1)<fim.posicao.charAt(1)) { // se moveu para frente
				if(fim.tipo=='-') {
						ini.tipo='-';
						fim.tipo='B';
						removerpecasdomeio(ini,fim);
						JogoDeDamas.tabuleiro.viroudama(fim);
						JogoDeDamas.tabuleiro.viroucomum(ini);
					}}
			if(ini.posicao.charAt(1)>fim.posicao.charAt(1)) { // se moveu para tras
				if(fim.tipo=='-') {
					ini.tipo='-';
					fim.tipo='B';
					removerpecasdomeio(ini,fim);
					JogoDeDamas.tabuleiro.viroudama(fim);
					JogoDeDamas.tabuleiro.viroucomum(ini);
					}}
			}
		if(ini.tipo=='P') {
			if(ini.posicao.charAt(1)<fim.posicao.charAt(1)) { // se moveu para frente (para comer uma peca)
				if(fim.tipo=='-') {
					ini.tipo='-';
					fim.tipo='P';
					removerpecasdomeio(ini,fim);
					JogoDeDamas.tabuleiro.viroudama(fim);
					JogoDeDamas.tabuleiro.viroucomum(ini);
					}}
			if(ini.posicao.charAt(1)>fim.posicao.charAt(1)) { // se moveu para tras
				if(fim.tipo=='-') {
					ini.tipo='-';
					fim.tipo='P';
					removerpecasdomeio(ini,fim);
					JogoDeDamas.tabuleiro.viroudama(fim);
					JogoDeDamas.tabuleiro.viroucomum(ini);
				}}}}
	static void removerpecasdomeio(dama ini,pecacomum fim) {
		if(ini.posicao.charAt(1)>fim.posicao.charAt(1)) {
			if(fim.posicao.codePointAt(0)>ini.posicao.codePointAt(0)) {
				int a,b=fim.posicao.codePointAt(0)-1;
				for(a=fim.posicao.charAt(1)+1;a<ini.posicao.charAt(1);a++) {
					char m[]= {(char)(b),(char)(a)};
					String pecameio = new String(m);
					int i;
					i=JogoDeDamas.tabuleiro.comparar(pecameio);
					JogoDeDamas.tabuleiro.lista[i].tipo='-';
					b--;
				}
			}
			if(ini.posicao.codePointAt(0)>fim.posicao.codePointAt(0)) {
				int a,b=fim.posicao.codePointAt(0)+1;
				for(a=fim.posicao.charAt(1)+1;a<ini.posicao.charAt(1);a++) {
					char m[]= {(char)(b),(char)(a)};
					String pecameio = new String(m);
					int i;
					i=JogoDeDamas.tabuleiro.comparar(pecameio);
					JogoDeDamas.tabuleiro.lista[i].tipo='-';
					b++;
				}
			}
		}
		if(fim.posicao.charAt(1)>ini.posicao.charAt(1)) {
			if(fim.posicao.codePointAt(0)>ini.posicao.codePointAt(0)) {
				int a,b=ini.posicao.codePointAt(0)+1;
				for(a=ini.posicao.charAt(1)+1;a<fim.posicao.charAt(1);a++) {
					char m[]= {(char)(b),(char)(a)};
					String pecameio = new String(m);
					int i;
					i=JogoDeDamas.tabuleiro.comparar(pecameio);
					JogoDeDamas.tabuleiro.lista[i].tipo='-';
					b++;}}
			if(ini.posicao.codePointAt(0)>fim.posicao.codePointAt(0)) {
				int a,b=ini.posicao.codePointAt(0)-1;
				for(a=ini.posicao.charAt(1)+1;a<fim.posicao.charAt(1);a++) {
					char m[]= {(char)(b),(char)(a)};
					String pecameio = new String(m);
					int i;
					i=JogoDeDamas.tabuleiro.comparar(pecameio);
					JogoDeDamas.tabuleiro.lista[i].tipo='-';
					b--;}}}
	}
}
