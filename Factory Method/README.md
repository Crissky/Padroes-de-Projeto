# Factory Method

### Factory Method ou Construtor virtual, é um padrão de projeto de software (do inglês Design Pattern) que permite às classes delegar para subclasses decidirem, isso é feito através da criação de objetos que chamam o método fabrica especificado numa interface e implementado por um classe filha ou implementado numa classe abstrata e opcionalmente sobrescrito por classes derivadas.

Criar um objeto geralmente requer processos complexos não apropriados para incluir dentro da composição do objeto. A criação do objeto talvez necessite de uma duplicação de código significativa, talvez necessite informações não acessíveis para a composição do objeto, talvez não providencie um grau de abstração suficiente, ou então não faça parte da composição das preocupações do objeto. O padrão de design **Factory Method** maneja/trata esses problemas definindo um método separado para criação dos objetos, no qual as subclasses possam sobrescrever para especificar o "tipo derivado" do produto que vai ser criado.

FONTE: [Wikipedia](https://en.wikipedia.org/wiki/Factory_method_pattern)
