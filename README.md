Este projeto demonstra a criação de uma API de pagamentos robusta e segura utilizando Spring Boot, explorando os desafios e considerações do mundo dos sistemas bancários.</br>

Visão Geral
Esta API foi desenvolvida com o objetivo de fornecer uma plataforma para processamento de pagamentos, abrangendo desde o cadastro de clientes e contas até a realização de transferências, pagamentos de contas e consultas de extratos. A segurança e a confiabilidade são prioridades, com a implementação de mecanismos de autenticação, autorização e proteção contra ataques cibernéticos.</br>
</br>
Funcionalidades
Cadastro de Clientes: Permite o cadastro de novos clientes, incluindo informações como nome, CPF, endereço e dados de contato.</br>
Criação de Contas: Possibilita a abertura de contas bancárias para os clientes, com número da conta, agência e saldo inicial.</br>
Transferências: Permite a transferência de valores entre contas, com validação de saldo, limites e outras regras de negócio.</br>
Pagamentos: Possibilita o pagamento de contas, boletos e outros tipos de pagamentos, com integração com sistemas de terceiros, se necessário.</br>
Extratos: Permite a consulta de extratos bancários, com informações detalhadas sobre transações, saldos e outros dados relevantes.</br>
Segurança: Implementa mecanismos de segurança robustos, como autenticação, autorização e proteção contra vulnerabilidades comuns.</br>
Tecnologias Utilizadas</br>
Java: Linguagem de programação principal.</br>
Spring Boot: Framework para desenvolvimento da API.</br>
Spring Data JPA: Facilita o acesso ao banco de dados.</br>
Hibernate: Implementação do JPA.</br>
MySQL: Banco de dados relacional utilizado para armazenar os dados.</br>
Springdoc OpenAPI (Swagger): Para documentação da API.</br>
Lombok: Para reduzir o código boilerplate.</br>
BCryptPasswordEncoder: Para criptografia de senhas.</br>
Java JWT (JSON Web Token): Para autenticação e autorização.</br>
HikariCP: Pool de conexões para otimizar o acesso ao banco de dados.</br>
JUnit e Mockito: Para testes unitários e de integração.</br>
</br>
</br>
Pré-requisitos</br>
Java Development Kit (JDK) versão 17 ou superior instalado.</br>
MySQL instalado e em execução.</br>
Maven instalado para gerenciamento de dependências.</br>
