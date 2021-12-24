import java.util.Locale;
import java.util.Scanner;

import entities.TaxaJurosBrasilService;

public class App {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo:  ");
        double saldo = scanner.nextDouble();
        System.out.print("Mes/s:  ");
        int mes = scanner.nextInt();
        TaxaJurosBrasilService brtx = new TaxaJurosBrasilService(2.0);
        double pagamento = brtx.pagamento(saldo, mes);

        System.out.println("Pagamento em " + mes + " mês: ");
        System.out.println(String.format("%.2f", pagamento));
        scanner.close();
    }
}
