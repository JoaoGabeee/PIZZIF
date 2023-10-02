import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;

public class TesteArquivo {
    public static void main(String[] args) {
        File arquivo = new File("TesteArquivo.txt");
        LinkedHashMap<String, String> infos = new LinkedHashMap<>();


        try (FileWriter fileWriter = new FileWriter(arquivo, false)) {
            arquivo.createNewFile();

            for (var info : infos.values()) {
                fileWriter.append(info);
            }

            fileWriter.append('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void anexarAoarquivo(LinkedHashMap<String, String> info) {

        for (var i : info.values()) System.out.println(i);
    }
}