# Buscador de Vagas - Core Service

Este é um aplicativo que busca vagas na internet e mostra para o usuário as melhores oportunidades baseadas nos dados fornecidos. Além disso, ele gera um currículo personalizado em PDF para que o usuário possa se candidatar à vaga com mais facilidade.
## Como instalar e executar

Este serviço pode ser executado com Docker Compose, seguindo os passos abaixo:

1. Clone o repositório:

   ```
   git clone https://github.com/free-open-connect/core-service.git
   ```

2. Acesse a pasta raiz do projeto:

   ```
   cd core-service
   ```

3. Execute o comando `docker-compose up` para baixar as imagens necessárias e iniciar os contêineres do aplicativo:

   ```
   docker-compose up
   ```

   Isso irá iniciar o aplicativo e expor o endpoint http://localhost:8080.

4. Para acessar a aplicação, abra o seu navegador e digite o endereço http://localhost:8080.

## Como utilizar

Ao acessar o aplicativo, o usuário deve preencher os dados solicitados na tela (como cargo desejado, localização, experiência etc.) e clicar no botão "Buscar vagas". O aplicativo irá buscar as vagas disponíveis na internet e retornar as melhores opções para o usuário.

Além disso, é possível gerar um currículo personalizado em PDF para cada vaga encontrada. Basta selecionar a opção "Gerar currículo" e preencher os dados solicitados. O arquivo PDF será gerado e poderá ser salvo para uso posterior.

## Workflow da aplicação

![workflow](https://user-images.githubusercontent.com/107776531/235372396-1d75d358-3a2f-4088-be78-a4e7fa0847ae.png)

## Tecnologias utilizadas

- Spring Boot 3
- Java 17
- Quarkus

## Licença

Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT).


