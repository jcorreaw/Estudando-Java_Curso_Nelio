package Ex1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Entre com as informações do produto: ");
        System.out.print("Nome: ");
        product.name = sc.nextLine();

        System.out.print("Preço: ");
        product.price = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        product.quantity = sc.nextInt();

        System.out.println(product);

        System.out.println("Entre com o numero de produtos a ser adicionado: ");
        product.addProducts(sc.nextInt());
        System.out.println(product);

        System.out.println("Entre com o numero de produtos a ser removido: ");
        product.removeProducts(sc.nextInt());
        System.out.println(product);


        sc.close();




    }
}
