package Interpol;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
public class windowbotao extends JFrame{
	private static final long serialVersionUID = 1L;
	private static JTextArea texto; // area de texto
	private Container painel; // janela principal
	private JPanel mapa; // painel contendo o mapa
	public JPanel transportes; // painel contendo os veiculos de transporte
	private static JButton[] listabotoes=new JButton[50]; // lista com todos os botoes contido no mapa
	public windowbotao() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		visual();}
	public static void alteracor(int nbotao, String cor) { // funcao usada para alterar a cor do botao requisitado, toda vez que alguma peca se move
		if(cor=="branco") {
			listabotoes[nbotao].setBackground(Color.white);
		}
		else if(cor=="vermelho") {
			listabotoes[nbotao].setBackground(Color.red);
		}
		else if(cor=="verde") {
			listabotoes[nbotao].setBackground(Color.green);
		}
		else if(cor=="amarelo") {
			listabotoes[nbotao].setBackground(Color.yellow);
		}
		else if(cor=="azul") {
			listabotoes[nbotao].setBackground(Color.cyan);
		}
		else {
			listabotoes[nbotao].setBackground(Color.magenta);
		}
	}
	public void visual() {
		setSize(1000,1000);
		painel = getContentPane();
		painel.setLayout(new BorderLayout());// layout da janela principal
		texto = new JTextArea();
		painel.add(texto, BorderLayout.PAGE_START);// a area de texto fica no inicio do border layout
		
		transportes=new JPanel();
		transportes.setLayout(new FlowLayout(FlowLayout.LEFT));
		painel.add(transportes,BorderLayout.PAGE_END);// a area de transportes, que eh um flowlayout fica no final do border layout
		
		mapa= new JPanel();
		mapa.setLayout(null);
		painel.add(mapa,BorderLayout.CENTER);// o mapa, que nao possui layout, fica no centro do borderlayout 
		
		//criacao de todos os botoes
		JButton botao0=new JButton("0");//cria um botao
		botao0.setSize(50,26);// define seu tamanho (igual para todos)
		botao0.setLocation(170,588); // define sua localizao (diferente para todos os 50)
		mapa.add(botao0); // adiciona o botao no jpanel mapa
		botao0.setBackground(Color.white); //define a cor como branca (inicial)
		listabotoes[0]=botao0; // adiciona na lista contendo todos os botoes
		botao0.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				//acoes executadas toda vez que o botao eh apertado
				Interpol.mainwindow.str=0;// a variavel que diz a casa para onde a peca deve se mover eh setada com o numero do botao/estacao
				Interpol.mainwindow.tt.taque();// diz para a thread, que dira para a main que um evento aconteceu
				}});
		JButton botao1=new JButton("1");
		botao1.setSize(50,26);
		botao1.setLocation(170,475);
		mapa.add(botao1);
		botao1.setBackground(Color.WHITE);
		listabotoes[1]=botao1;
		botao1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=1;
				Interpol.mainwindow.tt.taque();}});
		JButton botao2=new JButton("2");
		botao2.setSize(50,26);
		botao2.setLocation(170,370);
		mapa.add(botao2);
		botao2.setBackground(Color.white);
		listabotoes[2]=botao2;
		botao2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=2;
				Interpol.mainwindow.tt.taque();}});
		JButton botao3=new JButton("3");
		botao3.setSize(50,26);
		botao3.setLocation(170,260);
		mapa.add(botao3);
		botao3.setBackground(Color.white);
		listabotoes[3]=botao3;
		botao3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=3;
				Interpol.mainwindow.tt.taque();}});
		JButton botao4=new JButton("4");
		botao4.setSize(50,26);
		botao4.setLocation(170,147);
		mapa.add(botao4);
		botao4.setBackground(Color.white);
		listabotoes[4]=botao4;
		botao4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=4;
				Interpol.mainwindow.tt.taque();}});
		JButton botao5=new JButton("5");
		botao5.setSize(50,26);
		botao5.setLocation(170,50);
		mapa.add(botao5);
		botao5.setBackground(Color.white);
		listabotoes[5]=botao5;
		botao5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=5;
				Interpol.mainwindow.tt.taque();}});
		JButton botao6=new JButton("6");
		botao6.setSize(50,26);
		botao6.setLocation(290,588);
		mapa.add(botao6);
		botao6.setBackground(Color.white);
		listabotoes[6]=botao6;
		botao6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=6;
				Interpol.mainwindow.tt.taque();}});
		JButton botao7=new JButton("7");
		botao7.setSize(50,26);
		botao7.setLocation(260,479);
		mapa.add(botao7);
		botao7.setBackground(Color.white);
		listabotoes[7]=botao7;
		botao7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=7;
				Interpol.mainwindow.tt.taque();}});
		JButton botao8=new JButton("8");
		botao8.setSize(50,26);
		botao8.setLocation(343,487);
		mapa.add(botao8);
		botao8.setBackground(Color.white);
		listabotoes[8]=botao8;
		botao8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=8;
				Interpol.mainwindow.tt.taque();}});
		JButton botao9=new JButton("9");
		botao9.setSize(50,26);
		botao9.setLocation(343,382);
		mapa.add(botao9);
		botao9.setBackground(Color.white);
		listabotoes[9]=botao9;
		botao9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=9;
				Interpol.mainwindow.tt.taque();}});
		JButton botao10=new JButton("10");
		botao10.setSize(50,26);
		botao10.setLocation(487,576);
		mapa.add(botao10);
		botao10.setBackground(Color.white);
		listabotoes[10]=botao10;
		botao10.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=10;
				Interpol.mainwindow.tt.taque();}});
		JButton botao11=new JButton("11");
		botao11.setSize(50,26);
		botao11.setLocation(449,487);
		mapa.add(botao11);
		botao11.setBackground(Color.white);
		listabotoes[11]=botao11;
		botao11.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=11;
				Interpol.mainwindow.tt.taque();}});
		JButton botao12=new JButton("12");
		botao12.setSize(50,26);
		botao12.setLocation(449,403);
		mapa.add(botao12);
		botao12.setBackground(Color.white);
		listabotoes[12]=botao12;
		botao12.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=12;
				Interpol.mainwindow.tt.taque();}});
		JButton botao13=new JButton("13");
		botao13.setSize(50,26);
		botao13.setLocation(449,319);
		mapa.add(botao13);
		botao13.setBackground(Color.white);
		listabotoes[13]=botao13;
		botao13.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=13;
				Interpol.mainwindow.tt.taque();}});
		JButton botao14=new JButton("14");
		botao14.setSize(50,26);
		botao14.setLocation(423,235);
		mapa.add(botao14);
		botao14.setBackground(Color.white);
		listabotoes[14]=botao14;
		botao14.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=14;
				Interpol.mainwindow.tt.taque();}});
		JButton botao15=new JButton("15");
		botao15.setSize(50,26);
		botao15.setLocation(419,142);
		mapa.add(botao15);
		botao15.setBackground(Color.white);
		listabotoes[15]=botao15;
		botao15.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=15;
				Interpol.mainwindow.tt.taque();}});
		JButton botao16=new JButton("16");
		botao16.setSize(50,26);
		botao16.setLocation(343,83);
		mapa.add(botao16);
		botao16.setBackground(Color.white);
		listabotoes[16]=botao16;
		botao16.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=16;
				Interpol.mainwindow.tt.taque();}});
		JButton botao17=new JButton("17");
		botao17.setSize(50,26);
		botao17.setLocation(533,512);
		mapa.add(botao17);
		botao17.setBackground(Color.white);
		listabotoes[17]=botao17;
		botao17.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=17;
				Interpol.mainwindow.tt.taque();}});
		JButton botao18=new JButton("18");
		botao18.setSize(50,26);
		botao18.setLocation(555,428);
		mapa.add(botao18);
		botao18.setBackground(Color.white);
		listabotoes[18]=botao18;
		botao18.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=18;
				Interpol.mainwindow.tt.taque();}});
		JButton botao19=new JButton("19");
		botao19.setSize(50,26);
		botao19.setLocation(555,336);
		mapa.add(botao19);
		botao19.setBackground(Color.white);
		listabotoes[19]=botao19;
		botao19.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=19;
				Interpol.mainwindow.tt.taque();}});
		JButton botao20=new JButton("20");
		botao20.setSize(50,26);
		botao20.setLocation(555,244);
		mapa.add(botao20);
		botao20.setBackground(Color.white);
		listabotoes[20]=botao20;
		botao20.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=20;
				Interpol.mainwindow.tt.taque();}});
		JButton botao21=new JButton("21");
		botao21.setSize(50,26);
		botao21.setLocation(540,143);
		mapa.add(botao21);
		botao21.setBackground(Color.white);
		listabotoes[21]=botao21;
		botao21.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=21;
				Interpol.mainwindow.tt.taque();}});
		JButton botao22=new JButton("22");
		botao22.setSize(50,26);
		botao22.setLocation(498,62);
		mapa.add(botao22);
		botao22.setBackground(Color.white);
		listabotoes[22]=botao22;
		botao22.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=22;
				Interpol.mainwindow.tt.taque();}});
		JButton botao23=new JButton("23");
		botao23.setSize(50,26);
		botao23.setLocation(665,432);
		mapa.add(botao23);
		botao23.setBackground(Color.white);
		listabotoes[23]=botao23;
		botao23.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=23;
				Interpol.mainwindow.tt.taque();}});
		JButton botao24=new JButton("24");
		botao24.setSize(50,26);
		botao24.setLocation(665,335);
		mapa.add(botao24);
		botao24.setBackground(Color.white);
		listabotoes[24]=botao24;
		botao24.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=24;
				Interpol.mainwindow.tt.taque();}});
		JButton botao25=new JButton("25");
		botao25.setSize(50,26);
		botao25.setLocation(665,248);
		mapa.add(botao25);
		botao25.setBackground(Color.white);
		listabotoes[25]=botao25;
		botao25.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=25;
				Interpol.mainwindow.tt.taque();}});
		JButton botao26=new JButton("26");
		botao26.setSize(50,26);
		botao26.setLocation(665,159);
		mapa.add(botao26);
		botao26.setBackground(Color.white);
		listabotoes[26]=botao26;
		botao26.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=26;
				Interpol.mainwindow.tt.taque();}});
		JButton botao27=new JButton("27");
		botao27.setSize(50,26);
		botao27.setLocation(646,67);
		mapa.add(botao27);
		botao27.setBackground(Color.white);
		listabotoes[27]=botao27;
		botao27.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=27;
				Interpol.mainwindow.tt.taque();}});
		JButton botao28=new JButton("28");
		botao28.setSize(50,26);
		botao28.setLocation(725,545);
		mapa.add(botao28);
		botao28.setBackground(Color.white);
		listabotoes[28]=botao28;
		botao28.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=28;
				Interpol.mainwindow.tt.taque();}});
		JButton botao29=new JButton("29");
		botao29.setSize(50,26);
		botao29.setLocation(748,450);
		mapa.add(botao29);
		botao29.setBackground(Color.white);
		listabotoes[29]=botao29;
		botao29.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=29;
				Interpol.mainwindow.tt.taque();}});
		JButton botao30=new JButton("30");
		botao30.setSize(50,26);
		botao30.setLocation(763,348);
		mapa.add(botao30);
		botao30.setBackground(Color.white);
		listabotoes[30]=botao30;
		botao30.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=30;
				Interpol.mainwindow.tt.taque();}});
		JButton botao31=new JButton("31");
		botao31.setSize(50,26);
		botao31.setLocation(770,256);
		mapa.add(botao31);
		botao31.setBackground(Color.white);
		listabotoes[31]=botao31;
		botao31.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=31;
				Interpol.mainwindow.tt.taque();}});
		JButton botao32=new JButton("32");
		botao32.setSize(50,26);
		botao32.setLocation(782,158);
		mapa.add(botao32);
		botao32.setBackground(Color.white);
		listabotoes[32]=botao32;
		botao32.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=32;
				Interpol.mainwindow.tt.taque();}});
		JButton botao33=new JButton("33");
		botao33.setSize(50,26);
		botao33.setLocation(892,117);
		mapa.add(botao33);
		botao33.setBackground(Color.white);
		listabotoes[33]=botao33;
		botao33.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=33;
				Interpol.mainwindow.tt.taque();}});
		JButton botao34=new JButton("34");
		botao34.setSize(50,26);
		botao34.setLocation(782,60);
		mapa.add(botao34);
		botao34.setBackground(Color.white);
		listabotoes[34]=botao34;
		botao34.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=34;
				Interpol.mainwindow.tt.taque();}});
		JButton botao35=new JButton("35");
		botao35.setSize(50,26);
		botao35.setLocation(805,589);
		mapa.add(botao35);
		botao35.setBackground(Color.white);
		listabotoes[35]=botao35;
		botao35.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=35;
				Interpol.mainwindow.tt.taque();}});
		JButton botao36=new JButton("36");
		botao36.setSize(50,26);
		botao36.setLocation(876,547);
		mapa.add(botao36);
		botao36.setBackground(Color.white);
		listabotoes[36]=botao36;
		botao36.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=36;
				Interpol.mainwindow.tt.taque();}});
		JButton botao37=new JButton("37");
		botao37.setSize(50,26);
		botao37.setLocation(895,406);
		mapa.add(botao37);
		botao37.setBackground(Color.white);
		listabotoes[37]=botao37;
		botao37.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=37;
				Interpol.mainwindow.tt.taque();}});
		JButton botao38=new JButton("38");
		botao38.setSize(50,26);
		botao38.setLocation(895,311);
		mapa.add(botao38);
		botao38.setBackground(Color.white);
		listabotoes[38]=botao38;
		botao38.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=38;
				Interpol.mainwindow.tt.taque();}});
		JButton botao39=new JButton("39");
		botao39.setSize(50,26);
		botao39.setLocation(895,212);
		mapa.add(botao39);
		botao39.setBackground(Color.white);
		listabotoes[39]=botao39;
		botao39.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=39;
				Interpol.mainwindow.tt.taque();}});
		JButton botao40=new JButton("40");
		botao40.setSize(50,26);
		botao40.setLocation(952,588);
		mapa.add(botao40);
		botao40.setBackground(Color.white);
		listabotoes[40]=botao40;
		botao40.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=40;
				Interpol.mainwindow.tt.taque();}});
		JButton botao41=new JButton("41");
		botao41.setSize(50,26);
		botao41.setLocation(971,493);
		mapa.add(botao41);
		botao41.setBackground(Color.white);
		listabotoes[41]=botao41;
		botao41.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=41;
				Interpol.mainwindow.tt.taque();}});
		JButton botao42=new JButton("42");
		botao42.setSize(50,26);
		botao42.setLocation(997,409);
		mapa.add(botao42);
		botao42.setBackground(Color.white);
		listabotoes[42]=botao42;
		botao42.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=42;
				Interpol.mainwindow.tt.taque();}});
		JButton botao43=new JButton("43");
		botao43.setSize(50,26);
		botao43.setLocation(1008,318);
		mapa.add(botao43);
		botao43.setBackground(Color.white);
		listabotoes[43]=botao43;
		botao43.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=43;
				Interpol.mainwindow.tt.taque();}});
		JButton botao44=new JButton("44");
		botao44.setSize(50,26);
		botao44.setLocation(1069,223);
		mapa.add(botao44);
		botao44.setBackground(Color.white);
		listabotoes[44]=botao44;
		botao44.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=44;
				Interpol.mainwindow.tt.taque();}});
		JButton botao45=new JButton("45");
		botao45.setSize(50,26);
		botao45.setLocation(1008,144);
		mapa.add(botao45);
		botao45.setBackground(Color.white);
		listabotoes[45]=botao45;
		botao45.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=45;
				Interpol.mainwindow.tt.taque();}});
		JButton botao46=new JButton("46");
		botao46.setSize(50,26);
		botao46.setLocation(1038,585);
		mapa.add(botao46);
		botao46.setBackground(Color.white);
		listabotoes[46]=botao46;
		botao46.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=46;
				Interpol.mainwindow.tt.taque();}});
		JButton botao47=new JButton("47");
		botao47.setSize(50,26);
		botao47.setLocation(1119,584);
		mapa.add(botao47);
		botao47.setBackground(Color.white);
		listabotoes[47]=botao47;
		botao47.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=47;
				Interpol.mainwindow.tt.taque();}});
		JButton botao48=new JButton("48");
		botao48.setSize(50,26);
		botao48.setLocation(1114,505);
		mapa.add(botao48);
		botao48.setBackground(Color.white);
		listabotoes[48]=botao48;
		botao48.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=48;
				Interpol.mainwindow.tt.taque();}});
		JButton botao49=new JButton("49");
		botao49.setSize(50,26);
		botao49.setLocation(1114,403);
		mapa.add(botao49);
		botao49.setBackground(Color.white);
		listabotoes[49]=botao49;
		botao49.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				Interpol.mainwindow.str=49;
				Interpol.mainwindow.tt.taque();}});
		
		setVisible(true);//torna tudo visivel
	}
	public void inserelinha(String linha) {// funcao para inserir uma linha de texto no painel de texto
		texto.append(linha + "\n");
	}
	public void removelinha() { // limpa o painel de texto
		texto.setText("");
	}
	public void adicionatransp(String transp) { //adiciona a figura do meio de transporte utilizado pelo mister x
		if(transp=="metro") {
			Imagem metro=new Imagem();// cria um objeto do tipo Imagem
			JLabel m=metro.imagem("metro.png"); // diz que a imagem adicionada sera a de um metro
			setSize(104,58); // define o tamanho da imagem
			transportes.add(m); // adiciona no jpanel de transportes
		}
		else if(transp=="onibus") {
			Imagem onibus=new Imagem();
			JLabel o=onibus.imagem("onibus.png");
			setSize(104,58);
			transportes.add(o);
		}
		else {
			Imagem taxi=new Imagem();
			JLabel t=taxi.imagem("taxi.png");
			setSize(104,58);
			transportes.add(t);
		}
	}
	public void adicionaImagem(JLabel img) { //funcao para adicionar a imagem de fundo do mapa
		img.setSize(1058,662);
		img.setLocation(130,0);
		mapa.add(img);
		SwingUtilities.updateComponentTreeUI(this);
	}
}
