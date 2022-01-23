package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        //usando construtor sem parametro

        Carro carro1 = new Carro();
        carro1.setCor("Preto");
        carro1.setModelo("Fiat Argo");
        carro1.setCapacidadeTanque(68);

        System.out.println(carro1.getCor());
        System.out.println((carro1.getModelo()));
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.TotalValorTanque());

        System.out.println("--------------------------------------------");

        //usando construtor com parametro
        Carro carro = new Carro("Amarelo", "Honda Civic", 70);
        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.TotalValorTanque());
        System.out.println("--------------------------------------------");
    }
}
