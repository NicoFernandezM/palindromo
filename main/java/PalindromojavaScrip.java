public class PalindromojavaScrip {
    public static boolean esPalindromo(String cadena){
        String resultado="";
        StringBuilder stringBuilder = new StringBuilder(cadena);
        resultado = stringBuilder.reverse().toString();
        return resultado.equals(cadena);
    }
}
