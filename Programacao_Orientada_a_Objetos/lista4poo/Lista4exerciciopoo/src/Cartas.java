public class Cartas {

    String nomeCarta;
    int alturaMm;
    int larguraMm;
    boolean bemConservada;
    int anoLancamento;

    public void caixaGuarda(){
        System.out.println("A caixa para guardar suas cartas deve ter no mínimo:\r"
                            + (alturaMm + 2) +  " milímetros de altura;\r"
                            + (larguraMm + 2) + " milímetros de largura.");
    }

    public void utilizacao(){
        if(bemConservada){
            System.out.println("A carta é boa para trocas e pode ser usada em campeonatos!");
        }else{
            System.out.println("A carta é ruim para trocas e não pode ser usada em campeonatos!");
        }
    }

    public boolean jogaModerno(boolean nova){
        if(anoLancamento < 2020){
            System.out.println(nomeCarta + " só pode jogar formatos antigos!");
            nova = false;
        }else{
            System.out.println(nomeCarta + " pode jogar formatos modernos e antigos!");
            nova = true;
        }
        return nova;
    }

    public void ImprimirDetalhes(){
        System.out.println(nomeCarta);
        System.out.println(alturaMm);
        System.out.println(larguraMm);
        System.out.println(bemConservada);
        System.out.println(anoLancamento);
    }

}
