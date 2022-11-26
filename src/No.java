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

    public void setElement(Object item) {
        this.element = item;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    public No getPrev() {
        return prev;
    }

    public void setPrev(No prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return getElement().toString();
    }
}