package xadrez;

public class Transforma extends objetodecomando{
	public char transformar;
	public Transforma(char afetadocoluna,char afetadolinha,char transformar) {
		super(afetadocoluna,afetadolinha);
		this.transformar=transformar;
	}
}
