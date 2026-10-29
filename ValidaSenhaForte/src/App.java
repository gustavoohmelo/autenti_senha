import java.util.Scanner;
import java.util.*;

public class App {

    public static String validarSenha(String senha) {
        if (senha.length() < 8) {
            return "Senha inválida: deve ter pelo menos 8 caracteres.";
        }

        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) {
                temNumero = true;
                break;
            }
        }
        if (!temNumero) {
            return "Senha inválida: deve conter pelo menos um número.";
        }

        String[] senhasObvias = { "batata", "Abcdef1", "abcdefgh", "12345678", "senha123", "admin123", "abcdefg1" };
        for (String obvia : senhasObvias) {
            if (senha.equals(obvia)) {
                return "ALERTA, Está senha é muito comum ou óbvia!";
            }
        }
        return "Sucesso! Sua senha passou pelos critérios de validação.";
    }

    public static void main(String[] senha) {
        Scanner scanner = 
            new Scanner(System.in);
        System.out.print("Digite uma senha: ");
        String senhaInput = scanner.nextLine();

        String resultado = validarSenha(senhaInput);

        System.out.println(resultado);
    }
}
