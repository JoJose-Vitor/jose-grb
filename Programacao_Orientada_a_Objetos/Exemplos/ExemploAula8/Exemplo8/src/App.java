import java.io.File;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Digite o 1º  numero: ");
        int numero1 = pedirNumero();
        System.out.println("Digite o 2º  numero: ");
        int numero2 = pedirNumero();
        
        System.out.println("Resultado da soma: " + (numero1 + numero2));
        
        do{
            try {
                Pessoa pessoa = new Pessoa(scanner.nextLine());
                System.out.println(pessoa.getNome());
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }while(true);

        System.out.println("Fim!!");

        try{
            File file = null;
            Scanner scanner = new Scanner(file,"asd");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Deu errado, tente novamente mais tarde!");
        }

        System.out.println("Bye world");
    }

    public static int pedirNumero(){
        do {
            try{
             return Integer.parseInt(scanner.nextLine().trim());
            }catch(Exception e){
                System.out.println("Numero invalido, por favor envie um numero valido:");
            }
        } while (true);
    }
}
