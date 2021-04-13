# Abstract Factory
## Abstract Factory é um padrão de projeto de software (do inglês Design Pattern). Este padrão fornece uma maneira de encapsular um grupo de fábricas individuais que têm um tema comum sem especificar suas classes concretas.

Em uso normal, o software cliente cria uma implementação concreta da fábrica abstrata e, em seguida, usa a interface genérica da fábrica para criar os objetos concretos que fazem parte do tema. O cliente não sabe (ou se preocupa) com quais objetos concretos obtém de cada uma dessas fábricas internas, pois utiliza apenas as interfaces genéricas de seus produtos. Esse padrão separa os detalhes de implementação de um conjunto de objetos de seu uso geral e depende da composição do objeto, pois a criação do objeto é implementada em métodos expostos na interface de fábrica.

FONTE: [Wikipedia](https://en.wikipedia.org/wiki/Abstract_factory_pattern)
