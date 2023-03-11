
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        int a = 0, b = 1, c = 0;
        boolean encontrado = false;

        while (c <= num) {
            if (c == num) {
                encontrado = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }

        if (encontrado) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}