public class App {
    public static void main(String[] args) throws Exception {

        Carro novoCarro = new Carro("Ford Fiesta", 5, "Azul", true);
        Bicicleta novBicicleta= new Bicicleta("Caloi Vulcan", "Vermelha", 16, true);
    
        novoCarro.acelerar();
        novoCarro.frear();
        novBicicleta.acelerar();
        novBicicleta.frear();
    }
}
