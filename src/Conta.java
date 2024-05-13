public class Conta {
    private int numeroConta;
    private String numeroAgencia;
    private String nomeCliente;
    private double saldo;

    Conta(int numeroConta, String numeroAgencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

   @Override
   public String toString() {
       return "Numero da Conta: " + numeroConta 
       + ", Número Agencia: " + numeroAgencia
       + ", Nome do Cliente: " + nomeCliente
       + ", Saldo da Conta: " + saldo;
   }
}
