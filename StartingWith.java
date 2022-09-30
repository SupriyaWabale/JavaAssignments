import java.util.ArrayList;
import java.util.List;

public class Startingwith {
    public static void main(String args[])
    {
        List<Integer> list2= new ArrayList<Integer>();
        list2.add(11);
        list2.add(23);
        list2.add(16);
        list2.add(19);
        list2.add(34);
        list2.stream().map(s-> s+ "").filter(s->s.startsWith("1")).forEach(System.out::println);

    }
}
