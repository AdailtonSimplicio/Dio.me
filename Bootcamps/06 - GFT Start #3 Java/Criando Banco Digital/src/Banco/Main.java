package Banco;

public class Main {
    public static void main(String[] args){
        Cliente adailton = new Cliente();
        adailton.setNome("adailton");

        Iconta cc = new ContaCorrente(adailton);
        Iconta poupanca = new ContaPoupanca(adailton);

            cc.depositar(1000.00);
            cc.transferir(75.00, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
