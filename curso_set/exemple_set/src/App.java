import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args)  {
        //Implementação HasSet
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Smarphone");
        set.add("Computador de Mesa");
        System.out.println(set.contains("Notebook"));
        for(String s : set){
            System.out.println(s);
        }
        System.out.println("********************************************");
        //Implementação TreeSet

        Set<String> tree = new TreeSet<>();
        tree.add("Marina");
        tree.add("Joninha");
        tree.add("Marinilza");

        System.out.println(tree.contains("Marina"));
        for(String c : tree){
            System.out.println(c);
        }
    }
        
}
