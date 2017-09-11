package avaliacao;
	import java.util.Scanner;
public class questao10 {
	public static void main(String[] args) {
		int idade;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe sua Idade: ");
		idade = leitura.nextInt();
		
		leitura.close();
		
		if ((idade >= 5) || (idade <= 7)){
			System.out.println("Infantil A");
		}else {
			System.out.println("Infantil B ");
		if ((idade >= 11) || (idade <= 13)){
			System.out.println("Juvenil A");
		}else {
			System.out.println("Juvenil B");
		if (idade >= 17) { 
			System.out.println("Senior");
		}
			}
				
			}
		}
	}

