public class BancoTerminal {
    public static void main(String[] args) {
        double saldo = 15.0;
        double valorSolicitado = 22.0;

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println("Saldo atual: " + saldo);
    }
}
