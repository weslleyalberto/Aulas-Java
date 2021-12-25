package entities;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome,Double preco){
        this.setNome(nome);
        this.setPreco(preco);
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public boolean equals(Object object){
        
    }
}
