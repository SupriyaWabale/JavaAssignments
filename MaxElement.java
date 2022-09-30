import java.util.*;

public class MaxElement {
    public static void main(String args[]) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(11);
        list1.add(89);
        list1.add(77);
        Integer maximum = list1.stream().max(Integer::compare).get();
        System.out.println("Maximum=" + maximum);
    }
}