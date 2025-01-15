```markdown
# Desafio Backend - BTG Pactual

🚀 Este desafio...  

---

## 📚 O que você aprenderá  

- Como criar um microservico com Spring Boot.
- Como consumir uma fila do RabbitMQ.
- Como comunicar com o banco de dados MongoDB via Docker.
- Como mapear uma collection do MongoDB dentro do Spring.
- Como fazer aggregations no MongoDB com Spring.
- Como efetuar logs com o SLF4J.

## 📚 Lista de tarefasÇ

- Qual e o desafio que vamos resolver.

Comunicacao com o banco de dados:

- Iniciando o projeto Java(Web, Data MongoDB, RabbitMQ).
- Configurando o RabbitMQ e MongoDB no Docker.
- Configurando a comunicacao do Spring Boot com o MongoDB.
- Configurando a criacao da fila no RabbitMQ.

Funcionalidade de Consumo de Pedidos:

- Mapear as entidades(Order, OrderItem).
- Criar o listener da fila do RabbitMQ.
- Criar a implementacao para salvar o pedido no MongoDB.
- Testar o fluxo(rabbitmq - spring - mongodb).

Funcionalidade de disponibilizar as informacoes via API:

- Lembre-se , a API devera informar:
  - Lista de pedidos realizados por cliente
  - Valor total de um pedido.
  - Quantidade de pedidos por cliente

- Criar endpoint(estruturar DTO de retorno)
- Criar servico de listagem de pedidos do cliente
- Criar servico que calcula o valor total de todos os pedidos do cliente
- Testar a API
  

