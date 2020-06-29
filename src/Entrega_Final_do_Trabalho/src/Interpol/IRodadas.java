package Interpol;

public interface IRodadas {
	public int getrodada(); //verifica qual eh a rodada atual
	public void incrodada();// aumenta em 1 a rodada atual
	public boolean revealposition();// verifica se o misterx deve revelar sua posicao naquela rodada
}
