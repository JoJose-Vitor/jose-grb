package pagamentos;

public interface FormaPagamento {
    double receberPagamento(String identificadorPagamento, double valor);
    double reembolsar(double Valor);
    String emitirComprovante();


}
