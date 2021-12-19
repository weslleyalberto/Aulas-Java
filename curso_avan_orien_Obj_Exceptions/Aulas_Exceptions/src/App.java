import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
      methodo1();
    }
    public static void methodo1(){
        System.out.println("Methodo1 Start");
        methodo2();
        System.out.println("Methodo1 Final");
    }
    public static void methodo2(){
        System.out.println("Methodo 2 Start");
        Scanner scanner = new Scanner(System.in);

        try{
         String[] vect = scanner.nextLine().split(" ");
         int position = scanner.nextInt();
         System.out.println(vect[position]);
  
         
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalida posição!");
            e.printStackTrace();
           // scanner.next();
        }
        catch(InputMismatchException e){
            System.out.println("Você deve digitar apenas números");
        }
        
        scanner.close();
        System.out.println("Methodo 2 Final");
    }
}
