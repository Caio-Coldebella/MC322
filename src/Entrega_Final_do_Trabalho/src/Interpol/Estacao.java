package Interpol;

public interface Estacao {
	public String getOcupada(); // verifica se a estacao do tabuleiro esta ocupada e por qual peca
	public void setOcupada(String ocup); // altera o estado de ocupacao de uma estacao no tabuleiro
	public Estacao[] getvizinhanca(); // devolve uma lista com todas as estacoes vizinhas de uma estacao
	public void addvizinho(Estacao vizinho); //adiciona uma estacao vizinha a uma estacao
}
