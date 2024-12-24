# SISTEMA DE GERENCIAMENTO DE BIBLIOTECA

## Índice
1. [Descrição](#descrição)
2. [Explicação](#explicação-do-funcionamento-do-código)
3. [Execução](#execucao)
4. [GitFlow](#gitflow)
5. [Commits](#commits)


## Descrição

É um programa desenvolvido para uma biblioteca que permite o gerenciamento de livros e usuários.


## Explicação do funcionamento do código

- Foi implementado de acordo com o paradigma de orientação a objetos.
- O programa foi escrito para o que o usuário inteja com o terminal, podendo escolher entre:
  - Cadastrar livros;
  - Cadastrar usuários;
  - Realizar empréstimo de livros;
  - Devolver livros;
  - Visualizar quais livros estão disponíveis;
  - Visualizar quais livros estão sob posse do usuário;
  - Exibir informações de um determinado livro e/ou usuário.
- Além disso, o programa oferece suporte de verificação para confirmar se o usuário pode pegar mais livros emprestados e se o livro desejado está disponível para empréstimo.

> IMPORTANTE:
>
> Os próximos passos de implementação de código são:
> 1. Realizar empréstimo de livro;
> 2. Realizar devolução de livro;
> 3. Melhorar código, refatorando onde for necessário;
> 4. Implementar funcionalidade de salvar dados em arquivos de texto (desafio extra).


## Execução
1. Certifique-se de ter o Java e o IntelliJ instalados em sua máquina, e o GitHub se desejar clonar o repositório.
2. Clone o repositório pelo GitHub utilizando o comando git clone https://github.com/nubiabarmoreira/Exercicios-Introducao-POO/tree/main
3. Importe o projeto no IntelliJ.
4. Para executar o projeto basta rodar a classe `Main`.
   Também pode ser executado utilizando o atalho Shift + F10
5. Após, siga as instruções que aparecerá no terminal.


## GitFlow

- A branch principal é a branch `main`
- Há uma branch secundária para desenvolvimento, a branch `develop`
- Após todos os códigos estarem na `develop` foi feito o merge para a branch `main`


## Commits

-  Foi utilizado coventional commits para manter um padrão de projeto, seguindo essa documentação:
   https://www.conventionalcommits.org/pt-br/v1.0.0/
