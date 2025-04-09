import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia,nomeCliente;
        double saldo;

        System.out.println("Digite o numero da sua conta:");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o numero da sua agencia:");
        agencia=scanner.nextLine();

        System.out.println("digite seu nome:");
        nomeCliente=scanner.nextLine();

        System.out.println("Digite o saldo:");
        String saldoTexto = scanner.nextLine();
        saldo = Double.parseDouble(saldoTexto.replace(",", "."));

        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco\nsua agência é:"
        +agencia+" conta:"+numero+"\nseu saldo:"+ saldo+"R$ já está disponível para saque");

        scanner.close();
    }
}
