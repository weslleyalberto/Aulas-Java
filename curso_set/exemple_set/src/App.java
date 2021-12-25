import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args)  {
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Smarphone");
        set.add("Computador de Mesa");
        System.out.println(set.contains("Notebook"));
        for(String s : set){
            System.out.println(s);
        }
    }
        
}
