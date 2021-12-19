import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class App {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com número de funcionários: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("É terceirizado? (y/n) ");
        String result = scanner.nextLine();
        Funcionario funcionario = new Funcionario();
        if(result.equals("y")){
          System.out.print("Nome:");
          String nome = scanner.nextLine();
          scanner.nextLine();
          System.out.print("Horas");
          int horas = scanner.nextInt();
          scanner.nextLine();
          System.out.print("Valor por hora: ");
          double valorPorHora = scanner.nextDouble();
          funcionario = new FuncionarioTerceirizado(nome,horas,valorPorHora,50.0);
          funcionario.pagamentoFuncionario(horas);
        }
        else if(result.equals("n")){
            System.out.println("N");
        }   
        else{
            System.out.println("Erro: Digite Y ou N");
        }
        System.out.println(funcionario);
        scanner.close();

    }
}
