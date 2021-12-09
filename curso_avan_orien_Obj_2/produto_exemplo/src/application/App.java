package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class App {
    public static void main(String[] args)  {
       Locale.setDefault(Locale.US);
       Scanner scanner = new Scanner(System.in);
        //Produto product = new Produto();
        System.out.println("Entre com os dados:");
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite o preço: ");
        double price = scanner.nextDouble();
        System.out.print("Entre com quantidade de produtos:");
        int quantity = scanner.nextInt();
        Produto product = new Produto(name,price,quantity);
        product.addQuantity(3);
        product.setNome("Notebook Asus ROCK");
        product.setPreco(5999.90);
        System.out.println(product);
       // product.setNome(scanner.nextLine());
        System.out.print("Entre com a quantidade que deseja adicionar");
        product.addQuantity(scanner.nextInt());
        System.out.println(product.getNome());
        scanner.close();
    }
}
