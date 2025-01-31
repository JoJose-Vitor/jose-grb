package Programacao_Procedural.lista4;
public class lista4exercicio1 {
    public static void main(String[] args){
        int fator1 = 1;
        int fator2 = 1;
        int valor;

        while(fator1 <= 10){
            while(fator2 <= 10){
                valor = fator1 * fator2;
                System.out.println(fator1 + " X " + fator2 + " = " + valor);
                fator2++;
            }
            System.out.println("");
            fator2 = 1;
            fator1++;
        }
    }
}
