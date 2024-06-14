import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Por favor, digite o número da agência: ");
        String entrada = scan.nextLine();
        String numeroAgencia = entrada;
        System.out.printf("Por favor, digite o número da conta: ");
        entrada = scan.nextLine();
        int numeroConta = Integer.parseInt(entrada);
        System.out.printf("Por favor, digite o nome do cliente: ");
        entrada = scan.nextLine();
        String nomeCliente = entrada;
        System.out.printf("Por favor, insira o saldo da conta: ");
        entrada = scan.nextLine();
        double saldoConta = Double.parseDouble(entrada);

        System.out.println("");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
        System.out.println("");
        scan.close();
    }
}
