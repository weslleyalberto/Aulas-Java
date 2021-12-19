import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class App {
    public static void main(String[] args) throws ParseException  {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com numero do quarto");
        int n = scanner.nextInt();
        System.out.println("Data Checkin (dd/MM/yyyy)");
        Date checkin = sdf.parse(scanner.next());
        System.out.println("Checkout Date");
        Date checkout = sdf.parse(scanner.next());
        if(!checkout.after(checkin)){
            System.out.println("Erro de reserva: A data de checkout não pode ser anterior ao checkin");
        }
        else{
            Reserva reserva = new Reserva(n,checkin,checkout);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Atualização da reserva: ");
            System.out.println("Data Checkin (dd/MM/yyyy)");
             checkin = sdf.parse(scanner.next());
            System.out.println("Checkout Date");
             checkout = sdf.parse(scanner.next());
              
               String error = reserva.atualizarDatas(checkin, checkout);
               if(error != null){
                System.out.println("Error em reserva: " + error);
               }
               else{  
                   reserva.atualizarDatas(checkin, checkout);
                System.out.println("Reserva Atualizada: " + reserva);

               }
               
                  
               


            

        }
        scanner.close();
    }
}
