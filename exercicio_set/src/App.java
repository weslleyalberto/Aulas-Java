import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntrada;

public class App {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Entre com caminho completo");
       String path = scanner.nextLine();
       try(BufferedReader bf = new BufferedReader(new FileReader(path))){
       Set<LogEntrada> set = new HashSet<>();
       
       String linhas = bf.readLine();
       while(linhas != null){
        String[] fields = linhas.split(" ");
        String username = fields[0];
        Date momento = Date.from(Instant.parse(fields[1]));
        set.add(new LogEntrada(username, momento));
        linhas = bf.readLine();
       }
       System.out.println("total usuarios: " + set.size());

       }
       catch(IOException e){
           System.out.println("Error: " + e.getMessage());
       }

       scanner.close();

    }
}
