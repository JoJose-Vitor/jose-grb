public class Garrafa<T extends Liquido>{
    private T conteudo;

    public Garrafa(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo(){
        return this.conteudo;
    }

    public void exibirInfo(){
        if(conteudo instanceof Suco) {
            Suco suco = (Suco) conteudo;
            System.out.println(suco.getEhNatual());
            System.out.println(suco.getSabor());
            return;
        }

        if(conteudo instanceof Refrigerante) {
            Refrigerante refrigerante = (Refrigerante) conteudo;
            System.out.println(refrigerante.getEstahComGas());
            System.out.println(refrigerante.getSabor());
        }
    }
}
