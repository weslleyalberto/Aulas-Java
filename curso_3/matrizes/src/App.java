import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int m ,n ;
       System.out.print("Quantas linhas terá a matriz?");
       m = scanner.nextInt();
       System.out.print("Quantas colunas terá matriz?");
       n = scanner.nextInt();

       int[][] mat = new int[m][n];
       for(int i =0; i < m; i++){
           for(int j =0; j < n; j++){
               System.out.print("Elemento [" + i + "," + j + "]: ");
               mat[i][j] = scanner.nextInt();
           }
       }
       System.out.println();
       System.out.println("Matriz dgitada: ");
       for(int i =0; i < m; i++){
           for(int j =0; j < n; j++){
               System.out.print(mat[i][j] + " ");
           }
           System.out.println();
       }



       scanner.close();

    }
}
