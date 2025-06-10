package ListaMetodos;
import java.util.Scanner;

public class tabuada {
    public static void tabelaTriangular(int numero) {
        int valor;
        for (int linha = 1; linha <= numero; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                valor = linha * coluna;
                System.out.printf("%4d", valor); // "%4d" Isso ajuda a manter a coluna alinhada a direita
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero de 1 a 9: ");
        numero = entrada.nextInt();
        tabelaTriangular(numero);


        entrada.close();
    }
    
}
