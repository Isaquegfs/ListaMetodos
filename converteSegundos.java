package ListaMetodos;
import java.util.Scanner;

public class converteSegundos {
    public static int[] Converte(int segundos) {
        int horas, minutos, segundosRestante;
        horas = segundos / 3600;
        minutos = (segundos / 60) % 60;
        segundosRestante = segundos % 60;     
        return new int[]{horas, minutos, segundosRestante};
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int segundos;

        System.out.print("Digite a quantidade de segundos a ser convertido: ");
        segundos = entrada.nextInt();
        
        int[] resultado = Converte(segundos);

        System.out.printf("Tempo convertido: " + resultado[0] + " horas, " + resultado[1] + " minutos e " + resultado[2] + "segundos");

        entrada.close();
    }
}
