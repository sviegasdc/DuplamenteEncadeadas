public interface ITADLista {
    public void replaceElement(No posicao, Object novoElemento);

    public void swapElement(No posicaoElemento1, No posicaoElemento2);

    public void insertBefore(No posicao, Object novoElemento);

    public void insertAfter(No posicao, Object novoElemento);

    public void insertFirst(Object novoElemento);

    public void insertLast(Object novoElemento);

    public void removePorPosicao(No posicao);

    public void Before(No posicao);

    public void After(No posicao);

    public void isLast(No posicao);

    public void isFirst(No posicao);

    public void size();

    public boolean isEmpty();
}
