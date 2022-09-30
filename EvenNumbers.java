import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String args[])
    {
        List<Integer> list4=new ArrayList<Integer>();
        list4.add(12);
        list4.add(23);
        list4.add(18);
        list4.add(56);
        list4.add(88);
        System.out.println("Even Numbers using normal for loop as follows:");
        for(int i=0;i<list4.size();i++)
        {
            if(list4.get(i)%2==0) {
                System.out.println(list4.get(i));
            }
        }
        System.out.println("Even Numbers using stream API:");
        List<Integer> evennos=list4.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println(evennos);

    }
}
