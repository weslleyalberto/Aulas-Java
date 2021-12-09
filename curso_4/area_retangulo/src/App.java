import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double base, altura, area,perimetro,diagonal;

        System.out.print("Base do relângulo: ");
        base = scanner.nextDouble();
        System.out.print("Altura do retangulo:");
        altura = scanner.nextDouble();
        area = base * altura;
        perimetro = 2 * base + 2 * altura;
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
        System.out.println("Area: " + String.format("%.4f", area));
        System.out.println("Perimetro: " +  String.format("%.4f", perimetro));
        System.out.println("Diagonal: " + String.format("%.4f", diagonal));
        scanner.close();
    }
}
