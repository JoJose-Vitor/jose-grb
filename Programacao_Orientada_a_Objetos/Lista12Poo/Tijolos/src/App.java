import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Tijolo> tijolos = new ArrayList<>();
        int pretosPares = 0;
        int brancosPares = 0;
        int pretos = 0;
        int brancos = 0;

        for(int i = 0; i < 100; i++){
            
            Thread.sleep(50);

            tijolos.add(new Tijolo());

            tijolos.get(i).setId(i + 1);

            tijolos.get(i).setCor(Tijolo.escolherCor());

            tijolos.get(i).setFuros(Integer.toString(Tijolo.escolherFuros()));

            boolean ehPar = Tijolo.parOuImpar(Integer.parseInt(tijolos.get(i).getFuros()));

            if(tijolos.get(i).getCor() == "preto"){
                pretos ++;
                if(ehPar){
                    pretosPares ++;
                }
            }

            if(tijolos.get(i).getCor() == "branco"){
                brancos ++;
                if(ehPar){
                    brancosPares ++;
                }
            }

            System.out.println("Produzinho tijolo com id = " + tijolos.get(i).getId());
        }

        System.out.println("O numero de tijolos pretos com furos pares é: " + pretosPares);
        System.out.println("O numero de tijolos pretos com furos impares é: " + (pretos - pretosPares));
        System.out.println("O numero de tijolos brancos com furos pares é: " + brancosPares);
        System.out.println("O numero de tijolos brancos com furos impares é: " + (brancos - brancosPares));
        System.out.println("O numero de tijolos pretos é: " + pretos);
        System.out.println("O numero de tijolos brancos é: " + brancos);

        tijolos.get(75).imprimirPropriedades();
    }
}
