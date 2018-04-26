import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("2");
        hashSet.add("1");
        hashSet.add("ab");
        for(String value : hashSet){
            System.out.println(value);
        }
    }
}
