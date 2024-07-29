public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {}

    @Override
    public void depositar(double valor) {}

    @Override
    public void transferir(double valor, InterfaceConta contaDestino) {}
}
