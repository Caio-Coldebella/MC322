package Interpol;

import java.util.Random;
public class mainwindow {
	public static String verificamovimento() throws Exception {
		throw new movimentoinvalido("Esse movimento eh invalido, tente outro");
	}
	public static int str=-1; // variavel que dira para qual casa cada peca se movera
	public static thread tt= new thread(); // inicia um objeto do tipo thread
	public static void main(String[] args) {
		windowbotao wb=new windowbotao();// cria a janela principal
		Imagem img=new Imagem(); // cria um objeto imagem
		wb.adicionaImagem(img.imagem("tabuleiro.png"));// adiciona a imagem tabuleiro ao fundo da janela
		ITabuleiro t=new Tabuleiro();// cria o tabuleiro contendo as estacoes
		IMisterX mx;// cria o mister x
		IPolicia vermelho;// cria os policiais
		IPolicia verde;
		IPolicia amarelo;
		IPolicia azul;
		int posatual=-1;
		t.criatabuleiro();// funcao chamada para criar as estacoes do tabuleiro e definir seus vizinhos
		IRodadas r=new Rodadas(1);// cria um objeto rodadas
		Random rand=new Random();// cria um random para sortear as casas onde cada peca ira comecar
		int[] listapos= {-1,-1,-1,-1,-1};// lista com a posicao inicial de cada peca
		int randint=-1;
		for(int i=0;i<5;i++) {
			do {
			randint=rand.nextInt(49);// gerando casas iniciais diferentes para cada peca
			}while(randint==listapos[0] || randint==listapos[1] || randint==listapos[2] || randint==listapos[3]);
			listapos[i]=randint;// se certifica que cada peca ira comecar em uma estacao diferente
		}
		mx=new MisterX(listapos[0]);// adiciona o misterx na posicao inicial
		vermelho= new Policia(listapos[1],"vermelho");// adiciona o policial vermelho na posicao inicial e torna o botao referente a essa posicao vermelho
		Interpol.windowbotao.alteracor(vermelho.getpos(),"vermelho");
		verde= new Policia(listapos[2],"verde");
		Interpol.windowbotao.alteracor(verde.getpos(),"verde");
		amarelo= new Policia(listapos[3],"amarelo");
		Interpol.windowbotao.alteracor(amarelo.getpos(),"amarelo");
		azul= new Policia(listapos[4],"azul");
		Interpol.windowbotao.alteracor(azul.getpos(),"azul");
		while(r.getrodada()<13) {// o jogo roda ate a rodada 12
		wb.removelinha();// limpa o espaco de texto
		wb.inserelinha("Mova o policial vermelho");// orienta o jogador a realizar a acao
		posatual=vermelho.getpos();
		do {
		tt.tique();// indica para a thread que devera esperar um evento de algum botao
		// o botao altera a variavel str, referente a posicao para aonde a peca ira
		vermelho.movement(str, t);// ordem de movimento do vermelho
		if(vermelho.getpos()==posatual) {
			try {
				wb.inserelinha("Esse movimento eh invalido, tente outro");
				verificamovimento();
			} catch (Exception e) {
				e.printStackTrace();}}
		}while(posatual==vermelho.getpos());
		if(vermelho.getcaptura()) {// verifica se o vermelho capturou o misterx
			wb.removelinha();
			wb.inserelinha("Parabens, Voce Venceu!");// se sim, indica ao jogador
			Interpol.windowbotao.alteracor(mx.getpos(),"roxo");// mostra aonde estava misterx
			break;}
		// o mesmo procedimento ocorre com os outros policiais
		wb.removelinha();
		wb.inserelinha("Mova o policial verde");
		posatual=verde.getpos();
		do {
		tt.tique();// indica para a thread que devera esperar um evento de algum botao
		// o botao altera a variavel str, referente a posicao para aonde a peca ira
		verde.movement(str, t);// ordem de movimento do verde
		if(verde.getpos()==posatual) {
			try {
				wb.inserelinha("Esse movimento eh invalido, tente outro");
				verificamovimento();
			} catch (Exception e) {
				e.printStackTrace();}}
		}while(posatual==verde.getpos());
		if(verde.getcaptura()) {
			wb.removelinha();
			wb.inserelinha("Parabens, Voce Venceu!");
			Interpol.windowbotao.alteracor(mx.getpos(),"roxo");
			break;}
		wb.removelinha();
		wb.inserelinha("Mova o policial amarelo");
		posatual=amarelo.getpos();
		do {
		tt.tique();// indica para a thread que devera esperar um evento de algum botao
		// o botao altera a variavel str, referente a posicao para aonde a peca ira
		amarelo.movement(str, t);// ordem de movimento do amarelo
		if(amarelo.getpos()==posatual) {
			try {
				wb.inserelinha("Esse movimento eh invalido, tente outro");
				verificamovimento();
			} catch (Exception e) {
				e.printStackTrace();}}
		}while(posatual==amarelo.getpos());
		if(amarelo.getcaptura()) {
			wb.removelinha();
			wb.inserelinha("Parabens, Voce Venceu!");
			Interpol.windowbotao.alteracor(mx.getpos(),"roxo");
			break;}
		wb.removelinha();
		wb.inserelinha("Mova o policial azul");
		posatual=azul.getpos();
		do {
		tt.tique();// indica para a thread que devera esperar um evento de algum botao
		// o botao altera a variavel str, referente a posicao para aonde a peca ira
		azul.movement(str, t);// ordem de movimento do azul
		if(azul.getpos()==posatual) {
			try {
				wb.inserelinha("Esse movimento eh invalido, tente outro");
				verificamovimento();
			} catch (Exception e) {
				e.printStackTrace();}}
		}while(posatual==azul.getpos());	
		if(azul.getcaptura()) {
			wb.removelinha();
			wb.inserelinha("Parabens, Voce Venceu!");
			Interpol.windowbotao.alteracor(mx.getpos(),"roxo");
			break;}
		Interpol.windowbotao.alteracor(mx.getpos(),"branco");// limpa a posicao aonde mister x estava
		mx.random(t,azul);// move o misterx
		wb.adicionatransp(mx.gettransp());// adiciona a figura do meio de transporte utilizado pelo misterx
		if(r.revealposition()==true) {// verifica se o misterx deve revelar a sua posicao atual
			Interpol.windowbotao.alteracor(mx.getpos(),"roxo");
			if(r.getrodada()==12) {// verifica se o jogo acabou
				wb.removelinha();
				wb.inserelinha("Mister X fugiu, tente novamente");}// se acabou, diz ao jogador que misterx perdeu
			}
		r.incrodada();// aumenta a rodada em 1
		}
	}
}
