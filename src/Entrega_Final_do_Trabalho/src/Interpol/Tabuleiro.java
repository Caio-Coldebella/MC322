package Interpol;

public class Tabuleiro implements ITabuleiro{//recebe jogador devolve jogador
	public static Estacao[] tab=new Estacao[50];
	public void criatabuleiro() { //adiciona as estacoes na lista tab e adiciona as relacoes de vizinhanca
		tab[0]=new EstTaxi();
		tab[1]=new EstTaxi();
		tab[2]=new EstTaxi();
		tab[3]=new EstOnibus();
		tab[4]=new EstTaxi();
		tab[5]=new EstMetro();
		tab[6]=new EstTaxi();
		tab[7]=new EstTaxi();
		tab[8]=new EstOnibus();
		tab[9]=new EstMetro();
		tab[10]=new EstTaxi();
		tab[11]=new EstTaxi();
		tab[12]=new EstTaxi();
		tab[13]=new EstTaxi();
		tab[14]=new EstTaxi();
		tab[15]=new EstTaxi();
		tab[16]=new EstTaxi();
		tab[17]=new EstOnibus();
		tab[18]=new EstTaxi();
		tab[19]=new EstOnibus();
		tab[20]=new EstTaxi();
		tab[21]=new EstTaxi();
		tab[22]=new EstOnibus();
		tab[23]=new EstTaxi();
		tab[24]=new EstTaxi();
		tab[25]=new EstTaxi();
		tab[26]=new EstTaxi();
		tab[27]=new EstOnibus();
		tab[28]=new EstOnibus();
		tab[29]=new EstTaxi();
		tab[30]=new EstTaxi();
		tab[31]=new EstOnibus();
		tab[32]=new EstTaxi();
		tab[33]=new EstTaxi();
		tab[34]=new EstTaxi();
		tab[35]=new EstTaxi();
		tab[36]=new EstMetro();
		tab[37]=new EstTaxi();
		tab[38]=new EstOnibus();
		tab[39]=new EstMetro();
		tab[40]=new EstOnibus();
		tab[41]=new EstTaxi();
		tab[42]=new EstOnibus();
		tab[43]=new EstOnibus();
		tab[44]=new EstTaxi();
		tab[45]=new EstTaxi();
		tab[46]=new EstTaxi();
		tab[47]=new EstOnibus();
		tab[48]=new EstTaxi();
		tab[49]=new EstTaxi();
		tab[0].addvizinho(tab[1]);
		tab[0].addvizinho(tab[6]);
		tab[1].addvizinho(tab[0]);
		tab[1].addvizinho(tab[2]);
		tab[1].addvizinho(tab[7]);
		tab[2].addvizinho(tab[1]);
		tab[2].addvizinho(tab[3]);
		tab[2].addvizinho(tab[9]);
		tab[3].addvizinho(tab[2]);
		tab[3].addvizinho(tab[4]);
		tab[3].addvizinho(tab[15]);
		tab[3].addvizinho(tab[8]);
		tab[3].addvizinho(tab[9]);
		tab[4].addvizinho(tab[3]);
		tab[4].addvizinho(tab[5]);
		tab[4].addvizinho(tab[16]);
		tab[5].addvizinho(tab[4]);
		tab[5].addvizinho(tab[16]);
		tab[5].addvizinho(tab[22]);
		tab[5].addvizinho(tab[9]);
		tab[5].addvizinho(tab[39]);
		tab[6].addvizinho(tab[0]);
		tab[6].addvizinho(tab[8]);
		tab[6].addvizinho(tab[10]);
		tab[7].addvizinho(tab[1]);
		tab[7].addvizinho(tab[8]);
		tab[8].addvizinho(tab[6]);
		tab[8].addvizinho(tab[7]);
		tab[8].addvizinho(tab[9]);
		tab[8].addvizinho(tab[11]);
		tab[8].addvizinho(tab[17]);
		tab[8].addvizinho(tab[3]);
		tab[9].addvizinho(tab[2]);
		tab[9].addvizinho(tab[14]);
		tab[9].addvizinho(tab[3]);
		tab[9].addvizinho(tab[8]);
		tab[9].addvizinho(tab[5]);
		tab[9].addvizinho(tab[36]);
		tab[10].addvizinho(tab[6]);
		tab[10].addvizinho(tab[17]);
		tab[10].addvizinho(tab[28]);
		tab[11].addvizinho(tab[8]);
		tab[11].addvizinho(tab[12]);
		tab[11].addvizinho(tab[17]);
		tab[12].addvizinho(tab[11]);
		tab[12].addvizinho(tab[13]);
		tab[13].addvizinho(tab[12]);
		tab[13].addvizinho(tab[14]);
		tab[13].addvizinho(tab[18]);
		tab[14].addvizinho(tab[13]);
		tab[14].addvizinho(tab[15]);
		tab[14].addvizinho(tab[9]);
		tab[14].addvizinho(tab[19]);
		tab[14].addvizinho(tab[20]);
		tab[15].addvizinho(tab[3]);
		tab[15].addvizinho(tab[21]);
		tab[15].addvizinho(tab[14]);
		tab[15].addvizinho(tab[16]);
		tab[16].addvizinho(tab[15]);
		tab[16].addvizinho(tab[4]);
		tab[16].addvizinho(tab[5]);
		tab[17].addvizinho(tab[10]);
		tab[17].addvizinho(tab[11]);
		tab[17].addvizinho(tab[18]);
		tab[17].addvizinho(tab[8]);
		tab[17].addvizinho(tab[19]);
		tab[17].addvizinho(tab[28]);
		tab[18].addvizinho(tab[17]);
		tab[18].addvizinho(tab[19]);
		tab[18].addvizinho(tab[13]);
		tab[18].addvizinho(tab[23]);
		tab[19].addvizinho(tab[18]);
		tab[19].addvizinho(tab[20]);
		tab[19].addvizinho(tab[14]);
		tab[19].addvizinho(tab[24]);
		tab[19].addvizinho(tab[17]);
		tab[19].addvizinho(tab[31]);
		tab[20].addvizinho(tab[19]);
		tab[20].addvizinho(tab[21]);
		tab[20].addvizinho(tab[14]);
		tab[20].addvizinho(tab[26]);
		tab[21].addvizinho(tab[20]);
		tab[21].addvizinho(tab[22]);
		tab[21].addvizinho(tab[15]);
		tab[22].addvizinho(tab[21]);
		tab[22].addvizinho(tab[27]);
		tab[22].addvizinho(tab[5]);
		tab[23].addvizinho(tab[18]);
		tab[23].addvizinho(tab[24]);
		tab[23].addvizinho(tab[30]);
		tab[24].addvizinho(tab[23]);
		tab[24].addvizinho(tab[25]);
		tab[24].addvizinho(tab[19]);
		tab[24].addvizinho(tab[31]);
		tab[25].addvizinho(tab[32]);
		tab[25].addvizinho(tab[24]);
		tab[25].addvizinho(tab[26]);
		tab[26].addvizinho(tab[20]);
		tab[26].addvizinho(tab[25]);
		tab[26].addvizinho(tab[27]);
		tab[27].addvizinho(tab[26]);
		tab[27].addvizinho(tab[32]);
		tab[27].addvizinho(tab[33]);
		tab[27].addvizinho(tab[34]);
		tab[27].addvizinho(tab[22]);
		tab[27].addvizinho(tab[31]);
		tab[27].addvizinho(tab[39]);
		tab[28].addvizinho(tab[10]);
		tab[28].addvizinho(tab[35]);
		tab[28].addvizinho(tab[29]);
		tab[28].addvizinho(tab[17]);
		tab[28].addvizinho(tab[31]);
		tab[29].addvizinho(tab[28]);
		tab[29].addvizinho(tab[30]);
		tab[29].addvizinho(tab[37]);
		tab[30].addvizinho(tab[23]);
		tab[30].addvizinho(tab[29]);
		tab[30].addvizinho(tab[31]);
		tab[31].addvizinho(tab[30]);
		tab[31].addvizinho(tab[32]);
		tab[31].addvizinho(tab[24]);
		tab[31].addvizinho(tab[19]);
		tab[31].addvizinho(tab[27]);
		tab[31].addvizinho(tab[28]);
		tab[31].addvizinho(tab[39]);
		tab[32].addvizinho(tab[25]);
		tab[32].addvizinho(tab[27]);
		tab[32].addvizinho(tab[31]);
		tab[32].addvizinho(tab[33]);
		tab[33].addvizinho(tab[27]);
		tab[33].addvizinho(tab[39]);
		tab[33].addvizinho(tab[32]);
		tab[33].addvizinho(tab[34]);
		tab[34].addvizinho(tab[27]);
		tab[34].addvizinho(tab[33]);
		tab[35].addvizinho(tab[28]);
		tab[35].addvizinho(tab[36]);
		tab[36].addvizinho(tab[35]);
		tab[36].addvizinho(tab[37]);
		tab[36].addvizinho(tab[38]);
		tab[36].addvizinho(tab[40]);
		tab[36].addvizinho(tab[9]);
		tab[36].addvizinho(tab[39]);
		tab[37].addvizinho(tab[29]);
		tab[37].addvizinho(tab[42]);
		tab[37].addvizinho(tab[36]);
		tab[37].addvizinho(tab[38]);
		tab[38].addvizinho(tab[36]);
		tab[38].addvizinho(tab[37]);
		tab[38].addvizinho(tab[39]);
		tab[39].addvizinho(tab[33]);
		tab[39].addvizinho(tab[45]);
		tab[39].addvizinho(tab[27]);
		tab[39].addvizinho(tab[31]);
		tab[39].addvizinho(tab[38]);
		tab[39].addvizinho(tab[43]);
		tab[39].addvizinho(tab[5]);
		tab[39].addvizinho(tab[36]);
		tab[40].addvizinho(tab[41]);
		tab[40].addvizinho(tab[46]);
		tab[40].addvizinho(tab[36]);
		tab[40].addvizinho(tab[42]);
		tab[40].addvizinho(tab[47]);
		tab[41].addvizinho(tab[40]);
		tab[41].addvizinho(tab[42]);
		tab[41].addvizinho(tab[48]);
		tab[42].addvizinho(tab[41]);
		tab[42].addvizinho(tab[48]);
		tab[42].addvizinho(tab[37]);
		tab[42].addvizinho(tab[40]);
		tab[42].addvizinho(tab[43]);
		tab[42].addvizinho(tab[47]);
		tab[43].addvizinho(tab[39]);
		tab[43].addvizinho(tab[49]);
		tab[43].addvizinho(tab[42]);
		tab[43].addvizinho(tab[44]);
		tab[44].addvizinho(tab[43]);
		tab[44].addvizinho(tab[45]);
		tab[45].addvizinho(tab[44]);
		tab[45].addvizinho(tab[39]);
		tab[46].addvizinho(tab[40]);
		tab[46].addvizinho(tab[47]);
		tab[47].addvizinho(tab[40]);
		tab[47].addvizinho(tab[42]);
		tab[47].addvizinho(tab[46]);
		tab[47].addvizinho(tab[48]);
		tab[48].addvizinho(tab[41]);
		tab[48].addvizinho(tab[42]);
		tab[48].addvizinho(tab[47]);
		tab[48].addvizinho(tab[49]);
		tab[49].addvizinho(tab[48]);
		tab[49].addvizinho(tab[43]);
	}
	public void movermisterx(int origem,int destino, IMisterX mx) { //move misterx e verifica o meio de transporte
		if (tab[destino].getOcupada()=="nao") {
			tab[origem].setOcupada("nao");
			tab[destino].setOcupada("misterx");
			if(tab[origem].getClass()==EstTaxi.class) {
				mx.settransp("taxi");
				}
			else if(tab[origem].getClass()==EstOnibus.class) {
				if(tab[destino].getClass()==EstTaxi.class) {
					mx.settransp("taxi");}
				else {
					mx.settransp("onibus");}}
			else {
				if(tab[destino].getClass()==EstTaxi.class) {
					mx.settransp("taxi");}
				else if(tab[destino].getClass()==EstOnibus.class) {
					mx.settransp("onibus");}
				else {
					mx.settransp("metro");}
				}
			}}
	public void moverpolicia(int origem, int destino, Policia p) {// move a policia e verifica se capturou o misterx
		if(tab[destino].getOcupada()=="misterx") {
			p.setcaptura();}
		else {
			tab[origem].setOcupada("nao");
			tab[destino].setOcupada(p.getnome());
			Interpol.windowbotao.alteracor(origem,"branco");
			Interpol.windowbotao.alteracor(destino,p.getnome());//altera as cores dos botoes na interface grafica
		}}
	public int buscaposicao(Estacao casa) { //retorna o indice de uma estacao
		for(int i=0;i<tab.length;i++) {
			if(tab[i].equals(casa)) {
				return i;}}
		return -1;
	}
}
