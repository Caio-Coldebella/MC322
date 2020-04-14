package restaum;

public class tabuleiro {
	pecas lista[]= new pecas[33];
	void crialista() {
		lista[0]=new pecas('P',"c7");
		lista[1]=new pecas('P',"d7");
		lista[2]=new pecas('P',"e7");
		lista[3]=new pecas('P',"c6");
		lista[4]=new pecas('P',"d6");
		lista[5]=new pecas('P',"e6");
		lista[6]=new pecas('P',"a5");
		lista[7]=new pecas('P',"b5");
		lista[8]=new pecas('P',"c5");
		lista[9]=new pecas('P',"d5");
		lista[10]=new pecas('P',"e5");
		lista[11]=new pecas('P',"f5");
		lista[12]=new pecas('P',"g5");
		lista[13]=new pecas('P',"a4");
		lista[14]=new pecas('P',"b4");
		lista[15]=new pecas('P',"c4");
		lista[16]=new pecas('-',"d4");
		lista[17]=new pecas('P',"e4");
		lista[18]=new pecas('P',"f4");
		lista[19]=new pecas('P',"g4");
		lista[20]=new pecas('P',"a3");
		lista[21]=new pecas('P',"b3");
		lista[22]=new pecas('P',"c3");
		lista[23]=new pecas('P',"d3");
		lista[24]=new pecas('P',"e3");
		lista[25]=new pecas('P',"f3");
		lista[26]=new pecas('P',"g3");
		lista[27]=new pecas('P',"c2");
		lista[28]=new pecas('P',"d2");
		lista[29]=new pecas('P',"e2");
		lista[30]=new pecas('P',"c1");
		lista[31]=new pecas('P',"d1");
		lista[32]=new pecas('P',"e1");
	}
	void imprime() {
		System.out.println("7     "+lista[0].EspacoOcupado+" "+lista[1].EspacoOcupado+" "+lista[2].EspacoOcupado);
		System.out.println("6     "+lista[3].EspacoOcupado+" "+lista[4].EspacoOcupado+" "+lista[5].EspacoOcupado);
		System.out.println("5 "+lista[6].EspacoOcupado+" "+lista[7].EspacoOcupado+" "+lista[8].EspacoOcupado+" "+lista[9].EspacoOcupado+" "+lista[10].EspacoOcupado+" "+lista[11].EspacoOcupado+" "+lista[12].EspacoOcupado);
		System.out.println("4 "+lista[13].EspacoOcupado+" "+lista[14].EspacoOcupado+" "+lista[15].EspacoOcupado+" "+lista[16].EspacoOcupado+" "+lista[17].EspacoOcupado+" "+lista[18].EspacoOcupado+" "+lista[19].EspacoOcupado);
		System.out.println("3 "+lista[20].EspacoOcupado+" "+lista[21].EspacoOcupado+" "+lista[22].EspacoOcupado+" "+lista[23].EspacoOcupado+" "+lista[24].EspacoOcupado+" "+lista[25].EspacoOcupado+" "+lista[26].EspacoOcupado);
		System.out.println("2     "+lista[27].EspacoOcupado+" "+lista[28].EspacoOcupado+" "+lista[29].EspacoOcupado);
		System.out.println("1     "+lista[30].EspacoOcupado+" "+lista[31].EspacoOcupado+" "+lista[32].EspacoOcupado);
		System.out.println("  a b c d e f g");
		System.out.println();
	}
	void mover(pecas ini,pecas fim) {
		if(ini.EspacoOcupado=='P'&& fim.EspacoOcupado=='-') {
			if(ini.Nome.charAt(0)==fim.Nome.charAt(0)) {
				movimentovertical(ini,fim);
				ini.desocupar();
				fim.ocupar();}
			else if(ini.Nome.charAt(1)==fim.Nome.charAt(1)) {
				movimentohorizontal(ini,fim);
				ini.desocupar();
				fim.ocupar();}
			System.out.println("Source: "+ini.Nome);
			System.out.println("Target: "+fim.Nome);
			imprime();
			}
		}
	void movimentovertical(pecas ini,pecas fim) {
		char m[]= {ini.Nome.charAt(0),(char)(((int)ini.Nome.charAt(1)+(int)fim.Nome.charAt(1))/2)};
		String pecameio = new String(m);
		lista[comparar(pecameio)].desocupar();
	}
	void movimentohorizontal(pecas ini,pecas fim) {
		char m[]= {(char)((ini.Nome.codePointAt(0)+fim.Nome.codePointAt(0))/2),ini.Nome.charAt(1)};
		String pecameio = new String(m);
		lista[comparar(pecameio)].desocupar();
	}
	int comparar(String x) {
		int i;
		for(i=0;i<33;i++) {
			if(x.compareTo(lista[i].Nome)==0)
					break;}
		return i;}
}