import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        //Inicializando o Scanner.
        Scanner leitura = new Scanner(System.in);

        //Dando boas vindas ao usuário e solicitando as informações.
        System.out.println("""
                    ********** Banco **********
                    Seja bem-vindo ao nosso sistema!
                    Para começar, precisaremos de alguns dados.
                
                    Primeiro, digite o seu nome:
                """);

        //Solicitando informações e guardando em variáveis.
        String nomeUsuario = leitura.nextLine();

        System.out.println("Digite o número de sua agência:");
        String agenciaUsuario = leitura.nextLine();

        System.out.println("Digite o número de sua conta:");
        int contaUsuario = leitura.nextInt();

        System.out.println("Digite o seu saldo:");
        double saldoUsuario = leitura.nextDouble();

        System.out.println("Olá " + nomeUsuario + " obrigado por criar uma conta em nosso banco, " +
                "sua agência é, " + agenciaUsuario + ", conta " + contaUsuario + " e seu saldo " + saldoUsuario +
                "R$ já está disponível para saque.");
    }

}
