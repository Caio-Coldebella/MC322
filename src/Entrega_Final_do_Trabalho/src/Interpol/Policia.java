package Interpol;

public class Policia implements IPolicia{//recebe jogador recebe tabuleiro devolve tabuleiro
	private int pos;
	private String nome;
	private boolean captura;
	Policia(int pos,String nome){
		this.pos=pos;
		this.nome=nome;
		this.captura=false;
	}
	public int getpos() {
		return pos;
	}
	public String getnome() {
		return nome;
	}
	public boolean getcaptura() {
		return captura;
	}
	public void setcaptura() {
		captura=true;
	}
	public void setpos(int posicao) {
		pos=posicao;}
	public void movement(int estacao,ITabuleiro t) {
		boolean ehvizinho=false; //cria uma variavel para verificar se a estacao eh vizinha
		Estacao[] vizinhos=Tabuleiro.tab[getpos()].getvizinhanca();// recebe uma lista com os vizinhos
		int len=vizinhos.length;
		for(int i=0;i<len;i++) {
			if(t.buscaposicao(vizinhos[i])==estacao) {// verifica se a casa de destino esta na lista
				ehvizinho=true;}}
		if(ehvizinho) {
			t.moverpolicia(getpos(), estacao, Policia.this); // se esta na lista envia a ordem de movimento para o tabuleiro
			setpos(estacao);// altera a variavel da posicao da peca no proprio objeto
		}
	}
}
