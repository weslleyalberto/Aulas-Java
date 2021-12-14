package entitys;

public class Aluguel {
    private Integer quartoNumero;
    private String nomeEstudante;
    private String emailEstudante;

    public Aluguel(int quartoNumero, String nomeEstudante, String emailEstudante) {
        this.quartoNumero = quartoNumero;
        this.nomeEstudante = nomeEstudante;
        this.emailEstudante = emailEstudante;
    }
    public void setNumeroQuarto(int quartoNumero){
        this.quartoNumero = quartoNumero;
    }
    public Integer getNumeroQuarto(){
        return quartoNumero;
    }
    public void setNomeEstudante(String nome){
        nomeEstudante = nome;
    }
    public String getNomeEstudante(){
        return nomeEstudante;
    }
    public void setEmailEstudante(String emailEstudante){
        this.emailEstudante = emailEstudante;
    }
    public String getEmailEstudante(){
        return emailEstudante;
    }
    public String toString(){
        return getNumeroQuarto() + ": " + getNomeEstudante() + ", " + getEmailEstudante();
    }

}
