import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sets {

    public static void usaTudo(){

        Set<Integer> set = new LinkedHashSet<>();
        Set<Pessoa> pessoas = new LinkedHashSet<>();

        for (int i = 1; i <= 15; i += 2) {
            set.add(i);
        }

        for (int j = 16; j >= 0; j -= 2) {
            set.add(j);
        }

        List<Integer> numerosList = new ArrayList<>();
        for (int k = 5; k <=10 ; k++) {
            numerosList.add(k);
        }

        set.add(-300);

        for (Integer numero : set) {
            System.out.println(numero);
        }

        set.removeAll(numerosList);

        for (Integer numero1 : set) {
            System.out.println(numero1);
        }

        for (int l = 1; l <= 15; l += 2) {
            set.add(l);
        }

        set.retainAll(numerosList);

        for (Integer numero2 : set) {
            System.out.println(numero2);
        }

        for (int m = 0; m < 16; m++) {
            pessoas.add(new Pessoa("123987", "Champson"));
        }

        System.out.println(pessoas.size());
        System.out.println(pessoas.isEmpty());
        System.out.println(pessoas.contains(new Pessoa("123987","Leo")));
        System.out.println(pessoas.contains(new Pessoa("1239845","Champson")));

        pessoas.remove(new Pessoa("123987", "Joao"));

        System.out.println(pessoas.size());
        System.out.println(pessoas.isEmpty());

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}

