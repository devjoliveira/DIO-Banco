package conta;
public abstract class Conta implements IConta {

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;

    private int agencia;
    private int numero;
    protected double saldo;
    private String titular;

    public Conta(String titular) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void consultar() {
        System.out.println("Saldo: " + getSaldo());
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valor;
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }
}
