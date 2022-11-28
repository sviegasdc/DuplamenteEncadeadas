public class Test {
    public static void main(String[] args) {
        TADSequencia Lista = new TADSequencia();
        Lista.insertFirst("batata");
        Lista.insertLast("xavier");
        System.out.println(Lista);
        System.out.println("Lista vazia: "+Lista.isEmpty());
    }
}
