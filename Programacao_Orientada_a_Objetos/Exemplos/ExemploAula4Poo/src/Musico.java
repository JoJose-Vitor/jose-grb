public class Musico {
    String nome;
    int idade;
    boolean ehInstrumentista;
    String instrumento;
    boolean ehCantor;

    public void ImprimirDetalhes(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(ehInstrumentista);
        System.out.println(instrumento);
        System.out.println(ehCantor);
    }

    public void cantar(){
        if (ehCantor){
            System.out.println("LALAIA LALAIA LALAIA");
        }else
            System.out.println("ANUICGISOVWGYVUERBVKNJKSNSBSDK");
    }

    public void tocar(){
        if (ehInstrumentista){
            System.out.println("TIRANDO UM SOM!!");
        }else
            System.out.println("1723612638712638712736");
    }
}
