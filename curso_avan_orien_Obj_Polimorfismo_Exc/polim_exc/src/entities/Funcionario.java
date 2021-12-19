package entities;

public class Funcionario {
    private String nome;
    private Integer horas;
    protected Double valorPorHora;
    protected Double pagamento;
    public Funcionario() {
        
    }
    public Double getPagamento() {
        return pagamento;
    }
   
    public Double getValorPorHora() {
        return valorPorHora;
    }
    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    public Integer getHoras() {
        return horas;
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Funcionario(String nome,Integer horas,Double valorPorHora){
        this.setNome(nome);
        this.setHoras(horas);
        this.setValorPorHora(valorPorHora);
        
    }
    public void pagamentoFuncionario(int horasTrabalhadas){
        pagamento+=  valorPorHora * horasTrabalhadas;
    }
    public String toString(){
        return this.getNome() + " - " + "$" + String.format("%.2f",getPagamento());
    }
    
}
