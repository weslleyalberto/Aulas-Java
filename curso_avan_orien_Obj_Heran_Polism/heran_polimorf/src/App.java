import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.Contribuinte;
import entities.ContribuintePJ;
import entities.ContribuitePF;

public class App {
    public static void main(String[] args)  {
       Locale.setDefault(Locale.US);
       Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro do contribuinte");
        System.out.print("Numero de contrinuinte à cadastrar: ");
        int n = scanner.nextInt();
        List<Contribuinte> lista = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            scanner.nextLine();
            System.out.print("Cliente PF (f) ou Jurídica (j) ? ");       
            char m = scanner.next().charAt(0);
            int soma = i +1;
            if(m == 'f'){
                System.out.println("Cadastro Pessoa Física:");
                System.out.print("Usuario # " + soma);
                System.out.print("Nome: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                System.out.print("Renda Anual");
                double rendaAnual = scanner.nextDouble(); 
                scanner.nextLine();               
                System.out.print("Teve gasto com saúde? (s/n)");
                char t = scanner.next().charAt(0);
                if(t == 's'){
                   // scanner.nextLine();
                   System.out.print("Gasto com plano de saude");
                    double gastoSaude = scanner.nextDouble();
                    lista.add(new ContribuitePF(nome,rendaAnual,gastoSaude));
                }
                else if(t == 'n'){
                    lista.add(new ContribuitePF(nome,rendaAnual,0.0));
                }
            }
            else if(m == 'j'){
                scanner.nextLine();
                System.out.println("Cadastro Pessoa Jurídica:");
                System.out.println("Empresa # " + soma);
                System.out.print("Razão Social: ");
                String nome = scanner.nextLine();
                System.out.print("Renda Anual");
                double rendaAnual = scanner.nextDouble();
                System.out.print("Quantidade de funcionários ");
                int funcionários = scanner.nextInt();
                lista.add(new ContribuintePJ(nome,rendaAnual,funcionários));
            }
        }


        //Total Imposto Arrecadado
        double soma = 0.0;
        System.out.println("Total de gastos");
        for(Contribuinte c : lista){
            System.out.println(c);
            soma += c.calculoImposto();
        }
        System.out.println(soma);

       scanner.close();
    }
}
