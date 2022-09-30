import java.util.Scanner;
@java.lang.FunctionalInterface
interface Addition
{
    void add(int x,int y);
}
interface Multiplication
{
    void multi(int x,int y);
}

public class FunctionalInterface {
    public static void main(String args[])
    {

        Addition a=(x,y)-> System.out.println("Addition="+(x+y));
        a.add(10,20);
        Multiplication m=(x,y)-> System.out.println("Multiplication="+x*y);
        m.multi(10,20);

    }
}
