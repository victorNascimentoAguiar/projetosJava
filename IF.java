package first;

import java.util.Scanner;

public class IF {
	public static void main (String[]args) {
Scanner entrada = new Scanner (System.in);
System.out.print("nome do aluno:  ");
String nome = entrada.nextLine();
System.out.print("informme a nota 1 : " );
double nota1 = entrada.nextDouble();
System.out.println("informe a nota 2 :"); 
double nota2 = entrada.nextDouble();
System.out.println("informe a nota3 : ");
double nota3 = entrada.nextDouble();
double mediap = nota1 + nota2 + nota3 ;
double media = mediap /3;
System.out.println("o aluno " + nome + " foi: " );
if(media>10.0  || media<0 ) {
	System.out.println("nota invalida");
}
else {
if(media>=7.0)  {
    System.out.println("APROVADO PARABÉNS");
}
else {
	System.out.println("reprovado ");
	
}
System.out.println("media: " + media);
}

   entrada.close();
	}
}
