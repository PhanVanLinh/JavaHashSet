package treeset;

public class Dog implements Comparable {
    int size;

    public Dog(int s) {
        size = s;
    }

    public String toString() {
        return size + "";
    }

    @Override
    public int compareTo(Object o) {
        return size - ((Dog) o).size;
    }
}