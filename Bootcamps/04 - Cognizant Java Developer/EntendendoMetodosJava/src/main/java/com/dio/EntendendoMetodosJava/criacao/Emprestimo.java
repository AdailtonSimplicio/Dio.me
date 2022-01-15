package com.dio.EntendendoMetodosJava.criacao;

public class Emprestimo {
    public static double duasParcelas(){
        return 0.02;
    }
    public static double tresParcelas(){
        return 0.03;
    }
    public static double quatroParcelas(){
        return 0.04;
    }
    public static double cincoParcelas(){
        return 0.05;
    }
    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * duasParcelas());

            System.out.println("O valor total do emprestimo para duas parcelas é: " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * tresParcelas());

            System.out.println("O valor total do emprestimo para tres parcelas é: " + valorFinal);
        } else if (parcelas == 4) {
            double valorFinal = valor + (valor * quatroParcelas());

            System.out.println("O valor total do emprestimo para quatro parcelas é: " + valorFinal);
        } else if (parcelas == 5) {
            double valorFinal = valor + (valor * cincoParcelas());

            System.out.println("O valor total do emprestimo para cinco parcelas é: " + valorFinal);
        }else {
            System.out.println("Quantidades de parcelas não permitida!");
        }
    }
}