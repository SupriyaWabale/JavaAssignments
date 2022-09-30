import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DescdingSort {
    public static void main(String args[])
    {
        List<Integer> list3=new ArrayList<Integer>();
        list3.add(11);
        list3.add(1);
        list3.add(56);
        list3.add(18);
        List<Integer> sortedlist=list3.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedlist);

    }
}
