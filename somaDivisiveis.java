package ListaMetodos;
import java.util.Scanner;

public class somaDivisiveis {

    //Subrotina
    public static int somarDivisiveis(int a, int b, int c) {
        int soma = 0;

        // Garante que b seja o menor e c o maior
        int inicio = Math.min(b, c);
        int fim = Math.max(b, c);

        for (int i = inicio; i <= fim; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }
        return soma;
        }   
        
    //Main
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a, b, c, resultado;

        System.out.print("Digite o valor de a (maior que 1): ");
        a = entrada.nextInt();
        while (a <= 1) {
            System.out.print("Valor inválido. Digite um valor maior que 1 para a: ");
            a = entrada.nextInt();
        }

        System.out.print("Digite o valor de b: ");
        b = entrada.nextInt();

        System.out.print("Digite o valor de c: ");
        c = entrada.nextInt();

        // Chamada subrotina
        resultado = somarDivisiveis(a, b, c);
        
        
        System.out.println("A soma dos números entre " + b + " e " + c + " divisíveis por " + a + " é: " + resultado);

        entrada.close();
    }        
}
