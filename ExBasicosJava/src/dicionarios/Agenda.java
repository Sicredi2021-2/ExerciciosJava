package dicionarios;

import java.util.*;

public class Agenda {
	private HashMap<String, String> agenda = new HashMap<>();
//	private LinkedHashMap<String, String> agenda = new LinkedHashMap<>();
	

	public void inserir(String nome, String fone)  {
		if (nome == null || fone == null || nome.equals("") || fone.equals(""))
			throw new IllegalArgumentException();
		else if (agenda.containsKey(nome))
				throw new IllegalArgumentException();
		else agenda.put(nome, fone);
		}
	
	public String buscarNumero(String nome){
		return agenda.get(nome);
	}
	
	public String removerNome(String nome) {
		return agenda.remove(nome);
	}	
}

