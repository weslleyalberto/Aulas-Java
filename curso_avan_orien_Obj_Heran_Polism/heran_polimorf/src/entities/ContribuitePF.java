package entities;

public class ContribuitePF extends Contribuinte {
    
    private Double gastoSaude;

    public ContribuitePF() {
        super();
    }
    public Double getGastoSaude() {
        return gastoSaude;
    }
   
    public ContribuitePF(String nome, Double rendaAnual,Double gastoSaude) {
        super(nome,rendaAnual);
        this.gastoSaude = gastoSaude;
    }
  

    @Override
    public Double calculoImposto() {
        if(getRendaAnual() < 2000.00){
            if(getGastoSaude() > 0.0){
                return (getRendaAnual() * 15.0  / 100.0) - (getGastoSaude() * 50.0 /100.0) ;
            }
            else{
                return getRendaAnual() * 15.0 / 100.0;
            }
           
        }
        else{
            if(getGastoSaude() > 0.0){
                return (getRendaAnual() * 25.0 /100.0) - (getGastoSaude() * 50.0 /100);
            }
            return getRendaAnual() * 25.0 / 100.0;
        }
        
    }
    public String toString(){
        return "Nome Contribuinte: " + getNome() + " , " + "Renda anual: " + String.format("%.2f", getRendaAnual()) + ", "
        + "Gasto com saúde: " + String.format("%.2f", getGastoSaude()) + " Total a pagar de imposto: " + "R$:" +String.format("%.2f", calculoImposto());
    }
    
}
