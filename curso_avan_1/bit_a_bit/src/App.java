import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*int n1 = 89;
       int n2 = 60;
       System.out.println(n1 & n2);
       System.out.println(n1 | n2);
       System.out.println(n1 ^ n2); 
       String original = "agdgd GGFDDFF vvccv GHRCV  ";
       String s1 = original.toLowerCase();
       System.out.println(s1);

       String s2 = original.toUpperCase();

       String s3 = original.trim();
       String s4 = original.substring(2);
       String s5 = original.substring(2,9);
       String s6 = original.replace('a', 'x');
       String s7 = original.replace("ag","xv");
       System.out.println(s6);
       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s4);
       System.out.println(s5);
       System.out.println(s7);*/
       String nome ;
       Scanner scanner = new Scanner(System.in);
       int quantidadeLetras;
       System.out.print("Digite um nome:");
       nome = scanner.nextLine();
       String[] vet = new String[nome.length()];
       for(int i =0; i < nome.length(); i ++){
            vet[i] = nome;
       }
       for(int i = 0; i < nome.length(); i ++){
           System.out.print("O nome digitado foi :" + vet[i]);
           
       }
       System.out.println();
       System.out.print("O nome possui: " + nome.length());
       scanner.close();
    }
}
