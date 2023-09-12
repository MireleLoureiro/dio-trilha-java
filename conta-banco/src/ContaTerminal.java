import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Digite o número da sua Agência: ");
        String agencia = sc.next();
        System.out.print("Por favor, digite o número da sua conta: ");
        int numero = sc.nextInt();
        System.out.print("Agora digite o seu saldo: R$ ");
        double saldo = sc.nextDouble();

        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
