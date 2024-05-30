<h1> Bem-vindo ao Conversor de Moedas.</h1>

<div alaing = center>
<img src=https://github.com/SamilMoret/conversor_de_moedas/blob/main/out/production/img_conversor.png?raw=true> 
</div>

 <hr style="width: 100%; height: 2px; margin: 0;">

<div alaing = center>
<img src=https://github.com/SamilMoret/conversor_de_moedas/blob/main/out/production/img_banco_de_dados.png?raw=true> 
</div>

 <hr style="width: 100%; height: 2px; margin: 0;">

### Descripção do projeto:

<p>O Currency Converter é uma aplicação Java que permite aos usuários converter valores de uma moeda para outra usando taxas de câmbio atualizadas. A aplicação recupera os dados de taxas de câmbio de uma API externa, realiza a conversão e armazena o histórico de conversões em um banco de dados MySQL. </p>

https://samilmoret.github.io/decodificador_de_texto/

### Funcionalidades:

<p>
  Conversão de valores entre diferentes moedas usando taxas de câmbio atualizadas.
  Armazenamento do histórico de conversões em um banco de dados MySQL.
  Exibição do histórico de conversões para consulta futura.</p>


### 🖥️ Tecnologias e Ferramentas: 

<p>
Java: Linguagem de programação utilizada para desenvolver a aplicação.
Gson: Biblioteca usada para fazer o parsing de JSON.
MySQL: Banco de dados utilizado para armazenar o histórico de conversões.
MySQL Connector/J: Driver JDBC para conectar a aplicação Java ao banco de dados MySQL.
IntelliJ IDEA: IDE utilizada para desenvolvimento do projeto.
</p>

### Configuração e Execução:

<h2>Pré-requisitos</h2>
<p>
JDK 17 ou superior
MySQL Server
IntelliJ IDEA (ou qualquer outra IDE de sua preferência)
</p>

<h2>Configuração do Banco de Dados</h2>

<ol>
  <li>1. Instale e configure o MySQL Server.</li>
  <li>2. Crie um banco de dados chamado `conversion_history`.</li>
  <li>3. Execute o seguinte script SQL para criar a tabela necessária MySQL:</li>
</ol>

```
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
<h2>Configuração da Aplicação</h2>

<ol>
  <li>1. Clone o repositório para sua máquina local..</li>
  <li>2. Abra o projeto na sua IDE.</li>
  <li>3. Adicione os arquivos JAR do Gson e MySQL Connector/J ao seu projeto.</li>
  <li>4. Configure as credenciais do banco de dados em DatabaseUtil.java:</li>
</ol>

```
public class DatabaseUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/conversion_history";
        String user = "seu_usuario";
        String password = "sua_senha";
        return DriverManager.getConnection(url, user, password);
    }
}
```
<h2>Executando a Aplicação</h2>

<ol>
  <li>1. Compile e execute a classe CurrencyConverter.</li>
  <li>2. Siga as instruções no console para realizar conversões e visualizar o histórico.</li>
</ol>

### Estructura do Projeto

src/
├── CurrencyConverter.java
├── ExchangeRateService.java
├── Currency_Filter.java
└── DatabaseUtil.java

<h2>Feito por:</h2>
<p>Samil Moret</p>
<a href="https://www.linkedin.com/in/samilmoret/"><img width="48" height="48" src="https://img.icons8.com/color/48/linkedin.png" alt="linkedin"/></a>
<a href="https://linkwhats.app/f27e11"><img width="48" height="48" src="https://img.icons8.com/color/48/whatsapp--v1.png" alt="whatsapp--v1"/></a>
