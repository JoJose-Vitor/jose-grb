public final class StandUp extends Evento{
    private String comediante;

    public StandUp(String nome, String local, String data, String comediante){
        super(nome, local, data);
        this.comediante = comediante;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Estrelando: " + this.comediante);
    }

    @Override
    public void comecarEvento() {
        System.out.println("Começa agora a apresentação de Stand Up!");
    }

    public void comecarEvento(String piada){
        System.out.println(
        """
        Um homem passou em frente ao cinema e ele estava em reforma. Qual o nome do filme?


        Nenhum, o cinema está em reforma.        
        """);
    }

}
