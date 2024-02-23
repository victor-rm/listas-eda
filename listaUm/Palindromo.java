import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entrada = sc.nextLine().split(" ");
        sc.close();

        char[] palavra = converteStringEmChar(entrada);

        System.out.println(palindromo(palavra));
    }

    // Código revisado pelo gh
    public static boolean palindromo(char[] palavra) {
        boolean ehPalidromo = true;

        for (int i = 0; i < palavra.length / 2; i++) {
            if (palavra[i] != palavra[palavra.length - 1 - i]) {
                ehPalidromo = false;
            }
        }

        return ehPalidromo;
    }

    private static char[] converteStringEmChar(String[] entrada) {
        char[] retorno = new char[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            retorno[i] = entrada[i].charAt(0);
        }

        return retorno;
    } 
}