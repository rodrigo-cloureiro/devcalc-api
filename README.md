# DevCalc API

## 🎯 Objetivo do Projeto
O DevCalc API é uma aplicação REST em JAVA utilizando o Spring Boot que disponibiliza operações matemáticas,
como adição, subtração, multiplicação e divisão.

O principal objetivo é servir como base para a implementação de pipelines de CI/CD automatizados utilizando
GitHub Actions, Docker e Docker Hub.

## 🛠️ Ferramenta de Build
O projeto utiliza Maven como ferramenta de build e gerenciamento de dependências.

## 🪜 Estrutura do projeto
```
devcalc-api/
├── src/
│   ├── main/
│   │   └── java/com/devcalc/
│   └── test/
│       └── java/com/devcalc/
├── pom.xml
└── README.md
```

## 🚀 Executar o projeto localmente
Pré-requisitos:
- Java 21
- Maven 3.9.11
- Docker

### 💻 Executando localmente
1. Clone o repositório:
```
git clone https://github.com/rodrigo-cloureiro/devcalc-api.git
cd devcalc-api
```
2. Compile o projeto
```
mvn clean
mvn compile
```
3. Execute os testes
```
mvn test
```
4. Inicie a aplicação
5. Verifique os endpoints:
   - ➕ GET /add?a=10&b=5 → retorna 15 
   - ➖ GET /subtract?a=10&b=5 → retorna 5 
   - ✖️ GET /multiply?a=10&b=5 → retorna 50 
   - ➗ GET /divide?a=10&b=5 → retorna 2

### 🐳 Executando com Docker
Em breve...

## 👨‍💻 [Rodrigo Loureiro](https://github.com/rodrigo-cloureiro?tab=repositories)