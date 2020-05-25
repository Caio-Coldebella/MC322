# Projeto Jogo Interpol

## Equipe
  * Caio Ruiz Coldebella RA:232621
## Descrição Resumida do Projeto
  * O projeto é uma versão simplificada do jogo Interpol, o tabuleiro é composto de 50 estações, sendo estas de Metrô, Ônibus ou Táxi. O jogador controla 4 peças que representam os detetives, já o computador controla o MisterX, cada peça começa em uma estação diferente no tabuleiro. O objetivo do jogo é estar na mesma casa do MisterX em até 12 rodadas, caso contrário o MisterX vencerá. O MisterX move-se escondido pelo tabuleiro, sendo que toda rodada é revelado o meio de transporte que ele utilizou para se locomover, e sendo revelada a sua posição apenas nas rodadas 2, 6 e 10, e na última caso MisterX vença.
  * Todas as peças se movem da seguinte forma:
    * Caso estejam em uma estação de metrô:
      * Podem se mover para uma estação de metrô vizinha utilizando o metrô, podem se mover para uma estação de ônibus vizinha utilizando ônibus, e podem se mover para uma estação de táxi vizinha utilizando táxi.
    * Caso estejam em uma estação de ônibus:
      * Podem se mover para uma estação de metrô vizinha utilizando ônibus, podem se mover para uma estação de ônibus vizinha utilizando õnibus, e podem se mover para uma estação de táxi vizinha utilizando táxi.
    * Caso estejam em uma estação de táxi:
      * Podem se mover para uma estação de metrô, ônibus ou taxi vizinhas utilizando táxi

## Vídeo do Projeto
  * [Acessar](https://www.youtube.com/watch?v=ytJRJuvAP7o&t=8s)
## Diagrama Geral de Componentes
  ![pag1](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/pag1.jpg)
  ![pag2](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/pag2.jpg)
# Componente `EstMetro`

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/estmetro.png)

## Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/estacaometro.png)

Campo | Valor
----- | -----
Classe |`MC322/src/Projeto_Jogo_Interpol/EstMetro.java`
Autores | `Caio Ruiz Coldebella`
Objetivo | `Representa cada uma das estações de metrô, e definirá se as peças ocupam estas estações, assim como armazenará informaçoes sobre suas estações vizinhas.`
Interface | `Estacao`
~~~
public interface Estacao {
	public String getOcupada();
	public void setOcupada(String ocup);
	public Estacao[] getvizinhanca();
	public void addvizinho(Estacao vizinho);
}
~~~
# Componente `EstOnibus`

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/estonibus.png)

## Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/estacaoonibus.png)

Campo | Valor
----- | -----
Classe |`MC322/src/Projeto_Jogo_Interpol/EstMetro.java`
Autores | `Caio Ruiz Coldebella`
Objetivo | `Representa cada uma das estações de ônibus, e definirá se as peças ocupam estas estações, assim como armazenará informaçoes sobre suas estações vizinhas.`
Interface | `Estacao`
~~~
public interface Estacao {
	public String getOcupada();
	public void setOcupada(String ocup);
	public Estacao[] getvizinhanca();
	public void addvizinho(Estacao vizinho);
}
~~~
# Componente `EstTaxi`

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/esttaxi.png)

## Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/estacaotaxi.png)

Campo | Valor
----- | -----
Classe |`MC322/src/Projeto_Jogo_Interpol/EstMetro.java`
Autores | `Caio Ruiz Coldebella`
Objetivo | `Representa cada uma das estações de táxi, e definirá se as peças ocupam estas estações, assim como armazenará informaçoes sobre suas estações vizinhas.`
Interface | `Estacao`
~~~
public interface Estacao {
	public String getOcupada();
	public void setOcupada(String ocup);
	public Estacao[] getvizinhanca();
	public void addvizinho(Estacao vizinho);
}
~~~
# Componente `MisterX`

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/misterx.png)

## Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/imisterx.png)

