package ListaMetodos;
import java.util.Scanner;
import java.util.Random;


public class vetorUniao {
    public static void uniao(int []vetorA, int []vetorB) {
        int []somaVetor = new int[10];
        for (int i = 0; i < somaVetor.length; i++) {
            somaVetor[i] = vetorA[i] + vetorB[i];
        }

        for (int i = 0; i < somaVetor.length; i++) {
            System.out.print(somaVetor[i] + " ");
        }
    }


    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        String opcao;
        int []vetorA = new int[10];
        int []vetorB = new int[10];

        System.out.println("Digite ");
        System.out.println("'A' - Para uma lista aleatória");
        System.out.println("'D' - Para digitar os valores");
        System.out.print("Qual opção deseja: ");
        opcao = entrada.nextLine().toUpperCase();

        if (opcao.equals("A")) {
            for (int i = 0; i < vetorA.length; i++){
                vetorA[i] = random.nextInt(21);
                vetorB[i] = random.nextInt(21);
        }

        }
        else if (opcao.equals("D")) {
            for (int i = 0; i < vetorA.length; i++) {
                System.out.print("Digite o " + i + "° valor da lista A: ");
                vetorA[i] = entrada.nextInt();
                System.out.print("Digite o " + i + "° valor da lista B: ");
                vetorB[i] = entrada.nextInt();
            }
        }
        uniao(vetorA, vetorB);
        entrada.close();
    }
}
