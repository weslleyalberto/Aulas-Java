package entities;

public class Aluguel {
    private int numeroQuarto;
    private String nome;
    private String email;
    
    public Aluguel(int numeroQuarto,String nome,String email) {
       this.numeroQuarto = numeroQuarto;
       this.nome = nome;
       this.email = email;
    }
    public String toString(){
        return "#" + this.numeroQuarto + ": " +this.nome  + ", " + this.email;
    }

}
