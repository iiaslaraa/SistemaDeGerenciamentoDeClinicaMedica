<div align="center">

# 🏥 Sistema de Gerenciamento para Clínica Médica

### *Medical Clinic Management System*

Projeto acadêmico desenvolvido durante o **Curso Técnico em Informática** da **Escola Técnica de Brasília (ETB)**.

Aplicando conceitos de:
✔ Engenharia de Software  
✔ Programação Orientada a Objetos (POO)  
✔ Persistência de Dados (DAO)  
✔ Banco de Dados Relacional (MySQL)  
✔ UML (Diagrama de Classes)  
✔ JDBC  

<br>

![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-8.2-1B6AC6?style=for-the-badge)
![Git](https://img.shields.io/badge/Git-Versionamento-F05032?style=for-the-badge&logo=git&logoColor=white)

</div>

---

## 📑 Índice

- 📖 Sobre
- 🎯 Objetivos
- 🚧 Status
- 🛠 Tecnologias
- ⚙️ Funcionalidades
- 🧪 Testes
- 📂 Estrutura
- 🏗 Arquitetura
- 🗄 Banco de Dados
- 📐 Modelagem
- 🗺 Roadmap
- 📄 Licença
- 👩‍💻 Autora

---

## 📖 Sobre

O **Sistema de Gerenciamento para Clínica Médica** é um projeto acadêmico desenvolvido como parte da formação no **Curso Técnico em Informática** da **Escola Técnica de Brasília (ETB)**.

O projeto tem como objetivo desenvolver uma aplicação para gerenciamento de clínicas médicas, colocando em prática conhecimentos de Engenharia de Software, Banco de Dados Relacionais, Programação Orientada a Objetos e Java.

Atualmente o projeto encontra-se em desenvolvimento. Nesta fase inicial foram realizados o levantamento de requisitos, a modelagem do banco de dados e a estruturação da documentação técnica, que servirão como base para a implementação da aplicação.

O sistema permite o gerenciamento de:

- Médicos
- Pacientes
- Consultórios
- Consultas
- Exames

Além das tabelas associativas:

- Médico_Paciente
- Médico_Exame
- Paciente_Exame

---

## 🎯 Objetivos

- Desenvolver um sistema para gerenciamento de clínicas médicas.
- Aplicar conceitos de Engenharia de Software.
- Desenvolver uma aplicação em Java.
- Integrar Java e MySQL utilizando JDBC.
- Aplicar Programação Orientada a Objetos.
- Organizar o projeto utilizando boas práticas de desenvolvimento.
- Documentar todas as etapas do projeto.

---

## 🚧 Status do Projeto

> **Status Atual:** Em desenvolvimento

O projeto está sendo desenvolvido de forma incremental, acompanhando as etapas do Curso Técnico em Informática. Atualmente, a fase de modelagem do banco de dados foi concluída e a implementação da aplicação em Java está em andamento.

| Etapa | Status |
|:-------|:------:|
| Planejamento | ✅ Concluído |
| Levantamento de Requisitos | ✅ Concluído |
| Modelagem do Banco de Dados | ✅ Concluído |
| Scripts SQL | ✅ Concluído |
| Modelagem UML | ✅ Concluído |
| Desenvolvimento em Java | ✅ Concluído |
| Integração JDBC | ✅ Concluído |
| Camada DAO | ✅ Concluído |
| Operações CRUD | ✅ Concluído |
| Testes | ✅ Concluído |
| Documentação Final | ⏳ Planejado |

---

## 🛠️ Tecnologias Utilizadas

| Categoria | Tecnologia | Status |
|:-----------|:-----------|:------:|
| Linguagem | Java | ✅ |
| Banco de Dados | MySQL | ✅ |
| Linguagem SQL | SQL | ✅ |
| Modelagem | MySQL Workbench | ✅ |
| UML | Astah Professional | ✅ |
| Versionamento | Git | ✅ |
| Repositório | GitHub | ✅ |
| IDE | NetBeans | ✅ |

---

## ⚙️ Funcionalidades Implementadas

Todas as entidades possuem:

✔ grava()
✔ leUm()
✔ leTodos()
✔ leTodosLike()
✔ leTodosNotIn()
✔ leTodosBetween()
✔ altera()
✔ exclui()

---

## 🧪 Testes

Foram desenvolvidas classes de teste para todas as entidades do sistema, validando:

Inserção
Consulta
Atualização
Exclusão
Pesquisas com LIKE
Pesquisas com NOT IN
Pesquisas com BETWEEN

---

## 📂 Estrutura do Projeto

```text
Java-database-management-system
│
├── Projeto_ClinicaMedica
│
├── database
│   ├── projetoclinicamedica.sql
│   └── MODELO RELACIONAL (MySQL).pdf
│
├── docs
│   └── Diagrama De Classes - UML.pdf
│
├── README.md
├── ROADMAP.md
├── CHANGELOG.md
└── LICENSE
```

A estrutura do projeto será expandida conforme novas funcionalidades forem sendo implementadas.

---

## 🏗️ Arquitetura do Projeto

O projeto está sendo desenvolvido seguindo uma arquitetura em camadas, buscando manter a organização e facilitar futuras manutenções.

```text
  ┌──────────────┐
  │   Usuário    │
  └──────┬───────┘
         │
         ▼
  ┌──────────────┐
  │ Aplicação    │
  │     Java     │
  └──────┬───────┘
         │
         ▼
  ┌──────────────┐
  │     JDBC     │
  └──────┬───────┘
         │
         ▼
  ┌──────────────┐
  │    MySQL     │
  └──────────────┘
```

Conforme o desenvolvimento avançar, novas camadas serão adicionadas, incluindo entidades, DAOs e demais componentes da aplicação.

---

## 🗄️ Banco de Dados

O banco de dados representa a primeira etapa concluída do projeto e constitui a base para toda a aplicação.

Nesta fase foram desenvolvidos:

- Modelagem do banco de dados;
- Estrutura das tabelas;
- Definição das entidades;
- Relacionamentos;
- Chaves primárias;
- Chaves estrangeiras;
- Scripts SQL de criação da base.

Entidades principais:

Médico
Paciente
Consultório
Consulta
Exame

Entidades associativas:

Médico_Paciente
Médico_Exame
Paciente_Exame

O banco de dados servirá como base para as próximas etapas de desenvolvimento da aplicação.

---

## 📐 Modelagem

Atualmente o projeto possui os seguintes artefatos de modelagem:

- ✔ Modelo Entidade-Relacionamento (MER)
- ✔ Modelo Relacional
- 🚧 Diagrama de Classes (UML)
- 🚧 Documentação Técnica

Os diagramas serão adicionados ao repositório conforme forem finalizados.

---

## 🗺️ Roadmap

| Versão | Objetivo | Status |
|:-------:|:----------|:------:|
| v0.1.0 | Planejamento do Projeto | ✅ |
| v0.2.0 | Modelagem do Banco de Dados | ✅ |
| v0.3.0 | Scripts SQL | ✅ |
| v0.4.0 | Modelagem UML | ✅ |
| v0.5.0 | Estrutura Inicial em Java | ✅ |
| v0.6.0 | Integração JDBC | ✅ |
| v0.7.0 | Implementação da Camada DAO | ✅ |
| v0.8.0 | Operações CRUD | ✅ |
| v0.9.0 | Testes da Aplicação | ✅ |
| v1.0.0 | Primeira Versão Estável | ✅ |


---

## 📌 Próximas Implementações

As próximas etapas previstas para o desenvolvimento do projeto incluem:

- Implementação das classes do domínio;
- Desenvolvimento da camada de persistência (DAO);
- Integração com o banco de dados utilizando JDBC;
- Implementação das operações CRUD;
- Organização da arquitetura da aplicação;
- Finalização da modelagem UML;
- Aprimoramento da documentação técnica.

---

## 📚 Documentação

| Documento | Status |
|:-----------|:------:|
| README | ✅ |
| Banco de Dados | ✅ |
| UML | ✅ |
| Arquitetura | ✅ |
| CHANGELOG | ⏳ |
| ROADMAP | ⏳ |

---

## 📄 Licença

Este projeto está licenciado sob a **Licença MIT**.

Consulte o arquivo **LICENSE** para mais informações.

---

## 🎓 Contexto Acadêmico

| Informação | Detalhes |
|:------------|:---------|
| Instituição | Escola Técnica de Brasília (ETB) |
| Curso | Técnico em Informática |
| Área | Engenharia de Software |
| Tipo de Projeto | Projeto Acadêmico |
| Status | 🚧 Em desenvolvimento |

---

## 👩‍💻 Autora

<div align="center">

## Iasmim Lima Lara Cardoso

Software Engineering Student • Data Analytics Student • IT Technician

📍 Brasília - DF, Brasil

</div>

---

## 📫 Contato

- **GitHub:** https://github.com/iiaslaraa
- **LinkedIn:** https://www.linkedin.com/in/iiaslaraa/
- **E-mail:** iasmimlaracardoso@gmail.com

---

<div align="center">

### ⭐ Se este projeto foi interessante para você, considere deixar uma estrela no repositório.

Ela ajuda a apoiar o desenvolvimento e incentiva a continuidade do projeto.

</div>
