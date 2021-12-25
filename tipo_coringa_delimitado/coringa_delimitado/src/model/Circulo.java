package model;

public class Circulo implements Shape {

    private Double raio;
    

    public Circulo( double raio) {
       this.raio =raio;
      
    }

    public Double getRaio() {
        return raio;
    }
  
    @Override
    public double area() {
        
        return Math.pow(getRaio(), 2) * Math.PI;
    }
    
}
