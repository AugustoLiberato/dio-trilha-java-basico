import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Olá, Bem vindo!");

        //Obter pela classe scanner os valores digitados no terminal
        System.out.println("Informe o número da sua agência: ");
        int numero = scanner.nextInt();

        System.out.println("Informe a sua  agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe seu saldo");
        Float saldo = scanner.nextFloat();

        //Exibir a mensagem da conta criada
        /*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], 
        conta [Numero] e seu saldo [Saldo] já está disponível para saque". */



        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );
    }
}
