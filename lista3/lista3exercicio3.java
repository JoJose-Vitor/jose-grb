package lista3;
import java.util.Objects;
import java.util.Scanner;

public class lista3exercicio3 {
    public static void main(String[] args){

        String usuario;
        String senha;
        int i = 1;
        
        Scanner scanner = new Scanner(System.in);

        do{

        System.out.println("Informe seu usuário: ");
        usuario = scanner.nextLine();
        System.out.println("Informe sua senha: ");
        senha = scanner.nextLine();

        boolean ulogin = (Objects.equals(usuario, "admin"));
        boolean usenha = (Objects.equals(senha, "123senha"));
        if (ulogin == true && usenha == true){
            System.out.println("Login realizado com sucesso!");
            break;
        }else{
            
            if (i == 3){
                System.out.println("Sua conta foi bloqueada");
        break;
            }

            System.out.println("Credenciais inválidas... tente novamente:");

            i++;
        }
        }while (i <= 3);
}
}