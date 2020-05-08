package xadrez;

public class CSVConverter extends CSVReader {
	public CSVConverter() {
		super();
		}
	objetodecomando[] conversao(String[] commands) {
		int l=commands.length,i;
		int n=0;
		objetodecomando lista[]= new objetodecomando[2*l];
		for(i=0;i<l;i++) {
			if(commands[i].length()>1) {
				char afetadocoluna=commands[i].charAt(0);
				char afetadolinha=commands[i].charAt(1);
				char destinocoluna=commands[i].charAt(3);
				char destinolinha=commands[i].charAt(4);
				Movimento a=new Movimento(afetadocoluna,afetadolinha,destinocoluna,destinolinha);
				lista[n]=a;
				n++;}
			else if(commands[i].length()==1){
				char trans=commands[i].charAt(0);
				char afetadocoluna=commands[i-1].charAt(3);
				char afetadolinha=commands[i-1].charAt(4);
				Transforma b=new Transforma(afetadocoluna,afetadolinha,trans);
				lista[n]=b;
				n++;}
			}
		Movimento x=new Movimento('p','0','p','0');
		lista[n]=x;
		return lista;
	}
}
