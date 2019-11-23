import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        printList(new ArrayList<Integer>());
        addNumbers(new ArrayList<Number>());

        List<EvenNumber> le = new ArrayList<>();
        le.add(new EvenNumber(10));
        List<? extends NaturalNumber> ln = le;
        ln.add(null);
        //        ln.add(new EvenNumber(12));

        List<EvenNumber> naturalNumber = new ArrayList<>();
        naturalNumber.add(new EvenNumber(10));

        List<Integer> il = new ArrayList<>();
        List<Number> nl = new ArrayList<>();
        //il = nl;
        //nl = il;

        List<? extends Integer> wil = new ArrayList<>();
        List<? extends Number> wnl = new ArrayList<>();
        wnl = il;

    }

    public static void printList(List<? extends Number> list) {
        for (Object elem : list) {
            System.out.println(elem + " ");
        }
        System.out.println();
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    void foo(List<?> i) {
        i.set(0, null);
        Object a = i.get(0);
        i.set(0, a);
    }


}


class NaturalNumber {

    private int i;

    public NaturalNumber(int i) {
        this.i = i;
    }
}

class EvenNumber extends NaturalNumber {

    public EvenNumber(int i) {
        super(i);
    }
}
