package Interpol;

public class EstTaxi implements Estacao{
	private String ocupada;//definira se a casa esta ocupada e por qual peca
	private Estacao[] vizinhanca= new Estacao[1];
	EstTaxi(){
		this.ocupada="nao";
		vizinhanca[0]=null;}
	public void setOcupada(String ocup) {
		ocupada=ocup;
	}
	public void addvizinho(Estacao vizinho) {
		if(vizinhanca.length==1 && vizinhanca[0]==null) {
			vizinhanca[0]=vizinho;}
		else {
			int i= 1+ vizinhanca.length;
			Estacao[] aux= new Estacao[i];
			for(int j=0;j<vizinhanca.length;j++) {
				aux[j]=vizinhanca[j];}
			aux[i-1]=vizinho;
			vizinhanca=aux;}}
	public String getOcupada() {
		return ocupada;
	}
	public Estacao[] getvizinhanca() {
		return vizinhanca;
	}
}
