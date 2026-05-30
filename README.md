# 🚗 Vehicle Price API

API REST desenvolvida com Spring Boot para consulta de marcas, modelos e valores de veículos utilizando dados da Tabela FIPE.

## 📋 Sobre o Projeto

O objetivo deste projeto é fornecer uma API simples e eficiente para consulta de informações de veículos, permitindo a integração com aplicações web, mobile e sistemas corporativos.

Além das consultas à Tabela FIPE, a aplicação registra o histórico das consultas realizadas em banco de dados.

## 🚀 Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* PostgreSQL
* OpenFeign
* Docker
* Maven
* Swagger / OpenAPI

## 📂 Estrutura do Projeto

```text
src
├── client
│   └── FipeClient
├── controller
│   └── FipeController
├── service
│   └── FipeService
├── repository
│   └── HistoricoRepository
├── entity
│   └── HistoricoConsulta
└── dto
    ├── MarcaDTO
    └── VeiculoDTO
```

## 🔗 Endpoints Disponíveis

### Listar marcas

```http
GET /api/fipe/marcas
```

### Consultar veículo

```http
GET /api/fipe/veiculo/{marca}/{modelo}/{ano}
```

Exemplo:

```http
GET /api/fipe/veiculo/fiat/palio/2018
```

## 🐳 Executando com Docker

```bash
docker-compose up -d
```

## ▶️ Executando Localmente

### Clonar o repositório

```bash
git clone https://github.com/RicardoAntuness/vehicle-price-api.git
```

### Entrar na pasta

```bash
cd vehicle-price-api
```

### Executar a aplicação

```bash
mvn spring-boot:run
```

## 📖 Documentação da API

Após iniciar a aplicação, a documentação Swagger estará disponível em:

```text
http://localhost:8080/swagger-ui.html
```

ou

```text
http://localhost:8080/swagger-ui/index.html
```

## 💡 Funcionalidades

* Consulta de marcas de veículos
* Consulta de modelos e anos
* Consulta de valores FIPE
* Persistência do histórico de consultas
* Documentação automática via Swagger
* Integração com API externa utilizando OpenFeign

## 👨‍💻 Autor

Ricardo Antunes

Estudante de Ciência da Computação | QA Engineer | Desenvolvedor Java

GitHub: https://github.com/RicardoAntuness
LinkedIn: [https://www.linkedin.com/in/ricardo-antunes](https://www.linkedin.com/in/ricardo-rigo-antunes-5578021a6/)
