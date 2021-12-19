package entities;

public class FuncionarioTerceirizado extends Funcionario {
     
    private Double dispesaAdicional;

    public FuncionarioTerceirizado() {
        super();
    }
    public FuncionarioTerceirizado(String nome,Integer horas,Double valorPorHora,
     Double dispesaAdicional) {
        super(nome,horas,valorPorHora);
        this.dispesaAdicional = dispesaAdicional;
    }
    public Double getAdicionalSalario(){
        return getPagamento() * getAdicionalSalario();
    }
    public void setAdicionalSalario(Double dispesaAdicional){
        this.dispesaAdicional+= dispesaAdicional;
    }
    @Override
    public final void pagamentoFuncionario(int horasTrabalhadas){
        pagamento+= pagamento +  valorPorHora * horasTrabalhadas;
        //pagamento+= pagamento * 110.0 / 100.0;
    }
    public String toString(){
        return this.getNome() + " - " + "$" + String.format("%.2f",getPagamento());
    }

}
