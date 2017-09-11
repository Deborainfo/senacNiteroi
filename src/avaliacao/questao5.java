package avaliacao;
	import java.util.Scanner;
public class questao5 {
	public static void main(String[]args) {
		
		double lado1;
		double lado2;
		double lado3;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Informe a Primeira Medida: ");
		lado1= leitura.nextDouble();
		System.out.println("Informe a Segunda Medida: ");
		lado2 = leitura.nextDouble();
		System.out.println("Informe a Terceira Medida: ");
		lado3 = leitura.nextDouble();
		
		leitura.close();
		
		if ((lado1 == lado2 ) && (lado2 == lado3)) {
			System.out.println("Formou - se um Triangulo Equilátero ");
			}else {
				System.out.println("Formou -se um Triângulo Escaleno ");
		if (lado1 == lado2) {
			System.out.println("Formou - se um Triângulo Isósceles ");
		}
			
		}
	}
}
