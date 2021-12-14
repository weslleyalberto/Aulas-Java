import java.util.Scanner;

import entitys.Aluguel;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("quantos quartos deseja alugar? ");
        int n = scanner.nextInt();
        Aluguel[] aluguel = new Aluguel[n];
        for(int i =0; i< n; i++){
            int soma  = i + 1;
            
            System.out.println("Renda #" + soma);
            System.out.print("Número do quarto : ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nome do inquilino: ");
            String nome = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Email do inquilino: ");
            String email = scanner.nextLine();
            aluguel[i] = new Aluguel(numero,nome,email);
        }
        for(int i = 0; i < n; i++){
            System.out.println(aluguel[i]);
        }
        scanner.close();
    }
}
