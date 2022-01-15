package com.dio.EntendendoMetodosJava;

import com.dio.EntendendoMetodosJava.criacao.Calculadora;
import com.dio.EntendendoMetodosJava.criacao.Emprestimo;
import com.dio.EntendendoMetodosJava.criacao.Mensagem;
import com.dio.EntendendoMetodosJava.sobrecarga.Quadrilatero;
import com.dio.EntendendoMetodosJava.sobrecarga.Quadrilatero2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntendendoMetodosJavaApplication {

	public static void main(String[] args) {

		SpringApplication.run(EntendendoMetodosJavaApplication.class, args);
		System.out.println("Exercício nº1 CRIAÇÃO");
		System.out.println("");
		//Calculadora
		System.out.println("");
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
		System.out.println("Exercícios do Emprestimo");
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
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("Exercício nº2 SOBRECARGA");
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("Exercícios de Quadrilatero");
		System.out.println("------------------------------------------------------");
		Quadrilatero.area(4);
		Quadrilatero.area(2d,6d);
		Quadrilatero.area(8,9,9);
		Quadrilatero.area(9f,8f);
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");

		System.out.println("------------------------------------------------------");
		System.out.println("Exercício 2º finalizado com sucesso!!!");
		System.out.println("------------------------------------------------------");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("Exercício nº3 SOBRECARGA");
		System.out.println("");
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("Exercícios de Quadrilatero2");
		System.out.println("------------------------------------------------------");
		double areaQuadrado1 = Quadrilatero2.area1(3);
		System.out.println("Área quadrado:" + areaQuadrado1);
		double areaRetangulo1 = Quadrilatero2.area1(3,9);
		System.out.println("Área Retângulo:" + areaRetangulo1);
		double areaTrapezio1 = Quadrilatero2.area1(3,9,8);
		System.out.println("Área Trapézio:" + areaTrapezio1);
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");

		System.out.println("------------------------------------------------------");
		System.out.println("Exercício 3º finalizado com sucesso!!!");
		System.out.println("------------------------------------------------------");


}
}
