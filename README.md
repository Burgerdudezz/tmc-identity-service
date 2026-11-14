# TMC Identity Service

## Tech stack

Java 21, Spring Boot 4.1, and Maven Wrapper.

## Folder structure

- `src/main/java/com/tmc/identity/` — employee API, QR code issuance, and validation.
- `src/main/resources/` — application configuration.
- `src/test/` — tests.
- `.mvn/`, `mvnw`, `mvnw.cmd` — Maven Wrapper.

## How to run

Use JDK 21. From the repository root, run:

```bash
./mvnw spring-boot:run
```

On Windows, use `mvnw.cmd spring-boot:run`. The API runs at `http://127.0.0.1:8081`.
