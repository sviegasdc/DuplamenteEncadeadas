public class Test {
    public static void main(String[] args) {
        TADSequencia Lista = new TADSequencia();
        No n = Lista.insertFirst("batata");
        No p = Lista.insertFirst("bata");
        No q = Lista.insertLast("number");
        No u = Lista.insertLast("wed");
        Lista.first();
        System.out.println(Lista.elemAtRank(q));
        System.out.println(Lista);
        System.out.println("Lista vazia: "+Lista.isEmpty());
    }
}
