import javax.swing.*;
import java.util.*;


public class Main {

    private static String nomeUsuario, senhaUsuario, ruaUsuario, ciadadeUsuario, numeroCasaUsuario;


    public static void main(String[] args) {
        TesteArquivo.criarArquivo();
        String[] array = {"Cadastrar", "Entrar", "Continuar anonimo", "Sair"};

        String resposta = (String) JOptionPane.showInputDialog(
                null,

                "Você deseja?",
                "Bem-vindo a PizzIF",
                JOptionPane.PLAIN_MESSAGE,

                null,
                array,
                array[0]
        );

        switch (resposta) {
            case "Cadastrar" -> cadastroConta();
            case "Entrar" -> entrarConta();
            case "Continuar anonimo" -> continuarAnonimo();
            default -> {
                JOptionPane.showMessageDialog(null, "Saindo...");
                return;
            }

        }
    }

    static void cadastroConta() {

        JOptionPane.showMessageDialog(null, "Iremos ajudar a criar sua conta!");

        nomeUsuario = JOptionPane.showInputDialog("Qual será o nome do usuario?");
        ciadadeUsuario = JOptionPane.showInputDialog("Qual sua cidade?");
        ruaUsuario = JOptionPane.showInputDialog("Qual sua rua?");
        numeroCasaUsuario = JOptionPane.showInputDialog("Qual o numero da sua casa?");

        JPanel painel = new JPanel();
        JLabel textoSenha = new JLabel("Qual a senha: ");
        JPasswordField entradaSenha = new JPasswordField(10);

        painel.add(textoSenha);
        painel.add(entradaSenha);
        int escolha = JOptionPane.showConfirmDialog(null, painel);
        senhaUsuario = String.valueOf(entradaSenha.getPassword());
        switch (escolha){

            case JOptionPane.NO_OPTION -> {
                int simNao = JOptionPane.showConfirmDialog(null, "Deseja sair?");

                if (simNao == JOptionPane.YES_NO_OPTION) return;

            }
        }

        LinkedHashMap<String, String> usuario = new LinkedHashMap<>();
        usuario.put("nome", nomeUsuario);
        usuario.put("cidade", ciadadeUsuario);
        usuario.put("rua", ruaUsuario);
        usuario.put("casa", numeroCasaUsuario);
        usuario.put("senha", senhaUsuario);

        TesteArquivo.anexarAoArquivo(usuario);
    }

    static void cardapioPizzif() {
        ArrayList<String> saboresPizza = new ArrayList<String>();

        saboresPizza.add("");

    }

    public static void entrarConta() {
    }

    public static void continuarAnonimo() {
    }

}

