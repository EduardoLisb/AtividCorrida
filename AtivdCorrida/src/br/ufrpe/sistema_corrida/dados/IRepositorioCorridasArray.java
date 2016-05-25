package br.ufrpe.sistema_corrida.dados;
import java.util.ArrayList;

import br.ufrpe.sistema_corrida.beans.Corrida;
import br.ufrpe.sistema_corrida.exception.CorridaJaExisteException;


public interface IRepositorioCorridasArray {
		
		public void cadastrar (Corrida c)throws CorridaJaExisteException ;
		
		public ArrayList<Corrida> procurar (String id);
		
		public void remover (String id);
		

	}


