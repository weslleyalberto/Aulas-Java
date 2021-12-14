import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas");
        int l = scanner.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int c = scanner.nextInt();

        int[][] mat = new int[l][c];

        for(int i =0; i < l; i++){
            for(int g =0; g <c; g++){
                System.out.print("Digite numero inteiro: ");
                mat[i][g] = scanner.nextInt();
            }
        }
        int x = scanner.nextInt();
		
        for(int i =0; i < mat.length; i ++ ){
            for(int j =0 ; j < mat[i].length ; j ++){
                if(mat[i][j] == x){
                    System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
                }
            }
        }

		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
			}
		}

        scanner.close();
    }
}
