import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo: ");
        String srtPath = scanner.nextLine();
        File path = new File(srtPath); 
        System.out.println("Nome: " + path.getName());
        System.out.println("get Parent: " + path.getParent());
        System.out.println("Caminho completo " + path.getPath());
        scanner.close();
    }
}
