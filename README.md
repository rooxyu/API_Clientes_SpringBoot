#  API de Cadastro de Clientes

API REST desenvolvida em **Java com Spring Boot**, como atividade prática da disciplina de Programação Orientada a Objetos (POO).

O projeto tem como objetivo aplicar conceitos de **arquitetura em camadas, encapsulamento, injeção de dependências e operações CRUD**, utilizando uma lista em memória para simular o armazenamento de dados.

##  Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Maven
- Swagger / OpenAPI
- IntelliJ IDEA

##  Funcionalidades

A aplicação permite cadastrar, consultar, atualizar e remover clientes por meio de requisições HTTP.

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/clientes` | Lista todos os clientes |
| GET | `/clientes/{id}` | Busca um cliente pelo ID |
| POST | `/clientes` | Cadastra um novo cliente |
| PUT | `/clientes/{id}` | Atualiza um cliente |
| DELETE | `/clientes/{id}` | Remove um cliente |

##  Estrutura do projeto

O projeto utiliza uma arquitetura organizada em três camadas:

- **Model:** representa os dados dos clientes.
- **Service:** contém as regras de negócio e gerencia os dados em memória.
- **Controller:** recebe as requisições HTTP e retorna as respostas da API.

##  Exemplo de cadastro

**POST /clientes**

```json
{
  "nome": "João Silva",
  "email": "joao@email.com",
  "idade": 25
}
```

**Resposta — 201 Created**

```json
{
  "id": 1,
  "nome": "João Silva",
  "email": "joao@email.com",
  "idade": 25
}
```

##  Como executar

1. Clone o repositório.
2. Abra o projeto no IntelliJ IDEA.
3. Aguarde o Maven carregar as dependências.
4. Execute a classe `ApiClientesApplication.java`.
5. Acesse a API em `http://localhost:8080/clientes`.

###  Testando com Swagger

Com a aplicação em execução, acesse:

`http://localhost:8080/swagger-ui/index.html`

O Swagger permite testar os endpoints GET, POST, PUT e DELETE diretamente pelo navegador.

##  Observações

Os dados são armazenados temporariamente em uma `ArrayList`, sem utilização de banco de dados. Portanto, os registros são perdidos ao reiniciar a aplicação.

##  Melhorias futuras

- Desenvolvimento de uma interface web.
- Integração com banco de dados.
- Validação dos dados dos clientes.
- Implementação de novas funcionalidades.

---

 **Projeto acadêmico desenvolvido para praticar os conceitos de Programação Orientada a Objetos e desenvolvimento de APIs REST com Spring Boot.**
