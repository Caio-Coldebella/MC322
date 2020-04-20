package JogoDeDamas;

public class maindamas {
	public static void main(String args[]) {
		CSVReader csv = new CSVReader();
		csv.setDataSource("MC322/src/JogoDeDamas/Entrada.csv");
		String commands[] = csv.requestCommands();
		//**********
		tabuleiro tab= new tabuleiro();
		tab.crialista();
		System.out.println("Tabuleiro inicial:");
		tab.imprimir();
		int l=commands.length,i;
		String str;
		for(i=0;i<l;i++) {
			str=commands[i];
			char data1[]= {str.charAt(0),str.charAt(1)};
			char data2[]= {str.charAt(3),str.charAt(4)};
			String ini = new String(data1);
			String fim = new String(data2);
			tab.movimento(ini,fim);
		}
	}
}