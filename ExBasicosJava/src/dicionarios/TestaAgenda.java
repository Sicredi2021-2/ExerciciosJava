package dicionarios;

import java.util.*;

public class TestaAgenda {
	public static void main(String[]argc) {
		Agenda ag = new Agenda();
		try {
			ag.inserir("João", "11111111");
			ag.inserir("Pedro", "22222222");
			ag.inserir("Carlos", "33333333");
			ag.inserir("Ana", "44444444");
			ag.inserir("Maria", "55555555");
			ag.inserir("Paula", "66666666");
			ag.inserir("João", "999999999");
			ag.inserir("Maria Nro 2", "55555555");
		}
		catch (Exception ex) {
			System.out.println(ex.getClass());
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		 
		ag.removerNome("João");
		System.out.println("");

		
		String fone = ag.buscarNumero("Maria");
		System.out.println("\n" + fone);
		
	}
}
