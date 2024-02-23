import java.util.Scanner;

public class VetorCircularRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Classe de complexidade:
         * O(n)
         */

        String[] entrada = sc.nextLine().split(" ");
        int fatorCircular = sc.nextInt();
        sc.close();

        System.out.println(vetorCircularRecursivo(entrada, fatorCircular, 0, "").trim());

    }

    public static String vetorCircularRecursivo(String[] inteiros, int fatorCircular, int index, String vetor) {
        if (fatorCircular != 0) {
            if (index >= inteiros.length) {
                index = 0;
            }
            vetor = vetor + " " + vetorCircularRecursivo(inteiros, fatorCircular - 1, index + 1, inteiros[index]);
        }
        return vetor;
    }
}