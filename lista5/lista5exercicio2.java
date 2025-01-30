package lista5;

public class lista5exercicio2 {
    public static void main(String[] args){
        int fator1 = 10;
        int fator2 = 1;
        int valor;

        while(fator1 >= 1){
            while(fator2 <= 10){
                valor = fator1 * fator2;
                System.out.println(fator1 + " X " + fator2 + " = " + valor);
                fator2++;
            }
            System.out.println("");
            fator2 = 1;
            fator1--;
        }
    }
}
