import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double idade, idade2, media;
        String nome1,nome2;
        System.out.print("Nome da primeira pessoa:");
        nome1 = scanner.nextLine();
        System.out.print("Insira a idade da primeira pessoa:");
        idade = scanner.nextDouble();

        System.out.print("Nome da segunda pessoa: ");
        scanner.nextLine();
        nome2 = scanner.nextLine();
       
        System.out.print("Insira a idade da segunda pessoa");
        idade2 = scanner.nextDouble();
        media = (idade + idade2) / 2.0;
        if(idade > idade2){
            System.out.print("A media da idade de " + nome1 + " e " + nome2 + " eh de " + String.format("%.1f",media ) + " anos.");
        }
        else{
            System.out.print("A media da idade de " + nome1 + " e " + nome2 + " eh de " + String.format("%.1f",media ) + " anos.");
        }



        scanner.close();
    }
}
