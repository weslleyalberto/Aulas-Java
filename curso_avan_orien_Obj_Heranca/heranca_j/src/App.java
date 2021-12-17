import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

public class App {
    public static void main(String[] args) {
       Conta conta = new Conta(1001,"Weslley",0.0);
       ContaEmpresa contaEmpresa = new ContaEmpresa(1002,"Bia",0.0,500.0);
       //UPCASTING

       Conta conta1 =  contaEmpresa;
       Conta conta2 = new ContaEmpresa(1003,"Bobo",0.0,200.0);
       Conta conta3 = new ContaPoupanca(1004,"Anna",0.0,0.01);
        Conta x = new ContaEmpresa(3,"Alex",1000.0,0.1);
        Conta y = new ContaPoupanca(4,"Bob",1000.0,0.05);
        x.saque(50.0);
        y.saque(50.0);
        System.out.println("tttttttttttttttttttttttttttttttttttttttttttt");
        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());
        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");

       //DOWNCASTING

        ContaEmpresa contaEmpresa2 =(ContaEmpresa) conta2;
        contaEmpresa2.emprestimo(1000);

        //ContaEmpresa contaEmpresa5 = (ContaEmpresa) conta3;
        if(conta3 instanceof ContaEmpresa){
            ContaEmpresa contaEmpresa5 = (ContaEmpresa) conta3;
            contaEmpresa5.emprestimo(200.0);
            System.out.println("Empréstimo ! ");
        }
        if(conta3 instanceof ContaPoupanca){
            ContaPoupanca acc5 = (ContaPoupanca) conta3;
            acc5.atualizacaoSaldo();
            System.out.println("Atualizado! ");
        }
        //Sobreposição
        System.out.println("*********************");
        Conta acc1 = new Conta(1500,"Alex", 1000.0);
        acc1.saque(200.0);
        System.out.println(String.format("%.2f", acc1.getSaldo()));
        System.out.println("---------------------------------");
        Conta acc2 = new ContaPoupanca(1002,"marina",1000.0, 0.01);
        acc2.saque(200.0);
        System.out.println(acc2.getSaldo());

        //Subreposição com Super()
        Conta conta10 = new ContaEmpresa(1003,"Jonas",1000.0,500.0);
        conta10.saque(200.0);
        System.out.println(conta10.getSaldo());


    }
}
