# 💱 Bem-vindo ao Conversor de Moedas

<div align="center">
<img src="https://github.com/SamilMoret/conversor_de_moedas/blob/main/out/production/img_conversor.png?raw=true">
</div>

<hr style="width: 100%; height: 2px; margin: 0;">

<div align="center">
<img src="https://github.com/SamilMoret/conversor_de_moedas/blob/main/out/production/img_banco_de_dados.png?raw=true">
</div>

<hr style="width: 100%; height: 2px; margin: 0;">

### 📝  Descrição do projeto

O Currency Converter é uma aplicação Java que permite aos usuários converter valores de uma moeda para outra usando taxas de câmbio atualizadas. A aplicação recupera os dados de taxas de câmbio de uma API externa, realiza a conversão e armazena o histórico de conversões em um banco de dados MySQL.

### ⚙️ Funcionalidades

1. **Conversão de Moedas**
   - O aplicativo permite que os usuários selecionem a moeda de origem e a moeda de destino, e insiram o valor a ser convertido. Utilizando dados atualizados de uma API externa, o aplicativo realiza a conversão e exibe o resultado.

2. **Histórico de Conversões**
   - As conversões realizadas são armazenadas em um banco de dados MySQL, permitindo que os usuários consultem o histórico de conversões.

3. **Integração com API Externa**
   - O aplicativo utiliza a ExchangeRate-API para obter as taxas de câmbio mais recentes, garantindo que as conversões sejam baseadas em dados atualizados.

4. **Armazenamento em Banco de Dados**
   - As informações de conversão, incluindo moeda de origem, moeda de destino, valor original, valor convertido e a taxa de câmbio, são armazenadas em uma tabela no banco de dados MySQL.

### 🖥️ Tecnologias e Ferramentas

- Java: Linguagem de programação utilizada para desenvolver a aplicação.
- Gson: Biblioteca usada para fazer o parsing de JSON.
- MySQL: Banco de dados utilizado para armazenar o histórico de conversões.
- MySQL Connector/J: Driver JDBC para conectar a aplicação Java ao banco de dados MySQL.
- IntelliJ IDEA: IDE utilizada para desenvolvimento do projeto.
- API de Taxas de Câmbio: ExchangeRate-API

### ⚙️ Configuração e Execução

####  📋 Pré-requisitos

- JDK 17 ou superior
- MySQL Workbench
- IntelliJ IDEA (ou qualquer outra IDE de sua preferência)

####  🛠️ Detalhes Técnicos

1. A aplicação foi desenvolvida em Java, utilizando uma estrutura de classes bem organizada para facilitar a manutenção e a escalabilidade do projeto.

2. A integração com a API externa foi realizada utilizando HTTP requests para obter as taxas de câmbio no formato JSON, que são então parseadas utilizando a biblioteca Gson.

3. Para persistência dos dados, foi configurado um banco de dados MySQL. As operações de inserção e consulta são realizadas utilizando JDBC.

4. O histórico de conversões é exibido de forma ordenada, permitindo que o usuário veja as conversões mais recentes primeiro.

####  🗄️ Configuração do Banco de Dados

1. Instale e configure o MySQL Workbench.
2. Crie um banco de dados chamado `conversion_history`.
3. Execute o seguinte script SQL para criar a tabela necessária MySQL:

    ```sql
    CREATE TABLE conversion_history (
        id INT AUTO_INCREMENT PRIMARY KEY,
        from_currency VARCHAR(3) NOT NULL,
        to_currency VARCHAR(3) NOT NULL,
        amount DOUBLE NOT NULL,
        converted_amount DOUBLE NOT NULL,
        conversion_rate DOUBLE NOT NULL,
        conversion_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
    ```

#### ⚙️ Configuração da Aplicação

1. Clone o repositório para sua máquina local.
2. Abra o projeto na sua IDE.
3. Adicione os arquivos JAR do Gson e MySQL Connector/J ao seu projeto.
4. Configure as credenciais do banco de dados em `DatabaseUtil.java`:

    ```java
    public class DatabaseUtil {
        public static Connection getConnection() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/conversion_history";
            String user = "seu_usuario";
            String password = "sua_senha";
            return DriverManager.getConnection(url, user, password);
        }
    }
    ```

#### ▶️ Executando a Aplicação

1. Compile e execute a classe `CurrencyConverter`.
2. Siga as instruções no console para realizar conversões e visualizar o histórico.

###  🗂️ Estrutura do Projeto

```plaintext
src/
├── CurrencyConverter.java
├── ExchangeRateService.java
├── Currency_Filter.java
└── DatabaseUtil.java
```
### 🚀 Desafios e Soluções

1. **Problema de Conexão com o Banco de Dados:** Enfrentei desafios ao configurar a conexão com o banco de dados MySQL, especialmente relacionados às permissões de acesso e ao uso de colunas específicas. Resolvi isso ajustando as configurações de usuários e permissões no MySQL e corrigindo os nomes das colunas na tabela.
   
2. **Manipulação de Dados JSON:** Para garantir que os dados da API fossem corretamente interpretados, utilizei a biblioteca Gson para parsear e mapear os dados JSON para objetos Java.

### 🔚 Conclusão

Este projeto de conversor de moedas é uma solução prática para quem precisa realizar conversões de moedas de forma rápida e precisa. A integração com uma API externa garante que as taxas de câmbio estejam sempre atualizadas, e o armazenamento de dados em um banco de dados proporciona uma forma conveniente de manter um histórico das conversões realizadas. Estou empolgado com o potencial deste projeto e com as oportunidades de aprimorá-lo no futuro.

<h3>🧑‍💻 Feito por:</h3>
<p>Samil Moret</p>
<a href="https://www.linkedin.com/in/samilmoret/"><img width="48" height="48" src="https://img.icons8.com/color/48/linkedin.png" alt="linkedin"/></a>
<a href="https://linkwhats.app/f27e11"><img width="48" height="48" src="https://img.icons8.com/color/48/whatsapp--v1.png" alt="whatsapp--v1"/></a>
