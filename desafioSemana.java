package first;

import java.util.Scanner;

public class desafioSemana {
public static void main (String[]args) {
Scanner	novo = new Scanner(System.in);

System.out.println("digite um dia na semana");
String semana = novo.next(); 
if ("domingo".equalsIgnoreCase(semana)) {
System.out.println(1);
}else if ("segunda".equalsIgnoreCase(semana)) {
		System.out.println(2);
	}else if ("terça".equalsIgnoreCase(semana) ) {
			System.out.println(3);
		}else if ("quarta".equalsIgnoreCase(semana)) {
				System.out.println(4);
			}else if ("quinta".equalsIgnoreCase(semana)) {
					System.out.println(5);
				}else if ("sexta".equalsIgnoreCase(semana)) {
						System.out.println(6);
						}else if("sabado".equalsIgnoreCase(semana)) {
							System.out.println(7);
						}
					

novo.close();
}
}
