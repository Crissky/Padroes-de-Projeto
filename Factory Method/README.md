# Factory Method

### Factory Method ou Construtor virtual, é um padrão de projeto de software (do inglês Design Pattern) que permite às classes delegar para subclasses decidirem, isso é feito através da criação de objetos que chamam o método fabrica especificado numa interface e implementado por um classe filha ou implementado numa classe abstrata e opcionalmente sobrescrito por classes derivadas.

Criar um objeto geralmente requer processos complexos não apropriados para incluir dentro da composição do objeto. A criação do objeto talvez necessite de uma duplicação de código significativa, talvez necessite informações não acessíveis para a composição do objeto, talvez não providencie um grau de abstração suficiente, ou então não faça parte da composição das preocupações do objeto. O padrão de design **Factory Method** maneja/trata esses problemas definindo um método separado para criação dos objetos, no qual as subclasses possam sobrescrever para especificar o "tipo derivado" do produto que vai ser criado.

[Factory com IF](https://github.com/Crissky/Padroes-de-Projeto/blob/master/Factory%20Method/src/br/com/factorymethod/dominio/mensagem/MensagemFactory.java)
- Inicialização mais rápida.
- Tempo do método **get** será **O(n)** (Caso a opção retornada seja a última).

[Factory com HashMap](https://github.com/Crissky/Padroes-de-Projeto/blob/master/Factory%20Method/src/br/com/factorymethod/dominio/mensagem/MensagemFactory2.java)
- Inicialização mais lenta (Pois precisa instanciar no HashMap **TODOS os objetos** que são opções de retorno da Factory)
- Tempo do método **get** será **O(1)**, pois é um hash.

![Factory Method](https://brizeno.files.wordpress.com/2011/09/factory-method.png)

<br><br>
FONTE: [Wikipedia](https://en.wikipedia.org/wiki/Factory_method_pattern)
