import java.util.Locale;
import java.util.Scanner;


import entityies.Conta;

public class App {
    public static void main(String[] args)  {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

        System.out.println("Banco Caixote");

        System.out.print("Entre com o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.print("Enter com número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Deposito inicial? (Opcional)");
        double depositoInicial = scanner.nextDouble();

        Conta conta = new Conta(nomeCliente,numeroConta,depositoInicial);
        System.out.println(conta);
        System.out.print("Digite o valor do saque!");
        double saque = scanner.nextDouble();
        conta.Sacar(saque);
        System.out.println(conta.Saldo());
        
       
        System.out.println(conta);

        scanner.close();
    }
}
