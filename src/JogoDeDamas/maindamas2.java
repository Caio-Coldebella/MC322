package JogoDeDamas;
import java.util.Scanner;
public class maindamas2 {
	public static void main(String args[]) {
		String commands[] =new String[39];
		commands[0]="c3 d4";
		commands[1]="b6 a5";
		commands[2]="g3 h4";
		commands[3]="a7yb6";
		commands[4]="b2 c3";
		commands[5]="h6 g5";
		commands[6]="c3:b2";
		commands[7]="f2 g3";
		commands[8]="d6 c5";
		commands[9]="d4 e5";
		commands[10]="f6 d4";
		commands[11]="d4 f2";
		commands[12]="g1 e3";
		commands[13]="c5 b4";
		commands[14]="c3 d4";
		commands[15]="b4 c3";
		commands[16]="g3 f4";
		commands[17]="c3 e5";
		commands[18]="e3 d4";
		commands[19]="g5 e3";
		commands[20]="d4 f2";
		commands[21]="e5 d4";
		commands[22]="h4 g5";
		commands[23]="d4 c3";
		commands[24]="g5 h6";
		commands[25]="g7 f6";
		commands[26]="a1 b2";
		commands[27]="f6 e5";
		commands[28]="h8 f6";
		commands[29]="h6 g7";
		commands[30]="g7 h8";
		commands[31]="b6 e3";
		commands[32]="e5 f4";
		commands[33]="h8 d4";
		commands[34]="c3 a1";
		commands[35]="a3 b4";
		commands[36]="a1 h8";
		commands[37]="h8 b2";
		commands[38]="b2 h8";
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
		Scanner teclado=null;
		i=0;
		while(i<50) {
			teclado= new Scanner(System.in);
			str = teclado.nextLine();
			char data1[]= {str.charAt(0),str.charAt(1)};
			char data2[]= {str.charAt(3),str.charAt(4)};
			String ini = new String(data1);
			String fim = new String(data2);
			tab.movimento(ini,fim);
			i++;
		}
		teclado.close();
	}
}
