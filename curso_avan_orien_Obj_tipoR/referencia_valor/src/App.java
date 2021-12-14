import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class App {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);  
        int n = scanner.nextInt();
        Produto[] vect = new Produto[n];

        for(int i = 0 ; i < n; i++){
            scanner.nextLine();
            System.out.print("Nome do produto");
            String name = scanner.nextLine();
            System.out.print("Digite o preco:");
            //scanner.nextLine();
            double preco = scanner.nextDouble();
            vect[i] = new Produto(name, preco);

        }

        double soma  = 0.0 ;
        for(int i = 0 ; i < 0 ; i++){
            soma += vect[i].getPreco();
        }
        double media = soma / n;
        System.out.print(media);
       // Produto produto = new Produto("Tv Sanguns", 1500.99);
      scanner.close();
    }

}
