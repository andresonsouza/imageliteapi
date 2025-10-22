# 🧑‍💻 Spring Boot + ReactJS: Fullstack do Zero ao Deploy no Docker

Este projeto foi desenvolvido com base no curso **"Spring Boot + ReactJS: Fullstack do Zero ao Deploy no Docker"**, ministrado por **Douglas Sousa** na Udemy.  
O objetivo é construir uma aplicação web completa do zero, utilizando **Spring Boot 3**, **ReactJS**, **PostgreSQL** e **Docker**, passando por todas as etapas — desde a configuração do ambiente até o deploy.

---

## 🚀 Tecnologias Utilizadas

### Backend
- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA**
- **Spring Web**
- **Spring Validation**
- **PostgreSQL**
- **Docker**

### Frontend
- **ReactJS**
- **Vite**
- **Tailwind CSS**
- **Axios**
- **React Router DOM**
- **Postman** (para testes de API)

---

## 📚 O que foi aprendido

✅ Criar e desenvolver uma aplicação fullstack com **Spring Boot** e **ReactJS**  
✅ Criar banco de dados **SQL** e manipular dados através da API  
✅ Desenvolver **API REST** com Spring Boot  
✅ Testar endpoints com **Postman**  
✅ Criar componentes e páginas reutilizáveis em React  
✅ Estilizar páginas com **Tailwind CSS**  
✅ Fazer **build** e **deploy** da aplicação em containers **Docker**

---

## 🧩 Estrutura do Projeto

```
/backend
 ├── src/
 │   ├── main/java/...       # Código-fonte Spring Boot
 │   ├── main/resources/     # application.properties, scripts SQL
 │   └── test/java/...       # Testes automatizados
 ├── Dockerfile
 └── pom.xml

/frontend
 ├── src/
 │   ├── components/         # Componentes React
 │   ├── pages/              # Páginas da aplicação
 │   ├── services/           # Consumo da API (Axios)
 │   └── App.jsx
 ├── Dockerfile
 └── package.json
```

---

## ⚙️ Configuração do Ambiente

### Pré-requisitos

Antes de iniciar, é necessário ter instalado:
- [JDK 17+](https://adoptium.net/)
- [Node.js](https://nodejs.org/)
- [Docker Desktop](https://www.docker.com/)
- [PostgreSQL](https://www.postgresql.org/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (ou editor de sua preferência)
- [VS Code](https://code.visualstudio.com/) (para o frontend)

### Passos Iniciais

1. **Clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/springboot-react-fullstack.git
   cd springboot-react-fullstack
   ```

2. **Backend**
   ```bash
   cd backend
   mvn spring-boot:run
   ```

3. **Frontend**
   ```bash
   cd frontend
   npm install
   npm run dev
   ```

4. **Rodar com Docker**
   ```bash
   docker-compose up --build
   ```

---

## 🌐 Endpoints Principais (API)

| Método | Endpoint        | Descrição                   |
|--------|------------------|------------------------------|
| GET    | `/api/...`       | Lista recursos               |
| POST   | `/api/...`       | Cria novo recurso            |
| PUT    | `/api/.../{id}`  | Atualiza recurso existente   |
| DELETE | `/api/.../{id}`  | Remove recurso               |

> Os endpoints variam conforme a entidade criada no decorrer do curso.

---

## 🧠 Autor do Curso

**Douglas Sousa**  
Engenheiro de Sistemas Computacionais
> Apaixonado por tecnologia e desenvolvimento de software.  
> Ensinando a criar aplicações web modernas e escaláveis utilizando Java e JavaScript.

---

## 📅 Última atualização
**Novembro de 2024**

---

## 📝 Licença
Este repositório foi criado para fins de estudo e acompanhamento do curso.  
Sinta-se à vontade para utilizá-lo como referência ou base para seus próprios projetos.

---

🎯 *“Do backend ao frontend, do código ao deploy — construindo aplicações completas com Spring Boot e ReactJS.”*
