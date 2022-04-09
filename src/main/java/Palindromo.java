import java.util.Scanner;

public class Palindromo {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String palabraIngresada;

        do {
            palabraIngresada = pedirInput();
        } while (!verificarInput(palabraIngresada));

        boolean resultadoPalindromo = esPalindromo(palabraIngresada);
        imprimirResultados(resultadoPalindromo, palabraIngresada);
    }

    public static String pedirInput() {
        System.out.println("Por favor ingrese una palabra.");
        return scanner.nextLine();
    }

    public static boolean verificarInput(String palabraIngresada) {
        for (int i = 0; i < palabraIngresada.length(); i++) {
            if (Character.isDigit(palabraIngresada.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean esPalindromo(String palabraIngresada) {
        palabraIngresada = palabraIngresada.replace(" ", "");

        StringBuilder stringBuilder = new StringBuilder(palabraIngresada);
        String palabraInvertida = stringBuilder.reverse().toString();

        return palabraIngresada.equalsIgnoreCase(palabraInvertida);
    }

    public static void imprimirResultados(boolean resultadoPalindromo, String palabraIngresada) {
        String no = resultadoPalindromo ? "" : " no";
        System.out.println("La palabra \"" + palabraIngresada + "\"" + no + " es un palíndromo.");
    }
}
