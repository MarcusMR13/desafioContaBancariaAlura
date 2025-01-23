import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String name = "Marcus Marques";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;

        System.out.println("*********************************");
        System.out.println(String.format("Nome: %s", name));
        System.out.println(String.format("Tipo conta: %s", tipoConta));
        System.out.println(String.format("Saldo inicial: %.2f", saldoInicial));
        System.out.println("*********************************");

    }
}
