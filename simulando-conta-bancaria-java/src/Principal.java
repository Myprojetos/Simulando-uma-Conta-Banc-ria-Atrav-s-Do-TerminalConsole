import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("1. Criar nova conta");
        System.out.println("2. Acessar conta existente");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System clSystem;
                CriarUsuario conta = CriarUsuario.criarConta();
                System.out.println("Conta criada com sucesso para " + conta.getNome() + " " + conta.getSobrenome());
                System.out.println("CPF: " + conta.getCpf());
                System.out.println("Saldo: " + conta.getSaldo());
                GerarConta gerar = new GerarConta();
                System.out.println("Agência: " + gerar.getAgencia());
                System.out.println("Número da Conta: " + gerar.getNumeroConta());
                System.out.println("|");
                System.out.println("|");
                System.out.println("Obrigado!!");
                break;
            case 2:
                AcessarConta acesso = AcessarConta.acessar();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    // metodo para acessar conta
    public static void acessarConta() {
        System.out.println("Você escolheu acessar uma conta existente.");
        // Aqui você pode adicionar o código para acessar uma conta existente
    }

    public static void gerarBancaria(String[] args) {
        GerarConta gerar = new GerarConta();
        System.out.println("Agência: " + gerar.getAgencia());
        System.out.println("Número da Conta: " + gerar.getNumeroConta());
    }
}