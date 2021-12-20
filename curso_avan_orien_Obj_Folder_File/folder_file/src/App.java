import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma pasta");
        String srtPath = scanner.nextLine();

        File path = new File(srtPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for(File folder : folders){
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile);
        System.out.println("Arquivos: ");
        for(File file : files){
            System.out.println(file);
        }
        boolean sucesso = new File(srtPath + "\\subdir").mkdir();
        System.out.println("Diretório criado com sucesso " + sucesso);
        scanner.close();
    }
}
