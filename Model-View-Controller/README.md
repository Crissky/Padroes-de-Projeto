# MVC (Model View Controller)
## MVC é o acrônimo de Model-View-Controller (em português: Arquitetura Modelo-Visão-Controle). É um padrão de arquitetura de software formulado na década de 1970. Ele é focado no reuso de código e a separação de conceitos em três camadas interconectadas, onde a apresentação dos dados e interação dos usuários (front-end) são separados dos métodos que interagem com o banco de dados (back-end).

Normalmente usado para o desenvolvimento de interfaces de usuário que divide uma aplicação em partes (camadas/componentes) interconectadas. Isto é feito para separar representações de informação internas dos modos como a informação é apresentada para e aceita pelo usuário, levando ao desenvolvimento paralelo de maneira eficiente.

### Camada de modelo ou da lógica da aplicação (Model)
Modelo consiste na parte lógica da aplicação, que gerencia o comportamento dos dados através de regras de negócios, lógica e funções. Esta fica apenas esperando a chamada das funções, que permite o acesso para os dados serem coletados, gravados e, exibidos.

### Camada de apresentação ou visualização (View)
Visão pode ser qualquer saída de representação dos dados, como uma tabela ou um diagrama. É onde os dados solicitados ao Modelo (Model) são exibidos. É possível ter várias visões do mesmo dado, como um gráfico de barras para gerenciamento e uma Visão tabular para contadores. A Visão também provoca interações com o usuário, que interage com o Controle (Controller). O exemplo básico disso é um botão gerado por uma Visão, no qual um usuário clica e aciona uma ação no Controle.

### Camada de controle ou controlador (Controller)
O Controle aceita entrada e a converte em comandos para o Modelo ou Visão. Ele faz a mediação da entrada e saída, comandando a Visão e o Modelo para serem alterados de forma apropriada conforme o usuário solicitou. O foco do Controle é a ação do usuário, onde são manipulados os dados que o usuário insere ou atualiza, chamando em seguida o Modelo.

![Model-View-Controller (MVC)](https://miro.medium.com/max/3408/1*nvmfpwiv_mSEy2cD0xYZBQ.png)

<br>

FONTE: [Wikipedia](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)
