public class ListaEncadeada {
    private No primeiro;
    private No ultimo;
    private No atual;
    private int tamanho;

    public ListaEncadeada() {
        this.tamanho = 0;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionarUltimo(Object novoElemento) {
        No novoNo = new No(novoElemento);
        //passando o valor para o nó
        if (this.primeiro == null && this.ultimo == null) {
            setPrimeiro(novoNo);

        } else {
            //novoNo como novo ultimo
            this.ultimo.setNext(novoNo);
            //último antigo como o anterior do novoNo(último atual)
            novoNo.setPrev(ultimo);
        }
        this.ultimo = novoNo;
        this.tamanho++;
    }

    public void adicionarInicio(Object novoElemento) {
        No novoNo = new No(novoElemento);
        //passando o valor para o nó
        if(this.primeiro==null && this.ultimo==null) {
            setPrimeiro(novoNo);
            setUltimo(novoNo);

        }else {
            //antigo primeiro como próximo do novoNo(primeiro atual)
            novoNo.setNext(primeiro);
            //novoNo como novo primeiro
            primeiro = novoNo;
        }
        atual = novoNo;
        this.tamanho++;
    }

    public void removerPrimeiro(){
        this.atual = this.primeiro;
        if(this.primeiro == this.ultimo){
            this.primeiro = null;
            this.ultimo = null;
        }else{
            this.primeiro = this.atual.getNext();
        }
        this.tamanho--;
    }

    public void removerUltimo(){
        No atual = this.primeiro;
        if (atual.getNext() == this.ultimo) {
            this.ultimo = atual;
            atual.setNext(null);
        }
        atual = atual.getNext();
        this.tamanho--; // testar
    }

    public No get(int posicao){
        //é um metodo para visualizar todos da lista e encontrar o elemento que foi repassado
        No atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            //verifico se o atual tem próximo
            if (atual.getNext() != null) {
                atual = atual.getNext();
                //assim eu avanço na lista
            }
        }
        return atual;
    }

    public String toString() {
        String s = "";
        No atual = primeiro;
        while(atual!=null){
            s = s + " => "+atual.getElement();
            atual = atual.getNext();
        }
        return "head [null] "+ s+ " => tail [null]";
    }
}
