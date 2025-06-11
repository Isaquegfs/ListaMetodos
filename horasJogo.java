package ListaMetodos;
import java.util.Scanner;

public class horasJogo {
    public static int duracaoMinutos(int horaInicio, int minutoInicio, int horaFim, int minutoFim) {
        int inicioTotal, fimTotal, duracao;

        // Converter para minutos totais
        inicioTotal = horaInicio * 60 + minutoInicio;
        fimTotal = horaFim * 60 + minutoFim;

        // Verificar se terminou no mesmo dia ou dia seguinte
        if (fimTotal >= inicioTotal) {
            duracao = fimTotal - inicioTotal;
        }
        else {
            duracao = (24 * 60 - inicioTotal) + fimTotal;
        }
        return duracao;
    }


    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horaInicio, minutoInicio, horaFim, minutoFim, duracao;
        

        System.out.print("Digite a hora inicial: ");
        horaInicio = entrada.nextInt();
        System.out.print("Digite os minutos iniciais: ");
        minutoInicio = entrada.nextInt();
        System.out.print("Digite as horas finais: ");
        horaFim = entrada.nextInt();
        System.out.print("Digite os minutos finais: ");
        minutoFim = entrada.nextInt();

        duracao = duracaoMinutos(horaInicio, minutoInicio, horaFim, minutoFim);
        System.out.println("Duração do jogo: " + duracao + " minutos");

        entrada.close();
    }
}
