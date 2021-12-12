import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
       Scanner scanner = new Scanner(System.in);
       
    System.out.println("Digite o numero de colunas e linhas da matriz:");
    int n = scanner.nextInt();
    int[][] mat = new int[n][n];

    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            mat[i][j] = scanner.nextInt();
        }
    }
    System.out.println("Diagonal principal");
    for(int i=0; i <n; i++){
        System.out.print(mat[i][i]+ " ");
    }
    System.out.println();
    int contador = 0;
    for(int i =0; i <n ;i ++){
        for(int j = 0; j < n; j++){
            if(mat[i][j] < 0){
                contador ++;
            }
        }
    }
    System.out.println("Numero negativos: " + contador);
       scanner.close();
    }
}
