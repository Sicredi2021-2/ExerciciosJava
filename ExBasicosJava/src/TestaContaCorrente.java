
public class TestaContaCorrente {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(123456);
		
		System.out.println("Test1 - Inicializa nro da Conta");
		System.out.println(c1.getNroConta());
		
		c1.deposito(1000);
		System.out.println("Test2 - Inicializa Saldo");
		System.out.println(c1.getSaldo());
		
		c1.deposito(500);
		System.out.println("Test3 - Incrementa Saldo");
		System.out.println(c1.getSaldo());
		
		c1.retirada(3000);
		System.out.println("Test4 - Retirada inválida");
		System.out.println(c1.getSaldo());

		c1.retirada(800);
		System.out.println("Test4 - Retirada válida");
		System.out.println(c1.getSaldo());
	}

}
