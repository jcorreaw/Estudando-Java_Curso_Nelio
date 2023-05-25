package RetanguloAP;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo rect = new Retangulo();

        System.out.println("Digite a largura: ");
        rect.largura = sc.nextDouble();
        System.out.println("Digite a altura: ");
        rect.altura = sc.nextDouble();

        System.out.println("area: " + rect.area());
        System.out.println("perimetro: " + rect.perimetro());
        System.out.println("diagonal: " + rect.diagonal());






        sc.close();
    }


}
