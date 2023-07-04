# spring-boot-todo-list

Todo API is a RESTful API developed using Java Spring Boot. This API allows users to manage their Todo lists.

## Dependencies

The project uses the following dependencies:

| Dependency | Version |
| ---------- | ------- |
| Java | 17 |
| Spring Boot | 3.0.8 |
| Spring Boot Starter Data JPA | - |
| Spring Boot Starter Web | - |
| Spring Boot Devtools | - |
| PostgreSQL | - |
| Lombok | - |
| Spring Boot Starter Test | - |

## API Endpoints

| Method | Endpoint | Description |
| ------ | -------- | ----------- |
| `GET` | `/api/todos/getall` | Returns all Todo items. |
| `POST` | `/api/todos/add` | Adds a new Todo item. |
| `DELETE` | `/api/todos/delete` | Deletes the specified Todo item. |
| `GET` | `/api/todos/getAllByPage?pageNo=PAGE_NUMBER&pageSize=PAGE_SIZE` | Returns Todo items according to the specified page number and page size. |
| `GET` | `/api/todos/getById?id=ID` | Returns the Todo item with the specified ID. |
| `PUT` | `/api/todos/update` | Updates the specified Todo item. |

## Contributing

This project is open source and open for any contributions. If you are interested in contributing, please first read the [CONTRIBUTING.md](CONTRIBUTING.md) file.
