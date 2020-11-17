import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main implements Thread {
    private static int e=0;
    public static void main(String[] args) throws InterruptedException {
        IA ia=new A();
        Main a=new Main();


        String temp=ia.print("milad");
        System.out.println(temp);
        ArrayList<Integer> integers=new ArrayList<>();
        LinkedList<Integer> integerList=new LinkedList<>();
        integers.add(7);
        integerList.addFirst(7);
        HashSet<Integer> integerHashSet=new HashSet<>();
        integerHashSet.add(8);
        integerHashSet.contains(8);
    }

}
