public class TADLista implements ITADLista {
    private ListaEncadeada Lista;
    private No primeiro;

    private No ultimo;
    private No atual;

    private No anterior;

    public TADLista() {
        this.Lista = new ListaEncadeada();
    }

    public void replaceElement(int posicao, Object novoElemento) {
        No novoNo = new No(novoElemento);
        this.atual = primeiro;
        for(int i=0; i<=posicao;i++){
            this.atual = atual.getNext();
        }
        this.atual.setElement(novoNo);
        //para o replace precisa setar o anterior e o próximo?

    }
    public void swapElement(int posicaoElemento1, int posicaoElemento2) {

    }

    public void insertBefore(int posicao, Object novoElemento) {


    }

    public void insertAfter(int posicao, Object novoElemento) {

    }

    public void insertFirst(Object novoElemento) {
        Lista.adicionarInicio(novoElemento);

    }

    public void insertLast(Object novoElemento) {
        Lista.adicionarUltimo(novoElemento);

    }
    @Override
    public void removePorPosicao(int posicao) {
        //se a lista n estiver vazia
        if(!isEmpty()) {
            for (int i = 0; i <= posicao; i++) {
                this.atual = atual.getNext();
            }
            //anterior do atual vai apontar pra o próximo do atual
            //anterior => atual => próximo / anterior => próximo
            (atual.getPrev()).setNext(atual.getNext());
            //anterior <= próximo
            (atual.getNext()).setPrev(atual.getPrev());
        }
    }
    public void Before(int posicao) {
        if(!isEmpty()) {
            for (int i = 0; i <= posicao; i++) {
                this.atual = atual.getNext();
            }
        }
        System.out.println("Anterior aponta para: "+atual.getPrev());
    }

    public void After(int posicao) {
        if(!isEmpty()) {
            for (int i = 0; i <= posicao; i++) {
                this.atual = atual.getNext();
            }
        }
        System.out.println("Próximo aponta para: "+atual.getNext());

    }

    public void isLast() {

    }

    public void isFirst() {

    }

    public void size() {
        System.out.println("Tamnho da lista: "+Lista.getTamanho());
    }

    public boolean isEmpty() {
        return Lista.getPrimeiro()==null;
    }

    public String toString(){
        String texto = "";
        texto += String.format("%s ", atual.toString());

        if (atual.getNext() != null)
            texto += String.format("=> %s", atual.getNext().toString());

        if (atual.getPrev() != null)
            texto += String.format("<= %s", atual.getPrev().toString());

        return texto;
    }
}
