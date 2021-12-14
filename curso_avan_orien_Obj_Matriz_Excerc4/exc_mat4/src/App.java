import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de matriz: ");
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];

        for(int i =0; i < n; i++){
            for(int j =0; j < n; j++){
                System.out.print("Digite um número: ");
                int v = scanner.nextInt();
                mat[i][j] = v;
            }
        }
        int numerosNagatuivos =0;
        for(int i =0; i < n; i++){
            for(int j =0;j<n;j++){
                if(mat[i][j] < 0){
                   
                    numerosNagatuivos++;
                }
            }
        }

        System.out.print("Números negativos: ->" + numerosNagatuivos);

        System.out.println();
        for(int i =0; i <mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        scanner.close();
    }
}
