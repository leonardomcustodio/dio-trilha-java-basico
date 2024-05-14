import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia, nomeDoCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.print("Digite o nome do cliente: ");
        nomeDoCliente = sc.nextLine();

        System.out.print("Digite o saldo do cliente: ");
        saldo = sc.nextDouble();
        System.out.println();

        System.out.println("Olá " + nomeDoCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo "
                + saldo + " já está disponível para saque.");


    }
}