
import java.util.ArrayList;

public class Baralho {

    int quantidadeCartas;
    boolean legalModerno;
    String nomeDono;
    String nomeJogo;
    ArrayList<Cartas> cartas = new ArrayList<Cartas>();

    public void jogar(){
        if(quantidadeCartas >= 60){
        System.out.println(nomeDono + " entra na partida de " + nomeJogo + " com seu baralho!");
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println(cartas.get(i).nomeCarta + " é posta em jogo!");
            }
        }else{
            System.out.println(nomeDono + " nao pode jogar com esse baralho, quantidade de cartas insuficientes!");
        }
    }

    public void legalModerno(){
        for (int j = 0; j < cartas.size(); j++) {
            if(cartas.get(j).jogaModerno(legalModerno)){
                legalModerno = true;
            }else{
                legalModerno = false;
                break;
            }
        }
        if(legalModerno){
            System.out.println("O baralho pode ser usado em formato moderno!");
        }else{
            System.out.println("O baralho nao pode ser usado em formato moderno!");
        }
    }

    public void ImprimirDetalhes(){
        System.out.println(quantidadeCartas);
        System.out.println(legalModerno);
        System.out.println(nomeDono);
        System.out.println(nomeJogo);
        System.out.println(cartas);
    }

}

