package com.company;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    // construtor sem argumentos
    Carro() {

    }
    // construtoor com argumentos
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    // gets e sets gerados
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    // declaração de variavel para calculo de combustível
    double TotalValorTanque(){
        double valorConbustivel = 5.47;
        return capacidadeTanque * valorConbustivel;
    }
}
