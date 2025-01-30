package lista2;
import java.util.Objects;
import java.util.Scanner;

public class lista2exercicio1 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu usuário: ");
        String usuario = scanner.nextLine();
        System.out.println("Informe sua senha: ");
        String senha = scanner.nextLine();

        Boolean ulogin = (Objects.equals(usuario, "admin"));
        boolean usenha = (Objects.equals(senha, "123senha"));
        if (ulogin == true && usenha == true){
            System.out.println("Login realizado com sucesso!");
        }else{
            System.out.println("Credenciais inválidas...");
        }

    }
}
