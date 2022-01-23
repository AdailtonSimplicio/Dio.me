package com.dio.EntendendoMetodosJava.criacao;

public class Mensagem {
    public static void obterMensagem(int hora){

        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            mensagemBomdia();
            break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            mensagemBoatarde();
            break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            mensagemBoanoite();
            break;
            case 00:
            case 1:
            case 2:
            case 3:
            case 4:
            mensagemBoamadrugada();
            break;

        }
    }
    public static void mensagemBomdia(){
        System.out.println("Bom dia!");
    }
    public static void mensagemBoatarde(){
        System.out.println("Boa Tarde!");
    }
    public static void mensagemBoanoite(){
        System.out.println("Boa Noite!");
    }
    public static void mensagemBoamadrugada(){
        System.out.println("Boa Madrugada!");
    }
}
