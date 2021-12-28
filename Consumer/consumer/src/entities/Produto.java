package entities;

public class Produto {
    private String nome;
    private Double preco;
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public static boolean staticProdutoPredicate(Produto produto){
        return produto.getPreco() > 3000.00;
    }
    public boolean noStaticProdutoPredicate(){
        return preco > 3000.00;
    }
    public static void staticUpdatePreco(Produto produto){
        produto.setPreco(produto.getPreco() * 1.1);
    }
    @Override
    public String toString() {
       
        return "Nome: " + getNome() + "- " + "Preço: " + String.format("%.2f", getPreco());
        
    
    }
}
