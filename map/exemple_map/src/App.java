import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Produto;

public class App {
    public static void main(String[] args)  {
        Map<String,String> cookies = new TreeMap<>();
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "999888888");

        cookies.remove("email");
        cookies.put("phone", "1111111");
        System.out.println("Contem phone key: " + cookies.containsKey("phone"));
        System.out.println("phone number: " + cookies.get("phone"));
        System.out.println("emails: " + cookies.get("emails"));
        System.out.println("Todos os cookies: ");
        System.out.println("Tamanho: " + cookies.size());
        for(String p : cookies.keySet()){
            System.out.println(p);
        }
        Map<Produto,Double> produt = new HashMap<>();
        Produto p1 = new Produto("TV", 900.0);
        Produto p2 = new Produto("Notebook", 2999.99);
        Produto p3 = new Produto("Cama",500.99);
        Produto p4 = new Produto("Mouse", 29.90);
        
        produt.put(p1, 1000.0);
        produt.put(p2, 5000.00);
        produt.put(p3, 6000.0);
        produt.put(p4, 7000.0);

        Produto ps = new Produto("CCE",2599.90);
        System.out.println("Contem 'ps' key: " + cookies.containsKey(ps) );
    }
}
