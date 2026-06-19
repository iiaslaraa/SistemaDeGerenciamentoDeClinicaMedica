<div align="center">

# Database Management System

### Enterprise Java CRUD Application

<img src="https://readme-typing-svg.demolab.com?font=JetBrains+Mono&weight=600&size=24&duration=3500&pause=1200&color=4F46E5&center=true&vCenter=true&width=900&lines=Enterprise+Java+Application;Software+Engineering+Project;Object-Oriented+Programming;MySQL+Database;DAO+Pattern;JDBC+Integration;Built+with+Java+%26+Software+Engineering"/>

<br>

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

![JDBC](https://img.shields.io/badge/JDBC-Database-blue?style=for-the-badge)

![DAO](https://img.shields.io/badge/DAO-Pattern-success?style=for-the-badge)

![OOP](https://img.shields.io/badge/OOP-Object_Oriented-success?style=for-the-badge)

![UML](https://img.shields.io/badge/UML-Modeling-blueviolet?style=for-the-badge)

![Status](https://img.shields.io/badge/Status-In_Development-orange?style=for-the-badge)

![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

</div>

---

# Índice

- Sobre o Projeto
- Objetivos
- Motivação
- Funcionalidades
- Tecnologias
- Arquitetura
- Estrutura do Projeto
- Engenharia de Software Aplicada
- Banco de Dados
- UML
- Estrutura das Classes
- Instalação
- Como Executar
- Casos de Uso
- CRUD
- Organização do Código
- Roadmap
- Melhorias Futuras
- Contribuição
- Licença
- Autor

---

# Sobre o Projeto

O **Database Management System** é uma aplicação desenvolvida em Java com integração ao banco de dados MySQL utilizando JDBC.

O projeto foi desenvolvido com o objetivo de aplicar conceitos fundamentais de Engenharia de Software, Programação Orientada a Objetos, modelagem de banco de dados e arquitetura em camadas.

Embora tenha sido desenvolvido em ambiente acadêmico, sua estrutura foi planejada para se aproximar da organização encontrada em aplicações corporativas, utilizando padrões de projeto, separação de responsabilidades e boas práticas de desenvolvimento.

Além da implementação completa das operações CRUD, o projeto demonstra conhecimentos em modelagem UML, persistência de dados, arquitetura DAO e organização modular do código.

---

# Objetivos

Este projeto possui como principais objetivos:

- Desenvolver uma aplicação Java integrada ao MySQL.
- Aplicar Programação Orientada a Objetos.
- Utilizar JDBC para comunicação com banco de dados.
- Implementar arquitetura DAO.
- Aplicar conceitos de Engenharia de Software.
- Desenvolver modelagem UML.
- Construir um banco de dados relacional.
- Implementar operações CRUD completas.
- Organizar o projeto seguindo boas práticas.
- Demonstrar conhecimentos adquiridos durante a formação em Tecnologia da Informação.

---

# Motivação

O projeto foi criado para consolidar conhecimentos em desenvolvimento backend utilizando Java.

Durante seu desenvolvimento foram aplicados conceitos relacionados a:

- Engenharia de Software
- Programação Orientada a Objetos
- Banco de Dados
- UML
- DAO Pattern
- JDBC
- Relacionamentos entre entidades
- Encapsulamento
- Herança
- Interfaces
- Classes Abstratas
- Associação
- Organização em pacotes

Esses conceitos formam a base para o desenvolvimento de aplicações corporativas.

---

# Funcionalidades

Atualmente o sistema possui:

✅ Cadastro de registros

✅ Consulta de registros

✅ Atualização de registros

✅ Exclusão de registros

✅ Conexão com banco MySQL

✅ Organização em camadas

✅ DAO Pattern

✅ JDBC

✅ Classes de Modelo

✅ Classes DAO

✅ Programação Orientada a Objetos

✅ Modelagem UML

✅ Banco de Dados Relacional

---

# Tecnologias Utilizadas

| Categoria | Tecnologia |
|------------|------------|
| Linguagem | Java |
| Banco de Dados | MySQL |
| Persistência | JDBC |
| Arquitetura | DAO Pattern |
| Paradigma | Object-Oriented Programming |
| IDE | NetBeans |
| Modelagem | UML |
| Controle de Versão | Git |
| Repositório | GitHub |

---

# Arquitetura da Aplicação

A arquitetura do projeto segue o modelo em camadas.

```

               Usuário

                  │

                  ▼

         Interface da Aplicação

                  │

                  ▼

            Regras de Negócio

                  │

                  ▼

             Classes DAO

                  │

                  ▼

                 JDBC

                  │

                  ▼

              Banco MySQL

```

Cada camada possui responsabilidades específicas, tornando o código mais organizado, reutilizável e de fácil manutenção.

---

# Estrutura do Projeto

```

database-management-system-java

│

├── src

│   ├── connection

│   ├── dao

│   ├── model

│   ├── controller

│   ├── view

│   └── Main.java

│

├── database

│

├── diagrams

│

├── docs

│

├── assets

│

└── README.md

```

Cada diretório possui uma responsabilidade específica.

Essa organização facilita futuras manutenções e ampliações do sistema.

---

# Engenharia de Software Aplicada

O projeto demonstra a aplicação de diversos conceitos estudados durante a formação.

| Conceito | Aplicado |
|-----------|----------|
| Programação Orientada a Objetos | ✅ |
| Encapsulamento | ✅ |
| Herança | ✅ |
| Polimorfismo | ✅ |
| Interfaces | ✅ |
| Classes Abstratas | ✅ |
| Associação | ✅ |
| DAO Pattern | ✅ |
| JDBC | ✅ |
| Banco Relacional | ✅ |
| UML | ✅ |
| Engenharia de Software | ✅ |
| Modularização | ✅ |
| Organização em Pacotes | ✅ |

---

# Organização em Camadas

O projeto foi estruturado utilizando separação de responsabilidades.

Cada camada possui uma função específica.

### Interface

Responsável pela interação com o usuário.

### Controller

Controla o fluxo da aplicação.

### Model

Representa as entidades do sistema.

### DAO

Realiza operações no banco de dados.

### Connection

Gerencia a conexão JDBC.

### Database

Armazena as informações persistentes.

---

# Destaques do Projeto

Este projeto demonstra conhecimentos em:

- Desenvolvimento Backend
- Banco de Dados Relacional
- Engenharia de Software
- Programação Orientada a Objetos
- Arquitetura em Camadas
- Persistência de Dados
- JDBC
- DAO Pattern
- UML
- Modelagem de Sistemas

---

# Diferenciais

Em comparação com um CRUD tradicional, este projeto também apresenta:

- Organização modular.
- Separação entre regras de negócio e persistência.
- Estrutura preparada para crescimento.
- Código reutilizável.
- Modelagem orientada a objetos.
- Banco de dados modelado previamente.
- Aplicação de conceitos de Engenharia de Software.

---
