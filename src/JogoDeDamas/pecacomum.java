package JogoDeDamas;

public class pecacomum extends pecagenerica {
	pecacomum(char tipo,String posicao){
		super(tipo, posicao);
		casta=1;
	}
	static void movercomum(pecacomum ini,pecacomum fim) {
		if(ini.tipo=='B') {
			if(ini.posicao.charAt(1)<fim.posicao.charAt(1)) { // se moveu para frente
				if(fim.posicao.charAt(1)-ini.posicao.charAt(1)==1) {//se moveu para ocupar uma casa
					if(fim.tipo=='-') {
						ini.tipo='-';
						fim.tipo='B';
					}}
				if(fim.posicao.charAt(1)-ini.posicao.charAt(1)==2) {//se moveu para comer uma peca
					if(fim.tipo=='-') {
						ini.tipo='-';
						fim.tipo='B';
						removercomumdomeio(ini,fim);
						}}}
			if(ini.posicao.charAt(1)>fim.posicao.charAt(1)) { // se moveu para tras (para comer uma peca)
				if(ini.posicao.charAt(1)-fim.posicao.charAt(1)==2) {
					if(fim.tipo=='-') {
						ini.tipo='-';
						fim.tipo='B';
						removercomumdomeio(ini,fim);
						}}
				}
			}
		if(ini.tipo=='P') {
			if(ini.posicao.charAt(1)<fim.posicao.charAt(1)) { // se moveu para frente (para comer uma peca)
				if(fim.posicao.charAt(1)-ini.posicao.charAt(1)==2) {
					if(fim.tipo=='-') {
						ini.tipo='-';
						fim.tipo='P';
						removercomumdomeio(ini,fim);
						}}}
			if(ini.posicao.charAt(1)>fim.posicao.charAt(1)) { // se moveu para tras
				if(ini.posicao.charAt(1)-fim.posicao.charAt(1)==1) {
					if(fim.tipo=='-') {
						ini.tipo='-';
						fim.tipo='P';}}
				if(ini.posicao.charAt(1)-fim.posicao.charAt(1)==2) {
					if(fim.tipo=='-') {
						ini.tipo='-';
						fim.tipo='P';
						removercomumdomeio(ini,fim);
						}}}}
				}
	static void removercomumdomeio(pecacomum ini,pecacomum fim) {
		char m[]= {(char)((ini.posicao.codePointAt(0)+fim.posicao.codePointAt(0))/2),(char)((ini.posicao.charAt(1)+fim.posicao.charAt(1))/2)};
		String pecameio = new String(m);
		int i;
		i=JogoDeDamas.tabuleiro.comparar(pecameio);
		JogoDeDamas.tabuleiro.lista[i].tipo='-';
	}
}
