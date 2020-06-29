package Interpol;
import java.util.Random;

public class MisterX implements IMisterX{ //recebe tabuleiro devolve tabuleiro
	private int pos;
	private Estacao[] vizinhosvazios;
	private Estacao[] vizinhoscomvizinhosvazios;
	private String transporte;
	MisterX(int pos){
		this.pos=pos;
		this.transporte=null;
	}
	public int getpos() {
		return pos;}
	public void setpos(int posicao) {
		pos=posicao;
	}
	public String gettransp() {
		return transporte;}
	public void settransp(String transporte) {
		this.transporte=transporte;}
	
	public void addvizinhovazio(Estacao vizinho) {// chamada pela funcao random
		// adicionaestacoes a lista vizinhosvazios
		if(vizinhosvazios[0]!=null) {
			int leng=vizinhosvazios.length;
			Estacao[] aux= new Estacao[leng+1];
			for(int i=0;i<leng;i++) {
				aux[i]=vizinhosvazios[i];}
			aux[leng]=vizinho;
			vizinhosvazios=aux;}
		else {
		vizinhosvazios[0]=vizinho;}}
	
	public void addvizinhoscomvizinhosvazios(Estacao vizinho) { //chamada pela funcao random
		// adiciona estacoes a lista vizinhoscomvizinhosvazios
		if(vizinhoscomvizinhosvazios[0]!=null) {
			int leng=vizinhoscomvizinhosvazios.length;
			Estacao[] aux= new Estacao[leng+1];
			for(int i=0;i<leng;i++) {
				aux[i]=vizinhoscomvizinhosvazios[i];}
			aux[leng]=vizinho;
			vizinhoscomvizinhosvazios=aux;}
		else {
		vizinhoscomvizinhosvazios[0]=vizinho;}}
	
	public boolean vizinhancaocupada(Estacao casa) { //chamada pela funcao random
		Estacao[] viz=casa.getvizinhanca();// cria uma lista com a vizinhanca da estacao
		int l=viz.length;
		for(int i=0;i<l;i++) {
			if(viz[i].getOcupada()!="nao" && viz[i].getOcupada()!="misterx") {// se seus vizinhos estao ocupados por pecas diferentes do misterx, retorna true (possui vizinhos ocupados)
				return true;}}
		return false;}// se nao possui nenhum vizinho ocupado por pecas diferente do misterx retorna false (nao possui vizinhos ocupados)
	
	public void random(ITabuleiro t,IPolicia p) {
		int a=getpos();// a=posicao do mister x
		Estacao[] vizinhos=Interpol.Tabuleiro.tab[a].getvizinhanca();//coloca os vizinhos em uma lista
		int len=vizinhos.length;
		vizinhosvazios=null; //cria uma lista com vizinhos vazios
		vizinhosvazios=new Estacao[1];// define a lista como tamanho 1
		for(int j=0;j<len;j++) {
			if(vizinhos[j].getOcupada()=="nao") {// se o vizinho esta vazio adiciona na lista dos vizinhos vazios
				addvizinhovazio(vizinhos[j]);}}// chama a funcao que adiciona um vizinho a lista vizinhos vazios
		len=vizinhosvazios.length;// atualiza len para o tamanho dos vizinhos vazios
		if(len==1 && vizinhosvazios[0]==null) {// se nenhum vizinho estiver vazio, significa que a peca nao tem para onde ir e vai ser capturada
			p.setcaptura();
			return;}
		if(len==1) {// se tiver apenas um vizinho vazio a peca se move para esse vizinho
			Estacao destino=vizinhosvazios[0];
			int indice=t.buscaposicao(destino);
			t.movermisterx(a,indice, MisterX.this);
			setpos(indice);
			return;}
		// se tiver mais de um vizinho vazio, verifica quais desses vizinhos tem toda a sua vizinha vazia (exceto pelo misterx)
		vizinhoscomvizinhosvazios=null;
		vizinhoscomvizinhosvazios=new Estacao[1];
		for(int j=0;j<len;j++) {
			if(vizinhancaocupada(vizinhosvazios[j])==false) { // chama a funcao para verificar se esta estacao possui vizinhanca totalmente vazia
				addvizinhoscomvizinhosvazios(vizinhosvazios[j]);}} // se possuir adiciona a estacao na lista vizinhoscomvizinhosvazios
		len=vizinhoscomvizinhosvazios.length; // atualiza len
		if(len==1 && vizinhoscomvizinhosvazios[0]==null) {// se nenhum vizinho possuir vizinhanca vazia eh sorteado uma estacao da lista vizinhosvazios
			len=vizinhosvazios.length; // atualiza len
			int randint;
			Random r=new Random();
			randint=r.nextInt(len);// sorteia atraves da funcao random
			Estacao destino=vizinhosvazios[randint];
			int indice=t.buscaposicao(destino);
			t.movermisterx(a,indice, MisterX.this);
			setpos(indice);
			return;}
		if(len==1) { // se so ha um vizinho com vizinhanca vazia a peca se move para la
			Estacao destino=vizinhoscomvizinhosvazios[0];
			int indice=t.buscaposicao(destino);
			t.movermisterx(a,indice, MisterX.this);
			setpos(indice);
			return;}
		// se ha mais de um vizinho com vizinhanca vazia, eh realizado um sorteio entre as estacoes da lista vizinhoscomvizinhosvazios
		int randint;
		Random r=new Random();
		randint=r.nextInt(len);
		Estacao destino=vizinhoscomvizinhosvazios[randint];
		int indice=t.buscaposicao(destino);
		t.movermisterx(a,indice, MisterX.this);
		setpos(indice);
		}
}