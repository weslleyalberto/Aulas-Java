import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args)  {
        String[] linhas = new String[]{"Bom dia","Boa tarde","Boa noite"};
        String path = "c:\\Users\\wesll\\out.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for(String line: linhas){
                bw.write(line);
                bw.newLine();
            }
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
