package entitys;

public class Empregado {
    private Integer id;
    private String nome;
    private Double salario;

    public Empregado(int id,String nome,double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public Double getSalario(){
        return salario;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double salario){
        this.salario += salario;
    }
    public  void porcentualAumento(double porcentual){
        salario += salario * porcentual / 100;
    }
    public String toString(){
        return getId() + ", " + getNome() + ", " + String.format("%.2f",getSalario());
    }
  

}
