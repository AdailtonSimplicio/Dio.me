package br.com.dio.desafio.dominio;

import java.time.LocalDate;

import static java.time.LocalDate.*;

public class Main {

    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO");
        curso1.setDescricao("Para iniciantes");
        curso1.setCargaHoraria(11);

        Curso curso2 = new Curso();
        curso2.setTitulo("HTML 5");
        curso2.setDescricao("esqueleto da pagina");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Iniciando Um Bootcamp");
        mentoria1.setDescricao("Conceitos de um bootcamp");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
}
