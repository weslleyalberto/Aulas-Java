import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;
import model.exceptions.DomainException;

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            System.out.println("Entre com numero do quarto");
            int n = scanner.nextInt();
            System.out.println("Data Checkin (dd/MM/yyyy)");
            Date checkin = sdf.parse(scanner.next());
            System.out.println("Checkout Date");
            Date checkout = sdf.parse(scanner.next());
          
                Reserva reserva = new Reserva(n,checkin,checkout);
                System.out.println("Reserva: " + reserva);
    
                System.out.println();
                System.out.println("Atualização da reserva: ");
                System.out.println("Data Checkin (dd/MM/yyyy)");
                 checkin = sdf.parse(scanner.next());
                System.out.println("Checkout Date");
                 checkout = sdf.parse(scanner.next());
                  
                    reserva.atualizarDatas(checkin, checkout);
                  
                    System.out.println("Reserva Atualizada: " + reserva);
    
                   
        }
        catch(ParseException e){
            System.out.println("Data formato inválido");
        }
        catch(DomainException e){
            System.out.println("Erro na reserva " + e.getMessage());
        }
       
               
                  
               


            

        
        scanner.close();
    }
}
