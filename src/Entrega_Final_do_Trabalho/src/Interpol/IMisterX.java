package Interpol;

public interface IMisterX {
	public int getpos(); // devolve a posicao do misterx
	public void setpos(int posicao); // altera a posicao do misterx
	public void random(ITabuleiro t,IPolicia p); // funcao que faz o misterx se mover pelo tabuleiro
	public String gettransp(); // retorna o meio de transporte utilizado pelo mister x naquela rodada
	public void settransp(String transporte); // define o meio de transporte utilizado pelo mister x naquela rodada
}
