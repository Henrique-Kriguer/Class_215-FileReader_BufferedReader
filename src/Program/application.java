package Program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class application {

    public static void main(String[] args) {

        String path = "C:\\Development\\Nelio_JAVA\\17-Files\\HenriqueKriguer.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while( line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
            // Codigo Mais limpo que a versão anterior
        }
    }

}
