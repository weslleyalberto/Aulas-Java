import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitys.Empregado;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos funcionário deseja cadastrar? ");
        int n = scanner.nextInt();
        List<Empregado> empregados = new ArrayList<>();
        for(int i =0; i < n; i++){
            int soma = i + 1;
            System.out.println("Funcionário #" + soma);
             System.out.print("Digite Id: ");
             int c = scanner.nextInt();
             while(temId(empregados, c)){
                 System.out.println("O id informado já existe, digite outro:");
                 scanner.nextLine();
                 System.out.print("Digite ID");
                 c = scanner.nextInt();
             }
             scanner.nextLine();
             System.out.print("Digite nome: ");
             String nome = scanner.nextLine();
             System.out.println("Salario: ");
             double salario = scanner.nextDouble();
             empregados.add(new Empregado(c,nome,salario));

        }
        // segunda parte

            System.out.println();
            System.out.print("Digite o id do funcionário que deseja aumentar salario: ");
            int id = scanner.nextInt();
            Empregado result = empregados.stream().filter(c-> c.getId() == id).findFirst().orElse(null);
            if(result == null){
                System.out.print("Não há empregados com Id informado. Id informado -> " + id);
            }
            else{
               System.out.print("Digite o percentual de aumento do salário: ");
               double percentual = scanner.nextDouble();
               result.porcentualAumento(percentual);
            }
            //parte 3
            System.out.println("Lista de funcionários");
            for(Empregado e:empregados){
                System.out.println(e);
            }



        scanner.close();
    }
    public static boolean temId(List<Empregado> empregado, int id){
        Empregado result = empregado.stream().filter(c-> c.getId() == id).findFirst().orElse(null);
        return result != null;
    }
  
}
