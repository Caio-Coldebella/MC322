package restaum;

public class pecas {
	char EspacoOcupado;
	String Nome;
	pecas(char EspacoOcupado,String Nome){
		this.EspacoOcupado=EspacoOcupado;
		this.Nome=Nome;
	}
	void desocupar() {
		EspacoOcupado='-';}
	void ocupar() {
		EspacoOcupado='P';
	}
}
