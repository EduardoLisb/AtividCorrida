package br.ufrpe.sistema_corrida.beans;

import java.time.LocalDate;
import java.util.Random;

public class Corrida {

	private String id;
	private String descricao;
	private LocalDate dataHoraInicio;
	private LocalDate dataHoraFim;
	private float distPercorrida;
	private float velocMedia;
	private Percurso percurso;

	public Corrida(String id, String descricao, float distPercorrida, float velocMedia, Percurso percurso) {
		this.id = id;
		this.descricao = descricao;
		this.distPercorrida = distPercorrida;
		this.velocMedia = velocMedia;
		this.percurso = percurso;
	}

	public float pace() {
		float ritm = 0;
		ritm = 60 / velocMedia;
		return ritm;
	}

	public String getID() {
		id = new String();
		Random r = new Random();
		int z = 0;
		for (int i = 0; i < 10; i++) {
			z = r.nextInt(125) + 32;
			id += Character.toString((char) z);
		}
		System.out.println(id);
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(LocalDate dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public LocalDate getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(LocalDate dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public float getDistPercorrida() {
		return distPercorrida;
	}

	public void setDistPercorrida(float distPercorrida) {
		this.distPercorrida = distPercorrida;
	}

	public float getVelocMedia() {
		return velocMedia;
	}

	public void setVelocMedia(float velocMedia) {
		this.velocMedia = velocMedia;
	}

	public Percurso getPercurso() {
		return percurso;
	}

	public void setPercurso(Percurso percurso) {
		this.percurso = percurso;
	}
}