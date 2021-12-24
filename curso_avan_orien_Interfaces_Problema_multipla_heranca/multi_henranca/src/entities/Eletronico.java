package entities;

public abstract class Eletronico {
    public String serialNumber;

    public Eletronico(String serialMumber){
        this.serialNumber = serialMumber;
    }
    public String getSerial(){
        return serialNumber;
    }
    public void setSerial(String serialNumber){
        this.serialNumber = serialNumber;
    }

    
}
