import java.util.Scanner;

public class Palindromo {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main (String [] args) {
        llamarFunciones();
    }

    public static String pedirInput() {
        System.out.println("Por favor ingrese una palabra.");
        return scanner.nextLine();
    }

    public static boolean verificarInput (String palabraIngresada, boolean inputCorrecto) {
        for(int i = 0; i < palabraIngresada.length(); i++) {
            if(Character.isDigit(palabraIngresada.charAt(i))) {
                inputCorrecto = false;
            }
        }
        return inputCorrecto;
    }

    public static boolean esPalindromo(String palabraIngresada) {
        boolean resultadoPalindromo = true;
        palabraIngresada = palabraIngresada.replace(" ", "");

        StringBuilder stringBuilder = new StringBuilder(palabraIngresada);
        String palabraInvertida= stringBuilder.reverse().toString();
        if(!palabraIngresada.equalsIgnoreCase(palabraInvertida)) {
            resultadoPalindromo = false;
        }
        return resultadoPalindromo;
    }

    public static void imprimirResultados(boolean resultadoPalindromo, String palabraIngresada) {
        if(resultadoPalindromo) {
            System.out.println("La palabra " + palabraIngresada + " es un palíndromo.");
        }else {
            System.out.println("La palabra " + palabraIngresada + " no es un palíndromo.");
        }
    }

    public static void llamarFunciones() {
        boolean inputCorrecto;
        String palabraIngresada;

        do {
            inputCorrecto = true;
            palabraIngresada = pedirInput();
            inputCorrecto = verificarInput(palabraIngresada, inputCorrecto);
        } while (!inputCorrecto);

        boolean resultadoPalindromo = esPalindromo(palabraIngresada);
        imprimirResultados(resultadoPalindromo, palabraIngresada);

    }
}
