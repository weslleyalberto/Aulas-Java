package application;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
      double xA, xB ,xC , yA, yB,yC;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the mesuares of triagule X: ");
      xA = scanner.nextDouble();
      xB = scanner.nextDouble();
      xC = scanner.nextDouble();

      System.out.print("Enter the mesuares of triangule Y: ");
      yA = scanner.nextDouble();
      yB = scanner.nextDouble();
      yC = scanner.nextDouble();
    
      double p = (xA + xB + xC) / 2.0;
      double areaX =  Math.sqrt(p * ( p- xA) * (p - xB ) * (p - xC));
     

      double v = (yA + yB + yC) / 2.0;
      double areaY = Math.sqrt(v * (v-yA) *  (v - yB) * (v - yC));

        System.out.println("Triangule X area: " + String.format("%.4f", areaX));
        System.out.println("Triangule Y area: " + String.format("%.4f", areaY));

        if(areaX > areaY){
            System.out.println("A maior área é X");
        }
        else{
            System.out.println("A maior area é Y");
        }
        scanner.close();
    }
}
