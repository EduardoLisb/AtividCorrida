package br.ufrpe.sistema_corrida.exception;

public class CorridaJaExisteException extends Exception {
	
	private String id;

	public CorridaJaExisteException (String num){
		super("A conta de id " + num + " ja existe.");
		this.id = num;
	}

	public String getId() {
		return id;
	}

}
