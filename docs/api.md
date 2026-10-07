# Customer API

## Purpose

Provides customer information for applications within the Customer Digital Services domain.

## API

### GET /customers/{customerId}

Returns customer information for the supplied customer ID.

Example:

GET /customers/C1001

Response:

{
  "customerId": "C1001",
  "name": "John Smith",
  "status": "ACTIVE"
}

## Technology

- Java 17
- Spring Boot
- Maven
- REST
