package Metodos;

public class VerificaAprov {

	
		static String status;
		public void imprimirNota(double nota) 
		{
			if (nota >= 6) 
			{
				status = "Aprovado";
			}
			else 
			{
				status = "Reprovado";
			}
		}
		
		public static void main(String[] args) {
			VerificaAprov va = new VerificaAprov();
			va.imprimirNota(6.7);
			System.out.println(status);
		}
		

	

}
