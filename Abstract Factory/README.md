# Abstract Factory
## Abstract Factory é um padrão de projeto de software (do inglês Design Pattern). Este padrão fornece uma maneira de encapsular um grupo de fábricas individuais que têm um tema comum sem especificar suas classes concretas.

Em uso normal, o software cliente cria uma implementação concreta da fábrica abstrata e, em seguida, usa a interface genérica da fábrica para criar os objetos concretos que fazem parte do tema. O cliente não sabe (ou se preocupa) com quais objetos concretos obtém de cada uma dessas fábricas internas, pois utiliza apenas as interfaces genéricas de seus produtos. Esse padrão separa os detalhes de implementação de um conjunto de objetos de seu uso geral e depende da composição do objeto, pois a criação do objeto é implementada em métodos expostos na interface de fábrica.

- ### Prós
  - Uma fábrica é a localização de uma classe concreta no código em que objetos são construídos. O objetivo em empregar o padrão é isolar a criação de objetos de seu uso e criar famílias de objetos relacionados sem ter que depender de suas classes concretas. Isto permite que novos tipos derivados sejam introduzidos sem qualquer alteração ao código que usa a classe base. O uso deste padrão torna possível trocar implementações concretas sem alterar o código que estas usam, mesmo em tempo de execução.

- ### Contras
  - No entanto, o emprego deste padrão, como acontece com outros padrões semelhantes, pode resultar em uma complexidade desnecessária e trabalho extra no início do código. Além disso, os níveis mais elevados de abstração podem resultar em sistemas que são mais difíceis de manter. A essência do padrão Abstract Factory é fornecer uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

<br>

FONTE: [Wikipedia](https://en.wikipedia.org/wiki/Abstract_factory_pattern)
