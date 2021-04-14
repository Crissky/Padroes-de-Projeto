# State
## State é um padrão de projeto de software (do inglês Design Pattern). Ele é usado quando o comportamento de um objeto muda, dependendo do seu estado.

Em certas ocasiões, quando o contexto em que está a desenvolver requer um objeto que possua comportamentos diferentes dependendo de qual estado se encontra, é difícil manejar a mudança de comportamento e os estados desse objeto, tudo dentro do mesmo bloco de código. O padrão State propõe uma solução para esta complicação, criando basicamente, um objeto para cada estado possível do objeto que o chama.

O padrão State é motivado por aqueles objetos que, em seu estado atual, varia o seu comportamento devido as diferentes mensagens que possa receber. Como exemplo, tomamos uma classe Livro, um objeto desta classe terá respostas diferentes, dependendo do seu estado(Disponível ou Emprestado). Por exemplo invocando o método reservar de um objeto da classe Livro seu comportamento será diferente, se o Livro está no estado Disponível ou no estado Emprestado.

A implementação de um comportamento específico de estado diretamente dentro de uma classe é inflexível porque compromete a classe com um comportamento específico e torna impossível adicionar um novo estado ou alterar o comportamento de um estado existente posteriormente, independentemente (sem alterar) a classe. Neste, o padrão descreve duas soluções:
- Defina objetos separados (estado) que encapsulam o comportamento específico de cada estado. Ou seja, defina uma interface (estado) para executar o comportamento específico do estado e defina as classes que implementam a interface para cada estado.
- Uma classe delega o comportamento específico do estado para seu objeto de estado atual em vez de implementar o comportamento específico do estado diretamente.

Isso torna uma classe independente de como o comportamento específico do estado é implementado. Novos estados podem ser adicionados definindo novas classes de estado. Uma classe pode alterar seu comportamento em tempo de execução, alterando seu objeto de estado atual.

![Diagrama UML, exemplo Padrão State](https://upload.wikimedia.org/wikipedia/commons/b/b9/LibroActualizado.jpg)

<br>

FONTE: [Wikipedia](https://en.wikipedia.org/wiki/State_pattern)
