import java.util.Arrays;

public class QuestaoQ892474 {
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("O valor se encontra na: " + buscar(vetor, 5) + "ª posição");
    }

    public static int buscar(int[] vetorBusca, int valorBusca) {
        if (vetorBusca.length == 0) {
            return -1;
        }
        if (valorBusca == vetorBusca[vetorBusca.length - 1]) {
            return vetorBusca.length - 1;
        }

        return buscar(Arrays.copyOf(vetorBusca, vetorBusca.length - 1), valorBusca);
    }
}
