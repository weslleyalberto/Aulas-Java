import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dois números?");
        x = scanner.nextInt();
        y = scanner.nextInt();
        
      
            if(x > y){
                System.out.print("Decrescente!");
            }
            else{
                System.out.println("Crescente!");
            }
        
        


        scanner.close();
    }
}
