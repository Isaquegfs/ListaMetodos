package ListaMetodos;
import java.util.Random;

public class listaFatorial {
    public static int []vetorFatorial(int []vetorA) {
        int []vetorB = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            int armazenadorFatorial = 1;
            for (int fatorial = 1; fatorial <= vetorA[i]; fatorial++ ) {
                armazenadorFatorial = armazenadorFatorial *  fatorial;
            }
            vetorB[i] = armazenadorFatorial;
        }
        return vetorB;
    }


    public static void main(String[] args) {
        Random random = new Random();
        int []vetorA = new int[10];
        int []vetorB;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(10);
        }

        vetorB = vetorFatorial(vetorA);

        System.out.println("Fatoriais: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Fatorial de " + vetorA[i] + " = " + vetorB[i]);
        }
    }
}
