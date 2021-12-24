package entities;

public class Employee implements Comparable<Employee> {
    private String nome;
    private Double salario;

    public Employee(String nome,Double salario) {
        this.setNome(nome);
        this.setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Employee outro) {
       
        return -salario.compareTo(outro.getSalario());
    }
    
}
