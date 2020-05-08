package xadrez;

public class tabuleiroxadrez {
	static pecagenerica[] tab= new pecagenerica[64];
	void criatab() {
	tab[0]=new torre('a','8','T');
	tab[1]=new cavalo('b','8','H');
	tab[2]=new bispo('c','8','B');
	tab[3]=new rei('d','8','K');
	tab[4]=new rainha('e','8','Q');
	tab[5]=new bispo('f','8','B');
	tab[6]=new cavalo('g','8','H');
	tab[7]=new torre('h','8','T');
	tab[8]=new peao('a','7','P');
	tab[9]=new peao('b','7','P');
	tab[10]=new peao('c','7','P');
	tab[11]=new peao('d','7','P');
	tab[12]=new peao('e','7','P');
	tab[13]=new peao('f','7','P');
	tab[14]=new peao('g','7','P');
	tab[15]=new peao('h','7','P');
	tab[16]=new pecagenerica('a','6','-');
	tab[17]=new pecagenerica('b','6','-');
	tab[18]=new pecagenerica('c','6','-');
	tab[19]=new pecagenerica('d','6','-');
	tab[20]=new pecagenerica('e','6','-');
	tab[21]=new pecagenerica('f','6','-');
	tab[22]=new pecagenerica('g','6','-');
	tab[23]=new pecagenerica('h','6','-');
	tab[24]=new pecagenerica('a','5','-');
	tab[25]=new pecagenerica('b','5','-');
	tab[26]=new pecagenerica('c','5','-');
	tab[27]=new pecagenerica('d','5','-');
	tab[28]=new pecagenerica('e','5','-');
	tab[29]=new pecagenerica('f','5','-');
	tab[30]=new pecagenerica('g','5','-');
	tab[31]=new pecagenerica('h','5','-');
	tab[32]=new pecagenerica('a','4','-');
	tab[33]=new pecagenerica('b','4','-');
	tab[34]=new pecagenerica('c','4','-');
	tab[35]=new pecagenerica('d','4','-');
	tab[36]=new pecagenerica('e','4','-');
	tab[37]=new pecagenerica('f','4','-');
	tab[38]=new pecagenerica('g','4','-');
	tab[39]=new pecagenerica('h','4','-');
	tab[40]=new pecagenerica('a','3','-');
	tab[41]=new pecagenerica('b','3','-');
	tab[42]=new pecagenerica('c','3','-');
	tab[43]=new pecagenerica('d','3','-');
	tab[44]=new pecagenerica('e','3','-');
	tab[45]=new pecagenerica('f','3','-');
	tab[46]=new pecagenerica('g','3','-');
	tab[47]=new pecagenerica('h','3','-');
	tab[48]=new peao('a','2','p');
	tab[49]=new peao('b','2','p');
	tab[50]=new peao('c','2','p');
	tab[51]=new peao('d','2','p');
	tab[52]=new peao('e','2','p');
	tab[53]=new peao('f','2','p');
	tab[54]=new peao('g','2','p');
	tab[55]=new peao('h','2','p');
	tab[56]=new torre('a','1','t');
	tab[57]=new cavalo('b','1','h');
	tab[58]=new bispo('c','1','b');
	tab[59]=new rainha('d','1','q');
	tab[60]=new rei('e','1','k');
	tab[61]=new bispo('f','1','b');
	tab[62]=new cavalo('g','1','h');
	tab[63]=new torre('h','1','t');
		}
	void imprimir() {
		System.out.println("8 "+tab[buscar('a','8')].nome+" "+tab[buscar('b','8')].nome+" "+tab[buscar('c','8')].nome+" "+tab[buscar('d','8')].nome+" "+tab[buscar('e','8')].nome+" "+tab[buscar('f','8')].nome+" "+tab[buscar('g','8')].nome+" "+tab[buscar('h','8')].nome);
		System.out.println("7 "+tab[buscar('a','7')].nome+" "+tab[buscar('b','7')].nome+" "+tab[buscar('c','7')].nome+" "+tab[buscar('d','7')].nome+" "+tab[buscar('e','7')].nome+" "+tab[buscar('f','7')].nome+" "+tab[buscar('g','7')].nome+" "+tab[buscar('h','7')].nome);
		System.out.println("6 "+tab[buscar('a','6')].nome+" "+tab[buscar('b','6')].nome+" "+tab[buscar('c','6')].nome+" "+tab[buscar('d','6')].nome+" "+tab[buscar('e','6')].nome+" "+tab[buscar('f','6')].nome+" "+tab[buscar('g','6')].nome+" "+tab[buscar('h','6')].nome);
		System.out.println("5 "+tab[buscar('a','5')].nome+" "+tab[buscar('b','5')].nome+" "+tab[buscar('c','5')].nome+" "+tab[buscar('d','5')].nome+" "+tab[buscar('e','5')].nome+" "+tab[buscar('f','5')].nome+" "+tab[buscar('g','5')].nome+" "+tab[buscar('h','5')].nome);
		System.out.println("4 "+tab[buscar('a','4')].nome+" "+tab[buscar('b','4')].nome+" "+tab[buscar('c','4')].nome+" "+tab[buscar('d','4')].nome+" "+tab[buscar('e','4')].nome+" "+tab[buscar('f','4')].nome+" "+tab[buscar('g','4')].nome+" "+tab[buscar('h','4')].nome);
		System.out.println("3 "+tab[buscar('a','3')].nome+" "+tab[buscar('b','3')].nome+" "+tab[buscar('c','3')].nome+" "+tab[buscar('d','3')].nome+" "+tab[buscar('e','3')].nome+" "+tab[buscar('f','3')].nome+" "+tab[buscar('g','3')].nome+" "+tab[buscar('h','3')].nome);
		System.out.println("2 "+tab[buscar('a','2')].nome+" "+tab[buscar('b','2')].nome+" "+tab[buscar('c','2')].nome+" "+tab[buscar('d','2')].nome+" "+tab[buscar('e','2')].nome+" "+tab[buscar('f','2')].nome+" "+tab[buscar('g','2')].nome+" "+tab[buscar('h','2')].nome);
		System.out.println("1 "+tab[buscar('a','1')].nome+" "+tab[buscar('b','1')].nome+" "+tab[buscar('c','1')].nome+" "+tab[buscar('d','1')].nome+" "+tab[buscar('e','1')].nome+" "+tab[buscar('f','1')].nome+" "+tab[buscar('g','1')].nome+" "+tab[buscar('h','1')].nome);
		System.out.println("  a b c d e f g h");
		System.out.println();
		}
	void movimento(Movimento comando) {
		int i=buscar(comando.afetadocoluna,comando.afetadolinha);
		if(tab[i].getClass()==peao.class) {
			peao p= (peao)tab[i];
			p.movimentopeao(comando);
				}
		else if(tab[i].getClass()==torre.class) {
			torre t= (torre)tab[i];
			t.movimentotorre(comando);
				}
		else if(tab[i].getClass()==cavalo.class) {
			cavalo c= (cavalo)tab[i];
			c.movimentocavalo(comando);
				}
		else if(tab[i].getClass()==bispo.class) {
			bispo b= (bispo)tab[i];
			b.movimentobispo(comando);
				}
		else if(tab[i].getClass()==rainha.class) {
			rainha r= (rainha)tab[i];
			r.movimentorainha(comando);
				}
		else if(tab[i].getClass()==rei.class) {
			rei r= (rei)tab[i];
			r.movimentorei(comando);
				}
		System.out.println("Source: "+comando.afetadocoluna+comando.afetadolinha);
		System.out.println("Target: "+comando.destinocoluna+comando.destinolinha);
		imprimir();
		}
	void transformar(Transforma comando) {
		int i=buscar(comando.afetadocoluna,comando.afetadolinha);
		char a=comando.transformar;
		char c=comando.afetadocoluna;
		char l=comando.afetadolinha;
		if(a=='T'|| a=='t') {
			tab[i]= new torre(c,l,a);
				}
		else if(a=='H'||a=='h') {
			tab[i]=new cavalo(c,l,a);
			}
		else if(a=='B'||a=='b') {
			tab[i]=new bispo(c,l,a);
			}
		else if(a=='Q'||a=='q') {
			tab[i]=new rainha(c,l,a);
			}
		System.out.println("Transformation: "+c+l+" in "+a);
		imprimir();
	}	
	public static int buscar(char coluna,char linha) {
		char data1[]= {coluna,linha};
		String obj = new String(data1);
		int i;
		for(i=0;i<64;i++) {
			char data2[]= {tab[i].coluna,tab[i].linha};
			String alvo = new String(data2);
			if(obj.compareTo(alvo)==0)
					break;}
		return i;
	}
	public static void trocaposicao(int i,int j) {
		char ci=tab[i].coluna,li=tab[i].linha,cj=tab[j].coluna,lj=tab[j].linha;
		tab[i].coluna=cj;
		tab[i].linha=lj;
		tab[j].linha=li;
		tab[j].coluna=ci;
		}
	public static void removepeca(int i) {
		pecagenerica aux=new pecagenerica('x','x','-');
		aux.linha=tab[i].linha;
		aux.coluna=tab[i].coluna;
		tab[i]=aux;
	}
}
