package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        System.out.print("Entre com as medidas do triangulo X");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.print("Entre com as medidas do triangulo Y");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();
       
        double areaX = x.area();

     
        double areaY = y.area();
        System.out.println("A area do triangulo X é: " + String.format("%.4f", areaX));
        System.out.println("A area do triangulo Y é: " + String.format("%.4f", areaY));

        System.out.println();
        if(areaX > areaY){
            System.out.println("A maior área é a X");
        }
        else{
            System.out.println("A maior área é Y");
        }

        scanner.close();

    }
}
