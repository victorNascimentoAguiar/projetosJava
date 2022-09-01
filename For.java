package first;

public class For {
public static void main (String[]args) {
	for (int contador = 0; contador <= 20; contador += 2   ) {
	System.out.printf("i = %d\n",contador);	
	}
	//simplificada
int v = 0;
for(; v <=20;) {
	System.out.println("v = " + v );
	v +=2;
}
//laço infinito
//for (; ;) {
//	System.out.println("acabo");
//}
}
}
