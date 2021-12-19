package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer numeroQuarto;
    private Date checkin;
    private Date checkout;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Reserva() {
        
    }
    public Reserva(Integer numeroQuarto,Date checkin,Date checkout){
        this.numeroQuarto = numeroQuarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }
    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }
    public Date getCheckin(){
        return checkin;
    }
    public Date getCheckout(){
        return checkout;
    }
    public String atualizarDatas(Date checkin,Date checkout){
        Date now = new Date();
        if(checkin.before(now) || checkout.before(now)){
            return "Erro: Para atualizar checkin ou checkout com data futuras";
        }
        if(!checkout.after(checkin)){
           return "Erro de reserva: A data de checkout não pode ser anterior ao checkin";
        }
        this.checkin = checkin;
        this.checkout = checkout;
        return null;
    }
    public long duracao(){
        long result = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(result, TimeUnit.MILLISECONDS);
       
    }
    @Override
    public String toString(){
        return "Número do quarto: " + getNumeroQuarto()
        + "Checkin Data: (dd/MM/yyyy): " + sdf.format(getCheckin())
        + " " + "Checkout Data: " + sdf.format(getCheckout()) + "Quantidade de dias: " + duracao() + " noites";
        
    }
    
}
