import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        scanner.useLocale(Locale.US); // Usa ponto como separador decimal

        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scanner.close();

        //TO-DO: 
        //Conhecer e importar a classe Scanner OK
        //Exibir as mensagens para o nosso usuário OK
        //Obter pela scanner os valores digitados no terminal OK
        //Exibir a mensagem conta criada OK

        //Ajustes:
        //Convenção americana para double, usar ponto como separador decimal OK
        
    }
}
