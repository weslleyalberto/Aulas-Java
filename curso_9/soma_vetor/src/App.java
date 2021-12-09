import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n;
        double soma, media;
       
        System.out.print("Quantos numeros você vai digitar? ");
        n = scanner.nextInt();
        double[] vet =new double[n];
        for(int i =0 ; i < n; i++){
            System.out.print("Digite um número: " );
            vet[i]  = scanner.nextDouble();
        }

        System.out.println();
        System.out.print("VALORES= ");
        for(int i =0; i < n; i++){
            System.out.print(String.format("%.1f ", vet[i]));
        }
        System.out.println();
        soma =0;
        for(int i =0; i < n; i ++){
            soma = soma + vet[i];
        }
        System.out.println("SOMA = " +  String.format("%.2f", soma));
        media  = soma / n;
        System.out.println("MEDIA = " + String.format("%.2f", media));
        scanner.close();
    }
}
