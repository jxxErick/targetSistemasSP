public class ex4 {

    public static void main(String[] args) {
        String original = "Hello, world!"; // String original
        String invertida = inverter(original); // Inverte a string original
        System.out.println(invertida); // Imprime a string invertida
    }

    // Função para inverter a string
    public static String inverter(String s) {
        char[] chars = s.toCharArray(); // Converte a string em um array de caracteres
        int inicio = 0;
        int fim = s.length() - 1;
        while (fim > inicio) { // Enquanto não chegarmos ao meio da string
            // Troca os caracteres de posição
            char temp = chars[inicio];
            chars[inicio] = chars[fim];
            chars[fim] = temp;
            // Avança o início e retrocede o fim
            inicio++;
            fim--;
        }
        return new String(chars); // Retorna a string invertida
    }

}