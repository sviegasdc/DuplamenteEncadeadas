public class No {
    private Object element;
    private No next;

    private No prev;

    public No(Object newElement) {
        this.element = newElement;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object item ) {
        this.element = item;
    }

    public No getNext(){
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    public No getPrev(){
        return prev;
    }

    public void setPrev(No prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        String texto = "";
        texto += String.format("%s ", this.element.toString());

        if (this.getNext() != null)
            texto += String.format("=> %s", this.getNext().toString());

        if (this.getPrev() != null)
            texto += String.format("<= %s", this.getPrev().toString());

        return texto;
    }

}
