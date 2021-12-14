import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas você deseja adicionar? ");
        int n = scanner.nextInt();
        double[] vet = new double[n];
        double media = 0.0;
        for(int i =0; i < n; i++){
            System.out.println();
            System.out.print("Digite a altura da pessoa nº ");
            vet[i] = scanner.nextDouble();

        }
        //Média
        
        for(int i =0; i < n; i++){
            media += vet[i];
        }
        double mediaReal = media /n;
        System.out.println(String.format("%.2f", mediaReal));



        scanner.close();

    }
}
