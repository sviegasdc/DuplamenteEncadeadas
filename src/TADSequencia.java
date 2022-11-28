public class TADSequencia implements ITADSequencia{
    private ListaEncadeada Lista;
    private No primeiro;
    private No head;
    private No tail;
    private No ultimo;
    private No atual;
    private No anterior;
    private int tamanho;

    public TADSequencia() {
        //dando erro de "Lista is null" sem isso
        this.Lista = new ListaEncadeada();
        //nós sentinelas
        this.head = new No(null);
        this.tail = new No(null);
        head.setNext(tail);
        tail.setPrev(head);
        this.tamanho = 0;
    }

    public void replaceElement(No posicao, Object novoElemento) {
        No novoNo = new No(novoElemento);
        posicao.setElement(novoNo);
        //não é necessário setar o anterior e o próximo
    }

    public void swapElement(No posicaoElemento1, No posicaoElemento2) {
        atual = posicaoElemento1;
        posicaoElemento1.setElement(posicaoElemento2);
        posicaoElemento2.setElement(atual);
        //não é necessário setar o anterior e o próximo pq é basicamente um replace?
    }

    public void insertBefore(No posicao, Object novoElemento) {
        No novoNo = new No(novoElemento);
        //novoNo <= posição
        posicao.setPrev(novoNo);
        //novoNo => posição
        novoNo.setNext(posicao);
        //anterior (do posição) <= novoNo
        novoNo.setPrev(posicao.getPrev());
        //novoNo => próximo (do atual)
        novoNo.setNext(posicao.getNext());
        tamanho++;
    }

    public void insertAfter(No posicao, Object novoElemento) {
        No novoNo = new No(novoElemento);
        //posição <= novoNo
        novoNo.setPrev(posicao);
        //novoNo => próximo (do atual)
        novoNo.setNext(posicao.getNext());
        //novoNo <= próximo (do atual)
        (posicao.getNext()).setPrev(novoNo);
        //posição => novoNo
        posicao.setNext(novoNo);
        tamanho++;
    }

    public void insertFirst(Object novoElemento) {
        No novoNo = new No(novoElemento);
        Lista.adicionarInicio(novoElemento);
        head.setNext(novoNo);
        novoNo.setPrev(head);
    }

    public void insertLast(Object novoElemento) {
        No novoNo = new No(novoElemento);
        Lista.adicionarUltimo(novoElemento);
        tail.setPrev(novoNo);
        novoNo.setNext(tail);
    }

    public void removePorPosicao(No posicao) {
        //anterior => atual => próximo / anterior => próximo
        (posicao.getPrev()).setNext(posicao.getNext());
        //anterior <= próximo
        (posicao.getNext()).setPrev(posicao.getPrev());
        tamanho--;
    }

    public void Before(No posicao) {
        System.out.println("Anterior do nó "+posicao+"aponta para: "+posicao.getPrev());
    }

    public void After(No posicao) {
        System.out.println("Próximo do nó "+posicao+"aponta para: "+posicao.getNext());
    }

    public void first() {
        System.out.println("Primeiro nó: "+primeiro);
    }

    public void last() {
        System.out.println("Último nó: "+ultimo);
    }

    public Object elemAtRank(No posicao) {
        return posicao.getElement();
    }

    public Object replaceAtRank(No posicao, Object novoElemento) {
        No novoNo = new No(novoElemento);
        this.atual =posicao;
        posicao.setElement(novoNo);
        return atual;
    }

    public void insertAtRank(No posicao, Object novoElemento) {
        No novoNo = new No(novoElemento);
        //novoNo => posição
        novoNo.setNext(posicao);
        //anterior (do posição) <= novoNo
        novoNo.setPrev(posicao.getPrev());
        //posição => próximo
        posicao.setNext(posicao.getNext());
        //novoNo <= posição
        posicao.setPrev(novoNo);
        tamanho++;

    }

    public Object removeAtRank(No posicao) {
        //anterior => atual => próximo / anterior => próximo
        (posicao.getPrev()).setNext(posicao.getNext());
        //anterior <= próximo
        (posicao.getNext()).setPrev(posicao.getPrev());
        tamanho--;
        return posicao;
    }

    public void size() {
        System.out.println("Tamanho: "+Lista.getTamanho());
    }

    public boolean isEmpty() {
        //se o próximo do head for o tail, significa que a lista está vazia
        return head.getNext()==tail;
    }

    public String toString() {
        return Lista.toString();
    }
}
