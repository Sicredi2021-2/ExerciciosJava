
public class TestaCadastroDeConta {

	public static void main(String[] args) {
		CadastroDeContas cad = new CadastroDeContas();
		
		System.out.println("Test1 - Inseri conta válida");
		ContaCorrente c1 = new ContaCorrente(123456);
		c1.deposito(1000);
		cad.novaContaCorrente(c1);
		
		ContaCorrente c2 = cad.getConta(123456);
		System.out.println(c2.getNroConta());
		
		
		System.out.println("Test2 - recupera conta inválida");
		System.out.println(cad.getConta(555555));
		

	}

}
