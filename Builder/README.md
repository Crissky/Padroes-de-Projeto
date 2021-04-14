# Builder

### Builder é um padrão de projeto de software criacional (do inglês Design Pattern) que permite a separação da construção de um objeto complexo da sua representação, de forma que o mesmo processo de construção possa criar diferentes representações.

O padrão Builder pode ser utilizado em uma aplicação que converte o formato de texto RTF para uma série de outros formatos e que permite a inclusão de suporte para conversão para outros formatos, sem a alteração do código fonte do leitor de RTF.

A implementação da solução para esse problema pode ser realizada através de uma classe de leitura (director) associada a uma classe capaz de converter o formato RTF para outra representação (builder). O objeto da classe de leitura lê cada token do texto e executa o método apropriado no objeto de conversão, de acordo com tipo do token. A classe de conversão possui um método para cada tipo de token, incluindo os caracteres comuns, parágrafos, fontes e etc. Para cada formato de texto suportado é criada uma classe de conversão especializada (concrete builder). Um conversor para formato ASCII, por exemplo, poderia ignorar qualquer requisição para converter tokens que não fossem caracteres comuns. Um conversor para o formato PDF, por outro lado, iria processar qualquer requisição para poder converter o estilo, além do texto.

![Um exemplo de classe UML e diagrama de sequência para o padrão de design Builder.](https://upload.wikimedia.org/wikipedia/commons/8/87/W3sDesign_Builder_Design_Pattern_UML.jpg)

<br>

FONTE: [Wikipedia](https://en.wikipedia.org/wiki/Builder_pattern)
