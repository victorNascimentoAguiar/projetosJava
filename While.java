package first;

import java.util.Scanner;

public class While {
public static void main(String[]args) {
// while 1#
	//	int contador = 1;
//	while (contador <= 10) {
//		System.out.printf("i = %d\n" , contador);
//		contador++;
//	}
	//while 2#
	Scanner entrada = new Scanner (System.in);
	String valor = "";
	while(!valor.equalsIgnoreCase("sair")) {
		System.out.println("pode falar :");
		valor = entrada.nextLine();
	}
	entrada.close();
}
}
