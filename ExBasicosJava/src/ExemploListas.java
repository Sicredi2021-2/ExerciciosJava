import java.util.ArrayList;
import java.util.LinkedList;

public class ExemploListas {
	public void demo1() {
		System.out.println("Começo do demo 1 \n");
		ArrayList<String> lStr = new ArrayList<>();
		
		lStr.add("Michael");
		lStr.add("Carol");
		lStr.add("Leonardo");
		for(int i = 0; i < lStr.size(); i++)
			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		
		System.out.println();
		lStr.add(0, "Dine");
		for(int i = 0; i < lStr.size(); i++) {
			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		}
		
		if (lStr.contains("Leonardo"))
			System.out.println("Leonardo presente");
		else
			System.out.println("Leonardo saiu");
		
		if (lStr.contains("Edi"))
			System.out.println("Edi presente");
		else
			System.out.println("Edi saiu");

		lStr.remove(0);
		for(int i = 0; i < lStr.size(); i++)
			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		
		System.out.println();

		lStr.remove("Carol");
		for(int i = 0; i < lStr.size(); i++)
			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		
		System.out.println();

		lStr.remove("Edi");
		for(int i = 0; i < lStr.size(); i++)
			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		
		System.out.println();
		
//		lStr.remove(15);
//		for(int i = 0; i < lStr.size(); i++)
//			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		
		System.out.println();
	}
	
	public void demo2() {
		System.out.println("Começo do demo 2 \n");
		LinkedList<String> lStr = new LinkedList<>();
		
		lStr.add("Michael");
		lStr.add("Carol");
		lStr.add("Leonardo");
		for(int i = 0; i < lStr.size(); i++)
			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		
		System.out.println();
		lStr.add(0, "Dine");
		for(int i = 0; i < lStr.size(); i++) {
			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		}
		
		if (lStr.contains("Leonardo"))
			System.out.println("Leonardo presente");
		else
			System.out.println("Leonardo saiu");
		
		if (lStr.contains("Edi"))
			System.out.println("Edi presente");
		else
			System.out.println("Edi saiu");

		lStr.remove(0);
		for(int i = 0; i < lStr.size(); i++)
			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		
		System.out.println();

		lStr.remove("Carol");
		for(int i = 0; i < lStr.size(); i++)
			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		
		System.out.println();

		lStr.remove("Edi");
		for(int i = 0; i < lStr.size(); i++)
			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		
		System.out.println();
		
//		lStr.remove(15);
//		for(int i = 0; i < lStr.size(); i++)
//			System.out.println("Nome: " + lStr.get(i) + "  " + "Posição:" + i);
		
		System.out.println();
	}

	public void demo3() {
		ContaCorrente c1;
		ArrayList<ContaCorrente> lCtas = new ArrayList<>();
		
		c1 = new ContaCorrente(123456);
		lCtas.add(c1);
		
		c1 = new ContaCorrente(654321);
		lCtas.add(c1);
		
		c1 = new ContaCorrente(246824);
		lCtas.add(c1);
		
		c1 = new ContaCorrente(357935);
		lCtas.add(c1);

		for(int i = 0; i < lCtas.size(); i++)
			System.out.println("Nome: " + lCtas.get(i).getNroConta() + "  " + "Posição:" + i);
		System.out.println();
		
		for(ContaCorrente c:lCtas)
			System.out.println("Nome: " + c.getNroConta() + "  ");
		System.out.println();
	}
	
}


