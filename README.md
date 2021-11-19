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

![image](https://user-images.githubusercontent.com/51242342/142526633-18d4523a-2a7c-4e89-8009-95366b168261.png)

## Processo TDD
Conforme mencionado anteriormente,  a sigla TDD descreve uma técnica de desenvolvimento denominada "Test Driven Development" ou "Desenvolvimento Voltado a Testes".  Adotado em paradigmas como a programação extrema (XP), o TDD se baseia na montagem primeiro dos testes a quais determinados códigos ou funcionalidades devem atender, antes da escrita do programa de fato.   

Seguindo esta lógica, o TDD funciona através de um ciclo básico de três etapas. 

 - **Fase Vermelha:** Inicialmente, elabora-se o teste unitário o qual será falho, afinal, não existirá ainda um "código" para passar por ele.
 - **Fase Verde:** Em sequência, é desenvolvido o programa o qual deverá atender ao teste criado, de modo a torná-lo bem sucedido. 
 - **Refatoração**: Por fim, é feita a refatoração do código desenvolvido, de modo que ele possa ser melhorado conforme os pontos apontados no processo de teste, além de atender a padrões de implementação.

## Exemplo TDD: Fórmula de Bhaskara
Agora, apresentarei um exemplo simples e rápido da implementação de um TDD usando JUnit. 

### Fase Vermelha
1. Inicialmente, cria-se uma estrutura de pastas/pacotes padrão conforme o projeto. Para o meu caso, criei uma classe "Bhaskara" dentro do pacote "com.izabela", na qual implementarei o método a ser testado. 
2. O método em questão será o "calculaBhaskara", instanciado de maneira estática (para ser chamado sem necessidade de uma instância da classe) e possuindo como valor de retorno "-1". Este valor inicial foi estabelecido pois ainda não será feito nenhum código no interior do método, afinal, o TDD se baseia primeiro no desenvolvimento de um teste a ser atendido.   
![image](https://user-images.githubusercontent.com/51242342/142553279-3e16ae6c-da43-44f4-8a59-ac02c6b39b40.png)

3. Criaremos agora a classe de teste referente à original Bhaskara. Para tanto, podemos clicar com o botão direito do mouse no nome da classe e então em "Go To > Test", conforme ilustrado abaixo. 
![image](https://user-images.githubusercontent.com/51242342/142553547-5997fa20-9e2e-4715-8c87-fc13d7378514.png) 
4. Inicialmente, não existirá classe de teste, logo, deveremos efetuar sua criação conforme a janela pop-up. 
![image](https://user-images.githubusercontent.com/51242342/142553678-f5699f1d-8a1f-467f-a834-7fc0ce93f694.png)
5. Com a classe criada, deveremos implementar um ou mais casos de teste aos quais deverão ser atendidos. Conforme se sabe pela matemática, a fórmula de bháskara recebe três valores A, B e C os quais correspondem a incógnitas de uma equação de segundo grau e retorna as raízes da equação. Sabe-se que: A deve ser maior que zero (para que a equação seja do segundo grau) e que delta (b^2 - 4 . A . C) não deverá ser negativo para que as raízes sejam reais. Como queremos uma função com um único valor de retorno, será necessário que o valor de delta seja igual a zero, para que haja apenas um valor real. Ademais, precisaremos verificar se A é ou não diferente de zero.  Projetaremos um teste para realizar estas aferições. 

### Fase Vermelha (Parte 2)
O teste mencionado é apresentado abaixo.  
![image](https://user-images.githubusercontent.com/51242342/142555943-7849a8e4-cd5b-4bde-bc6e-00a22c43bb80.png)
Tem-se um conjunto de incógnitas as quais atendem ambas as demandas explicitadas no item anterior. Usa-se da assertiva "assertEquals" para verificar se o valor retornado pelo método calculaBhaskara corresponde ao valor esperado como solução. A notação @Test é usada antes do método para indicar que o mesmo corresponde a um método de teste. 

Agora, executaremos a classe de teste mencionada através do comando "Run Bhaskara Test", que pode ser encontrado ao clicar no nome da classe que se deseja executar com o botão direito do mouse. 
![image](https://user-images.githubusercontent.com/51242342/142556140-d05c2e1e-671e-4871-a017-0f915fcc45d9.png)

Como resultado da execução, teremos que o teste falhou, exatamente como esperado, afinal, ainda não foi desenvolvido um código adequado para o cálculo de bháskara na classe Bhaskara. 
![image](https://user-images.githubusercontent.com/51242342/142556309-23b2a57d-25fe-411a-916d-bc8c489130e0.png)


### Fase Verde
Agora que já temos um caso de teste a ser atendido, usaremos as condições de validação do mesmo para elaborar a solução. Temos de garantir que:

 - A seja positivo
 - Delta seja igual a zero

Isso é feito através do código apresentado abaixo. Ao executá-lo, temos que o teste foi atendido, o que conclui a fase verde :)
![image](https://user-images.githubusercontent.com/51242342/142557091-c3932596-f6d1-4729-a846-23406291da83.png)

### Refatoração
Agora que já temos um código que atende às nossas condições de teste, podemos partir para a fase final do nosso TDD: a refatoração. Nela aperfeiçoaremos o programa da classe Bhaskara para que ele se torne mais efetivo. No nosso caso, podemos fazer a fusão dos ifs apresentados, colocando o cálculo do delta no início do método, conforme apresentado abaixo. 
![image](https://user-images.githubusercontent.com/51242342/142557404-78275bc1-8fb1-49f1-9fb6-5440b1c4c244.png)

Agora é necessário apenas executar o teste novamente, verificando se ele irá passar! Conforme apresentado abaixo, vemos que sim, ele foi aprovado :)
![image](https://user-images.githubusercontent.com/51242342/142557609-07f486e4-a1c5-4320-a939-7255dc20835d.png)

## Conclusão
Encerramos aqui nosso pequeno exemplo de TDD com JUnit! Espero que você tenha gostado desse tutorial!

