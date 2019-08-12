### Pequena rotina de automação usando Java, JUinit, Selenium WebDriver e Maven.(Windows 7 e Chrome 75) 
#### Usaremos o java como a linguem para aplicação. 
#### O JUinit é uma framework Java para testar os resultados gerados pelos métodos e caso a resposta não seja a esperada ele nos mostra os possíveis erros no método. Ele tem alguns métodos pré definidos para organizar o teste como um método de setup inicial, o método onde ocorre o teste, e um método para ser executado no final do test.
#### A Selenium WebDriver é uma ferramenta com suporte a várias linguagens que faz rapidamente a automação de testes de sistemas se passando por um usuário real desse sistema,  fazendo a interação diretamente pelo navegador. Para cada navegador é necessário um arquivo webdriver diferente e ao menos no caso do chrome existe um webdriver para cada versão do navegador sendo necessário atenção na hora de realizar o download. 
#### O Apache Maven é uma ferramenta de automação de compilação (ato de criar scripts ou automação de uma grande variedade de tarefas) que permite através do arquivo [pom.xml](https://github.com/m4theussouza/Desafio00/blob/master/pom.xml) baixar as bibliotecas Java e seus plugins. 

### Downloads necessários

#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1 - Baixe e instale o [Java SDK 12](https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html). Necessário para rodar as aplicações em Java. 
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2 - Baixe e instale o [Eclipse](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2019-06/R/eclipse-inst-win64.exe). IDE usada para desenvolver e rodar a aplicação.
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3 - Baixe e descompacte o [WebDriver Chrome](https://chromedriver.chromium.org/downloads). Recomendo que adicione o arquivo na raiz do HD para facilitar o caminho até ele.
### 
### Iniciando a aplicação
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1 - Abra o Eclipse e na tela inicial do eclipse vá em _File -> New -> Project..._
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2 - Na janela que se abre selecione _Maven -> Maven Project_
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3 - Na próxima janela marque a opção _Create a simple project (skip archetype selection)_ para que ele não crie arquivos desnecessários nesse momento no projeto
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4 - Agora precisamos dar um nome para o campo _Group Id_ e _Artifact Id_. Esses campos podem ter qualquer nome e eles que daram nome ao projeto. Após inserir os nomes clique em _Finish_. 
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 5 - Com o projeto Maven criado podemos ter acesso ao pom.xml, é nesse arquivo que adicionamos as dependências de nosso projeto. Acessando o [site de repositórios Maven](https://mvnrepository.com/) podemos buscar por diversas frameworks, plugins e bibliotecas e simplesmente copiar e colar o script de instalação no nosso arquivo dentro da tag xml _dependencies_. O arquivo [pom.xml](https://github.com/m4theussouza/Desafio00/blob/master/pom.xml) utilizado está disponivel. Portando é necessário adicionar em seu arquivo pom.xml tudo que está entre a linha 6 e a linha 21 do arquivo disponibilizado. Logo após salvar o arquivo o maven inicia o download e a montagem dos arquivos. Usamos o Maven para adicionar ao projeto o Selenium 4.0.0-alpha-2 e o JUinit 4.13-beta-3.
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 6 - No eclipse clique com o botão direito sobre _src/test/java_ que está localizado na guia _Package Explorer_ no canto superior esquerdo, depois vá em _New -> Package_. Coloque o nome de _page_. 
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 7 - Mesmos passos do anterior mas agora criaremos o pacote de nome _test_.
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 8 - Clique com o botão direito sobre o _package_ criado de nome _test_ e vá na opção _import_. Selecione _general -> File System_ e depois clique em _next_. Clique em _Browse..._ e naveque até onde baixou os arquivos [disponibilizados](https://github.com/m4theussouza/Desafio00) e selecione a pasta _test_ que contém o arquivo [_testRegistration.java_](https://github.com/m4theussouza/Desafio00/tree/master/test). Marque a caixa para importar o arquivo e depois clique em _finish_. 
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 9 - Faça a mesma coisa do passo anterior mas para o pacote de nome _page_ e para a pasta de nome _page_ importando os [5 arquivos disponibilizados](https://github.com/m4theussouza/Desafio00/tree/master/page).
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10 - Abra o arquivo _testResgitration_ e vá até a linha 26:
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; _System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");_
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; No segundo argumento do método setProperty passe como argumento o caminho do webdriver baixado e salve o arquivo.
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10 - Clique no botão Run do eclipse para iniciar a aplicação. Se tudo foi feito corretamente a aplicação deve iniciar abrindo o chrome, entrar no site _https://www.phptravels.net/admin/_, fazer o cadastro de um usuário e testar se o email cadastrado está correto. Caso queira com que o navegador seja finalizado após o cadastro e a verificação descomente a linha 52 do arquivo _testResgitration_.
