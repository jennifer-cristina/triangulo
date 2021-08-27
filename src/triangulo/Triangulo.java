package triangulo;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.print("Insira o primeiro lado: ");
		lado1 = leitor.nextInt();
		
		System.out.print("Insira o segundo lado: ");
		lado2 = leitor.nextInt();
		
		System.out.print("Insira o terceiro lado: ");
		lado3 = leitor.nextInt();
		
		leitor.close();
		
		if ( lado2 - lado3 < lado1  && lado1 < lado2 + lado3) {
			if ( lado1 - lado3 < lado2 && lado2 < lado1 + lado3) {
				if( lado1 - lado2 < lado3 && lado3 < lado1 + lado2) {
					System.out.println("É um triângulo");
					if ( lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
						System.out.println("É um triângulo Equilátero ");
					}else if ( lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
						System.out.println("É um triângulo Isósceles ");
					}else if ( lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
						System.out.println("É um triângulo Escaleno ");
					}
				}
			}
		}
	}
}
	