package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<Dog> dset = new TreeSet();
        dset.add(new Dog(2));
        dset.add(new Dog(1));
        dset.add(new Dog(3));

        Iterator iterator = dset.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
