package Interpol;

public class Rodadas implements IRodadas{
	private int rodada;
	Rodadas(int rodada){
		this.rodada=rodada;}
	public int getrodada() {
		return rodada;}
	public void incrodada() {
		rodada++;}
	public boolean revealposition() {// verifica se o mister x deve revelar sua posicao nesta rodada
		if(rodada==2 || rodada==6 || rodada==10 || rodada==12)
			return true;
		else 
			return false;}
}
