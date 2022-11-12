import utils.Gerador;
import utils.PrintUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintUtils.printMensagem("Bem vindo ao gerador de apostas da Lotofácil!");
        PrintUtils.printMensagem("Esses são os números disponíveis no volante: ");
        var numerosVolante = Gerador.geraNumerosVolante();
        PrintUtils.printMensagem(numerosVolante);

        PrintUtils.printMensagem("Escolha quantos números você deseja jogar: ");
        Scanner scanner =  new Scanner(System.in);
        var quantidadeNumeros = Integer.parseInt(scanner.nextLine());
        var numerosSorteados = Gerador.geraNumerosAposta(quantidadeNumeros);
        PrintUtils.printMensagem("Sua aposta é: " + numerosSorteados);
    }
}