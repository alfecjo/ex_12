# ## Desenvolvimento com Java 11 - IDE - NetBeans 13

### Objetivo

#### 🌱 O objetivo geral foi desenvolver e cumprir os requisitos estabelecidos.

#### 📫 REQUISITOS:

Desenvolver um EJB para (Jogo Somar aproveitando ex_11):

- Permitir o usuário informar seu nome.
- Apresentar 2 números aleatórios inteiros e solicitar que o usuário informe o resultado da soma destes números.
- Apresentar uma mensagem de erro ou acerto da soma. Cada acerto o usuário ganha um ponto.
- Exibir um ranking com os usuários que mais pontuaram.
- Poderá ser utilizado qualquer cliente.
- Todas as funcionalidades acima, já estão no ex_11. 

#### 📫 IMPLEMENTAR:

- O sistema deve enviar uma lista de ranking para o log do servidor, toda vez que houver um novo vencedor.
- Implemente um Message Driven Beans para isso.
- JMS Destination Resources: JMS destinations serve as the repositories for messages.
- Create a new destination resource: java/Fila.
- Deve haver um tratamento da lista recebida pelo container remoto no servidor, o qual deve imprimi-la no console, a título de verificação.

Project properties:

- Java Platform: JDK 11
- IDE: Netbeans 13
- Run: Payara Server
- Java EE Version: Jakarta EE 8 Web
- UI: Java Server Faces / Swing / JavaFX
- SessionBean: @Stateless and @Stateful (ao menos um de cada)
- ManegedBean: @requestScoped

- ![NetBeans IDE](https://img.shields.io/badge/NetBeansIDE-1B6AC6.svg?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)

- ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

- ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
