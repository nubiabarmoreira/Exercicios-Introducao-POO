public enum menuDeOpcoes {
    CADASTRARLIVRO ("1 : Cadastrar livro"),
    CADASTRARUSUARIO ("2 : Cadastrar usuário"),
    REALIZAREMPRESTIMO ("3 : Realizar empréstimo"),
    REALIZARDEVOLUCAO ("4 : Realizar devolução"),
    EXIBIRLIVROSDISPONIVEIS ("5 : Exibir livros disponíveis"),
    SAIR ("6 : Sair");

    private String descricao;

    menuDeOpcoes(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
