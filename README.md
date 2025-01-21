# API FórumHub

A **FórumHub** é uma API para gerenciar tópicos de fórum, permitindo criar, listar, detalhar, atualizar e excluir tópicos de forma lógica. Desenvolvido com **Java** e **Spring Boot**, o projeto utiliza boas práticas de desenvolvimento e ferramentas modernas do ecossistema Java.

---

## Funcionalidades

- **Autenticação:** Login com JWT e controle de acesso por perfil.
- **Tópicos:** 
  - Criar, listar (com paginação), detalhar, atualizar e excluir tópicos.
- **Usuários:** Cadastro de novos usuários.

---

## Tecnologias

- **Java 17**
- **Maven**
- **Spring Boot** (Web, Security, Data JPA)
- **Hibernate**
- **Flyway**
- **MySQL**
- **Lombok**
- **JWT**

---

## Estrutura do Projeto

- **configs:** Configurações gerais e segurança.
- **controller:** Endpoints da API.
- **domain:** Entidades e DTOs.
- **infra:** Tratamento de exceções e segurança.
- **repository:** Persistência de dados.
- **service:** Lógica de negócios.
- **migration:** Scripts Flyway para gerenciamento do banco de dados.

---

## Endpoints

### Autenticação
- **POST /login:** Retorna um token JWT.

### Tópicos
- **POST /topicos:** Cria um novo tópico.  
  **Exemplo de body:**  
  ```json
  {
      "titulo": "Título do Tópico",
      "mensagem": "Mensagem do tópico.",
      "autorId": 1,
      "cursoId": 2
  }
