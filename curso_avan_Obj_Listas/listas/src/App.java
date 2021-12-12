import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args)  {
        List<String> lists = new ArrayList<>();
        lists.add("MArina");
    lists.add("Alex");
    lists.add("Ana");
    lists.add(2, "Weslley");
    lists.remove("Weslley");
    lists.add("Carcará");
    lists.remove(0);
        System.out.println(lists.size());
    for(String t : lists){
        System.out.println(t);
    }
    System.out.println("-------------------------");
    lists.removeIf(w -> w.charAt(0) == 'C')  ;
    for(String n : lists){
        System.out.println(n);
    }
    List<String> resultado = lists.stream().filter(c-> c.charAt(0) == 'A').collect(Collectors.toList());
    for(String  v : resultado){
        System.out.println(v);
    }
    System.out.println("--------------------------------");
    String name = lists.stream().filter(c-> c.charAt(0) == 'J').findFirst().orElse("Não existe");
    System.out.println(name);
    }
}
