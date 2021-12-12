import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitys.Salario;

public class App {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Salario> list = new ArrayList<>();
        System.out.print("Quantos funcionário você quer cadastrar? ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Funcionário #" + i + ": ");
            System.out.print("Id: ");
            int id =scanner.nextInt();
            while(hasId(list,id)){
                System.out.print("ID de funcionário não existe, tente novamente ");
				id = scanner.nextInt();
            }
            System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Salary: ");
			double salary = scanner.nextDouble();
			list.add(new Salario(id, name, salary));

            System.out.println();
            System.out.print("Informe o Id do funcionário: ");
            int p = scanner.nextInt();
            Salario salario1 = list.stream().filter(c-> c.getId() == p).findFirst().orElse(null);
            if(salario1 == null){
                System.out.print("Este id não existe");
            }
            else{
                System.out.print("Informe a porcentagem");
                double porcentagem = scanner.nextDouble();
                salario1.aumentoSalarioPorcentagem(porcentagem);
            }
            System.out.println();
            System.out.println("List de funcionários: ");
            for(Salario obj: list){
                System.out.println(obj);
            }
        }

        scanner.close();
    }
    public static boolean hasId(List<Salario> list, int id){
    Salario salario = list.stream().filter(c-> c.getId() == id).findFirst().orElse(null);
    return salario != null;
    }
}
