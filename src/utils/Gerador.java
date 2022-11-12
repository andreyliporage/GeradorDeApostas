package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gerador {

    private static final int quantidadeNumerosVolante = 25;
    private static final int upperbound = quantidadeNumerosVolante + 1;
    public static List<Integer> numerosVolante = new ArrayList<>();
    private static Random random = new Random();

    public static String geraNumerosVolante() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < quantidadeNumerosVolante; i++) {
            int numeroGerado = random.nextInt(upperbound);
            if (numeroGerado == 0 || numerosVolante.contains(numeroGerado)) {
                --i;
            }
            else {
                numerosVolante.add(numeroGerado);
                stringBuilder.append(" ").append(numeroGerado);
            }
        }
        return stringBuilder.toString();
    }

    public static String geraNumerosAposta(int quantidadeNumeros) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> numerosApostados = new ArrayList<>();

        for (int i = 0; i < quantidadeNumeros; i++) {
            int posicaoNumeroSorteado = random.nextInt(numerosVolante.size() - 1);
            int numeroSorteado = numerosVolante.get(posicaoNumeroSorteado);

            if (numerosApostados.contains(numeroSorteado)) {
                --i;
            }
            else {
                numerosApostados.add(numeroSorteado);
                stringBuilder.append(" ").append(numeroSorteado);
            }
        }
        return stringBuilder.toString();
    }
}
