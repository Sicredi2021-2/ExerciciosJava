import java.util.HashMap;

public class ExemploMaps {
	public void demo1() {
		HashMap<String, ContaCorrente> tab =  new HashMap<>();
		
		tab.put("Felipe", new ContaCorrente(123456));
		tab.put("Carol", new ContaCorrente(654321));
		tab.put("Eduardo", new ContaCorrente(246802));
		
		System.out.println("Dados do Felipe: " + tab.get("Felipe").getNroConta());
		System.out.println("Dados da Carol: " + tab.get("Carol").getNroConta());
		System.out.println("Dados do Eduardo: " + tab.get("Eduardo").getNroConta());
		
		System.out.println("Dados do Edi: " + tab.get("Edi"));
		
		
	}
}
