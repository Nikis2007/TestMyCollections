import java.util.ArrayList;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        int index = MyCollections.binarySearch(list, "Bob");
        System.out.println("Index of Bob: " + index);
    }
}
