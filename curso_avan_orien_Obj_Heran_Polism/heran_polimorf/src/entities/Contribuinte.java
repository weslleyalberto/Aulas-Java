package entities;

public abstract class Contribuinte {
    private String nome;
    private Double rendaAnual;

    protected Contribuinte() {
        
    }
    public Double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    protected Contribuinte(String nome,Double rendaAnual){
        this.setNome(nome);
        this.setRendaAnual(rendaAnual);
    }
    public abstract Double calculoImposto();
    
}
