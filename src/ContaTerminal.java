import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leituraScanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta?");
        int numeroConta =  Integer.parseInt(leituraScanner.nextLine());

        System.out.println("Por favor, digite o número da Agência?");
        String numeroAgencia = leituraScanner.nextLine();    

        System.out.println("Por favor, digite o seu Nome?");
        String nomeCliente = leituraScanner.nextLine();

        System.out.println("Por favor, digite o seu Saldo?");
        double saldo = Double.parseDouble(leituraScanner.nextLine());

        Conta conta = new Conta(numeroConta, numeroAgencia, nomeCliente.toUpperCase(), saldo);
        System.out.println(conta.toString());
    }
}
