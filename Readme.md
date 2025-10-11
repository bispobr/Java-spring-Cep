# Api - Cep
Este repositório contém uma API simples desenvolvida com Java Spring, que permite consultar um CEP e retornar seus dados, além de testar alguns recursos da tecnologia.
## Requisitos

- Java 21+
- Maven

## Executando o Projeto

1. Clone o repositório:

```bash
git https://github.com/bispobr/java-spring-Cep.git
```

## Como usar

1. Inicie a aplicação com o Maven
2. API pode ser consumida através do endereço http://localhost:8080
3. A documentação da API está acessível através do Link http://localhost:8080/swagger-ui/index.html#/

## API Endpoints

API contem o seguinte endpoints:

```http request
GET /Busca-cep/{cep} - Retorna os dados do CEP.
```
| Parâmetro | Tipo     | Descrição                           |
|:----------|:---------| :---------------------------------- |
| `cep`     | `String` | **Obrigatório**. cep a ser consultado 
