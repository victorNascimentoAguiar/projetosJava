package first;

import java.util.Scanner;

public class calculadora {


public static void main (String[]args) {
String calcular;
double numero1;
double numero2;
Scanner entrada = new Scanner (System.in);
System.out.println("escolha a operação: +,-,*,/");
calcular = entrada.next();
System.out.println("digite o primeiro numero: ");
numero1 = entrada.nextDouble();
System.out.println("digite o segundo numero: :)");
numero2 = entrada.nextDouble();
double resultado = "+".equals(calcular)? numero1 +  numero2: 0;
       resultado = "-".equals(calcular)? numero1 -  numero2: resultado ;
       resultado = "*".equals(calcular)? numero1 *  numero2: resultado ;
       resultado = "/".equals(calcular)? numero1 /  numero2: resultado ;

System.out.println("resultado: " + resultado );
	entrada.close();
	
	
	
	
	
}
}