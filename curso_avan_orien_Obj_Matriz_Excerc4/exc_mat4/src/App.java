import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a capacidade da matriz: ");
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];

        for(int i =0; i< n; i++){
            for(int c =0; c <n;c++){
                System.out.print("Digite um número inteiro para matriz: ");             
                mat[i][c] = scanner.nextInt();
            }
        }
        //Diagonal
        System.out.println();
        System.out.println("Diagonal: ");
        for(int i =0 ; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        // Números negativos

        System.out.println();
        System.out.println("Números negativos");

        int quantidadeNegativos =0;
        for(int i =0; i < n; i++){
            for(int k =0; k < n; k++){
                if(mat[i][k] < 0){
                    quantidadeNegativos++;
                }
            }
        }
        System.out.print(quantidadeNegativos);


       scanner.close();
    }
}
