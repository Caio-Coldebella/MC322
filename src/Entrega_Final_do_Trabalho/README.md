# Estrutura de Arquivos e Pastas

~~~
├── README.md          <- apresentação do projeto
│
├── src                <- projeto em Java (preferencialmente projeto no Eclipse)
│   │
│   ├── Interpol           <- arquivos-fonte do projeto (.java)
│   │
│   └── README.md      <- instruções básicas de instalação/execução
│
├── bin
|   |
|   └── Interpol       <- arquivos em bytecode (.class)
│
└── assets             <- mídias usadas no projeto
~~~

## `assets`
![Tabuleiro](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/assets/tabuleiro.png)
![Táxi](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/assets/taxi.png)
![Ônibus](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/assets/onibus.png)
![Metrô](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/assets/metro.png)

# Projeto `Interpol`

# Descrição Resumida do Jogo
* O projeto é uma versão simplificada do jogo Interpol, o tabuleiro é composto de 50 estações, sendo estas de Metrô, Ônibus ou Táxi. O jogador controla 4 peças que representam os detetives, já o computador controla o MisterX, cada peça começa em uma estação diferente no tabuleiro. O objetivo do jogo é estar na mesma casa do MisterX em até 12 rodadas, caso contrário o MisterX vencerá. O MisterX move-se escondido pelo tabuleiro, sendo que toda rodada é revelado o meio de transporte que ele utilizou para se locomover, e sendo revelada a sua posição apenas nas rodadas 2, 6 e 10, e na última caso MisterX vença.
  * Todas as peças se movem da seguinte forma:
    * Caso estejam em uma estação de metrô:
      * Podem se mover para uma estação de metrô vizinha utilizando o metrô, podem se mover para uma estação de ônibus vizinha utilizando ônibus, e podem se mover para uma estação de táxi vizinha utilizando táxi.
    * Caso estejam em uma estação de ônibus:
      * Podem se mover para uma estação de metrô vizinha utilizando ônibus, podem se mover para uma estação de ônibus vizinha utilizando õnibus, e podem se mover para uma estação de táxi vizinha utilizando táxi.
    * Caso estejam em uma estação de táxi:
      * Podem se mover para uma estação de metrô, ônibus ou taxi vizinhas utilizando táxi

# Equipe
* `Caio Ruiz Coldebella` - `232621`

# Vídeos do Projeto

