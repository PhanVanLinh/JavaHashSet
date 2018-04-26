import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        HashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("2");
        hashSet.add("1");
        hashSet.add("ab");
        for(String integer : hashSet){
            System.out.println("value = "+integer);
        }
    }
}
