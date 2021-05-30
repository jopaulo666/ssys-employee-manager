# ssys-employee-manager
Projeto Java com Spring Boot.

## Descrição do Projeto
API para gerenciar informações e relatórios de funcionários.

## Status do projeto
Concluído.

## Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
* JDK Java 11
* IDE Spring Tool Suite ou Eclipse
* Postman

## Rodando o Back End (servidor)
### Clone esse repositório na sua Workspace
$ git clone https://github.com/jopaulo666/ssys-employee-manager.git
### Importe o projeto para sua IDE
File -> import -> Maven -> Existing Maven Projects
### Rode o projeto
Botão direito em cima do projeto -> Run As -> Spring Boot App
### Verifique o banco de dados H2
Para verificar se o banco de dados de teste foi criado, abra um navegador e cole a url http://localhost:8080/h2-console -> Connect

## Testando os Endpoint localmente com o Postman
Abra a ferramenta Postman e cole as seguintes URL's:
* API para CRUD de funcionários:
  * GET: localhost:8080/employee    (lista de funcionários)
  * POST: localhost:8080/employee    (inserção de funcionário)
  * PUT: localhost:8080/employee/id    (atualização de funcionário)
  * DELET: localhost:8080/employee/id    (exclusão de funcionário)
  * GET: localhost:8080/employee/id    (detalhe do funcionário)
* API de relatórios
  * GET: localhost:8080/employee/age (relatório por idade)
  * GET: localhost:8080/employee/salary (relatório por salário)
  
## Testando os Endpoint em produção com o Postman
Abra a ferramenta Postman e cole as seguintes URL's:
* API para CRUD de funcionários:
  * GET: https://ssys-employee.herokuapp.com/employee    (lista de funcionários)
  * POST: https://ssys-employee.herokuapp.com/employee    (inserção de funcionário)
  * PUT: https://ssys-employee.herokuapp.com/employee/id    (atualização de funcionário)
  * DELET: https://ssys-employee.herokuapp.com/employee/id (exclusão de funcionário)
  * GET: localhost:8080/employee/id (detalhe do funcionário)
* API de relatórios
  * GET: https://ssys-employee.herokuapp.com/employee/age (relatório por idade)
  * GET: https://ssys-employee.herokuapp.com/employee/salary (relatório por salário)

OBS1: Na primeira requisição, é normal a demora no retorno do serviço, pois como se trata de uma versão gratuíta, o Heroku "adormece" a API.

OBS2: É possível customizar os testes no Postman, banstando adicionar uma nova Environment, 
adicionando a URL "https://ssys-employee.herokuapp.com/" no campo Initial Value e trocando as mesmas por '{{host}}'.

## Tecnologias Utilizadas
* Java
* Spring Boot
* Spring Security
* JPA
* Lombok
* Maven

## Implantação em produção
* Back end: Heroku
* Banco de dados: Postgresql

## Autor
João Paulo da Mata Mendes

www.linkedin.com/in/joãopaulo-damatamendes
