package Banco;

public class Main {
    public static void main(String[] args){
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

            cc.depositar(1000.00);
            cc.transferir(75.00, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
