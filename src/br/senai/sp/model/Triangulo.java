package br.senai.sp.model;

public class Triangulo {
	
	// Propriedades/Atributos da classe
	public double base;
	public double ladoB;
	public double ladoC;
	public double altura;
	public String nome;

	// Métodos da classe
	public void mostrarDimensoes() {
		
		System.out.println("----------------------");
		System.out.println(nome);
		System.out.println("----------------------");
		System.out.println("base: " + base);
	    System.out.println("lado B: " + ladoB);
		System.out.println("lado C: " + ladoC);
		System.out.println("altura: " + altura);
		
	}
		
		public void calcularArea() {
			double area = (base * altura) / 2;
			System.out.println("Área = " + area);
	}
}
