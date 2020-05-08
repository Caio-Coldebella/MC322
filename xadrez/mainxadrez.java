package xadrez;
public class mainxadrez {
	public static void main(String args[]) {
		CSVReader csv = new CSVReader();
		csv.setDataSource("/Caio-Coldebella/MC322/src/xadrez/Entrada.csv");
		String comandos[] = csv.requestCommands();
		CSVConverter csvc= new CSVConverter();
		objetodecomando commands[] = csvc.conversao(comandos);
		int i=0;
		tabuleiroxadrez tabuleiro=new tabuleiroxadrez();
		tabuleiro.criatab();
		System.out.println("Tabuleiro inicial:");
		tabuleiro.imprimir();
		while(commands[i].afetadocoluna!='p') {
			if(commands[i].getClass()==Transforma.class) {
				tabuleiro.transformar((Transforma)commands[i]);
				}
			else {
				tabuleiro.movimento((Movimento)commands[i]);
				}
			i++;
		}
	}
}
/*int j = Character.getNumericValue(afetadolinha);*/