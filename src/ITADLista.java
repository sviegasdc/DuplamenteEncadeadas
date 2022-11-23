public interface ITADLista {
    public void replaceElement(int index, Object elemento);

    public void swapElement(int indexElemento1, int indexElemento2);

    public void insertBefore(int index, Object elemento);

    public void insertAfter(int index, Object elemento);

    public void insertFirst(Object elemento);

    public void insertLast(Object elemento);

    public void remove(int index);

    public void Before(int index);

    public void After(int index);

    public void isLast();

    public void isFirst();

    public void size();

    public boolean isEmpty();
}
