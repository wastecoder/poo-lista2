# 2ª Lista de Programação Orientada a Objeto

## Exercício 5
A partir de objetos comuns, crie 3 classes, abstraindo ao menos 5 características e 3 comportamentos para cada uma.
Crie o código em Java para estas classes.


## Exercício 6
Com base nas classes criadas no exercício anterior, instancie 2 objetos para cada classe, e escreva códigos para modificar suas características e executar seus comportamentos.


## Exercício 7
Crie uma classe chamada Caixa que faça venda de produtos, conforme o layout em anexo. A função da venda deverá acrescer o valor do produto no saldo, e deverá retornar o valor do novo saldo.
Faça também uma classe para testes que instancie o objeto Caixa e invoque a função venda.


## Exercício 8
Com base no exercício anterior o seu cliente pediu para que as vendas possam receber diversos produtos simultaneamente.
Faça a modificação no método venda de maneira que possa somar os valores de diversos produtos de uma única vez.


## Exercício 9
Identifique 3 classes do mundo real, de forma que cada uma delas possuam ao menos duas relações de associação sendo uma de agregação e outra de composição.
- Desenhe um diagrama com as classes e suas relações
- Faça o codigo Java com estas classes, crie ao menos 2 construtores em cada classe, um deles recebendo parâmetros para preencher todos os atributos, e outro construtor não recebendo parâmetro algum.
- Faça uma classe Teste que instâncie as classes principais e as que servem como agregação, e faça o vínculo entre elas, o vínculo pode ser feito por meio dos construtores das classes principais.


## Exercício 10
Criar exercício de dependência sobre Aeroporto, fazendo os relacionamentos que julgar necessário com as entidades abaixo:
- Aeronave
- Pessoa
- Piloto
- Passageiro
- Aeroporto

1. Desenhe o diagrama de classe dessas entidades, especificando as associações entre elas. Cada classe deve conter pelo menos 3 características e ao menos 1 comportamento, não se esqueça de fazer também a herança. 
2. Escreva o código em Java das classes
3. Crie uma função main que instancie ao menos 2 instâncias de cada classe, preenchendo as associações.


## Exercício 11
Jogo do Dinossauro - Skeep<br>
O Skeep é um dinossauro e será o personagem do nosso jogo, ele possui as seguintes características e comportamentos:

Características
- Energia
- Velocidade
- Temperatura
- Humor

Comportamentos
- pular()
- correr()
- comer()
- cantar()
- tomarSol()
- ficarNaSombra()

Regras:
- Tomar Sol para aumentar a velocidade, a temperatura, além de deixá-lo com o humor feliz
- Comer para aumentar a energia, diminui a velocidade, e deixar o humor feliz
- Correr gasta energia e velocidade, mas deixa o humor feliz
- ficarNaSombra recupera energia deixa o humor triste e diminui a temperatura
- cantar gasta energia e deixa o humor feliz
- pular gasta energia e velocidade e deixa o humor feliz

Faça uma classe chamada Dinossauro, contendo as características e comportamentos do Skeep.
- Crie uma classe de Teste com o método main, para executar as atividades abaixo:
- Crie uma instância do classe Dinossauro chamada de skeep
- Crie uma instância da classe Scanner chamada de scan

Em um loop inifinito
- Mostre na tela as características do objeto skeep
- Mostre um menu de opções para o usuário com as seguintes opções:
  - (P)ular  &nbsp; &nbsp; &nbsp; &nbsp;  Co(M)er
  - C(A)ntar  &nbsp; &nbsp;&nbsp;  Tomar (S)ol  &nbsp; &nbsp; &nbsp; &nbsp;  Ficar na S(O)mbra

- Pegue a primeira letra do que o usuário digitar como sendo a opção escolhida
  - String textoMaiusculo = scan.nextLine().toUpperCase();
  - char letra = textoMaiusculo.charAt(0);
- Conforme a opção escolhida execute o método correspondente no objeto skeep

