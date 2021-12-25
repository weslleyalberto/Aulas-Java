package entities;

import java.util.Locale;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return getNome().equals(produto.getNome()) && getPreco().equals(produto.getPreco());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPreco());
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", " + "Preco: " + String.format("%.2f",getPreco());
    }

    @Override
    public int compareTo(Produto o) {
        return nome.toUpperCase(Locale.ROOT).compareTo(o.getNome().toUpperCase(Locale.ROOT));
    }
}
