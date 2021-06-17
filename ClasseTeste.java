package Metodos;

public class ClasseTeste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setSaldo(0);
		conta.verificaSaldo();
		conta.depositar(100);
		conta.verificaSaldo();
		conta.depositar(500);
		System.out.println("Saldo: R$" + conta.getSaldo());
		

	}

}
