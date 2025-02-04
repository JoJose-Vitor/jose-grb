public class CampeonatoTCG {
    int quantidadeJogadores;
    String nomedoJogo;
    boolean formatoModerno;
    double valorInscricao;

    public void IniciaCampeonato(){
        System.out.println("O campeonato de " + nomedoJogo + " com " + quantidadeJogadores + "está aberto!");
    }

    public void Informaformato(){
        if(formatoModerno){
            System.out.println("Somente sao validas no campeonato cartas lancadas apos 2020!");
        }else{
            System.out.println("Todas as cartas sao Validas no campeonato!");
        }
    }

    public void arrecadacao(){
        System.out.println("O campeonato arrecadou R$" + (quantidadeJogadores * valorInscricao));
    }

    public void ImprimirDetalhes(){
        System.out.println(quantidadeJogadores);
        System.out.println(nomedoJogo);
        System.out.println(formatoModerno);
        System.out.println(valorInscricao);
    }
}