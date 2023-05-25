package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class TesteProdutos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Produtos[] vect = new Produtos[n];

        for (int i = 0; i < vect.length ; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produtos(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++){
            soma+= vect[i].getPreco();
        }
        double media = soma / vect.length;
        System.out.println(media);



        sc.close();
    }
}
