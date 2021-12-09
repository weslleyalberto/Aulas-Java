import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int x, y,z,menor ;
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        x  = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        y = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        z = scanner.nextInt();

        if(x < y && x < z){
            menor = x;
            System.out.print(menor);
        }
        else if(y < x && y <z){
            menor = y;
            System.out.print(menor);
        }
        else if(z < x && z < y){
          menor = z;
          System.out.print(menor);
        }
     


        scanner.close();

    }
}
