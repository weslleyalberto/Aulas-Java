package entitys;


public class Salario {
    private Integer id;
    private String name;
    private Double salario;


public Salario(Integer id,String name,Double salario){
    this.id =  id;
    this.name = name;
    this.salario = salario;
}
public Integer getId(){
    return this.id;
}
public void setId(Integer id){
    this.id = id;
}
public String getNome(){
    return this.name;
}
public void setName(String name){
    this.name = name;
}
public Double getSalario(){
    return this.salario;
}
public void setSalario(Double salario){
    this.salario = salario;
}
public String toString(){
    return this.id + ", " + this.name + ", " + String.format("%.2f", this.salario);
}
public void aumentoSalarioPorcentagem(Double porcentagem){
   salario += salario * porcentagem / 100.0;
}


}
