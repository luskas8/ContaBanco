import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta:");
        int account = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agency = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String name = scanner.nextLine();

        System.out.println("Por favor, digite o saldo atual: (e.g. 67.6)");
        Double balance = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n", name, agency, account, balance);
    }
}
