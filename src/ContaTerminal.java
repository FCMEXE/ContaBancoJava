
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String Agencia;
    int Numero;
    String NomeCliente;
    float Saldo;

        System.out.println("Por Favor,digite o número da Agencia!");
        System.out.println("-->");
        Agencia = teclado.nextLine();
        System.out.println("Por Favor,digite o número!");
        System.out.println("-->");
        Numero = teclado.nextInt();
        System.out.println("Por Favor,digite o nome do cliente!");
        System.out.println("-->");
        NomeCliente = teclado.nextLine();
        System.out.println("Por Favor,digite o Saldo!");
        System.out.println("-->");
        Saldo = teclado.nextFloat();

        System.out.print("Olá " + NomeCliente + ",obrigado por cirar uma conta em noso banco," +
                "sua agencia é" + Agencia + ",conta" + Numero + "e seu Saldo é" + Saldo + "já esta disponivel para saque!!");
    }
}