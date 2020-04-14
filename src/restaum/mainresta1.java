package restaum;

public class mainresta1 {
	public static void main(String args[]) {
		CSVReader csv = new CSVReader();
		csv.setDataSource("MC322/src/restaum/Entrada.csv");
		String commands[] = csv.requestCommands();
		//************************************************
		tabuleiro tab= new tabuleiro();
		tab.crialista();
		System.out.println("Tabuleiro inicial:");
		tab.imprime();
		int l=commands.length,i;
		String str;
		for(i=0;i<l;i++) {
			str=commands[i];
			char data1[]= {str.charAt(0),str.charAt(1)};
			char data2[]= {str.charAt(3),str.charAt(4)};
			String ini = new String(data1);
			String fim = new String(data2);
			pecas a=tab.lista[tab.comparar(ini)];
			pecas b=tab.lista[tab.comparar(fim)];
			tab.mover(a,b);
		}
	}
}