

import java.util.Scanner;

public class Criptografia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;
        char dado[];

        System.out.println("Digite uma palavra/frase: ");
        palavra = ler.next();

        dado = palavra.toCharArray();

        for (char nome : dado) {
            System.out.print(++nome);
        }
        System.out.println();
    }

}
