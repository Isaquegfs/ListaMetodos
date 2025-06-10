package ListaMetodos;
import java.util.Scanner;

public class calculaMedia {
    public static double mediaAritmetica(double notaA, double notaB, double notaC) {
        double media;
        media = (notaA + notaB + notaC) / 3;
        return media;
    }

    public static double mediaPonderada(double notaA, double notaB, double notaC) {
        double media;
        media = ((notaA * 5) + (notaB * 3) + (notaC * 2)) / (5 + 3 + 2);
        return media;
    }

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notaA, notaB, notaC, calcular;
        String escolher;

        System.out.print("Digite a primeira nota: ");
        notaA = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        notaB = entrada.nextDouble();
        System.out.print("Digite a terceira nota: ");
        notaC = entrada.nextDouble();

        entrada.nextLine(); // Limpar o scanner

        System.out.println("Opções");
        System.out.println("'A' - Para média aritmética");
        System.out.println("'P' - Para média ponderada");
        System.out.print("Digite a media escolhida: ");
        escolher = entrada.nextLine().toUpperCase();
        

        if (!escolher.equals("A") && !escolher.equals("P")) {
            while (true) {
                System.out.print("Entrada inválida, escolha uma das opções disponíveis: ");
                escolher = entrada.nextLine().toUpperCase();
                if ((escolher.equals("A") || escolher.equals("P"))) {
                    break;
                }
            }
        }
        
        if (escolher.equals("A")) {
            calcular = mediaAritmetica(notaA, notaB, notaC);
            System.out.println("A media aritmética é: " + calcular);
        }
        else if (escolher.equals("P")) {
            calcular = mediaPonderada(notaA, notaB, notaC);
            System.out.println("A media ponderada é: " + calcular);
        }
        entrada.close();
    }
}
