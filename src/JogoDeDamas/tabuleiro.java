package JogoDeDamas;

public class tabuleiro {
	static pecagenerica lista[]=new pecagenerica[32];
	void crialista() {
		lista[0]= new pecacomum('P',"b8");
		lista[1]= new pecacomum('P',"d8");
		lista[2]= new pecacomum('P',"f8");
		lista[3]= new pecacomum('P',"h8");
		lista[4]= new pecacomum('P',"a7");
		lista[5]= new pecacomum('P',"c7");
		lista[6]= new pecacomum('P',"e7");
		lista[7]= new pecacomum('P',"g7");
		lista[8]= new pecacomum('P',"b6");
		lista[9]= new pecacomum('P',"d6");
		lista[10]= new pecacomum('P',"f6");
		lista[11]= new pecacomum('P',"h6");
		lista[12]= new pecacomum('-',"a5");
		lista[13]= new pecacomum('-',"c5");
		lista[14]= new pecacomum('-',"e5");
		lista[15]= new pecacomum('-',"g5");
		lista[16]= new pecacomum('-',"b4");
		lista[17]= new pecacomum('-',"d4");
		lista[18]= new pecacomum('-',"f4");
		lista[19]= new pecacomum('-',"h4");
		lista[20]= new pecacomum('B',"a3");
		lista[21]= new pecacomum('B',"c3");
		lista[22]= new pecacomum('B',"e3");
		lista[23]= new pecacomum('B',"g3");
		lista[24]= new pecacomum('B',"b2");
		lista[25]= new pecacomum('B',"d2");
		lista[26]= new pecacomum('B',"f2");
		lista[27]= new pecacomum('B',"h2");
		lista[28]= new pecacomum('B',"a1");
		lista[29]= new pecacomum('B',"c1");
		lista[30]= new pecacomum('B',"e1");
		lista[31]= new pecacomum('B',"g1");
	}
	void imprimir() {
		System.out.println("8 "+"-"+" "+lista[0].tipo+" "+"-"+" "+lista[1].tipo+" "+"-"+" "+lista[2].tipo+" "+"-"+" "+lista[3].tipo);
		System.out.println("7 "+lista[4].tipo+" "+"-"+" "+lista[5].tipo+" "+"-"+" "+lista[6].tipo+" "+"-"+" "+lista[7].tipo+" "+"-");
		System.out.println("6 "+"-"+" "+lista[8].tipo+" "+"-"+" "+lista[9].tipo+" "+"-"+" "+lista[10].tipo+" "+"-"+" "+lista[11].tipo);
		System.out.println("5 "+lista[12].tipo+" "+"-"+" "+lista[13].tipo+" "+"-"+" "+lista[14].tipo+" "+"-"+" "+lista[15].tipo+" "+"-");
		System.out.println("4 "+"-"+" "+lista[16].tipo+" "+"-"+" "+lista[17].tipo+" "+"-"+" "+lista[18].tipo+" "+"-"+" "+lista[19].tipo);
		System.out.println("3 "+lista[20].tipo+" "+"-"+" "+lista[21].tipo+" "+"-"+" "+lista[22].tipo+" "+"-"+" "+lista[23].tipo+" "+"-");
		System.out.println("2 "+"-"+" "+lista[24].tipo+" "+"-"+" "+lista[25].tipo+" "+"-"+" "+lista[26].tipo+" "+"-"+" "+lista[27].tipo);
		System.out.println("1 "+lista[28].tipo+" "+"-"+" "+lista[29].tipo+" "+"-"+" "+lista[30].tipo+" "+"-"+" "+lista[31].tipo+" "+"-");		
		System.out.println("  a b c d e f g h");
		System.out.println();
	}
	void movimento(String ini,String fim) {
		int i=comparar(ini);
		int f=comparar(fim);
		if(lista[f].tipo=='-' && lista[i].casta==1 && lista[i].tipo!='-') {
			pecacomum ii= (pecacomum) lista[i];
			pecacomum ff=(pecacomum) lista[f];
			pecacomum.movercomum(ii,ff);
			ifviroudama(ff);
			System.out.println("Source: "+ii.posicao);
			System.out.println("Target: "+ff.posicao);
			imprimir();
		}
		if(lista[f].tipo=='-' && lista[i].casta==2) {
			pecacomum ff=(pecacomum) lista[f];
			dama id= (dama) lista[i];
			System.out.println("Source: "+id.posicao);
			System.out.println("Target: "+ff.posicao);
			dama.moverdama(id,ff);
			imprimir();
		}
	}
	
	public static int comparar(String x) {
		int i;
		for(i=0;i<32;i++) {
			if(x.compareTo(lista[i].posicao)==0)
					break;}
		return i;}
	public static void ifviroudama(pecacomum a) {
		int i;
		char t;
		String p;
		if(a.tipo=='B') {
			if(a.posicao.charAt(1)=='8'){
				i=comparar(a.posicao);
				t=a.tipo;
				p=a.posicao;
				lista[i]= new dama(t,p);
			}}
		if(a.tipo=='P') {
			if(a.posicao.charAt(1)=='1') {
				i=comparar(a.posicao);
				t=a.tipo;
				p=a.posicao;
				lista[i]= new dama(t,p);
			}}
		}
	public static void viroucomum(dama a){
		int i;
		char t;
		String p;
		i=comparar(a.posicao);
		t=a.tipo;
		p=a.posicao;
		lista[i]= new pecacomum(t,p);
		
	}
	public static void viroudama(pecacomum a) {
		int i;
		char t;
		String p;
		i=comparar(a.posicao);
		t=a.tipo;
		p=a.posicao;
		lista[i]= new dama(t,p);
	}
}
