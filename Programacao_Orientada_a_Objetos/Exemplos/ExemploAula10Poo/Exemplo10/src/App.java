import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        Garrafa<Suco> garrafa = new Garrafa<>(new Suco());
        Garrafa<Refrigerante> garrafa2 = new Garrafa<>(new Refrigerante());

        System.out.println(garrafa.getConteudo().getSabor());
        System.out.println(garrafa2.getConteudo().getSabor());

        List<Bombom> bombons = new ArrayList<>();

        List<Object> lista = new ArrayList<>();

        lista.add("Oi");
        lista.add(1);
        lista.add(1.75);
        lista.add(false);
        lista.add(new Bombom("Sonho de valsa"));


        System.out.println(bombons.isEmpty());

        bombons.add(new Bombom("Lollo"));
        bombons.add(new Bombom("Lollo"));
        bombons.add(new Bombom("Lollo"));
        bombons.add(new Bombom("Lollo"));
        bombons.add(new Bombom("Lollo"));
        bombons.add(new Bombom("Sonho de valsa"));
        bombons.add(new Bombom("Diamante Negro"));
        bombons.add(new Bombom("Batom"));

        System.out.println(bombons.contains(new Bombom("Lollo")));
        System.out.println(bombons.indexOf(new Bombom("Lollo")));

        if(bombons.indexOf(new Bombom("Lollo")) == -1){
            System.out.println("Não achou");
        }else{
            System.out.println("Achou!");
        }
        

        System.out.println(new Bombom("Sonho de null"));

        for (Bombom bombom : bombons) {
            System.out.println(bombom.getNome());
        }

        for (Bombom bombom : bombons) {
            System.out.println(bombom);
        }

        System.out.println(bombons.size());

        bombons.remove(1);

        System.out.println(bombons.size());

        System.out.println(bombons.get(2).getNome());

        System.out.println(bombons.isEmpty());

        bombons.set(2, new Bombom("Serenata de amor"));

        for (Bombom bombom : bombons) {
            System.out.println(bombom.getNome());
        }

        LinkedList<Bombom> outraLista = new LinkedList<>();
        outraLista.addAll(bombons);

        for (Bombom bombom : outraLista) {
            System.out.println(bombom);
        }

        Vector<Bombom> vector = new Vector<>();
        vector.addAll(bombons);
        vector.addAll(outraLista);

        for (Bombom bombom : vector) {
            System.out.println(bombom);
        }

        List<Bombom> bolachas = new ArrayList<>(List.of(
            new Bombom("Choco Trio"),
            new Bombom("Oreo"),
            new Bombom("Calipso"),
            new Bombom("Bis")
        ));

        System.out.println(bolachas);

        bombons.clear();
        System.out.println(bombons.size());

    }
}
