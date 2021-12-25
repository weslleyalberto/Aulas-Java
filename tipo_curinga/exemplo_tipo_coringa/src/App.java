import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args)  {
        List<Integer> myInts = Arrays.asList(5,2,10);
        printList(myInts);
        List<String> myString = Arrays.asList("Marina","João","Pedro");
        printList(myString);
    }
    public static void printList(List<?> lista){
        for(Object obj : lista){
            System.out.println(obj);
        }
    }
}
