import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        //Sets.usaTudo();
        Map<String, Pessoa> map = new HashMap<>();

        Pessoa pessoa = new Pessoa("123654", "Joao");
        map.put(pessoa.getCpf(), pessoa);

        System.out.println(map.size());

        System.out.println(map.get("123654"));
    }
}