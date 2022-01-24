package Banco;

public class ContaPoupanca extends Conta{
    public ContaPoupanca() {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("----------- Extrato Conta Poupança -----------");
        super.imprimirInforsComuns();

    }
}
