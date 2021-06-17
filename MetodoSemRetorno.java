package Metodos;

class Exercicio3
{
	public void verifyNumber() 
	{
		int num1 = 15;
		
		if (num1 % 2 == 0) 
		{
			System.out.printf("O numero %d é par", num1);
		}
		else 
		{
			System.out.printf("O numero %d é impar", num1);
		}
	}

}

public class MetodoSemRetorno {
	public static void main(String[] args) 
	{
		Exercicio3 metodo2 = new Exercicio3();
		metodo2.verifyNumber();
	}

}
