package entitys;

import java.util.List;

public class Aluno {
    private Integer id;
    private String nome;
    private Integer idade;


    public Aluno(Integer id, String nome,Integer idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    public Integer getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    public String toString(){
        return "Id:" + getId() + "- Nome: " + getNome() + "- Idade: " + getIdade();
    }
    public static Boolean temId(List<Aluno> lista, int id){
        Aluno aluno  = lista.stream().filter(c-> c.getId() == id).findFirst().orElse(null);
        return aluno != null;
    }

}
