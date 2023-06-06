package Set.application;

import java.util.HashSet;
import java.util.Set;
public class Program1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        set.remove("Tablet");
        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}
