import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * CriarConta
 */
public class CriarUsuario {
    private String nome;
    private String cpf;
    private String sobrenome;
    private double saldo;

    private static HashMap<String, CriarUsuario> contas = new HashMap<>();

    public CriarUsuario(String nome, String cpf, String sobrenome, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sobrenome = sobrenome;
        this.saldo = saldo;
    }

    public static CriarUsuario criarConta() {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        System.out.println("VOCÊ ESCOLHEU CRIAR UMA NOVA CONTA");
        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();
        System.out.println("Digite seu cpf(form:000.000.000-00):");
        String cpf = scanner.next();

        // Expressão regular para validar o CPF
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.matches()) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido. Por favor, digite no formato 123.456.789-10(com ponto e traço)");
        }

        // Loop do-while para garantir que o usuário faça um depósito mínimo de 10 reais
        do {
            System.out.print(
                    "Para Continuar com a criação da conta, voce deve fazer um depósito mínimo de 10 reais. Digite o valor que  gostaria de depositar: ");
            double deposito = scanner.nextDouble();

            if (deposito >= 10) {
                saldo += deposito;
                System.out.println("Depósito de " + deposito + " realizado com sucesso.");
                break; // Sai do loop se o depósito for válido
            } else {
                System.out.println("O valor mínimo para depósito é de 10 reais. Tente novamente.");
            }
        } while (true); // Loop continuará até que o depósito mínimo seja feito

        CriarUsuario novaConta = new CriarUsuario(nome, cpf, sobrenome, saldo);
        contas.put(cpf, novaConta);

        return novaConta;
    }

    // Getters para os atributos
    public static CriarUsuario getConta(String cpf) {
        return contas.get(cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSaldo() {
        return saldo;
    }

}
