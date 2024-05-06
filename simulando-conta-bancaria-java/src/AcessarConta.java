import java.util.Scanner;

public class AcessarConta {
    
    public static AcessarConta acessar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o CPF da conta que deseja acessar:");
        String cpf = scanner.nextLine();

        CriarUsuario conta = CriarUsuario.getConta(cpf);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
        } else {
            System.out.println("Conta encontrada. Detalhes da conta:");
            System.out.println("Nome: " + conta.getNome());
            System.out.println("Sobrenome: " + conta.getSobrenome());
            System.out.println("CPF: " + conta.getCpf());
            System.out.println("Saldo: " + conta.getSaldo());
        }

        AcessarConta  acesso = new AcessarConta();
        
        return acesso;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       AcessarConta acesso = AcessarConta.acessar();
    }
}

