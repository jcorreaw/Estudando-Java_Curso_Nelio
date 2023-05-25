package Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Dados dados = new Dados();

        System.out.println("Digite o nome: ");
        dados.nome = sc.nextLine();
        System.out.println("Digite o Salario Bruto: ");
        dados.salarioBruto = sc.nextDouble();
        System.out.println("Digite a taxa: ");
        dados.taxa = sc.nextDouble();

        System.out.println(dados);

        System.out.println("Digite a porcentagem: ");
        double porcentagem = sc.nextDouble();
        dados.salarioAposPorcentagem(porcentagem);

        System.out.println("Dados atualizados: "+ dados);





    }
}
