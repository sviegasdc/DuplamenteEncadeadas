public class TADLista implements ITADLista {
    private ListaEncadeada Lista;

    public TADLista() {
        this.Lista = new ListaEncadeada();
    }

    public void replaceElement(int index, Object element) {

    }

    public void swapElement(int indexElemento1, int indexElemento2) {

    }

    public void insertBefore(int index, Object element) {

    }

    public void insertAfter(int index, Object element) {

    }

    public void insertFirst(Object element) {

    }

    public void insertLast(Object element) {

    }

    public void remove(int index) {

    }

    public void Before(int index) {

    }

    public void After(int index) {

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

    public String mostrar(){
        return Lista.toString();
    }
}
