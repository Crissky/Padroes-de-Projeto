# Decorator
## Decorator é um padrão de projeto de software criacional (do inglês Design Pattern) que permite adicionar um comportamento a um objeto já existente em tempo de execução, ou seja, agrega dinamicamente responsabilidades adicionais a um objeto.

### Que problemas pode resolver?
Decorators oferecem uma alternativa flexível ao uso de herança para estender uma funcionalidade, com isso adiciona-se uma responsabilidade ao objeto e não à classe.

O Decorator surgiu da necessidade de adicionar um comportamento, funcionalidade ou estado extra a um objeto em tempo de execução, por exemplo quando Herança não é concebível por ser um caso que geraria um número muito alto de sub-classes.

### Exemplo
Suponha que existe um objeto Arma, ela pode ter comportamentos diferentes dependendo da munição, dependendo do tipo de mira que tiver, se tiver algum tipo de silenciador ou outro acessório. Imagine criar agora uma sub classe para cada combinação possível de armas, o número de classes aumenta exponencialmente para cada opção a mais que você tiver. É ai que entra o Decorator.

![Um exemplo do que poderia ser feito, caso não usado o padrão Decorator](https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Exemplo_Errado_Decorator.tif/lossless-page1-1346px-Exemplo_Errado_Decorator.tif.png)

### Que solução ele descreve?
O Decorator resolve problemas que a herança gera em determinados momentos, em que classes precisam ser muitos especificadas e detalhadas de diferentes formas gerando excessivas subclasses. Nestes momentos o decorator é aplicado. Diminuindo drasticamente as classes geradas e permitindo flexibilidade aos atributos e métodos.

Isto acontece, pois, a solução por de trás deste padrão é encapsular o objeto original dentro de uma interface. Ambos os objetos decorator e o objeto principal herdam essa interface. A interface utiliza composição recursiva para permitir que os ilimitados números de “decorações” possam ser adicionados ao objeto principal.

Esta solução traz ao projeto uma flexibilidade maior, em que pode se adicionar ou remover responsabilidades sem que seja necessário editar o código-fonte, alta coesão e fraco acoplamento.

<br>

FONTE: [Wikipedia](https://en.wikipedia.org/wiki/Decorator_pattern)
