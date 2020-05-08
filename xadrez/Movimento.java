package xadrez;

public class Movimento extends objetodecomando {
	public char destinocoluna;
	public char destinolinha;
	public Movimento(char afetadocoluna,char afetadolinha,char destinocoluna,char destinolinha) {
		super(afetadocoluna,afetadolinha);
		this.destinocoluna=destinocoluna;
		this.destinolinha=destinolinha;
	}
}
