package br.ufrpe.sistema_corrida.dados;

import java.util.ArrayList;

import br.ufrpe.sistema_corrida.beans.Corrida;
import br.ufrpe.sistema_corrida.exception.CorridaJaExisteException;

public class RepositorioCorridasArray implements IRepositorioCorridasArray {

	private static RepositorioCorridasArray instanceRace;
	private ArrayList<Corrida> corridas;
	private int next;

	public RepositorioCorridasArray(int tamanho) {

		this.corridas = new ArrayList<Corrida>(tamanho);
		this.next = 0;
	}

	public static synchronized RepositorioCorridasArray getInstance() {
		if (instanceRace == null) {
			instanceRace = new RepositorioCorridasArray(100);
		}
		return instanceRace;
	}

	public void cadastrar (Corrida c) throws CorridaJaExisteException {
		c = this.corridas.get(this.next);
		if (c != null && c.getID().equals(this.corridas.get(this.next).getID())) {
			this.next = next + 1;
			if (this.next == this.corridas.size()) {

			}
			System.out.println("Corrida Cadastrada!");
		} else {
			throw new CorridaJaExisteException(c.getID());
		}

	}

	private ArrayList<Integer> procurarIndice(String id) {
		int aux = 0;
		ArrayList<Integer> indice = new ArrayList<Integer>(aux);

		for (int i = 0; i < corridas.size(); i++) {
			if (id.equals(this.corridas.get(i).getID())) {
				indice.add(aux, corridas.indexOf(corridas.get(i)));
				aux++;
			}
		}
		return indice;
	}

	public ArrayList<Corrida> procurar(String id) {
		ArrayList<Integer> indices = this.procurarIndice(id);
		ArrayList<Corrida> saida = new ArrayList<Corrida>();
		for (int i = 0; i < indices.size(); i++) {
			if (i != this.next) {
				saida.add(this.corridas.get(indices.get(i)));
			} else {
				System.out.println("Corrida não encontrada!");
			}
		}
		return saida;
	}
	
	public void remover(String id) {
		ArrayList<Corrida> races = this.procurar(id);
		for (int i = 0; i < races.size(); i++) {
			if (races.get(i).getID() == id) {
				this.corridas.remove(this.corridas.indexOf(races.get(i)));
				System.out.println("Corrida foi removida!");
			} else {
				System.out.println("Houve um problema! Corrida não pode ser removida.");
			}
		}
	}

	
}
