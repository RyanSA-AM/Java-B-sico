    import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       
        String nomeCliente, agencia;
        int numero;
        double saldo;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
            nomeCliente = scan.nextLine(); 
        
        System.out.println("Informe o número da agência: ");
            agencia = scan.nextLine();

        System.out.println("Informe o número da conta: ");
            numero = scan.nextInt();

        System.out.println("Informe seu saldo: ");
            saldo = scan.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está dsponível para saque");
        

        


    }
}
