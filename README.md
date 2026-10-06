Contexto:

Uma empresa de aluguel de veículos deseja informatizar o controle dos carros disponíveis 
para seus clientes. Para cada veículo, é necessário armazenar informações como modelo, 
marca, ano e quilometragem.

O sistema também deverá permitir realizar algumas operações, como atualizar a quilometragem, calcular a idade do veículo e verificar se ele está disponível para locação.

O desafio é desenvolver essa aplicação utilizando os principais conceitos de Programação Orientada a Objetos (POO).

Objetivo

Criar uma aplicação utilizando classe, atributos, métodos, getters, setters e objetos, aplicando o conceito de encapsulamento.

Desafio

Crie uma classe chamada Veiculo.

A classe deverá possuir os seguintes atributos privados:


Atributo              Tipo               Descrição
marca                    String            Marca do veículo
modelo                  String            Modelo do veículo
ano                         int                  Ano de fabricação
quilometragem     double          Quilometragem atual
disponivel              boolean        Indica se está disponível para locação

Getters e Setters

Crie os métodos get e set para todos os atributos.

Métodos da classe

Além dos getters e setters, implemente os seguintes métodos.

calcularIdade()

Deve calcular a idade do veículo considerando o ano atual.
idade = ano atual - ano de fabricação

realizarLocacao()

O método deverá verificar se o veículo está disponível.

Se estiver disponível, alterar o atributo disponível para false.
Caso contrário, informar que o veículo já está alugado.

devolverVeiculo()

Ao devolver o veículo, o atributo disponível deverá ser alterado para true.

exibirDados()

O método deverá apresentar:
Marca:
Modelo:
Ano:
Quilometragem:
Idade:
Disponível:

Criando os objetos

No programa principal, crie dois objetos da classe Veiculo.
