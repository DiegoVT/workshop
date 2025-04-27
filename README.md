
# Workshop - Projeto Spring Boot + MongoDB


## 📚 Descrição

Projeto desenvolvido em Java utilizando **Spring Boot** e **MongoDB**, com foco na criação de uma API REST para gerenciar usuários, posts e comentários.  
O sistema realiza operações de CRUD, pesquisas por título de posts e buscas filtradas por intervalo de datas.
A aplicação expõe Web Services (REST APIs) para consumo de dados, implementando funcionalidades como:

- Cadastro de usuários  

- Cadastro de posts relacionados a usuários

- Comentários em posts

- Busca de posts por título e por intervalo de datas

- Tratamento de exceções para respostas HTTP padronizadas


## 🚀 Tecnologias Utilizadas
- Java 17
- Spring Boot 3.4.5
- Spring Data MongoDB
- MongoDB
- Maven
- Eclipse IDE
- Postman (testes de API)

## 🏛️ Estrutura do Projeto

com.aluno.ifto\
├── config                # *Instanciação de dados iniciais\*
├── domain                # Entidades (User, Post)\
├── dto                   # Data Transfer Objects (UserDTO, PostDTO, CommentDTO)\
├── repository            # Interfaces de acesso a dados (MongoDB)\
├── resources             # Controllers REST (UserResource, PostResource)\
├── resources.exception   # Tratamento global de exceções\
├── services              # Regras de negócio\
├── services.exception    # Exceções customizadas\
├── util                  # Utilitários (manipulação de URL e datas)\


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
cd workshop

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

Desenvolvido por **[Diego, Fernando e Uriel]**  
[🔗 LinkedIn](https://www.linkedin.com/) | [🐙 GitHub](https://github.com/)

---

> Projeto para fins de aprendizado e demonstração de boas práticas com Spring Boot e MongoDB.
