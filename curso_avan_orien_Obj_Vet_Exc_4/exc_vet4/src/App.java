import java.util.Locale;
import java.util.Scanner;

import entitys.Produto;

public class App {
    public static void main(String[] args) throws Exception {
       Locale.setDefault(Locale.US);
       Scanner scanner = new Scanner(System.in);
       System.out.print("Quantos produto deseja cadastrar? ");
       int n = scanner.nextInt();
       Produto[] vetProduto = new Produto[n];
       for(int i =0; i < n; i ++){
          
           System.out.print("Nome do produto: ");
           String nome = scanner.nextLine();
           scanner.nextLine();
           System.out.print("Digite o preço do produto: ");
           double preco = scanner.nextDouble();
          
           vetProduto[i] =  new Produto(nome,preco); 
       } 
       //Media de preços
       double precos = 0.0;
       for(int i =0; i < n; i++){
        precos += vetProduto[i].getPreco();
       }
       double media = precos / n;
       System.out.println("A média de preços é: " +String.format("%.2f", media));

       scanner.close();
    }
}
