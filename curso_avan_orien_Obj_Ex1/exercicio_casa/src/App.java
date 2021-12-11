import java.util.Scanner;

import entities.Aluguel;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos quartos vc quer alugar? ");
        int n = scanner.nextInt();
        Aluguel[] aluguels = new Aluguel[n];
        for(int i =0; i < n; i++){
            scanner.nextLine();
            System.out.print("Nome do cliente: ");
            String cliente = scanner.nextLine();
            System.out.print("Número do quarto: ");
            int v = scanner.nextInt();
            scanner.nextLine();
            System.out.print("E-mail do cliente: ");
            
            String emails = scanner.nextLine();
            aluguels[i] = new Aluguel(v, cliente, emails);
        }
        for(int w =0; w < n; w ++){
            System.out.println(aluguels[w]);
        }
        scanner.close();
    }
}
