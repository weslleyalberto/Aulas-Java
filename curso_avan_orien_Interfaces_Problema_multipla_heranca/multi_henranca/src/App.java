import entities.Scanner;
import entities.ScannerContract;

public class App {
    public static void main(String[] args) {
        Scanner s = new ScannerContract("1515");
        s.scanear("Meu documento");
        //System.out.println(s);
    }
}
