package carta;

import java.util.Random;

public final class CartaExplosao extends Carta{

    @Override
    public void exibirInformacoes(){
        System.out.println(String.format(
        """
        Nome: %s
        Revelada: %s
                
        Ação: Explode o jogador!
        """    
        ,
        getNome(),
        isRevelada()
        ));
    }

    @Override
    public void realizarAcao(){
        System.out.println("O jogador explodiu");
    }
}
