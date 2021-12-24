import java.util.Scanner;

import services.PrintService;



public class App {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();
        System.out.print("Quantos valores ? ");
        int n = sc.nextInt();
        for(int i =0 ; i < n ; i ++){
            Integer value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("Primeiro: "+ ps.firs());

       sc.close();
    }
}
