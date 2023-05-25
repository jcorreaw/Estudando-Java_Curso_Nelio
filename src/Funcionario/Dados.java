package Funcionario;

public class Dados {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }

    public void salarioAposPorcentagem(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }
    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }

}
