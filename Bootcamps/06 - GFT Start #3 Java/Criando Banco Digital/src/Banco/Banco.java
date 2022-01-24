package Banco;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Banco.Conta> getContas() {
        return contas;
    }

    public void setContas(List<Banco.Conta> contas) {
        this.contas = contas;
    }
}
