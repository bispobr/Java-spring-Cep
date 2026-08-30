# API de Consulta de CEP

API REST desenvolvida com Java e Spring Boot para consulta de CEP e retorno dos dados associados ao endereço.

O projeto também demonstra a utilização de documentação de APIs REST com OpenAPI/Swagger.

## Funcionalidades

- Consulta de CEP por parâmetro na URL
- Retorno dos dados associados ao CEP consultado
- API REST com Spring Web
- Documentação interativa com Swagger/OpenAPI
- Testes automatizados com Spring Boot Test

## Tecnologias

- Java 21
- Spring Boot 3.5.4
- Spring Web
- Springdoc OpenAPI
- Maven
- JUnit / Spring Boot Test

## Requisitos

- Java 21+
- Maven

## Executando o projeto

Clone o repositório:

```bash
git clone https://github.com/bispobr/Java-spring-Cep.git
cd Java-spring-Cep
```

Execute a aplicação com Maven:

```bash
./mvnw spring-boot:run
```

No Windows, utilize:

```bash
mvnw.cmd spring-boot:run
```

A aplicação estará disponível em:

```text
http://localhost:8080
```

## API Endpoint

### Consultar CEP

```http
GET /Busca-cep/{cep}
```

Retorna os dados correspondentes ao CEP informado.

| Parâmetro | Tipo | Obrigatório | Descrição |
|---|---|---|---|
| `cep` | `String` | Sim | CEP que será consultado. |

Exemplo:

```http
GET /Busca-cep/01001000
```

## Swagger / OpenAPI

A documentação interativa da API está disponível em:

```text
http://localhost:8080/swagger-ui/index.html
```

A especificação OpenAPI pode ser consultada em:

```text
http://localhost:8080/v3/api-docs
```

## Testes

Execute os testes automatizados com:

```bash
./mvnw test
```

No Windows:

```bash
mvnw.cmd test
```

## Fluxo simplificado

```text
Cliente
   │
   ▼
GET /Busca-cep/{cep}
   │
   ▼
API Spring Boot
   │
   ▼
Consulta do CEP
   │
   ▼
Resposta HTTP
```

## Estrutura

O projeto utiliza Maven e Spring Boot. O arquivo `pom.xml` centraliza as dependências e configurações de build da aplicação.

## Status

Projeto desenvolvido para praticar a construção de uma API REST com Java e Spring Boot, incluindo consulta de CEP e documentação com OpenAPI/Swagger.
