package Interpol;

public interface IPolicia {
	public String getnome(); // retorna o nome do policial (vermelho, verde, amarelo ou azul)
	public int getpos(); //retorna a posicao em que ele se encontra
	public void setpos(int posicao); // altera a estacao em que ele se encontra
	public void movement(int estacao,ITabuleiro t); //recebe a ordem de movimento do policial, se o movimento for possivel ele se move
	public boolean getcaptura(); //verifica se aquela peca capturou o mister x
	public void setcaptura(); // define que aquela peca capturou o misterx
}
