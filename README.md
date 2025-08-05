# springboot-one-to-many-relationship-person-phonenumber

# Spring Boot CRUD REST API (In-Memory Example)

This project demonstrates a basic Spring Boot REST API and a One-to-Many relationship.

## Technologies Used

- Java 17+
- Spring Boot 3+
- Spring Web
- Spring Validation

## Project Structure

- `Person`: Entity class representing a person.
- `PhoneNumber`: Entity class representing phone numbers of a person.
- `PersonController`: REST controller exposing the endpoints.
- `PersonService`: Business logic with in-memory list.


## One-to-Many Relationship

A **Person** can have **multiple phone numbers**.

### Example:
```json
{
  "id": 1,
  "name": "Sharad",
  "phoneNumbers": [
    {
      "id": 101,
      "number": "9876543210"
    },
    {
      "id": 102,
      "number": "9123456789"
    }
  ]
}
```

---

## Dummy Data (In-Memory Table)

| Person ID | Person Name | Phone ID | Phone Number |
|-----------|-------------|----------|---------------|
| 1         | Sharad      | 101      | 9876543210    |
| 1         | Sharad      | 102      | 9123456789    |
| 2         | Ravi        | 103      | 9090909090    |

---

## API Endpoints

### 1. Add Person with Phones

**POST** `/person`  
```json
{
  "id": 1,
  "name": "Sharad",
  "phoneNumbers": [
    { "id": 101, "number": "9876543210" },
    { "id": 102, "number": "9123456789" }
  ]
}
```

### 2. Get All Persons

**GET** `/person`

### 3. Get Person by ID

**GET** `/person/1`

### 4. Delete Person by ID

**DELETE** `/person/1`

---

## Custom Exception Example

If a person ID is not found:

```json
{
  "message": "Person with ID 99 not found",
  "timestamp": "2025-08-05T14:30:00"
}
```

---

## Run the Project

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

---

## License

This project is open-sourced for learning purposes.
