import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Locale.setDefault(Locale.US);
       Scanner scanner = new Scanner(System.in);
        int n,cont;
        System.out.print("Qual a ordem da matriz?");
        n = scanner.nextInt();
        int[][] mat = new int[n][n];

        for(int i =0; i < n; i++){
            for(int j =0 ; j < n ; j++){
                System.out.print("Elemento [" + i + "," + j + "]:");
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("DIagonal principal:");
        for(int i =0; i < n; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        cont = 0;
        for(int i =0;i < n ; i ++){
            for(int j =0; j < n; j ++){
                if(mat[i][j] < 0){
                    cont = cont + 1;
                }
            }
        }

        System.out.println("Quantidade de negativos = " + cont);
       scanner.close();
    }
}
