public interface ITADVetor {
    Object elemAtRank(No posicao);
    //retorna o elemento r
    Object replaceAtRank(No posicao, Object novoElemento);
    //substitui o elemento na colocação 'r'(index) por 'o'(elemento) e retorna o antigo elemento
    void insertAtRank(No posicao, Object novoElemento);
    //insere um novo elemento 'o'(elemento) na colocação 'r' (index)
    Object removeAtRank(No posicao);
    // remove e retorno o elemento na colocação 'r'(index)
    public void size();
    public boolean isEmpty();
}
