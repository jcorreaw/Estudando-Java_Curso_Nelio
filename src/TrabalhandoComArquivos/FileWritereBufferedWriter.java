package TrabalhandoComArquivos;

import java.io.*;

public class FileWritereBufferedWriter {
    public static void main(String[] args) {

        String[] lines = new String[]{"Bom dia", "Boa tarde", "Boa noite"};

        String path = "//home//joao//Projetos Java//saida.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
