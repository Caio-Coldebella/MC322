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
Objetivo | `<objetivo do componente>`
Interface | `<interface em Java do componente>`
~~~
public interface ITableProducer {
  String[] requestAttributes();
  String[][] requestInstances();
}
public interface IDataSource {
  public String getDataSource();
  public void setDataSource(String dataSource);
}
public interface IDataSet extends ITableProducer, IDataSource {
}
~~~
# Componente `EstOnibus`

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/estonibus.png)

## Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/estacaoonibus.png)

Campo | Valor
----- | -----
Classe | `MC322/src/Projeto_Jogo_Interpol/EstOnibus.java`
Autores | `Caio Ruiz Coldebella`
Objetivo | `<objetivo do componente>`
Interface | `<interface em Java do componente>`
~~~
public interface ITableProducer {
  String[] requestAttributes();
  String[][] requestInstances();
}
public interface IDataSource {
  public String getDataSource();
  public void setDataSource(String dataSource);
}
public interface IDataSet extends ITableProducer, IDataSource {
}
~~~
# Componente `EstTaxi`

![Componente](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/esttaxi.png)

## Interfaces

Interfaces associadas a esse componente:

![Diagrama Interfaces](https://github.com/Caio-Coldebella/MC322/blob/master/src/Projeto_Jogo_Interpol/Images/estacaotaxi.png)

Campo | Valor
----- | -----
Classe |`MC322/src/Projeto_Jogo_Interpol/EstTaxi.java`
Autores | `Caio Ruiz Coldebella`
Objetivo | `<objetivo do componente>`
Interface | `<interface em Java do componente>`
~~~
public interface ITableProducer {
  String[] requestAttributes();
  String[][] requestInstances();
}
public interface IDataSource {
  public String getDataSource();
  public void setDataSource(String dataSource);
}
public interface IDataSet extends ITableProducer, IDataSource {
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
Objetivo | `<objetivo do componente>`
Interface | `<interface em Java do componente>`
~~~
public interface ITableProducer {
  String[] requestAttributes();
  String[][] requestInstances();
}
public interface IDataSource {
  public String getDataSource();
  public void setDataSource(String dataSource);
}
public interface IDataSet extends ITableProducer, IDataSource {
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
Objetivo | `<objetivo do componente>`
Interface | `<interface em Java do componente>`
~~~
public interface ITableProducer {
  String[] requestAttributes();
  String[][] requestInstances();
}
public interface IDataSource {
  public String getDataSource();
  public void setDataSource(String dataSource);
}
public interface IDataSet extends ITableProducer, IDataSource {
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
Objetivo | `<objetivo do componente>`
Interface | `<interface em Java do componente>`
~~~
public interface ITableProducer {
  String[] requestAttributes();
  String[][] requestInstances();
}
public interface IDataSource {
  public String getDataSource();
  public void setDataSource(String dataSource);
}
public interface IDataSet extends ITableProducer, IDataSource {
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
Objetivo | `<objetivo do componente>`
Interface | `<interface em Java do componente>`
~~~
public interface ITableProducer {
  String[] requestAttributes();
  String[][] requestInstances();
}
public interface IDataSource {
  public String getDataSource();
  public void setDataSource(String dataSource);
}
public interface IDataSet extends ITableProducer, IDataSource {
}
~~~






## Detalhamento das Interfaces

### Interface `<nome da interface>`
`<papel da interface>`.

Método | Objetivo
-------| --------
`<id do método em Java>` | `<objetivo do método e descrição dos parâmetros>`

## Exemplo:

### Interface `ITableProducer`

Interface provida por qualquer fonte de dados que os forneça na forma de uma tabela.

Método | Objetivo
-------| --------
`requestAttributes` | Retorna um vetor com o nome de todos os atributos (colunas) da tabela.
`requestInstances` | Retorna uma matriz em que cada linha representa uma instância e cada coluna o valor do respectivo atributo (a ordem dos atributos é a mesma daquela fornecida por `requestAttributes`.

### Interface `IDataSetProperties`

Define o recurso (usualmente o caminho para um arquivo em disco) que é a fonte de dados.

Método | Objetivo
-------| --------
`getDataSource` | Retorna o caminho da fonte de dados.
`setDataSource` | Define o caminho da fonte de dados, informado através do parâmetro `dataSource`.
