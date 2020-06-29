package Interpol;

public interface ITabuleiro {
	public void criatabuleiro(); // cria todas as estacoes do jogo, e define seus vizinhos
	public void moverpolicia(int origem, int destino, Policia p); // recebe a ordem de movimento do policial e altera sua posicao no tabuleiro
	public void movermisterx(int origem, int destino,IMisterX mx); // recebe a ordem de movimento do misterx e altera sua posicao no tabuleiro
	// movermisterx tamebm verifica o transporte utilizado pelo mesmo
	public int buscaposicao(Estacao casa);// recebe uma estacao e retorna o indice correspondente aquela estacao
}
