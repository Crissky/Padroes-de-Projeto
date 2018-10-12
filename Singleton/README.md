# Singleton
### Singleton é um padrão de projeto de software (do inglês Design Pattern). Este padrão garante a existência de apenas uma instância de uma classe, mantendo um ponto global de acesso ao seu objeto.

Alguns projetos necessitam que algumas classes tenham apenas uma instância. Por exemplo, em uma aplicação que precisa de uma infraestrutura de log de dados, pode-se implementar uma classe no padrão singleton. Desta forma existe apenas um objeto responsável pelo log em toda a aplicação que é acessível unicamente através da classe singleton.

[Singleton 1](https://github.com/Crissky/Padroes-de-Projeto/blob/master/Singleton/src/br/com/singleton/dominio/GerenciadorImpressao.java)
- Para problemas de concorrêcia, essa implementação não é indicada, pois **mais de um processo** pode entrar no IF (Fazer a comparação lógica do IF, mas antes de executar o bloco interno do IF dá a vez a outro processo que também acessará o método **getInstance**. Assim mais de um processo pode entrar no IF) e instanciar a classe. fazendo com que se perca a instância anterior.

[Singleton 2](https://github.com/Crissky/Padroes-de-Projeto/blob/master/Singleton/src/br/com/singleton/dominio/GerenciadorImpressao2.java)
- Está segunda implementação visa resolver o problema de concorrência, pois a instancia é carregada junto com a classe (em uma **única linha**), além de exigir menos linhas em sua implementação.

<br><br><br>
FONTE: [Wikipedia](https://en.wikipedia.org/wiki/Singleton_pattern)
