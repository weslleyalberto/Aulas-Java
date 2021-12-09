import java.util.Locale;
import java.util.Scanner;

import calculator.cal;

public class App {
    public static final double PI = 3.14159;
    public static void main(String[] args)  {
       
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ráio: ");
        double raio = scanner.nextDouble();

        double c = circuference(raio);
        double v  = volume(raio);

        System.out.println("A circuferencia é " + String.format("%.2f",  c ));
        System.out.println("O volume é  " + String.format("%.2f", v));
        System.out.println("O valor do PI " + PI);
        System.out.println(cal.CalcularSoma(3, 4)); 
        scanner.close();

       
    }
    public static double circuference(double radios){
            return 2.0 * PI * radios;
    }
    public static double volume(double radios){
        return 4.0 * PI * radios * radios * radios / 3.0;
    }
}
