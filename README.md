# Desafio Backend - BTG Pactual

Este desafio tem como objetivo desenvolver um microserviço utilizando **Spring Boot**, consumindo mensagens de uma fila do **RabbitMQ** e comunicando-se com um banco de dados **MongoDB**. A implementação seguirá práticas modernas e fará uso de contêineres Docker para a configuração das dependências.

---

## 📚 O que você aprenderá

- Como criar um microserviço com Spring Boot.
- Como configurar e consumir mensagens de uma fila do RabbitMQ.
- Como integrar o Spring Boot com um banco de dados MongoDB via Docker.
- Como mapear coleções do MongoDB no Spring Boot.
- Como realizar aggregations no MongoDB utilizando Spring Data.
- Como implementar logs utilizando SLF4J.

---

## 🚀 Lista de Tarefas

### Comunicação com o Banco de Dados

1. Inicializar o projeto Java com as dependências necessárias:
   - **Spring Web**
   - **Spring Data MongoDB**
   - **RabbitMQ**

2. Configurar o RabbitMQ e MongoDB utilizando Docker.

3. Estabelecer a comunicação do Spring Boot com o MongoDB.

4. Configurar a criação da fila no RabbitMQ.

### Funcionalidade de Consumo de Pedidos

1. Mapear as entidades:
   - `Order`
   - `OrderItem`

2. Criar um listener para a fila do RabbitMQ.

3. Implementar a lógica para salvar os pedidos no MongoDB.

4. Testar o fluxo completo:
   - RabbitMQ → Spring Boot → MongoDB.

### Funcionalidade de Disponibilização de Informações via API

1. Implementar endpoints para:
   - Listar os pedidos realizados por cliente.
   - Calcular o valor total de um pedido.
   - Obter a quantidade de pedidos realizados por cliente.

2. Criar os DTOs necessários para a estrutura de resposta.

3. Implementar os serviços:
   - Listagem de pedidos por cliente.
   - Cálculo do valor total de todos os pedidos de um cliente.

4. Testar a API para garantir o correto funcionamento.

---

Exemplo da mensagem que deve ser consumida:

   {
       "codigoPedido": 1001,
       "codigoCliente":1,
       "itens": [
           {
               "produto": "lápis",
               "quantidade": 100,
               "preco": 1.10
           },
           {
               "produto": "caderno",
               "quantidade": 10,
               "preco": 1.00
           }
       ]
   }

## 🐳 Configuração do Docker

Na raiz do projeto, crie uma pasta chamada `local` e adicione o arquivo `docker-compose.yml` com o seguinte conteúdo:

```yaml
docker-compose.yml
services:
  mongodb:
    image: mongo
    ports:
      - "27017:27017"
    environment:
      - MONGO_INITDB_ROOT_USERNAME=admin
      - MONGO_INITDB_ROOT_PASSWORD=123

  rabbitmq:
    image: rabbitmq:3.13-management
    ports:
      - "15672:15672"
      - "5672:5672"
```

---

## 🛠️ Configuração do MongoDB e RabbitMQ

### MongoDB

1. Faça o download do **MongoDB Compass**.
2. Configure a conexão com as credenciais:
   - **Usuário:** admin
   - **Senha:** 123

### RabbitMQ

1. Acesse o painel de gerenciamento do RabbitMQ em `http://localhost:15672`.
2. Utilize as credenciais padrão:
   - **Usuário:** guest
   - **Senha:** guest

---

## ⚙️ Configuração do Spring Boot

No arquivo `application.properties`, configure as propriedades do aplicativo:

```properties
spring.application.name=orderms

spring.data.mongodb.authentication-database=admin
spring.data.mongodb.auto-index-creation=true
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=btgpactualdb
spring.data.mongodb.username=admin
spring.data.mongodb.password=123
```

Na raiz do projeto, crie o pacote `config` e adicione a classe `RabbitMqConfig` com o seguinte conteúdo:

```java
package hildo.costa.btg_api.config;

public class RabbitMqConfig {

    public static final String ORDER_CREATED_QUEUE = "btg-pactual-order-created";
}
```

---

## ✅ Testes

1. Teste a conexão com o MongoDB utilizando o **MongoDB Compass**.
2. Teste a comunicação com o RabbitMQ para garantir que as mensagens sejam consumidas corretamente.
3. Verifique os endpoints da API para confirmar que os dados estão sendo retornados conforme esperado.

---

## 🌐 Endpoints Disponíveis

- **GET** `/customers/{customerId}/orders`: Lista os pedidos realizados por um cliente.

---

## 🖥️ Requisitos

- **Java 17**
- **Docker** e **Docker Compose**
- **MongoDB Compass**
- **RabbitMQ Management**

---

## 🤝 Contribuição

Sinta-se à vontade para abrir issues ou pull requests para melhorias neste projeto. Toda contribuição é bem-vinda!

---



