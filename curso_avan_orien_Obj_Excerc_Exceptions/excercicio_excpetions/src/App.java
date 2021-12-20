import java.util.Locale;
import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.DomainException;

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

       
        try{
        System.out.print("Digite  numero da conta Bancária");
         int numero = scanner.nextInt();   
         scanner.nextLine();
         System.out.print("Titular:");
         String titular = scanner.nextLine();
         System.out.print("Saldo");
         double saldo = scanner.nextDouble();
        // scanner.nextDouble();
         System.out.print("Limite de saque");      
         double limiteSaque = scanner.nextDouble();
         
        Conta conta = new Conta(numero,titular,saldo,limiteSaque);
        System.out.println(conta);
        System.out.print("Valor para depositar?");
        double deposito = scanner.nextDouble();
        conta.deposito(deposito);
        scanner.nextLine();
        System.out.print("Valor do saque");
        double saque = scanner.nextDouble();
        conta.saque(saque);
        System.out.println(conta);
        }
        
        catch(DomainException e){
            System.out.println("Erro: " + e.getMessage());
        }
        scanner.close();
       
    }
}
