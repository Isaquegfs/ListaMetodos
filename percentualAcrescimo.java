package ListaMetodos;
import java.util.Scanner;

public class percentualAcrescimo {
    public static double Acrescimo(double valorA, double valorB) {
        double percentual;
        percentual = ((valorB - valorA) / valorA ) * 100;
        return percentual;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorA, valorB, acrescentar;

        System.out.print("Digite o valor antigo: ");
        valorA = entrada.nextDouble();

        System.out.print("Digite o valor atual: ");
        valorB = entrada.nextDouble();

        acrescentar = Acrescimo(valorA, valorB);

        if (valorB > valorA) {
            System.out.println("O aumento foi de: " + acrescentar + "%");
        }
        else if (valorB == valorA) {
            System.out.println("Não houve aumento");
        }
        else {
            System.out.println("A redução foi de: " + acrescentar + "%");
        }
        
        entrada.close();
    }
}
