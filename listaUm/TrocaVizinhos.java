import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class TrocaVizinhos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] entrada = sc.nextLine().split(" ");


    int[] inteiros = stringToArrayInt(entrada);

    System.out.println(Arrays.toString(troca(inteiros)));

  }

  public static int[] troca(int[] v) {
    for (int i = 0; i < v.length-1; i++) {
      if (i % 2 == 0) {
        swap(v, i, i + 1);
      }
    }
    return v;
  }
  public static void swap(int[] v, int i, int j) {
    int temp = v[i];
    v[i] = v[j];
    v[j] = temp;
  }
  public static int[] stringToArrayInt(String[] entrada) {
    return Stream.of(entrada).mapToInt(Integer::parseInt).toArray();
  }
}
