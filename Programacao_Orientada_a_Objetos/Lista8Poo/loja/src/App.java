public class App {
    public static void main(String[] args){

        try {
            Produto produto = new Produto("Limão", 2.5);
            
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        try {
            Produto produto2 = new Produto("", 7.0);
            
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        try {
            Produto produto3 = new Produto("Melancia", 0.0);
            
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
