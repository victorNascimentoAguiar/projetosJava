package first;

import java.util.Arrays;

import java.util.Comparator;

import java.util.Scanner;

public class VictorDicionario {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

//LIMITADO AS PALAVRAS ESCRITAS NO DICIONÁRIO

String [][] dic = { {"cachorro","dog"},

{"gato", "cat"},

{"teclado", "keyboard"},

{"rato", "mouse"},

{"abacaxi","pineapple"},

{"faca", "knife"},

{"mar", "sea"},

{"sabonete", "soap"},

{"verde","green"},

{"azul","blue"},

{"vermelho","red"},

{"branco","white"},

{"livro","book"},

{"caneta","pen"},

{"bicicleta","bike"},

{"jogo","game"},

{"caixa","box"},

{"telefone","phone"},

{"carro","car"},

{"cadeira","chair"},

{"manual","manual"},

{"osso","bone"},

{"outono","fall"},

{"inverno","winter"},

{"porta","door"},

{"veleiro","yacht"},

{"ilha","island"},

{"zebra","zebra"},

{"zero","zero"},

{"preto", "black"},

{"whisky","whiskey"},

{"dinheiro","money"},

{"estrela","star"},

{"homem", "man"},

{"kart", "kart"},

{"ninguém","nobody"},

{"queijo","cheese"},

{"urubu","vulture"},

{"yang", "yang"},

{"maçã", "apple"},

{"elefante","elephant"},

{"chapéu","hat"},

{"suco","juice"},

{"leão","lion"},

{"noite","night"},

{"avestruz","ostrich"},

{"pergunta","question"},

{"caminhão","truck"},

{"guarda-chuva","umbrella"},

{"raio-x","x-ray"},

};

final Comparator<String[]> arrayComparatorPt = new Comparator<String[]>() {

@Override

public int compare(String[] o1, String[] o2) {

return o1[0].compareTo(o2[0]);

}

};

final Comparator<String[]> arrayComparatorEn = new Comparator<String[]>() {

@Override

public int compare(String[] o1, String[] o2) {

return o1[1].compareTo(o2[1]);

}

};

int i = 0;

char op = '?';

String palavra;

String [][] dicP = new String[dic.length][2];

String [][] dicI = new String[dic.length][2];

for (int j = 0; j < dic.length; j++) {

dicP[j][0] = dic [j][0];

dicP[j][1] = dic [j][1];

dicI[j][0] = dic [j][0];

dicI[j][1] = dic [j][1];

}

mostrarMenu();

op = sc.nextLine().charAt(0);

op = Character.toUpperCase(op);

System.out.println("Sua opção: "+op);

while (op != 'F') {

if(op == 'D') {

Arrays.sort(dic, arrayComparatorPt);

for(final String[] arr : dic) {

System.out.println(Arrays.toString(arr));

}

} else if (op == 'E') {

Arrays.sort(dic, arrayComparatorEn);

for(final String[] arr : dic) {

System.out.println(Arrays.toString(arr));

}

} else if (op == 'P') {

System.out.println("Digite a palavra para ser traduzida: ");

palavra = sc.nextLine();

i = buscaPortugues(dicP, palavra);

if (i != -1) System.out.println(dicP[i][0]+ " => " + dicP[i][1]);

} else {

System.out.println("Digite a palavra para ser traduzida: ");

palavra = sc.nextLine();

i = buscaIngles(dicI, palavra);

if (i != -1) System.out.println(dicI[i][1]+ " => " + dicI[i][0]);

}

if (i == -1) System.out.println("A palavra não se encontra no dicionário: ");

mostrarMenu();

op = sc.nextLine().charAt(0);

op = Character.toUpperCase(op);

System.out.println("Sua opção: "+op);

}

System.out.println("Fim do programa");

sc.close();

}

public static int buscaPortugues(String[][] vet, String elem) {

for(int i = 0; i< vet.length; i++) {

if( elem.compareToIgnoreCase(vet[i][0]) == 0) {

return i;

}

}

return -1;

}

public static int buscaIngles(String[][] vet, String elem) {

for(int i = 0; i< vet.length; i++) {

if( elem.compareToIgnoreCase(vet[i][1]) == 0) {

return i;

}

}

return -1;

}

public static void mostrarMenu() {

System.out.println("Digite o idioma da busca: \n"

+ "[D] - Dicionário Ordenado PT-BR\n[E] - Dicionário Ordenado EN-US\n[P] - Português => Inglês\n[I] - Inglês => Português\n[F] - Fim");

}

}