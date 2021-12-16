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

    }
}
