# Demo GraphQL vs REST - Library Management System

Questo progetto dimostrativo implementa un sistema di gestione libreria utilizzando sia REST che GraphQL, permettendo un confronto diretto tra i due approcci. Il caso d'uso include la gestione di libri, autori, recensioni e utenti.

NOTA: Il proposito di questo progetto NON è avere un ambiente production ready
o che segua tutte le best practices di settore. E' un punto di inizio, un "Hello World" per iniziare
ad approcciare GraphQL.

## Tecnologie Utilizzate

- Java 17
- Spring Boot 3
- GraphQL Spring Boot Starter
- MySQL
- Flyway per le migrazioni
- Testcontainers per i test di integrazione

## Funzionalità Dimostrate

### REST Endpoints
- CRUD operations per libri, autori e recensioni
- Gestione delle relazioni tra entità

### GraphQL API
- Query per recupero dati con selezione precisa dei campi
- Mutations per operazioni di scrittura

## Database

Il sistema utilizza MySQL con migrations gestite da Flyway:
- `V20241102143603__database_schema_creation.sql`: Schema iniziale del database
- `V20241102144455__populate_library.sql`: Popolamento dati di esempio

## Test

I test di integrazione utilizzano Testcontainers per fornire un ambiente MySQL isolato:
- Container Docker avviato automaticamente durante i test
- Schema creato tramite Flyway
- Dati di test caricati automaticamente
- Applicazione avviata direttamente dai test per sfruttare i container

## Come Eseguire il Progetto

1. Prerequisiti:
    - Java 17
    - Docker (per i test)
    - Maven

2. Build:
   ```bash
   mvn clean install
   ```

3. Run:
   ```bash
   Start 
   TestGraphqlApplication (src/test/java/it/abstractit/graphlib/TestGraphqlApplication.java) per usare TestContainers e lasciare a Docker gestire il mysql, 
   o
   GraphqlApplication (src/main/java/it/abstractit/graphlib/GraphqlApplication.java) per usare un database configurato
   ```

4. Accesso alle API:
    - REST: `http://localhost:8080/`
    - GraphQL: `http://localhost:8080/graphql`
    - GraphiQL: `http://localhost:8080/graphiql`
    - Swagger: `http://localhost:8080/swagger`
    - Openapi: `http://localhost:8080/openapi`

## Risorse
Nella cartella 'extra' è possibile trovare il PDF della presentazione e la collection postman utilizzata

## Esempi di Confronto REST vs GraphQL

### Recupero Dettaglio Libro

REST (multiple chiamate):
```
GET /api/v1/books/{id}
GET /api/v1/books/{id}/authors
GET /api/v1/books/{id}/reviews
```

GraphQL (singola query):
```graphql
query {
  book(id: "1") {
    title
    authors {
      name
    }
    reviews {
      rating
      comment
    }
  }
}
```