import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.BrasilTaxaService;
import model.services.ServicoRentavel;

public class App {
    public static void main(String[] args)throws ParseException  {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        System.out.println("Entre com a rental data ");
        System.out.print("Modelo do carro:");
        String carro = sc.nextLine();

        System.out.print("Entrada: (dd/mm/yyyy HH:ss");
        Date dateInicio = sdf.parse(sc.nextLine());
        System.out.println("Data Retorno: (dd/MM/yyyy HH:ss");
        Date dateRetorno = sdf.parse(sc.nextLine());

        AluguelCarro aluguelCarro = new AluguelCarro(dateInicio,dateRetorno,new Veiculo(carro));
        System.out.print("Entre com preço por hora");
        double precoHora = sc.nextDouble();
        System.out.println("Entre com preco por dia:");
        double precoDia = sc.nextDouble();
        ServicoRentavel serviceRental = new ServicoRentavel(precoDia, precoHora, new BrasilTaxaService());
        serviceRental.processarCustos(aluguelCarro);
        System.out.println("Invoice:");
        System.out.println("Basic Pagamento: " + String.format("%.2f", aluguelCarro.getFatura().getPagamentoBase()));
        System.out.println("Tax Pagamento: " + String.format("%.2f", aluguelCarro.getFatura().getTaxa()));
        System.out.println("Total Pagamento: " + String.format("%.2f", aluguelCarro.getFatura().getTotalPagamento()));
        sc.close();
    }
}