Campo | Valor
----- | -----
Classe | `MC322/src/Projeto_Jogo_Interpol/MisterX.java`
Autores | `Caio Ruiz Coldebella`
Objetivo | `Representar a peça do MisterX, assim como sortear para qual estação ele se moverá`
Interface | `IMisterX`
~~~
public interface IMisterX {
	public int getpos();
	public void setpos(int posicao);
	public void random();
}
~~~
# Componente `Policia`

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/policia.png)

## Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/ipolicia.png)

Campo | Valor
----- | -----
Classe | `MC322/src/Projeto_Jogo_Interpol/Policia.java`
Autores | `Caio Ruiz Coldebella`
Objetivo | `Representar as peças controladas pelo jogador e verificar se estas podem se mover para a estação selecionada pelo jogador`
Interface | `IPolicia`
~~~
public interface IPolicia {
	public int getpos();
	public void setpos(int posicao);
	public void movement(int estacao);
}
~~~
# Componente `Tabuleiro`

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/tabuleiro.png)

## Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/itabuleiro.png)

Campo | Valor
----- | -----
Classe | `MC322/src/Projeto_Jogo_Interpol/Tabuleiro.java`
Autores | `Caio Ruiz Coldebella`
Objetivo | `Armazenar uma lista contendo todas as estações, assim como mover as peças de uma estação para a outra e verificar quando o MisterX deve se revelar e quando o jogo acaba`
Interface | `ITabuleiro`
~~~
public interface ITabuleiro {
	public void criatabuleiro();
	public void moverpolicia(int origem, int destino);
	public void movermisterx(int origem, int destino);
	public int buscaposicao(Estacao casa);
}
~~~
# Componente `Rodadas`

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/rodadas.png)

## Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/irodadas.png)

Campo | Valor
----- | -----
Classe | `MC322/src/Projeto_Jogo_Interpol/Rodadas.java`
Autores | `Caio Ruiz Coldebella`
Objetivo | `Armazenar a informação de qual rodada o jogo se encontra, assim como incrementar tal dado e também verificar se o MisterX deve se mover naquela rodada`
Interface | `IRodadas`
~~~
public interface IRodadas {
	public int getrodada();
	public void incrodada();
	public boolean revealposition();
}
~~~
## Detalhamento das Interfaces

### Interface `Estacao`
`Interface provida por qualquer classe que represente uma estação, podendo ser de metrô, ônibus ou táxi`

Método | Objetivo
-------| --------
`getOcupada` | `Retorna uma string que diz se a estação está ocupada, e se sim por qual peça`
`getvizinhanca` | `Retorna uma lista do tipo Estacao[] com todos os vizinhos da estação`
`addvizinho` | `Adiciona uma estação vizinha á lista vizinhança de uma peça`
### Interface `IMisterX`
`Interface que recebe a classe MisterX`

Método | Objetivo
-------| --------
`getpos` | `Retorna um número que representa em qual estação MisterX está`
`setpos` | `Move MisterX para outra estação`
`random` | `Sorteia para qual estação MisterX se moverá naquela rodada`
### Interface `IPolicia`
`Interface que recebe a classe Policia>`

Método | Objetivo
-------| --------
`getpos` | `Retorna um int que representa em qual estação a peça está`
`setpos` | `Altera a posição de uma peça do tipo Polícia`
`movement` | `Move uma peça do tipo Policia para outra estação`
### Interface `ITabuleiro`
`Interface que representa o tabuleiro do jogo e recebe a interface Estacao em um de seus métodos`

Método | Objetivo
-------| --------
`criatabuleiro` | `Cria a lista do tipo Estacao[] tab, que armazena as 50 estações do tabuleiro`
`moverpolicia` | `Move uma peça do tipo Policia e verifica se o jogo acabou`
`movermisterx` | `Move uma peça do tipo MisterX`
`buscaposicao` | `Busca uma estação na lista tab e retorna o seu número`
### Interface `IRodadas`
`Interface provida pela classe Rodadas`

Método | Objetivo
-------| --------
`getrodada` | `Retorna o número da rodada atual`
`incrodada` | `Aumenta em 1 o número da rodada`
`revealposition` | `Verifica se o MisterX deve revelar sua posição naquela rodada, se sim retorna true, retorna false caso contrário`