## Vídeo da Prévia
* [Prévia Interpol](https://www.youtube.com/watch?v=-aVv7dPcn2w&t=2s)

## Vídeo do Jogo
* [Demonstração do Jogo](https://www.youtube.com/watch?v=b_18EhfYALQ&t=54s)

# Slides do Projeto

## Slides da Prévia
* [Slides Prévia](https://docs.google.com/presentation/d/1S1_0Auh7A4Bnty0BI946roO-Hn6JHsnYs1UAQwbwXwI/edit?usp=sharing)

## Slides da Apresentação Final
* [Slides Apresentação Final](https://docs.google.com/presentation/d/12gT9gZTss7E-y8oYp15K24NXYm8-5Ades8nL5rl_mfQ/edit?usp=sharing)

# Relatório de Evolução

### Dificuldades enfrentadas
* Interromper a execução da main até um botão gerar um evento
	`O principal problema enfrentado ao implementar o código foi a dificuldade em fazer o código da main interromper a sua execução temporariamente até um dos 50 botões das estações gerar um evento, pois a main necessita da variavel str (int) que representa a casa para a qual a peça irá se movimentar, a qual é setada ao usuário pressionar um botão.`
	`A solução encontrada foi a utilização de thread, assim foi criada uma classe de nome "thread", a qual possui duas funções. A primeira função, "tique", é chamada pela main logo antes de esta necessitar da variável str para realizar o movimento dos Policiais, essa função possui o método "wait", o que faz com que a main entre em estado de espera.`
	`A segunda função possui nome "taque", e é chamada por qualquer botão que é pressionado logo após este setar a variavel str, essa função, através do "notify", notifica que a função main de que esta deve retomar o código de onde ela parou, segue abaixo o código da classe "thread"`

~~~java	
public class thread {
	boolean esperando;
	public thread() {}
	synchronized void tique() {
	esperando=true; // agora o objeto thread esta esperando um evento de algum botao
	notify();
	try {while(esperando) {// esperando algum evento de um botao
			wait();}
	}catch (InterruptedException e) {
		e.printStackTrace();}}
	synchronized void taque() {// ocorreu o evento em algum botao
	esperando=false;
	notify();// agora a thread prossegue o codigo na main}}		
~~~
### Melhorias
 * Aperfeiçoamento do codigo de movimento do Mister X
	`Inicialmente o código para o movimento do Mister X era muito simplificado, o código utilizava a lista com toda a vizinhança da estação onde o Mister X se encontrava, e sorteava (utilizando a função Random) um número entre zero e o tamanho dessa lista, a estação de destino seria a estação cujo índice na lista era igual ao número sorteado, porém se a estação estivesse ocupada era realizado um novo sorteio até ser sorteada uma estação vazia.`
	`Entretanto ocorriam alguns problemas com esta função, primeiramente ela não previa o caso onde Mister X estava cercado por todos os lados pelas peças adversárias, ou seja, sem nehuma estação vizinha vazia, nesse caso era sorteada uma estação infinitamente. Além disso, por diversas vezes o Mister X acabava se colocando em posições extremamente arriscadas, como se mover para uma casa com uma ou mais estações vizinhas ocupadas por uma peça inimiga, nestes casos ele era facilmente pego, e era muito fácil do usuário/jogador vencer o jogo.`
	`Dessa forma ,a lógica da nova função de movimento foi implementada de forma a resolver estes problemas. A partir da lista contendo todos os vizinhos da estação onde se encontrava Mister X foi criada uma nova lista, chamada "vizinhosvazios", contendo apenas as estações vizinhas da estação de origem que não estavam ocupadas, então há 3 casos:`
	** Se a lista "vizinhosvazios" não possuír nenhuma estação, então Mister X está cercado, neste caso o jogador vence o jogo
	** Se a lista "vizinhosvazios" possui apenas uma estação, então Mister X se moverá para esta
	** Se a lista "vizinhosvazios" possui 2 ou mais estações, todas as estações contidas nessa lista terão a sua vizinhança verificada, e as estações que estiverem com todos os seus vizinhos vazios, serão adicionadas na lista vizinhoscomvizinhosvazios, então teremos mais 3 casos:
		*** Se a lista "vizinhoscomvizinhosvazios" estiver vazia, será sorteada através da função nextInt() da biblioteca java.util.Random uma estação a partir da lista "vizinhosvazios", e o Mister X se moverá para lá
		*** Se a lista "vizinhoscomvizinhosvazios" possuir apenas uma estação, Mister X se moverá para lá	
		*** Se a lista "vizinhoscomvizinhosvazios" possuir 2 ou mais estações, uma destas será sorteada e Mister X se moverá para lá	
	`O código da função de movimento do Mister X se encontra na sessão Destaques de Código deste documento`

# Destaques de Código

* Código do movimento do Mister X
~~~java
public class MisterX implements IMisterX{
	private int pos;
	private Estacao[] vizinhosvazios;
	private Estacao[] vizinhoscomvizinhosvazios;
	private String transporte;
	...
	public void random(ITabuleiro t,IPolicia p) {
		int a=getpos();// a=posicao do mister x
		Estacao[] vizinhos=Interpol.Tabuleiro.tab[a].getvizinhanca();//coloca os vizinhos em uma lista
		int len=vizinhos.length;
		vizinhosvazios=null; //cria uma lista com vizinhos vazios
		vizinhosvazios=new Estacao[1];// define a lista como tamanho 1
		for(int j=0;j<len;j++) {
			if(vizinhos[j].getOcupada()=="nao") {// se o vizinho esta vazio adiciona na lista dos vizinhos vazios
				addvizinhovazio(vizinhos[j]);}}// chama a funcao que adiciona um vizinho a lista vizinhos vazios
		len=vizinhosvazios.length;// atualiza len para o tamanho dos vizinhos vazios
		if(len==1 && vizinhosvazios[0]==null) {// se nenhum vizinho estiver vazio, significa que a peca nao tem para onde ir e vai ser capturada
			p.setcaptura();
			return;}
		if(len==1) {// se tiver apenas um vizinho vazio a peca se move para esse vizinho
			...
		// se tiver mais de um vizinho vazio, verifica quais desses vizinhos tem toda a sua vizinha vazia (exceto pelo misterx)
		vizinhoscomvizinhosvazios=null;
		vizinhoscomvizinhosvazios=new Estacao[1];
		for(int j=0;j<len;j++) {
			if(vizinhancaocupada(vizinhosvazios[j])==false) { // chama a funcao para verificar se esta estacao possui vizinhanca totalmente vazia
				addvizinhoscomvizinhosvazios(vizinhosvazios[j]);}} // se possuir adiciona a estacao na lista vizinhoscomvizinhosvazios
		len=vizinhoscomvizinhosvazios.length; // atualiza len
		if(len==1 && vizinhoscomvizinhosvazios[0]==null) {// se nenhum vizinho possuir vizinhanca vazia eh sorteado uma estacao da lista vizinhosvazios
			len=vizinhosvazios.length; // atualiza len
			int randint;
			Random r=new Random();
			...
		if(len==1) { // se so ha um vizinho com vizinhanca vazia a peca se move para la
			...
		// se ha mais de um vizinho com vizinhanca vazia, eh realizado um sorteio entre as estacoes da lista vizinhoscomvizinhosvazios
		int randint;
		Random r=new Random();
		...
		}}
~~~
* Código de determinação do meio de transporte de Mister X
~~~java
public class Tabuleiro implements ITabuleiro{
...
public void movermisterx(int origem,int destino, IMisterX mx) { //move misterx e verifica o meio de transporte
	if (tab[destino].getOcupada()=="nao") {
		...
		if(tab[origem].getClass()==EstTaxi.class) {
			mx.settransp("taxi");}
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
				mx.settransp("metro");}}}}
~~~

* Código de adição de imagem na janela do jogo
~~~java
public class Imagem extends JLabel{
	private static final long serialVersionUID = 1L;
	public JLabel imagem(String arquivoImagem) {
		ImageIcon a=new ImageIcon(getClass().getResource(arquivoImagem));
		JLabel imagem=new JLabel(a);
		return imagem;}}
-------------------------------------------------------------------------------------------
public class windowbotao extends JFrame{
...
public void adicionaImagem(JLabel img) { //funcao para adicionar a imagem de fundo do mapa
		img.setSize(1058,662);
		img.setLocation(130,0);
		mapa.add(img);
		SwingUtilities.updateComponentTreeUI(this);}
~~~

* Código de alteração da cor dos botões
~~~java
public class windowbotao extends JFrame{
	***
	public static void alteracor(int nbotao, String cor) { // funcao usada para alterar a cor do botao requisitado, toda vez que alguma peca se move
		if(cor=="branco") {listabotoes[nbotao].setBackground(Color.white);}
		else if(cor=="vermelho") {listabotoes[nbotao].setBackground(Color.red);}
		else if(cor=="verde") {listabotoes[nbotao].setBackground(Color.green);}
		else if(cor=="amarelo") {listabotoes[nbotao].setBackground(Color.yellow);}
		else if(cor=="azul") {listabotoes[nbotao].setBackground(Color.cyan);}
		else {listabotoes[nbotao].setBackground(Color.magenta);}}
~~~
# Destaques de Pattern

## Diagrama do Pattern

![Diagrama Pattern](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/diagramapattern.png)

## Código do Pattern
~~~java
public class thread {
	boolean esperando;
	public thread() {}
	synchronized void tique() {
	esperando=true; // agora o objeto thread esta esperando um evento de algum botao
	notify();
	try {
		while(esperando) {// esperando algum evento de um botao
			wait();}
	}catch (InterruptedException e) {
		e.printStackTrace();}
	}
	synchronized void taque() {// ocorreu o evento em algum botao
	esperando=false;
	notify();// agora a thread prossegue o codigo na main
	}}
public class mainwindow {
	...
	public static void main(String[] args) {
	...
	tt.tique();
	verde.movement(str, t);
}
public class windowbotao extends JFrame{
...
	public void visual() {
	...
	JButton botao9=new JButton("9");
	...
	botao9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
		Interpol.mainwindow.str=9;
		Interpol.mainwindow.tt.taque();}});
}
~~~

A main opera sequencialmente, porem quando ela precisa da informação do novo valor de str (casa para aonde a peça se moverá) ela chama a função tique da classe thread, que coloca a main em estado de espera. Quando o botão é pressionado, é gerado um evento, o valor de str é setado de acordo com o botão que é apertado, e a main volta a operar normalmente.

# Documentação dos Componentes

# Diagramas

## Diagrama Geral do Projeto

![Diagrama Geral do Projeto](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/Diagrama_Geral_do_Projeto.jpg)

No diagrama podemos ver que a classe mainwindow recebe e envia informações diretamente para Tabuleiro, MisterX, Policia, Estacao e Rodadas.
Recebe e envia para thread, e envia informações para windowbotao.
Imagem envia para windowbotao, e windowbotao envia informações para thread

## Diagrama Geral de Componentes

![Diagrama Geral de Componentes](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/Diagrama_Componentes.jpg)

## Componente `EstMetro`

Representa cada uma das estações de metrô, e definirá se as peças ocupam estas estações, assim como armazenará informaçoes sobre suas estações vizinhas.

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/estmetro.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `MC322.src.Entrega_Final_do_Trabalho.src.Interpol.EstMetro`
Autores | `Caio Ruiz Coldebella`
Interfaces | `Estacao`

### Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/estacaometro.png)

Interface agregadora do componente em Java:

~~~java
public interface Estacao {
	public String getOcupada();
	public void setOcupada(String ocup);
	public Estacao[] getvizinhanca();
	public void addvizinho(Estacao vizinho);
}
~~~
## Componente `EstOnibus`

Representa cada uma das estações de ônibus, e definirá se as peças ocupam estas estações, assim como armazenará informaçoes sobre suas estações vizinhas.

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/estonibus.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `MC322.src.Entrega_Final_do_Trabalho.src.Interpol.EstOnibus`
Autores | `Caio Ruiz Coldebella`
Interfaces | `Estacao`

### Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/estacaoonibus.png)

Interface agregadora do componente em Java:

~~~java
public interface Estacao {
	public String getOcupada();
	public void setOcupada(String ocup);
	public Estacao[] getvizinhanca();
	public void addvizinho(Estacao vizinho);
}
~~~
## Componente `EstTaxi`

Representa cada uma das estações de táxi, e definirá se as peças ocupam estas estações, assim como armazenará informaçoes sobre suas estações vizinhas.

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/esttaxi.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `MC322.src.Entrega_Final_do_Trabalho.src.Interpol.EstTaxi`
Autores | `Caio Ruiz Coldebella`
Interfaces | `Estacao`

### Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/estacaotaxi.png)

Interface agregadora do componente em Java:

~~~java
public interface Estacao {
	public String getOcupada();
	public void setOcupada(String ocup);
	public Estacao[] getvizinhanca();
	public void addvizinho(Estacao vizinho);
}
~~~
## Componente `MisterX`

Representar a peça do MisterX, assim como sortear para qual estação ele se moverá

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/misterx.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `MC322.src.Entrega_Final_do_Trabalho.src.Interpol.MisterX`
Autores | `Caio Ruiz Coldebella`
Interfaces | `IMisterX`

### Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/imisterx.png)

Interface agregadora do componente em Java:

~~~java
public interface IMisterX {
	public int getpos();
	public void setpos(int posicao);
	public void random(ITabuleiro t,IPolicia p);
	public String gettransp();
	public void settransp(String transporte);
}
~~~
## Componente `Policia`

Representar as peças controladas pelo jogador e verificar se estas podem se mover para a estação selecionada pelo jogador

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/policia.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `MC322.src.Entrega_Final_do_Trabalho.src.Interpol.Policia`
Autores | `Caio Ruiz Coldebella`
Interfaces | `IPolicia`

### Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/ipolicia.png)

Interface agregadora do componente em Java:

~~~java
public interface IPolicia {
	public String getnome();
	public int getpos();
	public void setpos(int posicao);
	public void movement(int estacao,ITabuleiro t);
	public boolean getcaptura();
	public void setcaptura();
}
~~~
## Componente `Tabuleiro`

Armazenar uma lista contendo todas as estações, assim como mover as peças de uma estação para a outra e verificar quando o MisterX deve se revelar e quando o jogo acaba

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/Tabuleiro.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `MC322.src.Entrega_Final_do_Trabalho.src.Interpol.tabuleiro`
Autores | `Caio Ruiz Coldebella`
Interfaces | `ITabuleiro`

### Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/itabuleiro.png)

Interface agregadora do componente em Java:

~~~java
public interface ITabuleiro {
	public void criatabuleiro();
	public void moverpolicia(int origem, int destino, Policia p);
	public void movermisterx(int origem, int destino,IMisterX mx);
	public int buscaposicao(Estacao casa);
}
~~~
## Componente `Rodadas`

Armazenar a informação de qual rodada o jogo se encontra, assim como incrementar tal dado e também verificar se o MisterX deve se mover naquela rodada

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/rodadas.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `MC322.src.Entrega_Final_do_Trabalho.src.Interpol.Rodadas`
Autores | `Caio Ruiz Coldebella`
Interfaces | `IRodadas`

### Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/irodadas.png)

Interface agregadora do componente em Java:

~~~java
public interface IRodadas {
	public int getrodada();
	public void incrodada();
	public boolean revealposition();
}
~~~
## Componente `Imagem`

Recebe uma String com o nome de um arquivp .png e retorna um JLabel contendo o arquivo .png

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/imagem.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `MC322.src.Entrega_Final_do_Trabalho.src.Interpol.Imagem`
Autores | `Caio Ruiz Coldebella`

## Componente `thread`

É chamada pela main, e faz a main esperar pela geração de um evento por algum botao para prosseguir o código

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/thread.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `MC322.src.Entrega_Final_do_Trabalho.src.Interpol.thread`
Autores | `Caio Ruiz Coldebella`

## Componente `windowbotao`

Tem como objetivo gerar a interface gráfica, e alterar a mesma, além de gerar os eventos de cada botão quando pressionado e alterar as cores desses

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/windowbotao.png)

**Ficha Técnica**
item | detalhamento
----- | -----
Classe | `MC322.src.Entrega_Final_do_Trabalho.src.Interpol.windowbotao`
Autores | `Caio Ruiz Coldebella`

## Detalhamento das Interfaces

### Interface `Estacao`
`Interface provida por qualquer classe que represente uma estação, podendo ser de metrô, ônibus ou táxi`

~~~java
public interface Estacao {
	public String getOcupada();
	public void setOcupada(String ocup);
	public Estacao[] getvizinhanca();
	public void addvizinho(Estacao vizinho);}
~~~
Método | Objetivo
-------| --------
`getOcupada` | `Retorna uma String que diz se a estação está ocupada, e se sim por qual peça`
`setOcupada` | `Recebe uma String para alterar o estado de ocupação de uma estação no tabuleiro`
`getvizinhanca` | `Retorna uma lista do tipo Estacao[] com todos os vizinhos da estação`
`addvizinho` | `Adiciona uma estação vizinha á lista vizinhança de uma peça`

### Interface `IMisterX`
`Interface que recebe a classe MisterX`

~~~java
public interface IMisterX {
	public int getpos();
	public void setpos(int posicao);
	public void random(ITabuleiro t,IPolicia p);
	public String gettransp();
	public void settransp(String transporte);}
~~~
Método | Objetivo
-------| --------
`getpos` | `Retorna um número que representa em qual estação MisterX está`
`setpos` | `Move MisterX para outra estação`
`random` | `Define para qual estação MisterX se moverá naquela rodada`
`gettransp` | `Retorna uma String com o meio com de transporte utilizado pelo Mister X naquela rodada`
`settransp` | `Recebe uma String e a usa para alterar o meio de transporte utilizado pelo Mister X naquela rodada`

### Interface `IPolicia`
`Interface que recebe a classe Policia`

~~~java
public interface IPolicia {
	public String getnome();
	public int getpos();
	public void setpos(int posicao);
	public void movement(int estacao,ITabuleiro t);
	public boolean getcaptura();
	public void setcaptura();}
~~~
Método | Objetivo
-------| --------
`getnome` | `Retorna uma String com o nome do policial (vermelho, verde, amarelo ou azul)`
`getpos` | `Retorna um int que representa em qual estação a peça está`
`setpos` | `Altera a posição de uma peça do tipo Polícia`
`movement` | `Move uma peça do tipo Policia para outra estação`
`getcaptura` | `Retorna um booleano que diz se aquela peça capturou o Mister X`
`setcaptura` | `Função void que define que aquela peça capturou o Mister X`

### Interface `ITabuleiro`
`Interface que representa o tabuleiro do jogo e recebe a interface Estacao em um de seus métodos`

~~~java
public interface ITabuleiro {
	public void criatabuleiro();
	public void moverpolicia(int origem, int destino, Policia p);
	public void movermisterx(int origem, int destino,IMisterX mx);
	public int buscaposicao(Estacao casa);}
~~~
Método | Objetivo
-------| --------
`criatabuleiro` | `Cria a lista do tipo Estacao[] tab, que armazena as 50 estações do tabuleiro`
`moverpolicia` | `Move uma peça do tipo Policia e verifica se o jogo acabou`
`movermisterx` | `Move uma peça do tipo MisterX`
`buscaposicao` | `Busca uma estação na lista tab e retorna o seu número`

### Interface `IRodadas`
`Interface provida pela classe Rodadas`

~~~java
public interface IRodadas {
	public int getrodada();
	public void incrodada();
	public boolean revealposition();}
~~~
Método | Objetivo
-------| --------
`getrodada` | `Retorna o número da rodada atual`
`incrodada` | `Aumenta em 1 o número da rodada`
`revealposition` | `Verifica se o MisterX deve revelar sua posição naquela rodada, se sim retorna true, retorna false caso contrário`

# Plano de Exceções

## Diagrama da hierarquia de exceções

![Diagrama Excecoes](https://github.com/Caio-Coldebella/MC322/blob/master/src/Entrega_Final_do_Trabalho/diagramaexcecoes.png)

## Descrição das classes de exceção

Classe | Descrição
----- | -----
Exception         | Engloba todas as exceções
movimentoinvalido | Engloba todos os casos em que uma peça tenta se mover para uma casa que nao é vizinha ou para a casa que ocupa atualmente

