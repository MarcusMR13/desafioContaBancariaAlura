import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String name = "Marcus Marques";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        double valorAcrescimo = 0;
        double valorDecrescimo = 0;

        int i = 0;

        System.out.println("*********************************");
        System.out.println("DADOS INICIAIS DO CLIENTE: \n");
        System.out.println(String.format("Nome: %s", name));
        System.out.println(String.format("Tipo conta: %s", tipoConta));
        System.out.println(String.format("Saldo inicial: R$ %.2f", saldoInicial));
        System.out.println("*********************************");

        while (i != 4) {

            System.out.println("\nOPERAÇÕES: \n");
            System.out.println("1 - Consultar Saldos");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair \n");

            System.out.println("Escolha a opção desejada:");
            i = input.nextInt();

            if (i == 1) {
                System.out.println(String.format("\nSeu saldo atual é de R$ %.2f\n", saldoInicial));
            } else if (i == 2) {
                System.out.println("\nInforme o valor que deseja colocar em sua conta: ");
                valorAcrescimo = input.nextDouble();

                saldoInicial += valorAcrescimo;

                System.out.println(String.format("\nSeu saldo agora é: R$ %.2f\n", saldoInicial));
            } else if (i == 3) {

                System.out.println("\nInforme o valor que deseja Tirar sua conta: ");
                valorDecrescimo = input.nextDouble();

                if ( saldoInicial > valorDecrescimo){
                    
                    saldoInicial -= valorDecrescimo;

                }else {
                    System.out.println("\nNão há saldo o suficiente para essa transação! ");
                }

                System.out.println(String.format("\nSeu saldo agora é: R$ %.2f\n", saldoInicial));

            } else if (i == 4) {
                break;
            } else {
                System.out.println("\nOpção Inválida");
            }
        }

        System.out.println(String.format("\nSeu saldo ficou em R$ %.2f\n", saldoInicial));
        System.out.println("Obrigado por utilizar nossos sistemas\n");
    }
}
