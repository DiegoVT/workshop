
# Workshop - Projeto Spring Boot + MongoDB


## 📚 Descrição

Projeto desenvolvido em **Java** utilizando **Spring Boot** e **MongoDB**, com foco na criação de uma API REST para gerenciar usuários, posts e comentários.  
O sistema realiza operações de **CRUD**, pesquisas por título de posts e buscas filtradas por intervalo de datas.
A aplicação expõe Web Services (REST APIs) para consumo de dados, implementando funcionalidades como:

- **Cadastro de usuários**

- **Cadastro de posts relacionados a usuários**

- **Comentários em posts**

- **Busca de posts por título e por intervalo de datas**

- **Tratamento de exceções para respostas HTTP padronizadas**


## 🚀 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.4.5**
- **Spring Data MongoDB**
- **MongoDB**
- **Maven**
- **Eclipse IDE**
- **Postman (testes de API)**

## 🏛️ Estrutura do Projeto
```bash
src/main/java/com/aluno/ifto/
├── WorkshopApplication.java     # Classe principal de inicialização (Spring Boot Application)
│
├── config/
│   └── Instantiation.java        # Popular o banco de dados com dados iniciais
│
├── domain/
│   ├── Post.java                 # Entidade Post
│   ├── User.java                 # Entidade User
│
├── dto/
│   ├── AuthorDTO.java            # DTO para o autor do post
│   ├── CommentDTO.java           # DTO para comentários
│   └── UserDTO.java              # DTO para usuários
│
├── repository/
│   ├── PostRepository.java       # Repositório de Posts (MongoRepository)
│   └── UserRepository.java       # Repositório de Usuários (MongoRepository)
│
├── resources/
│   ├── PostResource.java         # API REST para Posts
│   └── UserResource.java         # API REST para Usuários
│
├── resources/exception/
│   ├── ResourceExceptionHandler.java  # Tratamento global de exceções
│   └── StandardError.java             # Modelo padrão de erro
│
├── resources/util/
│   └── URL.java                  # Utilitário para tratamento de parâmetros de URL
│
├── services/
│   ├── PostService.java          # Regras de negócio para Posts
│   └── UserService.java          # Regras de negócio para Usuários
│
└── services/exception/
    └── ObjectNotFoundException.java   # Exceção personalizada para objetos não encontrados

```
## 🔗 Endpoints Principais
### Usuários
- `GET /users` → Lista todos os usuários
- `GET /users/{id}` → Busca usuário pelo ID
- `POST /users` → Cadastra novo usuário
- `PUT /users/{id}` → Atualiza um usuário existente
- `DELETE /users/{id}` → Remove um usuário

### Posts
- `GET /posts/{id}` → Busca post pelo ID
- `GET /posts/titlesearch?text={texto}` → Busca posts por título
- `GET /posts/fullsearch?text={texto}&minDate={data_inicial}&maxDate={data_final}` → Busca posts por texto e intervalo de datas


## 🛠️ Como Executar o Projeto

### Pré-requisitos

- Java 17 instalado
- Maven instalado
- MongoDB em execução (porta padrão: `27017`)
- Eclipse IDE configurado para Java 17

### Passos

# Clone o repositório
git clone https://github.com/seu-usuario/workshop.git

# Acesse a pasta do projeto
git clone https://github.com/seu-usuario/workshop.git

# Compile e execute a aplicação
mvn spring-boot:run


Após iniciar, a aplicação estará disponível no endereço:  

http://localhost:8085


## 📌 Baseline de Desenvolvimento

- Backend: Spring Boot
- Banco de Dados: MongoDB
- API: Padrão RESTful
- Tratamento de Exceções: `@ControllerAdvice`
- Estrutura Modularizada por camadas
- Ferramenta de Teste de API: Postman

---

## 👨‍💻 Autor

Desenvolvido por **Diego, Fernando e Uriel**  
[🔗 LinkedIn - Diego](https://www.linkedin.com/in/seu-linkedin-diego) | [🔗 LinkedIn - Fernando](https://www.linkedin.com/in/seu-linkedin-fernando) | [🔗 LinkedIn - Uriel](https://www.linkedin.com/in/seu-linkedin-uriel)  
[🐙 GitHub - Diego](https://github.com/DiegoVT)


---

> Projeto para fins de aprendizado e demonstração de boas práticas com Spring Boot e MongoDB.
