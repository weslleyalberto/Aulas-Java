import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        Scanner scanner = new Scanner(System.in);
       int n;
      
       System.out.print("Quantos números você quer digitar?");
       n = scanner.nextInt();
       double[] vet = new double[n];
      for(int i =0; i < n; i++){
          System.out.print("Digite um número");
          vet[i] = scanner.nextDouble();

      }
      System.out.println("");
    
      for(int i =0; i < n; i++){
          System.out.println("Você digitou: " + String.format("%.1f", vet[i]));
      }
    }
}
