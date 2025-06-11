package ListaMetodos;
import java.util.Scanner;

public class calcularSerie {
    public static double Serie(double numero) {
        double armazenadorFatorial, denominador, soma = 0;
        for (int i = 1; i <= numero; i++){
            armazenadorFatorial = 1;
            for (denominador = 1; denominador <= i; denominador++){
                armazenadorFatorial = armazenadorFatorial * denominador;
            }
            soma = soma + (1.0 / armazenadorFatorial);
        }
        return soma;
    }

    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        double numero, soma;

        System.out.print("Digite um numero para calcular a serie: ");
        numero = entrada.nextDouble();

        soma = Serie(numero);
        System.out.println("Resultado da serie: " + soma);

        entrada.close();
    }
}
