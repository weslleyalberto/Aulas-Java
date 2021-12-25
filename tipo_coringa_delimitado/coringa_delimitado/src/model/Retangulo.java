package model;

public class Retangulo implements Shape{
    private Double width;
    private Double height;

public Retangulo(Double width,Double height){
    this.width = width;
    this.height = height;
}

    public Double getWidth() {
        return width;
    }
    public Double getHeight() {
        return height;
    }
    @Override   
    public double area() {
        
        return (getHeight() * getWidth()) / 2.0;
    }
  

    
}
