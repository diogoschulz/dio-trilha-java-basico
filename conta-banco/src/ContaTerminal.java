import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da Conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco" +
                ", sua agência é " + agencia + ", conta " + conta + " e seu saldo "
        + saldo + " já está disponível para saque");

    }
}