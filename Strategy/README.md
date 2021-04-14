# Strategy
## Strategy é um padrão de projeto de software (do inglês Design Pattern). Pode ser chamado de policy. Este padrão foi documentado no Catálogo GOF (Gang of Four), sendo categorizado como um padrão comportamental de desenvolvimento de software.

O Strategy delega as responsabilidades adquiridas pelas entidades, atribuindo, portanto, o comportamento. Assim a comunicação entre os objetos é aprimorada, pois há a distribuição das responsabilidades. O objetivo é representar uma operação a ser realizada sobre os elementos de uma estrutura de objetos. O padrão Strategy permite definir novas operações sem alterar as classes dos elementos sobre os quais opera. Segundo o catálogo GOF o padrão tem como meta: "*Definir uma família de algoritmos, encapsular cada uma delas e torná-las intercambiáveis. Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.*"

Por exemplo, uma classe que realiza validação em dados de entrada pode usar o padrão de estratégia para selecionar um algoritmo de validação dependendo do tipo de dados, a fonte dos dados, a escolha do usuário ou outros fatores discriminantes. Esses fatores não são conhecidos até o tempo de execução e podem exigir uma validação radicalmente diferente para ser executada. Os algoritmos de validação (estratégias), encapsulados separadamente do objeto de validação, podem ser usados por outros objetos de validação em diferentes áreas do sistema (ou mesmo em sistemas diferentes) sem duplicação de código.

![Strategy Pattern](https://www.programmingwithwolfgang.com/assets/img/posts/2018/01/Strategy.jpg)

<br>

FONTE: [Wikipedia](https://en.wikipedia.org/wiki/Strategy_pattern)
