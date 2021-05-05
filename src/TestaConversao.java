
public class TestaConversao {

	
		public static void main(String[] args) {
		
			//variáveis de tipos primitivos do Java
			float pontoFlutuante = 3.14f;
			System.out.println(pontoFlutuante);
			
			double salario = 1270.50;
			int valor = (int) salario;			
			System.out.println("Meu salario é: " + valor);
			
			double valor1 = 0.1;
			double valor2 = 0.2;
			double total = valor1 + valor2;
			System.out.println(total);
		}
}
