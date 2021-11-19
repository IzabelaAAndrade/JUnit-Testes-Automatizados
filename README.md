# Tutorial: Testes Automatizados com JUnit
Tutorial simples de criação e execução de TDD automatizado usando JUnit. Trabalho prático realizado para a disciplina de LPII, no técnico em informática do CEFET-MG. 

 - **Todo o tutorial foi elaborado usando como referência os vídeos "[Introdução ao JUnit 5 com NetBeans 11: Criar e configurar projeto Maven incluindo JUnit](https://www.youtube.com/watch?v=_BP3SLcB0QE)", "[Escrevendo TESTES UNITÁRIOS com JUNIT 5 seguindo TDD com NETBEANS 11 (Parte 2)](https://www.youtube.com/watch?v=uGhH4D4Pyww)" e "[Escrevendo TESTES UNITÁRIOS com JUNIT 5 seguindo TDD com NETBEANS 11 (Parte 3)](https://www.youtube.com/watch?v=W9bTYeqDlZ4)" do canal do Professor [Manoel Campos](https://github.com/manoelcampos).** 

# Introdução: JUnit
O JUnit é um framework amplamente utilizado para a execução de testes unitários, sendo bastante útil à implementação do sistema de TDD ou "Test Driven Development". Em sua versão mais recente (5) o JUnit possui três módulos essenciais:
- JUnit Platform: Usado para o desenvolvimento e execução de frameworks.
- JUnit Jupiter: Usado para a implementação e execução de testes.
- JUnit Vintage: Usado para permitir a execução de códigos/testes feitos em versões anteriores do framework. 

# Mão na Massa: Passo a Passo
Para o desenvolvimento de testes automatizados utilizando JUnit, trabalharemos com Java e Maven, podendo ser utilizada uma IDE de preferência a qual tenha suporte a tais ferramentas. Aqui, farei uso do Intellij. 

## Criação do Projeto

1. Inicialmente, deve ser feita a criação de um novo projeto (File > Novo > Projeto). Para as configurações iniciais, ir na aba "Maven" e selecionar a caixa "Create From Archetype". 
2. Criar o projeto Java normalmente, com o nome adequado ao projeto em desenvolvimento.  
![image](https://user-images.githubusercontent.com/51242342/142518849-d052e6b9-edb3-4e0a-84d1-6a580ce7bf44.png)


## Vinculando o JUnit

Para adicionar as dependências JUnit necessárias ao projeto, seguiremos alguns passos simples com base no [site do próprio framework](https://junit.org/junit5/).
1. Na página do framework, clique no botão "JUnit Jupiter" para realizar a vinculação deste módulo com o projeto em desenvolvimento.  

![image](https://user-images.githubusercontent.com/51242342/142519477-6f106f9c-53cc-4c0d-87cd-8fad536c895c.png)

2. Na página seguinte, selecione a versão mais recente do JUnit e clique nos números que a descrevem. 
![image](https://user-images.githubusercontent.com/51242342/142519728-3a45d23f-6691-46d4-adf5-f45df552c1ff.png)

3. Basta então copiar o código disponibilizado conforme a ferramenta auxiliar usada por você. O site do JUnit disponibiliza suporte a Maven, Groovy e Kotlin, mas aqui farei uso apenas do código Maven.  
![image](https://user-images.githubusercontent.com/51242342/142519960-e064ebe2-04ea-450c-bbca-eea4e96845ab.png)

4. Por fim, deveremos colar o código em questão no arquivo pom.xml, dentro da tag "dependencies". Caso a mesma não exista, basta adicioná-la antes.  
![image](https://user-images.githubusercontent.com/51242342/142520412-9051b65b-a71f-4b78-a08e-0eb76fb44432.png)

## Ajustes Maven
Para finalizar essa fase inicial de configuração do projeto, é necessário adicionar as ferramentas de build compatíveis com o Maven. Para tanto, basta adicionar o código da tag "build" disponibilizado na [aba dedicada a Maven do site do JUnit](https://junit.org/junit5/docs/current/user-guide/#running-tests-build-maven) no arquivo pom.xml. 

![image](https://user-images.githubusercontent.com/51242342/142520957-0ea4ebfb-0fec-439e-b2ac-c34b1d700ca7.png)

Feito isso, é importante então compilar o projeto!
