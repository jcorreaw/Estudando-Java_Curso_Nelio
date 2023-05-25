package ContaBancaria;

public class Cliente {
    private int numeroDaConta ;
    private String nomeDoCliente;
    private double saldo;


    public Cliente(int numeroDaConta, String nomeDoCliente){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCliente = nomeDoCliente;
    }
    public Cliente(int numeroDaConta, String nomeDoCliente, double depositoInicial){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCliente = nomeDoCliente;
        deposito(depositoInicial);

    }

    public Cliente() {

    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }


    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        saldo -= valor + 5.0;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroDaConta=" + numeroDaConta +
                ", nomeDoCliente='" + nomeDoCliente + '\'' +
                ", depositoInicial=" + saldo +
                '}';
    }
}
