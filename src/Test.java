public class Test {
    public static void main(String[] args) {
        TADLista Lista = new TADLista();
        Lista.insertFirst("ghost");
        Lista.insertFirst("alucard");
        Lista.insertLast("hexa");
        Lista.insertLast("cor");
        System.out.println(Lista);
        System.out.println("Lista vazia: "+Lista.isEmpty());
    }
}
