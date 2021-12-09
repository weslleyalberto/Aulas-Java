package entities;

public class Produto {
    private String name;
    private double price;
    private int quantity;
    
    public Produto(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getNome(){
        return this.name;
    }
    public void setNome(String name){
        this.name = name;
    }
    public double getPreco(){
        return this.price;
    }
    public void setPreco(double price){
        this.price = price;
    }
    public int getQuantidade(){
        return quantity;
    }
    
    public double totalValueInStock(){
        return price * quantity;
    }
    public void addQuantity(int quantity){
        this.quantity += quantity;
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return "Nome do Produto: " + this.name + " - Preço: " + String.format("%.2f",this.price) + " - " + "Quantidade:" + this.quantity;
    }

}
