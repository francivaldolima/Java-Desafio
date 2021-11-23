

import java.util.Scanner;

public class Prova {
    /**
     * Enunciado
        Faça uma aplicação Java que solicite uma frase para quem estiver executando o
        programa e após o usuário informar essa frase o programa deverá apresentar
        um Menu de opções a ser trabalhado com a frase digitada:
        Menu:
        1- Quantificar quantas palavras existem na frase
        2- Apresentar na tela as palavras uma por linha.
        3- Criptografar
        4- Digitar uma nova frase.
        5- Sair do programa
     */

    static String plv;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Prova prova = new Prova();
        int opcao;

        System.out.println("Digite uma frase: ");
        plv = scan.nextLine();

        for (;;) {
            System.out.println("Menu:====>FRASE: " + "#" + plv + "#");
            System.out.println("1-Quantificar quantas palavras existem na frase.");
            System.out.println("2-Apresentar na tela as palavras uma por linha.");
            System.out.println("3-Criptografar.");
            System.out.println("4-Digitar uma nova frase.");
            System.out.println("5-Sair do programa.");
            System.out.print("Opção:");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("*************************************************");
                    prova.quantificar(plv);
                    System.out.println("*************************************************");
                    break;
                case 2:
                    System.out.println("*************************************************");
                    prova.apresentar(plv);
                    System.out.println("*************************************************");
                    break;
                case 3:
                    System.out.println("*************************************************");
                    prova.criptografar(plv);
                    System.out.println("*************************************************");
                    break;
                case 4:
                    System.out.println("*************************************************");
                    System.out.print("Digite uma nova frase:");
                    String plv2 = scan.nextLine();
                    plv = scan.nextLine();
                    break;
                case 5:
                    System.out.println("Saindo do programa");
                    System.exit(0);
                    break;
                    default:
                        System.out.println("opção inválida");
            }

        }
    }

//1- Quantificar quantas palavras existem na frase
    public void quantificar(String frase) {
        String[] s = frase.split(" ");
        System.out.println("Na frase " + frase + " exitem " + s.length + " palavras.");
    }
    
//2- Apresentar na tela as palavras uma por linha.
    public void apresentar(String frase) {
        String[] s = frase.split(" ");
        for (String nome : s) {
            System.out.println(nome);
        }
    }
    
//3- Criptografar
    public void criptografar(String frase) {
        char dado[];
        dado = frase.toCharArray();
        for (char nome : dado) {
            System.out.print(++nome);
        }
        System.out.println("");
    }
    
//4- Digitar uma nova frase.
    public void digitar() {

    }
    
//5- Sair do programa
    public void sair() {

    }
}
