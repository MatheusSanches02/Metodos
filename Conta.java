package Metodos;

public class Conta {

	private double saldo;
	
	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}
	
	public double getSaldo() 
	{
		return saldo;
	}
		
	public void depositar( double valor) 
	{
		saldo += valor;	
	}
	
	public void verificaSaldo() 
	{
		System.out.println("Saldo: R$" + getSaldo());
	}
	
	
}
