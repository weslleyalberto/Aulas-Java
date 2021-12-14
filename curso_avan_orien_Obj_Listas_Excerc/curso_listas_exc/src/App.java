import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitys.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        System.out.print("Entre com número de alunos que deseja cadastrar: ");
        int n = scanner.nextInt();
        for(int i =0 ; i < n; i++){
            System.out.print("Digite o id do aluno: ");
            int c = scanner.nextInt();
           while(Aluno.temId(alunos, c)){
               System.out.println("Já existe Id com aluno cadastrado: ");
              return;

           }
           scanner.nextLine();
           System.out.print("Nome: ");
           String nome = scanner.nextLine();
           scanner.nextLine();
           System.out.print("Entre com idade: ");
           int idade = scanner.nextInt();
           alunos.add(new Aluno(c,nome,idade));

        }
        System.out.println();
        System.out.println("Lista de alunos cadastrados");

        for(Aluno a : alunos){
            System.out.println(a);
        }
        scanner.close();
    }
}
