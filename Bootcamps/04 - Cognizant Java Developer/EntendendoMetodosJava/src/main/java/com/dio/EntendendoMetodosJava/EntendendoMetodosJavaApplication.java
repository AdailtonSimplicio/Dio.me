package com.dio.EntendendoMetodosJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntendendoMetodosJavaApplication {

	public static void main(String[] args) {

		SpringApplication.run(EntendendoMetodosJavaApplication.class, args);
		//Calculadora
		System.out.println("------------------------------------------------------");
		System.out.println("Exercícios da calculadora");
		System.out.println("------------------------------------------------------");
		Calculadora.soma(5,6);
		Calculadora.subtracao(5,6);
		Calculadora.divisao(5,6);
		Calculadora.multiplicacao(5,6);
		System.out.println("");
		//Mensagem
		System.out.println("------------------------------------------------------");
		System.out.println("Exercícios da Mensagem");
		System.out.println("------------------------------------------------------");
		Mensagem.obterMensagem(2);
		Mensagem.obterMensagem(5);
		Mensagem.obterMensagem(13);
		Mensagem.obterMensagem(20);
		System.out.println("");
		//Emprestimo
		System.out.println("------------------------------------------------------");
		System.out.println("Exercícios da Mensagem");
		System.out.println("------------------------------------------------------");
		Emprestimo.calcular(10000, 2);
		Emprestimo.calcular(10000, 3);
		Emprestimo.calcular(10000, 4);
		Emprestimo.calcular(10000, 5);
		Emprestimo.calcular(10000, 6);
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");

		System.out.println("------------------------------------------------------");
		System.out.println("Exercício 1º finalizado com sucesso!!!");
		System.out.println("------------------------------------------------------");


}
}
