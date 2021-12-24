import java.util.Locale;
import java.util.Scanner;
import entities.TaxaJurosEUAService;
import entities.TaxaJurosService;

public class App {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo:  ");
        double saldo = scanner.nextDouble();
        System.out.print("Mes/s:  ");
        int mes = scanner.nextInt();
        TaxaJurosService brtx = new TaxaJurosEUAService(1.0);
        double pagamento = brtx.pagamento(saldo, mes);

        System.out.println("Pagamento em " + mes + " mês: ");
        System.out.println(String.format("%.2f", pagamento));
        scanner.close();
    }
}
