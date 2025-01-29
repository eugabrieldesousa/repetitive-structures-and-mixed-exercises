import java.util.Scanner;

public class Main {
    public static boolean ehPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean ehPalindromo(int num) {
        String str = Integer.toString(num);
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Primo: " + ehPrimo(num));
        System.out.println("Palíndromo: " + ehPalindromo(num));
        sc.close();
    }
}
