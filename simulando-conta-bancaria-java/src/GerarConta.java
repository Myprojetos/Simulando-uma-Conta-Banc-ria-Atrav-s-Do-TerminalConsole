import java.util.Random;

public class GerarConta {
    private String agencia;
    private String numeroConta;

    // Construtor
    public GerarConta() {
        this.agencia = gerarNumeroAgencia();
        this.numeroConta = gerarNumeroConta();
    }

    // Método para gerar número de agência
    private String gerarNumeroAgencia() {
        Random random = new Random();
        int numeroAgencia = random.nextInt(9000) + 1000; // Garante um número de 4 dígitos
        return String.format("%04d", numeroAgencia); // Formata o número para ter sempre 4 dígitos
    }

    // Método para gerar número de conta
    private String gerarNumeroConta() {
        Random random = new Random();
        int numeroConta = random.nextInt(90000000) + 10000000; // Garante um número de 8 dígitos
        return String.format("%08d", numeroConta); // Formata o número para ter sempre 8 dígitos
    }

    // Getters
    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    // Método main para teste
    public static void main(String[] args) {
        GerarConta conta = new GerarConta();
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
    }
}