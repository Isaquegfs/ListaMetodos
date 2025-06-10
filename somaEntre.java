package ListaMetodos;
import java.util.Scanner;

public class somaEntre {
    public static int somarEntre (int a, int b) {
        int soma = 0;
        
        for (int i = a; i < b - 1; i++) {
            soma = soma + (i+1);
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a, b, somador;

        System.out.print("Digite o primeiro numero: ");
        a = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        b = entrada.nextInt();

        somador = somarEntre(a, b);

        System.out.println("A soma dos numeros entre o primeiro e o segundo numero digitado é: " + somador);

        entrada.close();
    }
}
