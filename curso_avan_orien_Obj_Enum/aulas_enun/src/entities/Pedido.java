package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Pedido {
    private Integer id;
    private Date momento;
    private OrderStatus status;
    public Pedido() {
        
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Date getMomento() {
        return momento;
    }
    public void setMomento(Date momento) {
        this.momento = momento;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Pedido(Integer id,Date momento,OrderStatus status){
        this.setId(id);
        this.setMomento(momento);
        this.setStatus(status);
    }
    public String toString(){
        return "Id: " + getId() + "- Data: " + getMomento() + "- Status da Order: " + getStatus();
    }
    
}
