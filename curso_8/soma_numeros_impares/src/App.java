import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int x, y, troca, soma;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite dois números : ");
       x = scanner.nextInt();
       y = scanner.nextInt();
        if(x > y ){
            troca =x;
            x= y;
            y = troca;
        }
        soma  =0;
        for(int i = x + 1; i < y; i++){
            if(i % 2 != 0){
                soma = soma + i;
            }
        }
        System.out.println("SOMA DO IMPARES = " + soma);
        scanner.close();
    }
}
