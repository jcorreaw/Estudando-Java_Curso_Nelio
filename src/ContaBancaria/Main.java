package ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cliente cliente;

        System.out.print("Digite o numero da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite o nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Tem deposito inicial(y/n)? ");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y'){
            System.out.println("Qual o valor inicial? ");
            double entradaInicial = sc.nextDouble();
            cliente = new Cliente(numero, titular, entradaInicial);
        } else {
            cliente = new Cliente(numero, titular);
        }

        System.out.println("Cliente criado: " + cliente);

        System.out.print("Digite um valor para depositar: ");
        double valorDoDeposito = sc.nextDouble();
        cliente.deposito(valorDoDeposito);
        System.out.println("Conta apos deposito: " + cliente);

        System.out.print("Digite um valor para sacar: ");
        double valorParaSacar = sc.nextDouble();
        cliente.saque(valorParaSacar);
        System.out.println("Conta apos o saque: " + cliente);







    }

}
