import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;


public class TesteArquivo {

    static String testeArquivo = "TesteArquivo.csv";
    private static final File ARQUIVO = new File(testeArquivo);

    public static void criarArquivo() {
        try (FileWriter escreverCabecalhos = new FileWriter(testeArquivo, false)) {
            ARQUIVO.createNewFile();
            String[] cabecalhos = {"nome", "cidade", "rua", "casa", "senha"};


            escreverCabecalhos.write(String.join(";", cabecalhos));
            escreverCabecalhos.write("\n");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro");
            e.printStackTrace();
        }
    }

    public static void anexarAoArquivo(LinkedHashMap<String, String> info) {

        try (FileWriter escreverParaArquivo = new FileWriter(testeArquivo, true)) {

            for (String valor : info.values()) {
                escreverParaArquivo.write(valor + ";");
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERRO");
            e.printStackTrace();
        }

    }
}
