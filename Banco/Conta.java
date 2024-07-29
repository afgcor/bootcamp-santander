public abstract class Conta implements InterfaceConta {
    private int numeroAgencia;
    private int numeroConta;
    private double saldo;

    private static final int AGENCIA_SEQUENCIAL = 0001;
    private static int CONTA_SEQUENCIAL = 0001;

    public Conta(Cliente cliente) {
        this.numeroAgencia = Conta.AGENCIA_SEQUENCIAL;
        this.numeroConta = CONTA_SEQUENCIAL++;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, InterfaceConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
