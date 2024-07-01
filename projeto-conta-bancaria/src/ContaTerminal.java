import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner terminal_scanner = new Scanner(System.in);
        terminal_scanner.useLocale(Locale.US);

        System.out.println("Olá! Digite o número da conta: ");
        int numero = terminal_scanner.nextInt();
        terminal_scanner.nextLine();

        System.out.println("Informe o número da agência: ");
        String agencia = terminal_scanner.nextLine();

        System.out.println("Informe o nome do cliente: ");
        String nome_cliente = terminal_scanner.nextLine();

        System.out.println("Informe o saldo: ");
        double saldo = terminal_scanner.nextDouble();

        String mensagem = "Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+ ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);

        terminal_scanner.close();
    }
}
