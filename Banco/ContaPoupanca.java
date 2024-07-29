public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {}
    @Override
    public void depositar(double valor) {}
    @Override
    public void transferir(double valor, InterfaceConta contaDestino) {}

}
