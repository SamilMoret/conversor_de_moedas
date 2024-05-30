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


### ⚙️ Funcionalidades:
<ol>
    <li>
        <strong>Conversão de Moedas:</strong
        <ul>
            <li>O aplicativo permite que os usuários selecionem a moeda de origem e a moeda de destino, e insiram o valor a ser convertido. Utilizando dados atualizados de uma API externa, o aplicativo realiza a conversão e exibe o resultado.</li>
        </ul>
    </li>
    <li>
        <strong>Histórico de Conversões:</strong>
        <ul>
            <li>As conversões realizadas são armazenadas em um banco de dados MySQL, permitindo que os usuários consultem o histórico de conversões.</li>
        </ul>
    </li>
    <li>
        <strong>Integração com API Externa:</strong>
        <ul>
            <li>O aplicativo utiliza a ExchangeRate-API para obter as taxas de câmbio mais recentes, garantindo que as conversões sejam baseadas em dados atualizados.</li>
        </ul>
    </li>
    <li>
        <strong>Armazenamento em Banco de Dados:</strong>
        <ul>
            <li>As informações de conversão, incluindo moeda de origem, moeda de destino, valor original, valor convertido e a taxa de câmbio, são armazenadas em uma tabela no banco de dados MySQL.</li>
        </ul>
    </li>
</ol>


### 🖥️ Tecnologias e Ferramentas: 

<ul>
  <li>Java: Linguagem de programação utilizada para desenvolver a aplicação.</li>
  <li>Gson: Biblioteca usada para fazer o parsing de JSON.</li>
  <li>MySQL: Banco de dados utilizado para armazenar o histórico de conversões.</li>
  <li>MySQL Connector/J: Driver JDBC para conectar a aplicação Java ao banco de dados MySQL.</li>
  <li>IntelliJ IDEA: IDE utilizada para desenvolvimento do projeto.</li>
  <li>API de Taxas de Câmbio: ExchangeRate-API</li>
</ul>

### Configuração e Execução:

<h4>Pré-requisitos</h4>
<ul>
  <li>JDK 17 ou superior</li>
  </li>
  <li>MySQL Workbench</li>
  <li>IntelliJ IDEA (ou qualquer outra IDE de sua preferência)</li>
</ul>


<h4>Configuração do Banco de Dados</h4>

<ol>
  <li>Instale e configure o MySQL Workbench.</li>
  <li>Crie um banco de dados chamado `conversion_history`.</li>
  <li>Execute o seguinte script SQL para criar a tabela necessária MySQL:</li>
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

<h4>Configuração da Aplicação</h4>

<ol>
  <li>Clone o repositório para sua máquina local..</li>
  <li>Abra o projeto na sua IDE.</li>
  <li>Adicione os arquivos JAR do Gson e MySQL Connector/J ao seu projeto.</li>
  <li>Configure as credenciais do banco de dados em DatabaseUtil.java:</li>
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

<h4>Executando a Aplicação</h4>

<ol>
  <li>Compile e execute a classe CurrencyConverter.</li>
  <li>Siga as instruções no console para realizar conversões e visualizar o histórico.</li>
</ol>


### Estructura do Projeto

```
src/
├── CurrencyConverter.java
├── ExchangeRateService.java
├── Currency_Filter.java
└── DatabaseUtil.java
```

<h3>Feito por:</h3>
<p>Samil Moret</p>
<a href="https://www.linkedin.com/in/samilmoret/"><img width="48" height="48" src="https://img.icons8.com/color/48/linkedin.png" alt="linkedin"/></a>
<a href="https://linkwhats.app/f27e11"><img width="48" height="48" src="https://img.icons8.com/color/48/whatsapp--v1.png" alt="whatsapp--v1"/></a>
