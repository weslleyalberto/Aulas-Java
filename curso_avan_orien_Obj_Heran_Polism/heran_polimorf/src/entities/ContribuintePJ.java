package entities;

public class ContribuintePJ extends Contribuinte {

    private int numeroFuncionarios;
    public ContribuintePJ() {
        super();
    }
    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }
  
    public ContribuintePJ(String nome,Double rendaAnual,int numeroFuncionarios) {
        super(nome,rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }
    @Override
    public Double calculoImposto() {
        if(getNumeroFuncionarios() >= 0 && getNumeroFuncionarios() < 10){
            return getRendaAnual() * 16.0 / 100.0;
        }
        else
            return getRendaAnual() * 14.0 / 100.0;
        
        
    }
    public String toString(){
        return "Nome da Empresa: " + getNome() + " , " + "Renda anual: " + String.format("%.2f", getRendaAnual()) + ", "
        + "Número de funcionários " + getNumeroFuncionarios() + " Total a pagar de imposto: " + "R$:" +String.format("%.2f", calculoImposto());
    }
    
}
