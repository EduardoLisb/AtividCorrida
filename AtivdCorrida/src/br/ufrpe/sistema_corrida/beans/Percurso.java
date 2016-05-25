package br.ufrpe.sistema_corrida.beans;

import java.util.Random;

public class Percurso {

	private String id;
	private String url;

	public Percurso() {
		this.id = id;
		this.url = url;
	}

	public String gerarID() {
		String st = new String();
		Random r = new Random();
		int z = 0;
		for (int i = 0; i < 10; i++) {
			z = r.nextInt(125) + 32;
			st += Character.toString((char) z);
		}
		System.out.println(st);
		return st;
	}
}
