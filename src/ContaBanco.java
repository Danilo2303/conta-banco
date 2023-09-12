import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o número da sua Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite o nome do cliente: ");
        String nomecliente = scanner.nextLine();

        System.out.println("Por favor digite o Saldo da conta: ");
        int saldo = scanner.nextInt(); 

        scanner.close();

    
        System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
