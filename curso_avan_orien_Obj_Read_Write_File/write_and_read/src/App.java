import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        File file = new File("c:\\Users\\wesll\\in.txt");
        Scanner scanner = null;
        //System.out.println(file.getName());
        try{
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }    
        finally{
            if(scanner != null){
                scanner.close();
            }
            
        }
    }
}
